package com.write.annotations;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class PersonAnyGetter {

	private Map<String, Object> properties = new HashMap<>();

	@JsonAnyGetter
	public Map<String, Object> properties() {
		return properties;
	}

	@JsonAnySetter
	public void set(String field, Object value) {
		this.properties.put(field, value);
	}

}
