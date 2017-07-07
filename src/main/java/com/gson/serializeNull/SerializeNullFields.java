package com.gson.serializeNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.utilities.Car;

public class SerializeNullFields {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();

		builder.serializeNulls(); // if we comment this field output will be carJson = {"doors":4}

		Gson gson = builder.create();

		Car car = new Car();
		car.brand = null;
		car.doors = 4;

		String carJson = gson.toJson(car);
		System.out.println("carJson = " + carJson);

	}

}
