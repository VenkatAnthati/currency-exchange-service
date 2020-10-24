package com.example.micrsample.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.micrsample.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	
	ExchangeValue findByFromAndTo(String from, String to);
}
