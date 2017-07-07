package com.jackson.parse.jsonParser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.jackson.utilities.Car;

public class ParseJsonParser {

	public static void main(String[] args) {

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5}";

		JsonFactory factory = new JsonFactory();

		try {
			JsonParser parser = factory.createParser(carJson);

			Car car = new Car();

			while (!parser.isClosed()) {

				JsonToken token = parser.nextToken();

				System.out.println("JsonToken = " + token);

				if (JsonToken.FIELD_NAME.equals(token)) {

					String fieldName = parser.getCurrentName();
					System.out.println(fieldName);

					token = parser.nextToken();

					if ("brand".equals(fieldName)) {
						car.brand = parser.getValueAsString();
					} else if ("doors".equals(fieldName)) {
						car.doors = parser.getValueAsInt();
					}

				}

			}

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
