package com.gson.excludeFields;

import com.google.gson.annotations.Expose;

public class CarExpose {

	@Expose(serialize = false, deserialize = false)
	public String brand = null;

	@Expose(serialize = true, deserialize = true)
	public int doors = 0;

}
