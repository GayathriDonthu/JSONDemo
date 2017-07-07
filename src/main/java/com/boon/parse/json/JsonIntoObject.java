package com.boon.parse.json;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import com.boon.uilities.Car;
import com.boon.uilities.Fleet;

public class JsonIntoObject {

	public static void main(String[] args) {

		readValue();
		fromJson();

	}

	private static void readValue() {

		System.out.println("Parsing JSON Into Objects using readValue");
		String fleetString = "{ \"cars\" : [{\"brand\" : \"BMW\", \"doors\" : 5}, {\"brand\" : \"Audi\", \"doors\" : 6}]}";

		ObjectMapper objectMapper = JsonFactory.create();

		Fleet fleet = objectMapper.readValue(fleetString, Fleet.class);

		Car[] cars = fleet.cars;

		for (Car c : cars) {
			System.out.println("c.brand = " + c.brand);
			System.out.println("c.doors = " + c.doors);
		}
	}

	private static void fromJson() {

		System.out.println("Parsing JSON Into Objects using fromJson");
		String fleetString = "{ \"cars\" : [{\"brand\" : \"BMW\", \"doors\" : 5}, {\"brand\" : \"Audi\", \"doors\" : 6}]}";

		ObjectMapper objectMapper = JsonFactory.create();

		Fleet fleet = objectMapper.fromJson(fleetString, Fleet.class);

		Car[] cars = fleet.cars;

		for (Car c : cars) {
			System.out.println("c.brand = " + c.brand);
			System.out.println("c.doors = " + c.doors);
		}

	}

}
