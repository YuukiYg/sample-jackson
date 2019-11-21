package com.yuukiyg.samplejackson.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class RootElement {
	private String string;
	private List<Foo> fooList;
	private Map<String, byte[]> byteMap;
}
