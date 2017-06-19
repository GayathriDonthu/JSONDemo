package com.json.jsonGenerator;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class GenerateJson {

	public static void main(String[] args) {

		JsonFactory factory = new JsonFactory();

		try {
			JsonGenerator generator = factory.createGenerator(new File("src/main/resources/file/JsonOutput1.json"),
					JsonEncoding.UTF8);

			generator.writeStartObject();
			generator.writeStringField("brand", "Mercedes");
			generator.writeNumberField("doors", 5);
			generator.writeEndObject();

			generator.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
