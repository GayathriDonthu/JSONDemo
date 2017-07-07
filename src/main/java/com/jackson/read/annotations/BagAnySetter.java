package com.jackson.read.annotations;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class BagAnySetter {

	private Map<String, Object> properties = new HashMap<String, Object>();

	@JsonAnySetter
	public void set(String field, Object value) {
		this.properties.put(field, value);
	}

	public Object get(String field) {
		return this.properties.get(field);
	}

}
