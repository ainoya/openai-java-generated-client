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
import com.github.ainoya.client.model.RunStepObject;
import com.github.ainoya.client.model.RunStepStreamEventOneOf;
import com.github.ainoya.client.model.RunStepStreamEventOneOf1;
import com.github.ainoya.client.model.RunStepStreamEventOneOf2;
import com.github.ainoya.client.model.RunStepStreamEventOneOf3;
import com.github.ainoya.client.model.RunStepStreamEventOneOf4;
import com.github.ainoya.client.model.RunStepStreamEventOneOf5;
import com.github.ainoya.client.model.RunStepStreamEventOneOf6;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T13:08:57.656944544Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepStreamEvent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStepStreamEvent.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStepStreamEvent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStepStreamEvent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStepStreamEventOneOf> adapterRunStepStreamEventOneOf = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf.class));
            final TypeAdapter<RunStepStreamEventOneOf1> adapterRunStepStreamEventOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf1.class));
            final TypeAdapter<RunStepStreamEventOneOf2> adapterRunStepStreamEventOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf2.class));
            final TypeAdapter<RunStepStreamEventOneOf3> adapterRunStepStreamEventOneOf3 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf3.class));
            final TypeAdapter<RunStepStreamEventOneOf4> adapterRunStepStreamEventOneOf4 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf4.class));
            final TypeAdapter<RunStepStreamEventOneOf5> adapterRunStepStreamEventOneOf5 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf5.class));
            final TypeAdapter<RunStepStreamEventOneOf6> adapterRunStepStreamEventOneOf6 = gson.getDelegateAdapter(this, TypeToken.get(RunStepStreamEventOneOf6.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStepStreamEvent>() {
                @Override
                public void write(JsonWriter out, RunStepStreamEvent value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStepStreamEventOneOf`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf) {
                        JsonElement element = adapterRunStepStreamEventOneOf.toJsonTree((RunStepStreamEventOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf1`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf1) {
                        JsonElement element = adapterRunStepStreamEventOneOf1.toJsonTree((RunStepStreamEventOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf2`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf2) {
                        JsonElement element = adapterRunStepStreamEventOneOf2.toJsonTree((RunStepStreamEventOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf3`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf3) {
                        JsonElement element = adapterRunStepStreamEventOneOf3.toJsonTree((RunStepStreamEventOneOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf4`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf4) {
                        JsonElement element = adapterRunStepStreamEventOneOf4.toJsonTree((RunStepStreamEventOneOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf5`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf5) {
                        JsonElement element = adapterRunStepStreamEventOneOf5.toJsonTree((RunStepStreamEventOneOf5)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepStreamEventOneOf6`
                    if (value.getActualInstance() instanceof RunStepStreamEventOneOf6) {
                        JsonElement element = adapterRunStepStreamEventOneOf6.toJsonTree((RunStepStreamEventOneOf6)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6");
                }

                @Override
                public RunStepStreamEvent read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStepStreamEventOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf'", e);
                    }
                    // deserialize RunStepStreamEventOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf1'", e);
                    }
                    // deserialize RunStepStreamEventOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf2'", e);
                    }
                    // deserialize RunStepStreamEventOneOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf3;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf3'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf3'", e);
                    }
                    // deserialize RunStepStreamEventOneOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf4;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf4'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf4'", e);
                    }
                    // deserialize RunStepStreamEventOneOf5
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf5.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf5;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf5'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf5 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf5'", e);
                    }
                    // deserialize RunStepStreamEventOneOf6
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepStreamEventOneOf6.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepStreamEventOneOf6;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepStreamEventOneOf6'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf6 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepStreamEventOneOf6'", e);
                    }

                    if (match == 1) {
                        RunStepStreamEvent ret = new RunStepStreamEvent();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStepStreamEvent: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStepStreamEvent() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStepStreamEvent(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStepStreamEventOneOf", RunStepStreamEventOneOf.class);
        schemas.put("RunStepStreamEventOneOf1", RunStepStreamEventOneOf1.class);
        schemas.put("RunStepStreamEventOneOf2", RunStepStreamEventOneOf2.class);
        schemas.put("RunStepStreamEventOneOf3", RunStepStreamEventOneOf3.class);
        schemas.put("RunStepStreamEventOneOf4", RunStepStreamEventOneOf4.class);
        schemas.put("RunStepStreamEventOneOf5", RunStepStreamEventOneOf5.class);
        schemas.put("RunStepStreamEventOneOf6", RunStepStreamEventOneOf6.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStepStreamEvent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStepStreamEventOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf5) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepStreamEventOneOf6) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6
     *
     * @return The actual instance (RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStepStreamEventOneOf`. If the actual instance is not `RunStepStreamEventOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf`
     */
    public RunStepStreamEventOneOf getRunStepStreamEventOneOf() throws ClassCastException {
        return (RunStepStreamEventOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf1`. If the actual instance is not `RunStepStreamEventOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf1`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf1`
     */
    public RunStepStreamEventOneOf1 getRunStepStreamEventOneOf1() throws ClassCastException {
        return (RunStepStreamEventOneOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf2`. If the actual instance is not `RunStepStreamEventOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf2`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf2`
     */
    public RunStepStreamEventOneOf2 getRunStepStreamEventOneOf2() throws ClassCastException {
        return (RunStepStreamEventOneOf2)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf3`. If the actual instance is not `RunStepStreamEventOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf3`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf3`
     */
    public RunStepStreamEventOneOf3 getRunStepStreamEventOneOf3() throws ClassCastException {
        return (RunStepStreamEventOneOf3)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf4`. If the actual instance is not `RunStepStreamEventOneOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf4`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf4`
     */
    public RunStepStreamEventOneOf4 getRunStepStreamEventOneOf4() throws ClassCastException {
        return (RunStepStreamEventOneOf4)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf5`. If the actual instance is not `RunStepStreamEventOneOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf5`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf5`
     */
    public RunStepStreamEventOneOf5 getRunStepStreamEventOneOf5() throws ClassCastException {
        return (RunStepStreamEventOneOf5)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepStreamEventOneOf6`. If the actual instance is not `RunStepStreamEventOneOf6`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepStreamEventOneOf6`
     * @throws ClassCastException if the instance is not `RunStepStreamEventOneOf6`
     */
    public RunStepStreamEventOneOf6 getRunStepStreamEventOneOf6() throws ClassCastException {
        return (RunStepStreamEventOneOf6)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RunStepStreamEvent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with RunStepStreamEventOneOf
        try {
            RunStepStreamEventOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf1
        try {
            RunStepStreamEventOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf2
        try {
            RunStepStreamEventOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf3
        try {
            RunStepStreamEventOneOf3.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf4
        try {
            RunStepStreamEventOneOf4.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf5
        try {
            RunStepStreamEventOneOf5.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf5 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepStreamEventOneOf6
        try {
            RunStepStreamEventOneOf6.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepStreamEventOneOf6 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for RunStepStreamEvent with oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of RunStepStreamEvent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RunStepStreamEvent
     * @throws IOException if the JSON string is invalid with respect to RunStepStreamEvent
     */
    public static RunStepStreamEvent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RunStepStreamEvent.class);
    }

    /**
     * Convert an instance of RunStepStreamEvent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

