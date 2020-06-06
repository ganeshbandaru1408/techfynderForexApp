package com.techfynder.techfynderforexservice;

import static springfox.documentation.builders.PathSelectors.regex;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.techfynder.techfynderforexservice.entity.ExchangeValue;
import com.techfynder.techfynderforexservice.repository.ExchangeValueRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TechfynderForexServiceApplication {
	

   public static void main(String[] args) {
		SpringApplication.run(TechfynderForexServiceApplication.class, args);
	}
   
   @Bean
   public Docket documentation() {
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.any())
               .paths(regex("/.*"))
               .build()
               .pathMapping("/")
               .apiInfo(metadata());
   }

   @Bean
   public UiConfiguration uiConfig() {
       return UiConfiguration.DEFAULT;
   }

   private ApiInfo metadata() {
       return new ApiInfoBuilder()
               .title("Techfynder Forex API")
               .description("API Documentation for Forex API")
               .version("1.0")
               .contact(new Contact("Ganesh Bandaru","techfynder.com","ganeshbandaru@techfynder.com"))
               .build();
   }
   
   
   @Bean
   CommandLineRunner init(ExchangeValueRepository ExchangeValueRepository) {
       return args -> {
    	   //1
    	   ExchangeValue exchange1 = new ExchangeValue();
    	   exchange1.setCurrencyFrom("USD");
    	   exchange1.setCurrencyTo("INR");
    	   exchange1.setConversionMultiple(BigDecimal.valueOf(65.0));
    	   //2
    	   ExchangeValue exchange2 = new ExchangeValue();
    	   exchange1.setCurrencyFrom("EUR");
    	   exchange1.setCurrencyTo("INR");
    	   exchange1.setConversionMultiple(BigDecimal.valueOf(75.0));
    	   //3
    	   ExchangeValue exchange3 = new ExchangeValue();
    	   exchange1.setCurrencyFrom("AUD");
    	   exchange1.setCurrencyTo("INR");
    	   exchange1.setConversionMultiple(BigDecimal.valueOf(25.0));
    	   
    	   ExchangeValueRepository.save(exchange1);
    	   ExchangeValueRepository.save(exchange2);
    	   ExchangeValueRepository.save(exchange3);  
       };
   }
   

}
