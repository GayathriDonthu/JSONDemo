package com.generate.json;

import java.io.FileOutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utilities.Car;

public class JsonFromObject {

	public static void main(String[] args) {

		JsonFromObject obj = new JsonFromObject();

		obj.writeValue();

		obj.writeValueAsString();

	}

	void writeValue() {

		ObjectMapper objectMapper = new ObjectMapper();

		Car car = new Car();

		car.brand = "Audi";
		car.doors = 4;

		try {
			objectMapper.writeValue(new FileOutputStream("src/main/resources/file/JsonOutput.json"), car);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void writeValueAsString() {

		ObjectMapper objectMapper = new ObjectMapper();

		Car car = new Car();
		car.brand = "BMW";
		car.doors = 5;

		String json;
		try {
			json = objectMapper.writeValueAsString(car);
			System.out.println(json);

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
