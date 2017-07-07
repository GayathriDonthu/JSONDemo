package com.boon.parse.json;

import java.io.File;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import com.boon.uilities.Car;
import com.boon.uilities.Fleet;

public class JsonFromOtherSources {
	public static void main(String[] args) {

		file();

		/*
		 * for other sources refer com.jackson.json.reading.ReadingJson.java
		 * file
		 * 
		 * byte array char array File Reader InputStream String
		 */

	}

	private static void file() {

		ObjectMapper objectMapper = JsonFactory.create();

		Fleet fleet = objectMapper.readValue(new File("src/main/resources/file/fleet.json"), Fleet.class);

		Car[] cars = fleet.cars;

		for (Car c : cars) {
			System.out.println("brand = " + c.brand);
			System.out.println("doors = " + c.doors);
		}

	}
}
