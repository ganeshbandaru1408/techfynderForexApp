package com.techfynder.techfynderforexservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techfynder.techfynderforexservice.entity.ExchangeValue;
import com.techfynder.techfynderforexservice.service.ExchangeValueService;

@RestController
@RequestMapping("forex")
public class TechfynderForexController {

  @Autowired
  private ExchangeValueService service;

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
    ExchangeValue exchangeValue = service.retrieveExchangeValue(from, to);
    return exchangeValue;
  }
}