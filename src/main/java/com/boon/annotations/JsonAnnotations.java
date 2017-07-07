package com.boon.annotations;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class JsonAnnotations {

	public static void main(String[] args) {

		ObjectMapper objectMapper = JsonFactory.create();

		String json = "{ \"brand\" : \"Audi\", \"doors\" : 5, \"comment\" : \"hello\"}";

		Car car = objectMapper.readValue(json, Car.class);

		System.out.println("car.brand = " + car.brand);
		System.out.println("car.doors = " + car.doors);
		System.out.println("car.comment = " + car.comment);

	}

}
