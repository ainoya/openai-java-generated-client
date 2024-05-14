/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.ainoya.client.model;

import java.util.Objects;
import com.github.ainoya.client.model.ChatCompletionMessageToolCall;
import com.github.ainoya.client.model.ChatCompletionRequestAssistantMessage;
import com.github.ainoya.client.model.ChatCompletionRequestAssistantMessageFunctionCall;
import com.github.ainoya.client.model.ChatCompletionRequestFunctionMessage;
import com.github.ainoya.client.model.ChatCompletionRequestSystemMessage;
import com.github.ainoya.client.model.ChatCompletionRequestToolMessage;
import com.github.ainoya.client.model.ChatCompletionRequestUserMessage;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T09:39:57.939147Z[Etc/UTC]")
public class ChatCompletionRequestMessage extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChatCompletionRequestMessage.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChatCompletionRequestMessage.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChatCompletionRequestMessage' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChatCompletionRequestSystemMessage> adapterChatCompletionRequestSystemMessage = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestSystemMessage.class));
            final TypeAdapter<ChatCompletionRequestUserMessage> adapterChatCompletionRequestUserMessage = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestUserMessage.class));
            final TypeAdapter<ChatCompletionRequestAssistantMessage> adapterChatCompletionRequestAssistantMessage = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestAssistantMessage.class));
            final TypeAdapter<ChatCompletionRequestToolMessage> adapterChatCompletionRequestToolMessage = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestToolMessage.class));
            final TypeAdapter<ChatCompletionRequestFunctionMessage> adapterChatCompletionRequestFunctionMessage = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestFunctionMessage.class));

            return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestMessage>() {
                @Override
                public void write(JsonWriter out, ChatCompletionRequestMessage value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ChatCompletionRequestSystemMessage`
                    if (value.getActualInstance() instanceof ChatCompletionRequestSystemMessage) {
                      JsonElement element = adapterChatCompletionRequestSystemMessage.toJsonTree((ChatCompletionRequestSystemMessage)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ChatCompletionRequestUserMessage`
                    if (value.getActualInstance() instanceof ChatCompletionRequestUserMessage) {
                      JsonElement element = adapterChatCompletionRequestUserMessage.toJsonTree((ChatCompletionRequestUserMessage)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ChatCompletionRequestAssistantMessage`
                    if (value.getActualInstance() instanceof ChatCompletionRequestAssistantMessage) {
                      JsonElement element = adapterChatCompletionRequestAssistantMessage.toJsonTree((ChatCompletionRequestAssistantMessage)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ChatCompletionRequestToolMessage`
                    if (value.getActualInstance() instanceof ChatCompletionRequestToolMessage) {
                      JsonElement element = adapterChatCompletionRequestToolMessage.toJsonTree((ChatCompletionRequestToolMessage)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ChatCompletionRequestFunctionMessage`
                    if (value.getActualInstance() instanceof ChatCompletionRequestFunctionMessage) {
                      JsonElement element = adapterChatCompletionRequestFunctionMessage.toJsonTree((ChatCompletionRequestFunctionMessage)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage");
                }

                @Override
                public ChatCompletionRequestMessage read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ChatCompletionRequestSystemMessage
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionRequestSystemMessage.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionRequestSystemMessage;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionRequestSystemMessage'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionRequestSystemMessage failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionRequestSystemMessage'", e);
                    }
                    // deserialize ChatCompletionRequestUserMessage
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionRequestUserMessage.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionRequestUserMessage;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionRequestUserMessage'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionRequestUserMessage failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionRequestUserMessage'", e);
                    }
                    // deserialize ChatCompletionRequestAssistantMessage
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionRequestAssistantMessage.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionRequestAssistantMessage;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionRequestAssistantMessage'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionRequestAssistantMessage failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionRequestAssistantMessage'", e);
                    }
                    // deserialize ChatCompletionRequestToolMessage
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionRequestToolMessage.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionRequestToolMessage;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionRequestToolMessage'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionRequestToolMessage failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionRequestToolMessage'", e);
                    }
                    // deserialize ChatCompletionRequestFunctionMessage
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionRequestFunctionMessage.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionRequestFunctionMessage;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionRequestFunctionMessage'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionRequestFunctionMessage failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionRequestFunctionMessage'", e);
                    }

                    if (match == 1) {
                        ChatCompletionRequestMessage ret = new ChatCompletionRequestMessage();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ChatCompletionRequestMessage: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ChatCompletionRequestMessage() {
        super("oneOf", Boolean.FALSE);
    }

    public ChatCompletionRequestMessage(ChatCompletionRequestAssistantMessage o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionRequestMessage(ChatCompletionRequestFunctionMessage o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionRequestMessage(ChatCompletionRequestSystemMessage o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionRequestMessage(ChatCompletionRequestToolMessage o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionRequestMessage(ChatCompletionRequestUserMessage o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ChatCompletionRequestSystemMessage", ChatCompletionRequestSystemMessage.class);
        schemas.put("ChatCompletionRequestUserMessage", ChatCompletionRequestUserMessage.class);
        schemas.put("ChatCompletionRequestAssistantMessage", ChatCompletionRequestAssistantMessage.class);
        schemas.put("ChatCompletionRequestToolMessage", ChatCompletionRequestToolMessage.class);
        schemas.put("ChatCompletionRequestFunctionMessage", ChatCompletionRequestFunctionMessage.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ChatCompletionRequestMessage.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ChatCompletionRequestSystemMessage) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ChatCompletionRequestUserMessage) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ChatCompletionRequestAssistantMessage) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ChatCompletionRequestToolMessage) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ChatCompletionRequestFunctionMessage) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage
     *
     * @return The actual instance (ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChatCompletionRequestSystemMessage`. If the actual instance is not `ChatCompletionRequestSystemMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionRequestSystemMessage`
     * @throws ClassCastException if the instance is not `ChatCompletionRequestSystemMessage`
     */
    public ChatCompletionRequestSystemMessage getChatCompletionRequestSystemMessage() throws ClassCastException {
        return (ChatCompletionRequestSystemMessage)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ChatCompletionRequestUserMessage`. If the actual instance is not `ChatCompletionRequestUserMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionRequestUserMessage`
     * @throws ClassCastException if the instance is not `ChatCompletionRequestUserMessage`
     */
    public ChatCompletionRequestUserMessage getChatCompletionRequestUserMessage() throws ClassCastException {
        return (ChatCompletionRequestUserMessage)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ChatCompletionRequestAssistantMessage`. If the actual instance is not `ChatCompletionRequestAssistantMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionRequestAssistantMessage`
     * @throws ClassCastException if the instance is not `ChatCompletionRequestAssistantMessage`
     */
    public ChatCompletionRequestAssistantMessage getChatCompletionRequestAssistantMessage() throws ClassCastException {
        return (ChatCompletionRequestAssistantMessage)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ChatCompletionRequestToolMessage`. If the actual instance is not `ChatCompletionRequestToolMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionRequestToolMessage`
     * @throws ClassCastException if the instance is not `ChatCompletionRequestToolMessage`
     */
    public ChatCompletionRequestToolMessage getChatCompletionRequestToolMessage() throws ClassCastException {
        return (ChatCompletionRequestToolMessage)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ChatCompletionRequestFunctionMessage`. If the actual instance is not `ChatCompletionRequestFunctionMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionRequestFunctionMessage`
     * @throws ClassCastException if the instance is not `ChatCompletionRequestFunctionMessage`
     */
    public ChatCompletionRequestFunctionMessage getChatCompletionRequestFunctionMessage() throws ClassCastException {
        return (ChatCompletionRequestFunctionMessage)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestMessage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ChatCompletionRequestSystemMessage
    try {
      ChatCompletionRequestSystemMessage.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionRequestSystemMessage failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ChatCompletionRequestUserMessage
    try {
      ChatCompletionRequestUserMessage.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionRequestUserMessage failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ChatCompletionRequestAssistantMessage
    try {
      ChatCompletionRequestAssistantMessage.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionRequestAssistantMessage failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ChatCompletionRequestToolMessage
    try {
      ChatCompletionRequestToolMessage.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionRequestToolMessage failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ChatCompletionRequestFunctionMessage
    try {
      ChatCompletionRequestFunctionMessage.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionRequestFunctionMessage failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ChatCompletionRequestMessage with oneOf schemas: ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ChatCompletionRequestMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionRequestMessage
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestMessage
  */
  public static ChatCompletionRequestMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionRequestMessage.class);
  }

 /**
  * Convert an instance of ChatCompletionRequestMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

