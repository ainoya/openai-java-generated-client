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
import com.github.ainoya.client.model.RunStepDetailsMessageCreationObject;
import com.github.ainoya.client.model.RunStepDetailsMessageCreationObjectMessageCreation;
import com.github.ainoya.client.model.RunStepDetailsToolCallsObject;
import com.github.ainoya.client.model.RunStepDetailsToolCallsObjectToolCallsInner;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T05:37:10.597293Z[Etc/UTC]")
public class RunStepObjectStepDetails extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStepObjectStepDetails.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStepObjectStepDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStepObjectStepDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStepDetailsMessageCreationObject> adapterRunStepDetailsMessageCreationObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsMessageCreationObject.class));
            final TypeAdapter<RunStepDetailsToolCallsObject> adapterRunStepDetailsToolCallsObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsObject.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStepObjectStepDetails>() {
                @Override
                public void write(JsonWriter out, RunStepObjectStepDetails value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStepDetailsMessageCreationObject`
                    if (value.getActualInstance() instanceof RunStepDetailsMessageCreationObject) {
                      JsonElement element = adapterRunStepDetailsMessageCreationObject.toJsonTree((RunStepDetailsMessageCreationObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RunStepDetailsToolCallsObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsObject.toJsonTree((RunStepDetailsToolCallsObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject");
                }

                @Override
                public RunStepObjectStepDetails read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStepDetailsMessageCreationObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsMessageCreationObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsMessageCreationObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsMessageCreationObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsMessageCreationObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsMessageCreationObject'", e);
                    }
                    // deserialize RunStepDetailsToolCallsObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsObject'", e);
                    }

                    if (match == 1) {
                        RunStepObjectStepDetails ret = new RunStepObjectStepDetails();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStepObjectStepDetails: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStepObjectStepDetails() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStepObjectStepDetails(RunStepDetailsMessageCreationObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RunStepObjectStepDetails(RunStepDetailsToolCallsObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStepDetailsMessageCreationObject", RunStepDetailsMessageCreationObject.class);
        schemas.put("RunStepDetailsToolCallsObject", RunStepDetailsToolCallsObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStepObjectStepDetails.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStepDetailsMessageCreationObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepDetailsToolCallsObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject
     *
     * @return The actual instance (RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStepDetailsMessageCreationObject`. If the actual instance is not `RunStepDetailsMessageCreationObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsMessageCreationObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsMessageCreationObject`
     */
    public RunStepDetailsMessageCreationObject getRunStepDetailsMessageCreationObject() throws ClassCastException {
        return (RunStepDetailsMessageCreationObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepDetailsToolCallsObject`. If the actual instance is not `RunStepDetailsToolCallsObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsObject`
     */
    public RunStepDetailsToolCallsObject getRunStepDetailsToolCallsObject() throws ClassCastException {
        return (RunStepDetailsToolCallsObject)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStepObjectStepDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RunStepDetailsMessageCreationObject
    try {
      RunStepDetailsMessageCreationObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsMessageCreationObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunStepDetailsToolCallsObject
    try {
      RunStepDetailsToolCallsObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RunStepObjectStepDetails with oneOf schemas: RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RunStepObjectStepDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStepObjectStepDetails
  * @throws IOException if the JSON string is invalid with respect to RunStepObjectStepDetails
  */
  public static RunStepObjectStepDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepObjectStepDetails.class);
  }

 /**
  * Convert an instance of RunStepObjectStepDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

