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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RunToolCallObject;

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
 * Details on the tool outputs needed for this run to continue.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T02:02:15.250875Z[Etc/UTC]")
public class RunObjectRequiredActionSubmitToolOutputs {
  public static final String SERIALIZED_NAME_TOOL_CALLS = "tool_calls";
  @SerializedName(SERIALIZED_NAME_TOOL_CALLS)
  private List<RunToolCallObject> toolCalls = new ArrayList<>();

  public RunObjectRequiredActionSubmitToolOutputs() {
  }

  public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<RunToolCallObject> toolCalls) {
    
    this.toolCalls = toolCalls;
    return this;
  }

  public RunObjectRequiredActionSubmitToolOutputs addToolCallsItem(RunToolCallObject toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * A list of the relevant tool calls.
   * @return toolCalls
  **/
  @javax.annotation.Nonnull
  public List<RunToolCallObject> getToolCalls() {
    return toolCalls;
  }


  public void setToolCalls(List<RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObjectRequiredActionSubmitToolOutputs runObjectRequiredActionSubmitToolOutputs = (RunObjectRequiredActionSubmitToolOutputs) o;
    return Objects.equals(this.toolCalls, runObjectRequiredActionSubmitToolOutputs.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectRequiredActionSubmitToolOutputs {\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
    openapiFields.add("tool_calls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tool_calls");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunObjectRequiredActionSubmitToolOutputs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunObjectRequiredActionSubmitToolOutputs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunObjectRequiredActionSubmitToolOutputs is not found in the empty JSON string", RunObjectRequiredActionSubmitToolOutputs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunObjectRequiredActionSubmitToolOutputs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunObjectRequiredActionSubmitToolOutputs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunObjectRequiredActionSubmitToolOutputs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("tool_calls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tool_calls` to be an array in the JSON string but got `%s`", jsonObj.get("tool_calls").toString()));
      }

      JsonArray jsonArraytoolCalls = jsonObj.getAsJsonArray("tool_calls");
      // validate the required field `tool_calls` (array)
      for (int i = 0; i < jsonArraytoolCalls.size(); i++) {
        RunToolCallObject.validateJsonElement(jsonArraytoolCalls.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunObjectRequiredActionSubmitToolOutputs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunObjectRequiredActionSubmitToolOutputs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunObjectRequiredActionSubmitToolOutputs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunObjectRequiredActionSubmitToolOutputs.class));

       return (TypeAdapter<T>) new TypeAdapter<RunObjectRequiredActionSubmitToolOutputs>() {
           @Override
           public void write(JsonWriter out, RunObjectRequiredActionSubmitToolOutputs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunObjectRequiredActionSubmitToolOutputs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunObjectRequiredActionSubmitToolOutputs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunObjectRequiredActionSubmitToolOutputs
  * @throws IOException if the JSON string is invalid with respect to RunObjectRequiredActionSubmitToolOutputs
  */
  public static RunObjectRequiredActionSubmitToolOutputs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunObjectRequiredActionSubmitToolOutputs.class);
  }

 /**
  * Convert an instance of RunObjectRequiredActionSubmitToolOutputs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

