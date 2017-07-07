package com.jackson.write.annotations;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class OptimizedBooleanSerializer extends JsonSerializer<Boolean> {

	@Override
	public void serialize(Boolean bool, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {

		if (bool)
			jsonGenerator.writeNumber(1);
		else
			jsonGenerator.writeNumber(0);

	}

}
