package com.yuukiyg.samplejackson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuukiyg.samplejackson.model.RootElement;

/**
 * @author YuukiYg
 */
@Service
public class JsonToObjectServiceImpl implements JsonToObjectService{
	@Autowired
	private ObjectMapper mapper;

	@Override
	public RootElement json2object(String jsonString) {
		RootElement root = null;

		try {
			root = mapper.readValue(jsonString, new TypeReference<RootElement>(){});
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return root;
	}
}
