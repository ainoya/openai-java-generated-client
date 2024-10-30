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
import com.github.ainoya.client.model.CreateTranslationResponseJson;
import com.github.ainoya.client.model.CreateTranslationResponseVerboseJson;
import com.github.ainoya.client.model.TranscriptionSegment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateTranslation200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateTranslation200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateTranslation200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateTranslation200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateTranslationResponseJson> adapterCreateTranslationResponseJson = gson.getDelegateAdapter(this, TypeToken.get(CreateTranslationResponseJson.class));
            final TypeAdapter<CreateTranslationResponseVerboseJson> adapterCreateTranslationResponseVerboseJson = gson.getDelegateAdapter(this, TypeToken.get(CreateTranslationResponseVerboseJson.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateTranslation200Response>() {
                @Override
                public void write(JsonWriter out, CreateTranslation200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateTranslationResponseJson`
                    if (value.getActualInstance() instanceof CreateTranslationResponseJson) {
                        JsonElement element = adapterCreateTranslationResponseJson.toJsonTree((CreateTranslationResponseJson)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateTranslationResponseVerboseJson`
                    if (value.getActualInstance() instanceof CreateTranslationResponseVerboseJson) {
                        JsonElement element = adapterCreateTranslationResponseVerboseJson.toJsonTree((CreateTranslationResponseVerboseJson)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson");
                }

                @Override
                public CreateTranslation200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateTranslationResponseJson
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateTranslationResponseJson.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateTranslationResponseJson;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateTranslationResponseJson'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateTranslationResponseJson failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateTranslationResponseJson'", e);
                    }
                    // deserialize CreateTranslationResponseVerboseJson
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateTranslationResponseVerboseJson.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateTranslationResponseVerboseJson;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateTranslationResponseVerboseJson'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateTranslationResponseVerboseJson failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateTranslationResponseVerboseJson'", e);
                    }

                    if (match == 1) {
                        CreateTranslation200Response ret = new CreateTranslation200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateTranslation200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateTranslation200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateTranslation200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateTranslationResponseJson", CreateTranslationResponseJson.class);
        schemas.put("CreateTranslationResponseVerboseJson", CreateTranslationResponseVerboseJson.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateTranslation200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateTranslationResponseJson, CreateTranslationResponseVerboseJson
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateTranslationResponseJson) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateTranslationResponseVerboseJson) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateTranslationResponseJson, CreateTranslationResponseVerboseJson");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateTranslationResponseJson, CreateTranslationResponseVerboseJson
     *
     * @return The actual instance (CreateTranslationResponseJson, CreateTranslationResponseVerboseJson)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateTranslationResponseJson`. If the actual instance is not `CreateTranslationResponseJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTranslationResponseJson`
     * @throws ClassCastException if the instance is not `CreateTranslationResponseJson`
     */
    public CreateTranslationResponseJson getCreateTranslationResponseJson() throws ClassCastException {
        return (CreateTranslationResponseJson)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateTranslationResponseVerboseJson`. If the actual instance is not `CreateTranslationResponseVerboseJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTranslationResponseVerboseJson`
     * @throws ClassCastException if the instance is not `CreateTranslationResponseVerboseJson`
     */
    public CreateTranslationResponseVerboseJson getCreateTranslationResponseVerboseJson() throws ClassCastException {
        return (CreateTranslationResponseVerboseJson)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateTranslation200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateTranslationResponseJson
        try {
            CreateTranslationResponseJson.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateTranslationResponseJson failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateTranslationResponseVerboseJson
        try {
            CreateTranslationResponseVerboseJson.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateTranslationResponseVerboseJson failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateTranslation200Response with oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateTranslation200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateTranslation200Response
     * @throws IOException if the JSON string is invalid with respect to CreateTranslation200Response
     */
    public static CreateTranslation200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateTranslation200Response.class);
    }

    /**
     * Convert an instance of CreateTranslation200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

