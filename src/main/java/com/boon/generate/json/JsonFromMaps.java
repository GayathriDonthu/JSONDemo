package com.boon.generate.json;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class JsonFromMaps {

	public static void main(String[] args) throws FileNotFoundException {

		Map car = new HashMap();
		car.put("brand", "BMW");
		car.put("doors", 4);

		List cars = new ArrayList();
		cars.add(car);

		Map fleet = new HashMap();
		fleet.put("cars", cars);

		ObjectMapper objectMapper = JsonFactory.create();

		writeToString(objectMapper, fleet);
		writeToFile(objectMapper, fleet);

	}

	private static void writeToString(ObjectMapper objectMapper, Map fleet) {

		String json = objectMapper.writeValueAsString(fleet);
		System.out.println("json = " + json);

	}

	private static void writeToFile(ObjectMapper objectMapper, Map fleet) throws FileNotFoundException {

		objectMapper.writeValue(new FileOutputStream("src/main/resources/file/fleetOutput.json"), fleet);

	}

}
