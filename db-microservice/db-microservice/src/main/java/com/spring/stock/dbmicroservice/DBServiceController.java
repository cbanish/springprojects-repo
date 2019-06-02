package com.spring.stock.dbmicroservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stock.model.Quote;
import com.spring.stock.repository.QuoteRepository;

@RestController
@RequestMapping("dbservice/rest/quote")
public class DBServiceController {
	
	@Autowired
	public QuoteRepository quoteRepository;
	
	@GetMapping("/{userName}")
	public List<String> getQuotesbyUser(@PathVariable String userName){
		
		return quoteRepository.findQuotesByUsername(userName)
				.stream().map(Quote::getQuote)
				.collect(Collectors.toList());
	}

}
