/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.ainoya.client.model;

import java.util.Objects;
import com.github.ainoya.client.model.ThreadObject;
import com.github.ainoya.client.model.ThreadStreamEventOneOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.github.ainoya.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T00:41:41.163543671Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ThreadStreamEvent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ThreadStreamEvent.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ThreadStreamEvent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ThreadStreamEvent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ThreadStreamEventOneOf> adapterThreadStreamEventOneOf = gson.getDelegateAdapter(this, TypeToken.get(ThreadStreamEventOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<ThreadStreamEvent>() {
                @Override
                public void write(JsonWriter out, ThreadStreamEvent value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ThreadStreamEventOneOf`
                    if (value.getActualInstance() instanceof ThreadStreamEventOneOf) {
                        JsonElement element = adapterThreadStreamEventOneOf.toJsonTree((ThreadStreamEventOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ThreadStreamEventOneOf");
                }

                @Override
                public ThreadStreamEvent read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ThreadStreamEventOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ThreadStreamEventOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterThreadStreamEventOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ThreadStreamEventOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ThreadStreamEventOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ThreadStreamEventOneOf'", e);
                    }

                    if (match == 1) {
                        ThreadStreamEvent ret = new ThreadStreamEvent();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ThreadStreamEvent: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ThreadStreamEvent() {
        super("oneOf", Boolean.FALSE);
    }

    public ThreadStreamEvent(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ThreadStreamEventOneOf", ThreadStreamEventOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ThreadStreamEvent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ThreadStreamEventOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ThreadStreamEventOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ThreadStreamEventOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * ThreadStreamEventOneOf
     *
     * @return The actual instance (ThreadStreamEventOneOf)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ThreadStreamEventOneOf`. If the actual instance is not `ThreadStreamEventOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ThreadStreamEventOneOf`
     * @throws ClassCastException if the instance is not `ThreadStreamEventOneOf`
     */
    public ThreadStreamEventOneOf getThreadStreamEventOneOf() throws ClassCastException {
        return (ThreadStreamEventOneOf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ThreadStreamEvent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ThreadStreamEventOneOf
        try {
            ThreadStreamEventOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ThreadStreamEventOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ThreadStreamEvent with oneOf schemas: ThreadStreamEventOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ThreadStreamEvent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ThreadStreamEvent
     * @throws IOException if the JSON string is invalid with respect to ThreadStreamEvent
     */
    public static ThreadStreamEvent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ThreadStreamEvent.class);
    }

    /**
     * Convert an instance of ThreadStreamEvent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

