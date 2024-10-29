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
import com.github.ainoya.client.model.AutoChunkingStrategy;
import com.github.ainoya.client.model.StaticChunkingStrategy;
import com.github.ainoya.client.model.StaticChunkingStrategyStatic;
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
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AutoChunkingStrategy> adapterAutoChunkingStrategy = gson.getDelegateAdapter(this, TypeToken.get(AutoChunkingStrategy.class));
            final TypeAdapter<StaticChunkingStrategy> adapterStaticChunkingStrategy = gson.getDelegateAdapter(this, TypeToken.get(StaticChunkingStrategy.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy>() {
                @Override
                public void write(JsonWriter out, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AutoChunkingStrategy`
                    if (value.getActualInstance() instanceof AutoChunkingStrategy) {
                        JsonElement element = adapterAutoChunkingStrategy.toJsonTree((AutoChunkingStrategy)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `StaticChunkingStrategy`
                    if (value.getActualInstance() instanceof StaticChunkingStrategy) {
                        JsonElement element = adapterStaticChunkingStrategy.toJsonTree((StaticChunkingStrategy)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AutoChunkingStrategy, StaticChunkingStrategy");
                }

                @Override
                public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AutoChunkingStrategy
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AutoChunkingStrategy.validateJsonElement(jsonElement);
                        actualAdapter = adapterAutoChunkingStrategy;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AutoChunkingStrategy'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AutoChunkingStrategy failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AutoChunkingStrategy'", e);
                    }
                    // deserialize StaticChunkingStrategy
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StaticChunkingStrategy.validateJsonElement(jsonElement);
                        actualAdapter = adapterStaticChunkingStrategy;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'StaticChunkingStrategy'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for StaticChunkingStrategy failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'StaticChunkingStrategy'", e);
                    }

                    if (match == 1) {
                        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy ret = new CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AutoChunkingStrategy", AutoChunkingStrategy.class);
        schemas.put("StaticChunkingStrategy", StaticChunkingStrategy.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AutoChunkingStrategy, StaticChunkingStrategy
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AutoChunkingStrategy) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StaticChunkingStrategy) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AutoChunkingStrategy, StaticChunkingStrategy");
    }

    /**
     * Get the actual instance, which can be the following:
     * AutoChunkingStrategy, StaticChunkingStrategy
     *
     * @return The actual instance (AutoChunkingStrategy, StaticChunkingStrategy)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AutoChunkingStrategy`. If the actual instance is not `AutoChunkingStrategy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AutoChunkingStrategy`
     * @throws ClassCastException if the instance is not `AutoChunkingStrategy`
     */
    public AutoChunkingStrategy getAutoChunkingStrategy() throws ClassCastException {
        return (AutoChunkingStrategy)super.getActualInstance();
    }
    /**
     * Get the actual instance of `StaticChunkingStrategy`. If the actual instance is not `StaticChunkingStrategy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StaticChunkingStrategy`
     * @throws ClassCastException if the instance is not `StaticChunkingStrategy`
     */
    public StaticChunkingStrategy getStaticChunkingStrategy() throws ClassCastException {
        return (StaticChunkingStrategy)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AutoChunkingStrategy
        try {
            AutoChunkingStrategy.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AutoChunkingStrategy failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with StaticChunkingStrategy
        try {
            StaticChunkingStrategy.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for StaticChunkingStrategy failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy with oneOf schemas: AutoChunkingStrategy, StaticChunkingStrategy. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
     * @throws IOException if the JSON string is invalid with respect to CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
     */
    public static CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.class);
    }

    /**
     * Convert an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

