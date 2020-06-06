package com.techfynder.techfynderforexservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfynder.techfynderforexservice.entity.ExchangeValue;
import com.techfynder.techfynderforexservice.repository.ExchangeValueRepository;
@Service
public class ExchangeValueServiceImpl implements ExchangeValueService{
		
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	public ExchangeValue retrieveExchangeValue(String from, String to) {
		return exchangeValueRepository.findByCurrencyFromAndCurrencyTo(from, to);
	}
	
	
}
