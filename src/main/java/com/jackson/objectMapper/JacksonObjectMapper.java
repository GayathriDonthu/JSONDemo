package com.jackson.objectMapper;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.utilities.Car;

public class JacksonObjectMapper {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		String carJSON = "{	\"brand\" : \"Mercedes\", \"doors\" : 5	}";

		try {
			Car car = objectMapper.readValue(carJSON, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car doors = " + car.doors);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
