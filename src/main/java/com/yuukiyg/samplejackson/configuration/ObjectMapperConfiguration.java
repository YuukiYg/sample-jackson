package com.yuukiyg.samplejackson.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ObjectMapperConfiguration {
	@Bean
	public ObjectMapper jsonNode() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}
}
