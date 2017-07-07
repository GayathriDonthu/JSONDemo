package com.gson.excludeFields;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.utilities.Car;

public class SetExclusionStratergies {

	public static void main(String[] args) {

		ExclusionStrategy exclusionStrategy = new ExclusionStrategy() {

			public boolean shouldSkipField(FieldAttributes fieldAttributes) {
				if ("brand".equals(fieldAttributes.getName())) {
					return true;
				}
				return false;
			}

			public boolean shouldSkipClass(Class aClass) {
				return false;
			}

		};

		GsonBuilder builder = new GsonBuilder();
		builder.setExclusionStrategies(exclusionStrategy);

		Gson gson = builder.create();

		Car car = new Car();
		car.brand = "Audi";
		car.doors = 5;

		String carJson = gson.toJson(car);
		System.out.println("carJson = " + carJson);

	}

}
