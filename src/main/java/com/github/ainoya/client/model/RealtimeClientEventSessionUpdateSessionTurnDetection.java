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
import java.math.BigDecimal;
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
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T00:41:41.163543671Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RealtimeClientEventSessionUpdateSessionTurnDetection {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private BigDecimal threshold;

  public static final String SERIALIZED_NAME_PREFIX_PADDING_MS = "prefix_padding_ms";
  @SerializedName(SERIALIZED_NAME_PREFIX_PADDING_MS)
  private Integer prefixPaddingMs;

  public static final String SERIALIZED_NAME_SILENCE_DURATION_MS = "silence_duration_ms";
  @SerializedName(SERIALIZED_NAME_SILENCE_DURATION_MS)
  private Integer silenceDurationMs;

  public RealtimeClientEventSessionUpdateSessionTurnDetection() {
  }

  public RealtimeClientEventSessionUpdateSessionTurnDetection type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of turn detection, only \&quot;server_vad\&quot; is currently supported.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public RealtimeClientEventSessionUpdateSessionTurnDetection threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Activation threshold for VAD (0.0 to 1.0).
   * @return threshold
   */
  @javax.annotation.Nullable
  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }


  public RealtimeClientEventSessionUpdateSessionTurnDetection prefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
    return this;
  }

  /**
   * Amount of audio to include before speech starts (in milliseconds).
   * @return prefixPaddingMs
   */
  @javax.annotation.Nullable
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }

  public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }


  public RealtimeClientEventSessionUpdateSessionTurnDetection silenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
    return this;
  }

  /**
   * Duration of silence to detect speech stop (in milliseconds).
   * @return silenceDurationMs
   */
  @javax.annotation.Nullable
  public Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }

  public void setSilenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
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
   * @return the RealtimeClientEventSessionUpdateSessionTurnDetection instance itself
   */
  public RealtimeClientEventSessionUpdateSessionTurnDetection putAdditionalProperty(String key, Object value) {
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
    RealtimeClientEventSessionUpdateSessionTurnDetection realtimeClientEventSessionUpdateSessionTurnDetection = (RealtimeClientEventSessionUpdateSessionTurnDetection) o;
    return Objects.equals(this.type, realtimeClientEventSessionUpdateSessionTurnDetection.type) &&
        Objects.equals(this.threshold, realtimeClientEventSessionUpdateSessionTurnDetection.threshold) &&
        Objects.equals(this.prefixPaddingMs, realtimeClientEventSessionUpdateSessionTurnDetection.prefixPaddingMs) &&
        Objects.equals(this.silenceDurationMs, realtimeClientEventSessionUpdateSessionTurnDetection.silenceDurationMs)&&
        Objects.equals(this.additionalProperties, realtimeClientEventSessionUpdateSessionTurnDetection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, threshold, prefixPaddingMs, silenceDurationMs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventSessionUpdateSessionTurnDetection {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    prefixPaddingMs: ").append(toIndentedString(prefixPaddingMs)).append("\n");
    sb.append("    silenceDurationMs: ").append(toIndentedString(silenceDurationMs)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("threshold");
    openapiFields.add("prefix_padding_ms");
    openapiFields.add("silence_duration_ms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeClientEventSessionUpdateSessionTurnDetection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeClientEventSessionUpdateSessionTurnDetection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeClientEventSessionUpdateSessionTurnDetection is not found in the empty JSON string", RealtimeClientEventSessionUpdateSessionTurnDetection.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeClientEventSessionUpdateSessionTurnDetection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeClientEventSessionUpdateSessionTurnDetection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeClientEventSessionUpdateSessionTurnDetection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeClientEventSessionUpdateSessionTurnDetection.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeClientEventSessionUpdateSessionTurnDetection>() {
           @Override
           public void write(JsonWriter out, RealtimeClientEventSessionUpdateSessionTurnDetection value) throws IOException {
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
           public RealtimeClientEventSessionUpdateSessionTurnDetection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RealtimeClientEventSessionUpdateSessionTurnDetection instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RealtimeClientEventSessionUpdateSessionTurnDetection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeClientEventSessionUpdateSessionTurnDetection
   * @throws IOException if the JSON string is invalid with respect to RealtimeClientEventSessionUpdateSessionTurnDetection
   */
  public static RealtimeClientEventSessionUpdateSessionTurnDetection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeClientEventSessionUpdateSessionTurnDetection.class);
  }

  /**
   * Convert an instance of RealtimeClientEventSessionUpdateSessionTurnDetection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

