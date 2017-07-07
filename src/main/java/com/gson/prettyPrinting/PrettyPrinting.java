package com.gson.prettyPrinting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.utilities.Car;

public class PrettyPrinting {

	public static void main(String[] args) {

		Car car = new Car();
		car.brand = "Swift";
		car.doors = 4;

		compactJson(car);
		prettyPrintingJson(car);

	}

	private static void compactJson(Car car) {

		System.out.println("compactJson........");

		Gson gson = new Gson();

		String carJson = gson.toJson(car);

		System.out.println("carJson = " + carJson);

	}

	private static void prettyPrintingJson(Car car) {

		System.out.println("prettyPrintingJson......");

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String carJson = gson.toJson(car);

		System.out.println("carJson  = " + carJson);

	}

}
