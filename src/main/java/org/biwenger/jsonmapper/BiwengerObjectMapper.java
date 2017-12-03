package org.biwenger.jsonmapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDateTime;

public class BiwengerObjectMapper extends ObjectMapper {

    /**
     * We register the dateTime module directly in the constructor.
     * Other modules can be registered here too.
     */
    public BiwengerObjectMapper() {
        // Configuration
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Register custom modules
        SimpleModule localDateTimeModule = new SimpleModule();
        localDateTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(LocalDateTime.class));
        this.registerModule(localDateTimeModule);
    }
}
