package com.boon.date;

import java.util.Date;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ParseDates {

	public static void main(String[] args) {

		ObjectMapper objectMapper = JsonFactory.create();
		parseLongToDate(objectMapper);
		parseDateStringToDate(objectMapper);
		generateDateStringInJson();

	}

	private static void parseLongToDate(ObjectMapper objectMapper) {

		String paymentJson = "{ \"paymentDate\" : 1434016456493 }";
		// paymentDate value is a long representation of a date, in
		// milliseconds.

		Payment payment = objectMapper.readValue(paymentJson, Payment.class);

		System.out.println("payment.paymentDate = " + payment.paymentDate);

	}

	private static void parseDateStringToDate(ObjectMapper objectMapper) {

		String paymentJson = "{ \"paymentDate\" : \"2015-06-11T12:33:00.014Z\"}";
		// paymentDate is expressed as a date string instead of a long
		// millisecond value

		Payment payment = objectMapper.readValue(paymentJson, Payment.class);

		System.out.println("payment.paymentDate = " + payment.paymentDate);

	}

	private static void generateDateStringInJson() {

		ObjectMapper objectMapper = JsonFactory.createUseJSONDates();

		Date d = new Date();

		String dateJson = objectMapper.writeValueAsString(d);

		System.out.println("dateJson = " + dateJson);

	}

}
