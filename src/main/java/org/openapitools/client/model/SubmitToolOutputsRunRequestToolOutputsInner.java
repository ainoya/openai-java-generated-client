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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tokyo.ainoya.openapi.client.JSON;

/**
 * SubmitToolOutputsRunRequestToolOutputsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T06:29:56.349541Z[Etc/UTC]")
public class SubmitToolOutputsRunRequestToolOutputsInner {
  public static final String SERIALIZED_NAME_TOOL_CALL_ID = "tool_call_id";
  @SerializedName(SERIALIZED_NAME_TOOL_CALL_ID)
  private String toolCallId;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public SubmitToolOutputsRunRequestToolOutputsInner() {
  }

  public SubmitToolOutputsRunRequestToolOutputsInner toolCallId(String toolCallId) {
    
    this.toolCallId = toolCallId;
    return this;
  }

   /**
   * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
   * @return toolCallId
  **/
  @javax.annotation.Nullable
  public String getToolCallId() {
    return toolCallId;
  }


  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }


  public SubmitToolOutputsRunRequestToolOutputsInner output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * The output of the tool call to be submitted to continue the run.
   * @return output
  **/
  @javax.annotation.Nullable
  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequestToolOutputsInner submitToolOutputsRunRequestToolOutputsInner = (SubmitToolOutputsRunRequestToolOutputsInner) o;
    return Objects.equals(this.toolCallId, submitToolOutputsRunRequestToolOutputsInner.toolCallId) &&
        Objects.equals(this.output, submitToolOutputsRunRequestToolOutputsInner.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCallId, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitToolOutputsRunRequestToolOutputsInner {\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
    openapiFields.add("tool_call_id");
    openapiFields.add("output");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubmitToolOutputsRunRequestToolOutputsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitToolOutputsRunRequestToolOutputsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitToolOutputsRunRequestToolOutputsInner is not found in the empty JSON string", SubmitToolOutputsRunRequestToolOutputsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitToolOutputsRunRequestToolOutputsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitToolOutputsRunRequestToolOutputsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tool_call_id") != null && !jsonObj.get("tool_call_id").isJsonNull()) && !jsonObj.get("tool_call_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tool_call_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tool_call_id").toString()));
      }
      if ((jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull()) && !jsonObj.get("output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitToolOutputsRunRequestToolOutputsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitToolOutputsRunRequestToolOutputsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitToolOutputsRunRequestToolOutputsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitToolOutputsRunRequestToolOutputsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitToolOutputsRunRequestToolOutputsInner>() {
           @Override
           public void write(JsonWriter out, SubmitToolOutputsRunRequestToolOutputsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitToolOutputsRunRequestToolOutputsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitToolOutputsRunRequestToolOutputsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitToolOutputsRunRequestToolOutputsInner
  * @throws IOException if the JSON string is invalid with respect to SubmitToolOutputsRunRequestToolOutputsInner
  */
  public static SubmitToolOutputsRunRequestToolOutputsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitToolOutputsRunRequestToolOutputsInner.class);
  }

 /**
  * Convert an instance of SubmitToolOutputsRunRequestToolOutputsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

