package com.gson.customSerialization;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class BooleanDeserializer implements JsonDeserializer<Boolean> {

	@Override
	public Boolean deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {

		return json.getAsInt() == 0 ? false : true;

	}

}
