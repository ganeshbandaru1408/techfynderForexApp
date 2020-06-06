package com.techfynder.techfynderforexservice.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.techfynder.techfynderforexservice.entity.ExchangeValue;
import com.techfynder.techfynderforexservice.repository.ExchangeValueRepository;
import com.techfynder.techfynderforexservice.service.ExchangeValueService;

@RunWith(MockitoJUnitRunner.class)
public class TechfynderForexControllerTest {

  @Mock
  private ExchangeValueService service;
  @Mock
  private ExchangeValueRepository exchangeValueRepository;

  @SuppressWarnings("deprecation")
  @Test
  public void retrieveExchangeValue(){
	when(exchangeValueRepository.findByCurrencyFromAndCurrencyTo(Matchers.anyString(), Matchers.anyString())).thenReturn(getExchangeValue());
    ExchangeValue exchangeValue = service.retrieveExchangeValue("USD", "INR");
    assertEquals(exchangeValue.getConversionMultiple(), is(75.00));
  }
  
  private ExchangeValue getExchangeValue() {
	  ExchangeValue project = new ExchangeValue();
      project.setCurrencyFrom("USD");
      project.setCurrencyTo("INR");
      project.setConversionMultiple(BigDecimal.valueOf(75.0));
      return project;
  }
}