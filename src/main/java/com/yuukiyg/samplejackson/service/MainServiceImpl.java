package com.yuukiyg.samplejackson.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuukiyg.samplejackson.model.Foo;
import com.yuukiyg.samplejackson.model.RootElement;

@Service
public class MainServiceImpl implements MainService{

//https://www.baeldung.com/jackson-object-mapper-tutorial



	@Autowired
	private JsonToObjectService json2objectService;

	@Autowired
	private ObjectToJsonService objectToJsonService;

	@Override
	public void execute() {
		RootElement element = generateObject();
		String parsedJson = objectToJsonService.object2json(element);
		System.out.println(parsedJson);

		RootElement r = json2objectService.json2object(parsedJson);
		System.out.println(r);

	}


	private String generateTestJson() {
		String json = "";

		return json;
	}

	private RootElement generateObject() {
		RootElement root = new RootElement();

		List<Foo> testList = new ArrayList<Foo>();
		testList.add(new Foo(111, "aaa"));
		testList.add(new Foo(222, "bbb"));
		testList.add(new Foo(333, "ccc"));

		Map<String, byte[]> testMap = new HashMap<String, byte[]>();
		testMap.put("key1", "11111".getBytes());
		testMap.put("key2", "BBBBB".getBytes());

		root.setByteMap(testMap);
		root.setFooList(testList);
		root.setString("teststring");

		return root;
	}
}
