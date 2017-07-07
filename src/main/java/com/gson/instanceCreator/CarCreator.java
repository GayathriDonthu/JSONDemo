package com.gson.instanceCreator;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;
import com.gson.utilities.Car;

public class CarCreator implements InstanceCreator<Car> {

	@Override
	public Car createInstance(Type type) {
		Car car = new Car();
		car.brand = "Swift";
		return car;
	}
}
