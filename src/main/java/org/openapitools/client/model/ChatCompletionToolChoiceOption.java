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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.ChatCompletionNamedToolChoice;
import org.openapitools.client.model.ChatCompletionNamedToolChoiceFunction;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



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

import tokyo.ainoya.openapi.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T02:02:15.250875Z[Etc/UTC]")
public class ChatCompletionToolChoiceOption extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChatCompletionToolChoiceOption.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChatCompletionToolChoiceOption.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChatCompletionToolChoiceOption' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<ChatCompletionNamedToolChoice> adapterChatCompletionNamedToolChoice = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionNamedToolChoice.class));

            return (TypeAdapter<T>) new TypeAdapter<ChatCompletionToolChoiceOption>() {
                @Override
                public void write(JsonWriter out, ChatCompletionToolChoiceOption value) throws IOException {
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
                    // check if the actual instance is of the type `ChatCompletionNamedToolChoice`
                    if (value.getActualInstance() instanceof ChatCompletionNamedToolChoice) {
                      JsonElement element = adapterChatCompletionNamedToolChoice.toJsonTree((ChatCompletionNamedToolChoice)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ChatCompletionNamedToolChoice, String");
                }

                @Override
                public ChatCompletionToolChoiceOption read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isString()) {
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
                    // deserialize ChatCompletionNamedToolChoice
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ChatCompletionNamedToolChoice.validateJsonElement(jsonElement);
                      actualAdapter = adapterChatCompletionNamedToolChoice;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ChatCompletionNamedToolChoice'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ChatCompletionNamedToolChoice failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ChatCompletionNamedToolChoice'", e);
                    }

                    if (match == 1) {
                        ChatCompletionToolChoiceOption ret = new ChatCompletionToolChoiceOption();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ChatCompletionToolChoiceOption: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ChatCompletionToolChoiceOption() {
        super("oneOf", Boolean.FALSE);
    }

    public ChatCompletionToolChoiceOption(ChatCompletionNamedToolChoice o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionToolChoiceOption(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("ChatCompletionNamedToolChoice", ChatCompletionNamedToolChoice.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ChatCompletionToolChoiceOption.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChatCompletionNamedToolChoice, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ChatCompletionNamedToolChoice) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ChatCompletionNamedToolChoice, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChatCompletionNamedToolChoice, String
     *
     * @return The actual instance (ChatCompletionNamedToolChoice, String)
     */
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
     * Get the actual instance of `ChatCompletionNamedToolChoice`. If the actual instance is not `ChatCompletionNamedToolChoice`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionNamedToolChoice`
     * @throws ClassCastException if the instance is not `ChatCompletionNamedToolChoice`
     */
    public ChatCompletionNamedToolChoice getChatCompletionNamedToolChoice() throws ClassCastException {
        return (ChatCompletionNamedToolChoice)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionToolChoiceOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with String
    try {
      if(!jsonElement.getAsJsonPrimitive().isString()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ChatCompletionNamedToolChoice
    try {
      ChatCompletionNamedToolChoice.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChatCompletionNamedToolChoice failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ChatCompletionToolChoiceOption with oneOf schemas: ChatCompletionNamedToolChoice, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ChatCompletionToolChoiceOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionToolChoiceOption
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionToolChoiceOption
  */
  public static ChatCompletionToolChoiceOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionToolChoiceOption.class);
  }

 /**
  * Convert an instance of ChatCompletionToolChoiceOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

