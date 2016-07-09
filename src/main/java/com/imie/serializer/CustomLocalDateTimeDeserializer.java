package com.imie.serializer;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * This class is a date deserializer.
 * Format is yyyy-MM-dd HH:mm:ss
 *
 * Created by axel on 14/06/16.
 */
public class CustomLocalDateTimeDeserializer extends StdScalarDeserializer<LocalDateTime> {

    private final static DateTimeFormatter DATETIME_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    public CustomLocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }

    protected CustomLocalDateTimeDeserializer(Class<?> vc) {
        super(vc);
    }

    /**
     * This function deserialize date
     *
     * @param jp
     * @param ctxt
     * @return
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public LocalDateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String dateStr = null;
        String timeStr = null;
        String fieldName = null;

        while (jp.hasCurrentToken()) {
            JsonToken token = jp.nextToken();
            if (token == JsonToken.FIELD_NAME) {
                fieldName = jp.getCurrentName();
            } else if (token == JsonToken.VALUE_STRING) {
                if (StringUtils.equals(fieldName, "date")) {
                    dateStr = jp.getValueAsString();
                } else if (StringUtils.equals(fieldName, "time")) {
                    timeStr = jp.getValueAsString();
                } else {
                    throw new JsonParseException("Unexpected field name", jp.getTokenLocation());
                }
            } else if (token == JsonToken.END_OBJECT) {
                break;
            }
        }
        if (dateStr != null && timeStr != null) {
            LocalDateTime dateTime = LocalDateTime.parse(dateStr + " " + timeStr, DATETIME_FORMAT);
            return dateTime;
        }
        return null;
    }
}