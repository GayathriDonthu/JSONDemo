package com.jackson.treeModel;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTreeModel {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		String carJSON = "{ \"brand\" : \"Mercedes\", \"doors\" : 5}";

		try {
			JsonNode node = objectMapper.readValue(carJSON, JsonNode.class);

			JsonNode brandNode = node.get("brand");
			String brand = brandNode.asText();
			System.out.println("brand = " + brand);

			JsonNode doorsNode = node.get("doors");
			int doors = doorsNode.asInt();
			System.out.println("doors = " + doors);

		} catch (IOException e) {

		}

	}
}
