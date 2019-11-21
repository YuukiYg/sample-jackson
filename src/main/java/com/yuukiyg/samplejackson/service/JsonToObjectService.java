package com.yuukiyg.samplejackson.service;

import com.yuukiyg.samplejackson.model.RootElement;

public interface JsonToObjectService {

	public RootElement json2object(String jsonString);

}
