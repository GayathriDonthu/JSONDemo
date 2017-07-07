package com.gson.excludeFields;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExposeDemo {

	public static void main(String[] args) {

		CarExpose car = new CarExpose();
		car.brand = "BMW";
		car.doors = 5;

		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithoutExposeAnnotation();
		Gson gson = builder.create();
		String carJson = gson.toJson(car);

		System.out.println("carJson = " + carJson);

	}

}
