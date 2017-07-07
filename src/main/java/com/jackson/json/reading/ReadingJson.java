package com.jackson.json.reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.utilities.Car;

public class ReadingJson {

	public static void main(String[] args) {

		ReadingJson json = new ReadingJson();

		System.out.println("Reading JSON from a String");
		json.readString();

		System.out.println("Reading JSON from a Reader");
		json.readReader();

		System.out.println("Reading JSON from a File");
		json.readFile();

		System.out.println("Reading JSON from a URL");
		json.readURL();

		System.out.println("Reading JSON from InputStream");
		json.readInputStream();

		System.out.println("Reading JSON from Byte array");
		json.readByteArray();

	}

	/**
	 * Reading JSON from a String
	 */
	void readString() {

		ObjectMapper objectMapper = new ObjectMapper();

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		try {
			Car car = objectMapper.readValue(carJson, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Reading JSON from a Reader
	 */
	private void readReader() {

		ObjectMapper objectMapper = new ObjectMapper();

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5}";

		Reader reader = new StringReader(carJson);

		try {
			Car car = objectMapper.readValue(reader, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Reading JSON from a File
	 */
	void readFile() {

		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("src/main/resources/file/car.json");

		try {
			Car car = objectMapper.readValue(file, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Reading JSON from a URL
	 */
	void readURL() {

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			URL url = new URL(
					"file:///C:/Users/gayathri.guttikonda/Workspace_STS/JSONDemo/src/main/resources/file/car.json");

			Car car = objectMapper.readValue(url, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Reading JSON from InputStream
	 */
	void readInputStream() {

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			InputStream input = new FileInputStream("src/main/resources/file/car.json");

			Car car = objectMapper.readValue(input, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Reading JSON from Byte array
	 */
	void readByteArray() {

		ObjectMapper objectMapper = new ObjectMapper();

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5}";

		try {
			byte[] bytes = carJson.getBytes("UTF-8");

			Car car = objectMapper.readValue(bytes, Car.class);

			System.out.println("car.brand = " + car.brand);
			System.out.println("car.doors = " + car.doors);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
