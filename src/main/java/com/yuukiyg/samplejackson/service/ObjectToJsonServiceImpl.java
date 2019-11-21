package com.yuukiyg.samplejackson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuukiyg.samplejackson.model.RootElement;

@Service
public class ObjectToJsonServiceImpl implements ObjectToJsonService{
	@Autowired
	private ObjectMapper mapper;

	@Override
	public String object2json(RootElement root) {
		String json = "";
		try {
			json = mapper.writeValueAsString(root);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return json;
	}

}
