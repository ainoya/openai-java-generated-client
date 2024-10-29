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
import com.github.ainoya.client.model.ChatCompletionRequestToolMessageContentPart;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:48:55.661559293Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionRequestToolMessageContent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChatCompletionRequestToolMessageContent.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChatCompletionRequestToolMessageContent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChatCompletionRequestToolMessageContent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            final Type typeInstanceListChatCompletionRequestToolMessageContentPart = new TypeToken<List<ChatCompletionRequestToolMessageContentPart>>(){}.getType();
            final TypeAdapter<List<ChatCompletionRequestToolMessageContentPart>> adapterListChatCompletionRequestToolMessageContentPart = (TypeAdapter<List<ChatCompletionRequestToolMessageContentPart>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListChatCompletionRequestToolMessageContentPart));

            return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestToolMessageContent>() {
                @Override
                public void write(JsonWriter out, ChatCompletionRequestToolMessageContent value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `List<ChatCompletionRequestToolMessageContentPart>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof ChatCompletionRequestToolMessageContentPart) {
                            JsonArray array = adapterListChatCompletionRequestToolMessageContentPart.toJsonTree((List<ChatCompletionRequestToolMessageContentPart>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<ChatCompletionRequestToolMessageContentPart>, String");
                }

                @Override
                public ChatCompletionRequestToolMessageContent read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isString()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }
                    // deserialize List<ChatCompletionRequestToolMessageContentPart>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            ChatCompletionRequestToolMessageContentPart.validateJsonElement(element);
                        }
                        actualAdapter = adapterListChatCompletionRequestToolMessageContentPart;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<ChatCompletionRequestToolMessageContentPart>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<ChatCompletionRequestToolMessageContentPart> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<ChatCompletionRequestToolMessageContentPart>'", e);
                    }

                    if (match == 1) {
                        ChatCompletionRequestToolMessageContent ret = new ChatCompletionRequestToolMessageContent();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ChatCompletionRequestToolMessageContent: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ChatCompletionRequestToolMessageContent() {
        super("oneOf", Boolean.FALSE);
    }

    public ChatCompletionRequestToolMessageContent(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("List<ChatCompletionRequestToolMessageContentPart>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ChatCompletionRequestToolMessageContent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<ChatCompletionRequestToolMessageContentPart>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof ChatCompletionRequestToolMessageContentPart) {
                super.setActualInstance(instance);
                return;
            }
        }

        throw new RuntimeException("Invalid instance type. Must be List<ChatCompletionRequestToolMessageContentPart>, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<ChatCompletionRequestToolMessageContentPart>, String
     *
     * @return The actual instance (List<ChatCompletionRequestToolMessageContentPart>, String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }
    /**
     * Get the actual instance of `List<ChatCompletionRequestToolMessageContentPart>`. If the actual instance is not `List<ChatCompletionRequestToolMessageContentPart>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ChatCompletionRequestToolMessageContentPart>`
     * @throws ClassCastException if the instance is not `List<ChatCompletionRequestToolMessageContentPart>`
     */
    public List<ChatCompletionRequestToolMessageContentPart> getListChatCompletionRequestToolMessageContentPart() throws ClassCastException {
        return (List<ChatCompletionRequestToolMessageContentPart>)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestToolMessageContent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with String
        try {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with List<ChatCompletionRequestToolMessageContentPart>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                ChatCompletionRequestToolMessageContentPart.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<ChatCompletionRequestToolMessageContentPart> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ChatCompletionRequestToolMessageContent with oneOf schemas: List<ChatCompletionRequestToolMessageContentPart>, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ChatCompletionRequestToolMessageContent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChatCompletionRequestToolMessageContent
     * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestToolMessageContent
     */
    public static ChatCompletionRequestToolMessageContent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChatCompletionRequestToolMessageContent.class);
    }

    /**
     * Convert an instance of ChatCompletionRequestToolMessageContent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

