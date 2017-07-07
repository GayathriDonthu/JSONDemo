package com.gson.instanceCreator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.utilities.Car;

public class InstanceCreatorDemo {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(Car.class, new CarCreator());

		Gson gson = builder.create();

		String carJson = "{ \"doors\" : 5}";

		Car car = gson.fromJson(carJson, Car.class);

		System.out.println("car.brand = " + car.brand);

	}

}
