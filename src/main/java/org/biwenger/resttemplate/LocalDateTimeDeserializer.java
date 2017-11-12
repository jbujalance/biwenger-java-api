package org.biwenger.resttemplate;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

    public LocalDateTimeDeserializer(Class<?> vc) {
        super(vc);
    }

    public LocalDateTimeDeserializer(JavaType valueType) {
        super(valueType);
    }

    public LocalDateTimeDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public LocalDateTime deserialize(JsonParser pJsonParser, DeserializationContext pDeserializationContext) throws IOException, JsonProcessingException {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(pJsonParser.getLongValue()), ZoneId.systemDefault());
    }
}
