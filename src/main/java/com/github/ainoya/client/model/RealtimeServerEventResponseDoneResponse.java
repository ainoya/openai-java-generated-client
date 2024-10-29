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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * The response resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T13:08:57.656944544Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RealtimeServerEventResponseDoneResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "status_details";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private Object statusDetails;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private List<Object> output = new ArrayList<>();

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Object usage;

  public RealtimeServerEventResponseDoneResponse() {
  }

  public RealtimeServerEventResponseDoneResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the response.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RealtimeServerEventResponseDoneResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, must be \&quot;realtime.response\&quot;.
   * @return _object
   */
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  public RealtimeServerEventResponseDoneResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The final status of the response (\&quot;completed\&quot;, \&quot;cancelled\&quot;, \&quot;failed\&quot;, \&quot;incomplete\&quot;).
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public RealtimeServerEventResponseDoneResponse statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Additional details about the status.
   * @return statusDetails
   */
  @javax.annotation.Nullable
  public Object getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
  }


  public RealtimeServerEventResponseDoneResponse output(List<Object> output) {
    this.output = output;
    return this;
  }

  public RealtimeServerEventResponseDoneResponse addOutputItem(Object outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<>();
    }
    this.output.add(outputItem);
    return this;
  }

  /**
   * The list of output items generated by the response.
   * @return output
   */
  @javax.annotation.Nullable
  public List<Object> getOutput() {
    return output;
  }

  public void setOutput(List<Object> output) {
    this.output = output;
  }


  public RealtimeServerEventResponseDoneResponse usage(Object usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Usage statistics for the response.
   * @return usage
   */
  @javax.annotation.Nullable
  public Object getUsage() {
    return usage;
  }

  public void setUsage(Object usage) {
    this.usage = usage;
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
   * @return the RealtimeServerEventResponseDoneResponse instance itself
   */
  public RealtimeServerEventResponseDoneResponse putAdditionalProperty(String key, Object value) {
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
    RealtimeServerEventResponseDoneResponse realtimeServerEventResponseDoneResponse = (RealtimeServerEventResponseDoneResponse) o;
    return Objects.equals(this.id, realtimeServerEventResponseDoneResponse.id) &&
        Objects.equals(this._object, realtimeServerEventResponseDoneResponse._object) &&
        Objects.equals(this.status, realtimeServerEventResponseDoneResponse.status) &&
        Objects.equals(this.statusDetails, realtimeServerEventResponseDoneResponse.statusDetails) &&
        Objects.equals(this.output, realtimeServerEventResponseDoneResponse.output) &&
        Objects.equals(this.usage, realtimeServerEventResponseDoneResponse.usage)&&
        Objects.equals(this.additionalProperties, realtimeServerEventResponseDoneResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, status, statusDetails, output, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseDoneResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("status");
    openapiFields.add("status_details");
    openapiFields.add("output");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeServerEventResponseDoneResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeServerEventResponseDoneResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeServerEventResponseDoneResponse is not found in the empty JSON string", RealtimeServerEventResponseDoneResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull() && !jsonObj.get("output").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be an array in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeServerEventResponseDoneResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeServerEventResponseDoneResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeServerEventResponseDoneResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeServerEventResponseDoneResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeServerEventResponseDoneResponse>() {
           @Override
           public void write(JsonWriter out, RealtimeServerEventResponseDoneResponse value) throws IOException {
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
           public RealtimeServerEventResponseDoneResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RealtimeServerEventResponseDoneResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RealtimeServerEventResponseDoneResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeServerEventResponseDoneResponse
   * @throws IOException if the JSON string is invalid with respect to RealtimeServerEventResponseDoneResponse
   */
  public static RealtimeServerEventResponseDoneResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeServerEventResponseDoneResponse.class);
  }

  /**
   * Convert an instance of RealtimeServerEventResponseDoneResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

