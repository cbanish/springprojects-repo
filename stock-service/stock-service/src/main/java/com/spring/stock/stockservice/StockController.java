package com.spring.stock.stockservice;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@RestController
@RequestMapping("rest/stock")
public class StockController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/{username}")
	public List<QuoteResponse> getStockQuote(@PathVariable String username){
		
		String url="http://db-microservice/rest/quote/"+username ;
		
		List<String> quotesData=  restTemplate.getForObject(url, List.class);
		
		return quotesData.stream().map(quote-> {
			Stock stock=getStockPrice(quote);
			 return new QuoteResponse(quote, stock.getQuote().getPrice());
		}
		).collect(Collectors.toList());
	}
	
	private Stock getStockPrice(String quote) {
		Stock stockData=null;
		try {
			stockData= YahooFinance.get(quote);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockData;
	}
	

}
