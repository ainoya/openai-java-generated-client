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
import com.github.ainoya.client.model.MessageDeltaContentImageFileObject;
import com.github.ainoya.client.model.MessageDeltaContentImageFileObjectImageFile;
import com.github.ainoya.client.model.MessageDeltaContentImageUrlObject;
import com.github.ainoya.client.model.MessageDeltaContentImageUrlObjectImageUrl;
import com.github.ainoya.client.model.MessageDeltaContentRefusalObject;
import com.github.ainoya.client.model.MessageDeltaContentTextObject;
import com.github.ainoya.client.model.MessageDeltaContentTextObjectText;
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
public class MessageDeltaObjectDeltaContentInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MessageDeltaObjectDeltaContentInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MessageDeltaObjectDeltaContentInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MessageDeltaObjectDeltaContentInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageDeltaContentImageFileObject> adapterMessageDeltaContentImageFileObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentImageFileObject.class));
            final TypeAdapter<MessageDeltaContentTextObject> adapterMessageDeltaContentTextObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentTextObject.class));
            final TypeAdapter<MessageDeltaContentRefusalObject> adapterMessageDeltaContentRefusalObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentRefusalObject.class));
            final TypeAdapter<MessageDeltaContentImageUrlObject> adapterMessageDeltaContentImageUrlObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentImageUrlObject.class));

            return (TypeAdapter<T>) new TypeAdapter<MessageDeltaObjectDeltaContentInner>() {
                @Override
                public void write(JsonWriter out, MessageDeltaObjectDeltaContentInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MessageDeltaContentImageFileObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentImageFileObject) {
                        JsonElement element = adapterMessageDeltaContentImageFileObject.toJsonTree((MessageDeltaContentImageFileObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageDeltaContentTextObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentTextObject) {
                        JsonElement element = adapterMessageDeltaContentTextObject.toJsonTree((MessageDeltaContentTextObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageDeltaContentRefusalObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentRefusalObject) {
                        JsonElement element = adapterMessageDeltaContentRefusalObject.toJsonTree((MessageDeltaContentRefusalObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageDeltaContentImageUrlObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentImageUrlObject) {
                        JsonElement element = adapterMessageDeltaContentImageUrlObject.toJsonTree((MessageDeltaContentImageUrlObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject");
                }

                @Override
                public MessageDeltaObjectDeltaContentInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageDeltaContentImageFileObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentImageFileObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentImageFileObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentImageFileObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentImageFileObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentImageFileObject'", e);
                    }
                    // deserialize MessageDeltaContentTextObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentTextObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentTextObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentTextObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentTextObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentTextObject'", e);
                    }
                    // deserialize MessageDeltaContentRefusalObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentRefusalObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentRefusalObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentRefusalObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentRefusalObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentRefusalObject'", e);
                    }
                    // deserialize MessageDeltaContentImageUrlObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentImageUrlObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentImageUrlObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentImageUrlObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentImageUrlObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentImageUrlObject'", e);
                    }

                    if (match == 1) {
                        MessageDeltaObjectDeltaContentInner ret = new MessageDeltaObjectDeltaContentInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MessageDeltaObjectDeltaContentInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MessageDeltaObjectDeltaContentInner() {
        super("oneOf", Boolean.FALSE);
    }

    public MessageDeltaObjectDeltaContentInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageDeltaContentImageFileObject", MessageDeltaContentImageFileObject.class);
        schemas.put("MessageDeltaContentTextObject", MessageDeltaContentTextObject.class);
        schemas.put("MessageDeltaContentRefusalObject", MessageDeltaContentRefusalObject.class);
        schemas.put("MessageDeltaContentImageUrlObject", MessageDeltaContentImageUrlObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MessageDeltaObjectDeltaContentInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MessageDeltaContentImageFileObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageDeltaContentTextObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageDeltaContentRefusalObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageDeltaContentImageUrlObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject
     *
     * @return The actual instance (MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageDeltaContentImageFileObject`. If the actual instance is not `MessageDeltaContentImageFileObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentImageFileObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentImageFileObject`
     */
    public MessageDeltaContentImageFileObject getMessageDeltaContentImageFileObject() throws ClassCastException {
        return (MessageDeltaContentImageFileObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageDeltaContentTextObject`. If the actual instance is not `MessageDeltaContentTextObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentTextObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentTextObject`
     */
    public MessageDeltaContentTextObject getMessageDeltaContentTextObject() throws ClassCastException {
        return (MessageDeltaContentTextObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageDeltaContentRefusalObject`. If the actual instance is not `MessageDeltaContentRefusalObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentRefusalObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentRefusalObject`
     */
    public MessageDeltaContentRefusalObject getMessageDeltaContentRefusalObject() throws ClassCastException {
        return (MessageDeltaContentRefusalObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageDeltaContentImageUrlObject`. If the actual instance is not `MessageDeltaContentImageUrlObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentImageUrlObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentImageUrlObject`
     */
    public MessageDeltaContentImageUrlObject getMessageDeltaContentImageUrlObject() throws ClassCastException {
        return (MessageDeltaContentImageUrlObject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MessageDeltaObjectDeltaContentInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MessageDeltaContentImageFileObject
        try {
            MessageDeltaContentImageFileObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentImageFileObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageDeltaContentTextObject
        try {
            MessageDeltaContentTextObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentTextObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageDeltaContentRefusalObject
        try {
            MessageDeltaContentRefusalObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentRefusalObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageDeltaContentImageUrlObject
        try {
            MessageDeltaContentImageUrlObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentImageUrlObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for MessageDeltaObjectDeltaContentInner with oneOf schemas: MessageDeltaContentImageFileObject, MessageDeltaContentImageUrlObject, MessageDeltaContentRefusalObject, MessageDeltaContentTextObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of MessageDeltaObjectDeltaContentInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MessageDeltaObjectDeltaContentInner
     * @throws IOException if the JSON string is invalid with respect to MessageDeltaObjectDeltaContentInner
     */
    public static MessageDeltaObjectDeltaContentInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MessageDeltaObjectDeltaContentInner.class);
    }

    /**
     * Convert an instance of MessageDeltaObjectDeltaContentInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

