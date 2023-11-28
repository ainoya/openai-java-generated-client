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
import com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputImageObject;
import com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputLogsObject;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T05:21:58.409121Z[Etc/UTC]")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStepDetailsToolCallsCodeOutputLogsObject> adapterRunStepDetailsToolCallsCodeOutputLogsObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsCodeOutputLogsObject.class));
            final TypeAdapter<RunStepDetailsToolCallsCodeOutputImageObject> adapterRunStepDetailsToolCallsCodeOutputImageObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsCodeOutputImageObject.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>() {
                @Override
                public void write(JsonWriter out, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStepDetailsToolCallsCodeOutputLogsObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsCodeOutputLogsObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsCodeOutputLogsObject.toJsonTree((RunStepDetailsToolCallsCodeOutputLogsObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RunStepDetailsToolCallsCodeOutputImageObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsCodeOutputImageObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsCodeOutputImageObject.toJsonTree((RunStepDetailsToolCallsCodeOutputImageObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject");
                }

                @Override
                public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStepDetailsToolCallsCodeOutputLogsObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsCodeOutputLogsObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsCodeOutputLogsObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsCodeOutputLogsObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeOutputLogsObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsCodeOutputLogsObject'", e);
                    }
                    // deserialize RunStepDetailsToolCallsCodeOutputImageObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsCodeOutputImageObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsCodeOutputImageObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsCodeOutputImageObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeOutputImageObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsCodeOutputImageObject'", e);
                    }

                    if (match == 1) {
                        RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner ret = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(RunStepDetailsToolCallsCodeOutputImageObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(RunStepDetailsToolCallsCodeOutputLogsObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStepDetailsToolCallsCodeOutputLogsObject", RunStepDetailsToolCallsCodeOutputLogsObject.class);
        schemas.put("RunStepDetailsToolCallsCodeOutputImageObject", RunStepDetailsToolCallsCodeOutputImageObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStepDetailsToolCallsCodeOutputLogsObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepDetailsToolCallsCodeOutputImageObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject
     *
     * @return The actual instance (RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStepDetailsToolCallsCodeOutputLogsObject`. If the actual instance is not `RunStepDetailsToolCallsCodeOutputLogsObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsCodeOutputLogsObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsCodeOutputLogsObject`
     */
    public RunStepDetailsToolCallsCodeOutputLogsObject getRunStepDetailsToolCallsCodeOutputLogsObject() throws ClassCastException {
        return (RunStepDetailsToolCallsCodeOutputLogsObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepDetailsToolCallsCodeOutputImageObject`. If the actual instance is not `RunStepDetailsToolCallsCodeOutputImageObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsCodeOutputImageObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsCodeOutputImageObject`
     */
    public RunStepDetailsToolCallsCodeOutputImageObject getRunStepDetailsToolCallsCodeOutputImageObject() throws ClassCastException {
        return (RunStepDetailsToolCallsCodeOutputImageObject)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RunStepDetailsToolCallsCodeOutputLogsObject
    try {
      RunStepDetailsToolCallsCodeOutputLogsObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeOutputLogsObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunStepDetailsToolCallsCodeOutputImageObject
    try {
      RunStepDetailsToolCallsCodeOutputImageObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeOutputImageObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner with oneOf schemas: RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
  * @throws IOException if the JSON string is invalid with respect to RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
  */
  public static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class);
  }

 /**
  * Convert an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

