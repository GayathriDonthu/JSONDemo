package com.gson.jsonReader;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class GsonJsonReader {

	public static void main(String[] args) throws IOException {

		String json = "{ \"brand\" : \"Swift\", \"doors\" : 6}";

		JsonReader jsonReader = new JsonReader(new StringReader(json));

		while (jsonReader.hasNext()) {

			JsonToken token = jsonReader.peek();

			System.out.println(token);

			if (JsonToken.BEGIN_OBJECT.equals(token)) {
				jsonReader.beginObject();
			} else if (JsonToken.NAME.equals(token)) {
				String name = jsonReader.nextName();
				System.out.println(name);
			} else if (JsonToken.STRING.equals(token)) {
				String value = jsonReader.nextString();
				System.out.println(value);
			} else if (JsonToken.NUMBER.equals(token)) {
				long value = jsonReader.nextLong();
				System.out.println(value);
			}
		}

	}

}
