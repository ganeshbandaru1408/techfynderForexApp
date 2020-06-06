package com.techfynder.techfynderforexservice.service;
import com.techfynder.techfynderforexservice.entity.ExchangeValue;

public interface ExchangeValueService {
	public ExchangeValue retrieveExchangeValue(String from, String to);	
}
