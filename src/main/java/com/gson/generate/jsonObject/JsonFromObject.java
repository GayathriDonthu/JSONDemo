package com.gson.generate.jsonObject;

import com.google.gson.Gson;
import com.gson.utilities.Car;

public class JsonFromObject {

	public static void main(String[] args) {

		Car car = new Car();
		car.brand = "Audi";
		car.doors = 5;

		Gson gson = new Gson();

		String carJson = gson.toJson(car);

		System.out.println("carJson = " + carJson);

	}

}
