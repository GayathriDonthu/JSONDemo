package com.gson.customSerialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomDeserializerDemo {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(Boolean.class, new BooleanDeserializer());

		Gson gson = builder.create();

		String json = "{ \"username\" : \"kevin\", \"isSuperUser\" : 1}";

		BooleanPojo pojo = gson.fromJson(json, BooleanPojo.class);

		System.out.println("pojo.username = " + pojo.username);
		System.out.println("pojo.isSuperUser = " + pojo.isSuperUser);

	}

}
