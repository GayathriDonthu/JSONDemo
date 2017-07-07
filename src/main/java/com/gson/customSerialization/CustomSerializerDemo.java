package com.gson.customSerialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomSerializerDemo {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(Boolean.class, new BooleanSerializer());

		Gson gson = builder.create();

		BooleanPojo pojo = new BooleanPojo();
		pojo.username = "kevin";
		pojo.isSuperUser = true;

		String booleanJson = gson.toJson(pojo);

		System.out.println("booleanJson = " + booleanJson);

	}
}
