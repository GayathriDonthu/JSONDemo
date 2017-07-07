package com.boon.parse.json;

import java.util.List;
import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import com.boon.uilities.Fleet;

public class JsonIntoMaps {

	public static void main(String[] args) {

		String fleetString = "{ \"cars\" : [{\"brand\" : \"BMW\", \"doors\" : 5}, {\"brand\" : \"Audi\", \"doors\" : 6}]}";

		ObjectMapper objectMapper = JsonFactory.create();

		Fleet fleet = objectMapper.fromJson(fleetString, Fleet.class);

		Map fleetMap = objectMapper.readValue(fleetString, Map.class);

		List<Map> carList = (List<Map>) fleetMap.get("cars");

		for (Map carMap : carList) {

			String brand = (String) carMap.get("brand");
			int doors = (int) carMap.get("doors");

			System.out.println("brand = " + brand);
			System.out.println("doors = " + doors);
		}

	}

}
