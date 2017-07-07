package com.boon.annotations;

import org.boon.json.annotations.JsonInclude;

public class Car {

	public String brand = null;
	public int doors = 0;

	// @JsonIgnore
	@JsonInclude
	public String comment = "blabla";

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, int doors) {
		this.brand = brand;
		this.doors = doors;
	}

}
