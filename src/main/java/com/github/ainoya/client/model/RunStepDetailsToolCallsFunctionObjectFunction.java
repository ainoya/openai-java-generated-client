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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * The definition of the function that was called.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDetailsToolCallsFunctionObjectFunction {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public RunStepDetailsToolCallsFunctionObjectFunction() {
  }

  public RunStepDetailsToolCallsFunctionObjectFunction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RunStepDetailsToolCallsFunctionObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The arguments passed to the function.
   * @return arguments
   */
  @javax.annotation.Nonnull
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  public RunStepDetailsToolCallsFunctionObjectFunction output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
   * @return output
   */
  @javax.annotation.Nullable
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RunStepDetailsToolCallsFunctionObjectFunction instance itself
   */
  public RunStepDetailsToolCallsFunctionObjectFunction putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFunctionObjectFunction runStepDetailsToolCallsFunctionObjectFunction = (RunStepDetailsToolCallsFunctionObjectFunction) o;
    return Objects.equals(this.name, runStepDetailsToolCallsFunctionObjectFunction.name) &&
        Objects.equals(this.arguments, runStepDetailsToolCallsFunctionObjectFunction.arguments) &&
        Objects.equals(this.output, runStepDetailsToolCallsFunctionObjectFunction.output)&&
        Objects.equals(this.additionalProperties, runStepDetailsToolCallsFunctionObjectFunction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments, output, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFunctionObjectFunction {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("arguments");
    openapiFields.add("output");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("arguments");
    openapiRequiredFields.add("output");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RunStepDetailsToolCallsFunctionObjectFunction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunStepDetailsToolCallsFunctionObjectFunction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunStepDetailsToolCallsFunctionObjectFunction is not found in the empty JSON string", RunStepDetailsToolCallsFunctionObjectFunction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunStepDetailsToolCallsFunctionObjectFunction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("arguments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
      if ((jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull()) && !jsonObj.get("output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunStepDetailsToolCallsFunctionObjectFunction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunStepDetailsToolCallsFunctionObjectFunction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunStepDetailsToolCallsFunctionObjectFunction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsFunctionObjectFunction.class));

       return (TypeAdapter<T>) new TypeAdapter<RunStepDetailsToolCallsFunctionObjectFunction>() {
           @Override
           public void write(JsonWriter out, RunStepDetailsToolCallsFunctionObjectFunction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RunStepDetailsToolCallsFunctionObjectFunction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RunStepDetailsToolCallsFunctionObjectFunction instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RunStepDetailsToolCallsFunctionObjectFunction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RunStepDetailsToolCallsFunctionObjectFunction
   * @throws IOException if the JSON string is invalid with respect to RunStepDetailsToolCallsFunctionObjectFunction
   */
  public static RunStepDetailsToolCallsFunctionObjectFunction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepDetailsToolCallsFunctionObjectFunction.class);
  }

  /**
   * Convert an instance of RunStepDetailsToolCallsFunctionObjectFunction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

