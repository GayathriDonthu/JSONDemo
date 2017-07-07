package com.boon.parsingPrimitives;

import java.util.Arrays;
import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import com.boon.uilities.Car;

public class ParsingPrimitives {

	public static void main(String[] args) {

		ObjectMapper objectMapper = JsonFactory.create();

		StringToInt(objectMapper);
		StringToArray(objectMapper);
		StringtoMap(objectMapper);

	}

	/**
	 * String to int
	 * 
	 * @param objectMapper
	 */
	private static void StringToInt(ObjectMapper objectMapper) {

		String carJson = "{\"brand\" : \"123\", \"doors\" : 5}";

		Car car = objectMapper.readValue(carJson, Car.class);

		int value = objectMapper.parser().parseInt(car.brand);

		System.out.println("value = " + value);

	}

	/**
	 * json string with array of numbers to primitive java types
	 * 
	 * @param objectMapper
	 */
	private static void StringToArray(ObjectMapper objectMapper) {

		String carJson = "{\"brand\" : \"[123,234,345]\", \"doors\" : 5}";

		Car car = objectMapper.readValue(carJson, Car.class);

		int[] primitiveArray = objectMapper.parser().parseIntArray(car.brand);

		System.out.println("primitiveArray = " + Arrays.toString(primitiveArray));

	}

	/**
	 * JSON string representing an object into a Java Map
	 * 
	 * @param objectMapper
	 */
	private static void StringtoMap(ObjectMapper objectMapper) {

		String jsonMap = "{ \"key1\" : \"value1\", \"key2\" : \"value2\"}";

		Map<String, Object> map = objectMapper.parser().parseMap(jsonMap);

		System.out.println("map = " + map);

	}

}
