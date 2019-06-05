package com.spring.stock.stockservice;

import java.math.BigDecimal;

public class QuoteResponse {
	
	public String quote;
	
	public BigDecimal price;

	public QuoteResponse(String quote, BigDecimal price) {
		super();
		this.quote = quote;
		this.price = price;
	}


}
