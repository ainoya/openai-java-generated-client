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
import com.github.ainoya.client.model.AssistantToolsCode;
import com.github.ainoya.client.model.AssistantToolsFileSearchTypeOnly;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateMessageRequestAttachmentsInnerToolsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateMessageRequestAttachmentsInnerToolsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateMessageRequestAttachmentsInnerToolsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateMessageRequestAttachmentsInnerToolsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AssistantToolsCode> adapterAssistantToolsCode = gson.getDelegateAdapter(this, TypeToken.get(AssistantToolsCode.class));
            final TypeAdapter<AssistantToolsFileSearchTypeOnly> adapterAssistantToolsFileSearchTypeOnly = gson.getDelegateAdapter(this, TypeToken.get(AssistantToolsFileSearchTypeOnly.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateMessageRequestAttachmentsInnerToolsInner>() {
                @Override
                public void write(JsonWriter out, CreateMessageRequestAttachmentsInnerToolsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AssistantToolsCode`
                    if (value.getActualInstance() instanceof AssistantToolsCode) {
                        JsonElement element = adapterAssistantToolsCode.toJsonTree((AssistantToolsCode)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AssistantToolsFileSearchTypeOnly`
                    if (value.getActualInstance() instanceof AssistantToolsFileSearchTypeOnly) {
                        JsonElement element = adapterAssistantToolsFileSearchTypeOnly.toJsonTree((AssistantToolsFileSearchTypeOnly)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AssistantToolsCode, AssistantToolsFileSearchTypeOnly");
                }

                @Override
                public CreateMessageRequestAttachmentsInnerToolsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AssistantToolsCode
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AssistantToolsCode.validateJsonElement(jsonElement);
                        actualAdapter = adapterAssistantToolsCode;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AssistantToolsCode'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AssistantToolsCode failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AssistantToolsCode'", e);
                    }
                    // deserialize AssistantToolsFileSearchTypeOnly
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AssistantToolsFileSearchTypeOnly.validateJsonElement(jsonElement);
                        actualAdapter = adapterAssistantToolsFileSearchTypeOnly;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AssistantToolsFileSearchTypeOnly'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AssistantToolsFileSearchTypeOnly failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AssistantToolsFileSearchTypeOnly'", e);
                    }

                    if (match == 1) {
                        CreateMessageRequestAttachmentsInnerToolsInner ret = new CreateMessageRequestAttachmentsInnerToolsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateMessageRequestAttachmentsInnerToolsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateMessageRequestAttachmentsInnerToolsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateMessageRequestAttachmentsInnerToolsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AssistantToolsCode", AssistantToolsCode.class);
        schemas.put("AssistantToolsFileSearchTypeOnly", AssistantToolsFileSearchTypeOnly.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateMessageRequestAttachmentsInnerToolsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AssistantToolsCode, AssistantToolsFileSearchTypeOnly
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AssistantToolsCode) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AssistantToolsFileSearchTypeOnly) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AssistantToolsCode, AssistantToolsFileSearchTypeOnly");
    }

    /**
     * Get the actual instance, which can be the following:
     * AssistantToolsCode, AssistantToolsFileSearchTypeOnly
     *
     * @return The actual instance (AssistantToolsCode, AssistantToolsFileSearchTypeOnly)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AssistantToolsCode`. If the actual instance is not `AssistantToolsCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssistantToolsCode`
     * @throws ClassCastException if the instance is not `AssistantToolsCode`
     */
    public AssistantToolsCode getAssistantToolsCode() throws ClassCastException {
        return (AssistantToolsCode)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AssistantToolsFileSearchTypeOnly`. If the actual instance is not `AssistantToolsFileSearchTypeOnly`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssistantToolsFileSearchTypeOnly`
     * @throws ClassCastException if the instance is not `AssistantToolsFileSearchTypeOnly`
     */
    public AssistantToolsFileSearchTypeOnly getAssistantToolsFileSearchTypeOnly() throws ClassCastException {
        return (AssistantToolsFileSearchTypeOnly)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateMessageRequestAttachmentsInnerToolsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AssistantToolsCode
        try {
            AssistantToolsCode.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AssistantToolsCode failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AssistantToolsFileSearchTypeOnly
        try {
            AssistantToolsFileSearchTypeOnly.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AssistantToolsFileSearchTypeOnly failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateMessageRequestAttachmentsInnerToolsInner with oneOf schemas: AssistantToolsCode, AssistantToolsFileSearchTypeOnly. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateMessageRequestAttachmentsInnerToolsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateMessageRequestAttachmentsInnerToolsInner
     * @throws IOException if the JSON string is invalid with respect to CreateMessageRequestAttachmentsInnerToolsInner
     */
    public static CreateMessageRequestAttachmentsInnerToolsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateMessageRequestAttachmentsInnerToolsInner.class);
    }

    /**
     * Convert an instance of CreateMessageRequestAttachmentsInnerToolsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

