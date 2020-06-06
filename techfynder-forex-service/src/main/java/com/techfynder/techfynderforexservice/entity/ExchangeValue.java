package com.techfynder.techfynderforexservice.entity;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Exchange_Value")
public class ExchangeValue {

	@Id
	private ObjectId id;
	private String currencyFrom;
	private String currencyTo;
	private BigDecimal conversionMultiple;

	public ExchangeValue(ObjectId id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeValue() {
		super();
	}

	public ObjectId getId() {
		return id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
    
}
