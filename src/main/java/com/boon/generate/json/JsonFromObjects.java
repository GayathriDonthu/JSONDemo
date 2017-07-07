package com.boon.generate.json;

import java.io.File;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import com.boon.uilities.Car;
import com.boon.uilities.Fleet;

public class JsonFromObjects {

	public static void main(String[] args) {

		Fleet fleet = new Fleet();

		fleet.cars = new Car[1];

		fleet.cars[0] = new Car("Audi", 4);

		ObjectMapper objectMapper = JsonFactory.create();

		writeToString(objectMapper, fleet);
		writeToFile(objectMapper, fleet);

	}

	private static void writeToString(ObjectMapper objectMapper, Fleet fleet) {

		String fleetJson = objectMapper.writeValueAsString(fleet);

		System.out.println("fleetJson = " + fleetJson);
	}

	private static void writeToFile(ObjectMapper objectMapper, Fleet fleet) {

		objectMapper.writeValue(new File("src/main/resources/file/fleetOutput.json"), fleet);

	}

}
