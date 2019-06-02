package com.spring.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.stock.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer>{
	
	public List<Quote> findQuotesByUsername(String userName);

}
