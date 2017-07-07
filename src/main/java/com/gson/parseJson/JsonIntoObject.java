package com.gson.parseJson;

import com.google.gson.Gson;
import com.gson.utilities.Car;

public class JsonIntoObject {
	public static void main(String[] args) {

		String carJson = "{ \"brand\" : \"Audi\", \"doors\" : 4}";

		Gson gson = new Gson();

		Car car = gson.fromJson(carJson, Car.class);

		System.out.println("car.brand = " + car.brand);
		System.out.println("car.doors = " + car.doors);

	}
}
