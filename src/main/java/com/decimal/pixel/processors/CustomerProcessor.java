package com.decimal.pixel.processors;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.decimal.pixel.entity.Customers;
import java.util.function.Function;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerProcessor {

@Bean
public Function<KStream<String,Customers>,KStream<String,String>> processRawCustomer() {

    return inputStream ->{

        return inputStream.map((key,value)->{
            log.info("The deserialization is successful and the prrof is...");
            log.info("The first name of the customer...."+value.getFirstName());
            return new KeyValue<String,String>("","");

        });
    };

}

}
