package com.gson.excludeFields;

import com.google.gson.Gson;

public class TransientDemo {

	public static void main(String[] args) {

		CarTransient car = new CarTransient();
		car.brand = "BMW";
		car.doors = 5;

		Gson gson = new Gson();

		String carJson = gson.toJson(car);

		System.out.println("carJson = " + carJson);

	}

}
