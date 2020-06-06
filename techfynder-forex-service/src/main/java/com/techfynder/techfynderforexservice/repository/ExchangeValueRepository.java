package com.techfynder.techfynderforexservice.repository;


import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techfynder.techfynderforexservice.entity.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends CrudRepository<ExchangeValue, ObjectId> {

    ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
 
}