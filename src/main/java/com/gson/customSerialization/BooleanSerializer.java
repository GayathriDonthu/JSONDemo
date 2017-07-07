package com.gson.customSerialization;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class BooleanSerializer implements JsonSerializer<Boolean> {

	@Override
	public JsonElement serialize(Boolean b, Type type, JsonSerializationContext arg2) {

		if (b) {
			return new JsonPrimitive(1);
		}

		return new JsonPrimitive(0);
	}

}
