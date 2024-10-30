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
import com.github.ainoya.client.model.CreateFineTuningJobRequestIntegrationsInnerType;
import com.github.ainoya.client.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
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
 * CreateFineTuningJobRequestIntegrationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateFineTuningJobRequestIntegrationsInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreateFineTuningJobRequestIntegrationsInnerType type;

  public static final String SERIALIZED_NAME_WANDB = "wandb";
  @SerializedName(SERIALIZED_NAME_WANDB)
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public CreateFineTuningJobRequestIntegrationsInner() {
  }

  public CreateFineTuningJobRequestIntegrationsInner type(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public CreateFineTuningJobRequestIntegrationsInnerType getType() {
    return type;
  }

  public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
    this.type = type;
  }


  public CreateFineTuningJobRequestIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
    return this;
  }

  /**
   * Get wandb
   * @return wandb
   */
  @javax.annotation.Nonnull
  public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
    return wandb;
  }

  public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
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
   * @return the CreateFineTuningJobRequestIntegrationsInner instance itself
   */
  public CreateFineTuningJobRequestIntegrationsInner putAdditionalProperty(String key, Object value) {
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
    CreateFineTuningJobRequestIntegrationsInner createFineTuningJobRequestIntegrationsInner = (CreateFineTuningJobRequestIntegrationsInner) o;
    return Objects.equals(this.type, createFineTuningJobRequestIntegrationsInner.type) &&
        Objects.equals(this.wandb, createFineTuningJobRequestIntegrationsInner.wandb)&&
        Objects.equals(this.additionalProperties, createFineTuningJobRequestIntegrationsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, wandb, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wandb: ").append(toIndentedString(wandb)).append("\n");
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
    openapiFields.add("wandb");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("wandb");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateFineTuningJobRequestIntegrationsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFineTuningJobRequestIntegrationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFineTuningJobRequestIntegrationsInner is not found in the empty JSON string", CreateFineTuningJobRequestIntegrationsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFineTuningJobRequestIntegrationsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      CreateFineTuningJobRequestIntegrationsInnerType.validateJsonElement(jsonObj.get("type"));
      // validate the required field `wandb`
      CreateFineTuningJobRequestIntegrationsInnerWandb.validateJsonElement(jsonObj.get("wandb"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFineTuningJobRequestIntegrationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFineTuningJobRequestIntegrationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFineTuningJobRequestIntegrationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFineTuningJobRequestIntegrationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFineTuningJobRequestIntegrationsInner>() {
           @Override
           public void write(JsonWriter out, CreateFineTuningJobRequestIntegrationsInner value) throws IOException {
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
           public CreateFineTuningJobRequestIntegrationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateFineTuningJobRequestIntegrationsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateFineTuningJobRequestIntegrationsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateFineTuningJobRequestIntegrationsInner
   * @throws IOException if the JSON string is invalid with respect to CreateFineTuningJobRequestIntegrationsInner
   */
  public static CreateFineTuningJobRequestIntegrationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFineTuningJobRequestIntegrationsInner.class);
  }

  /**
   * Convert an instance of CreateFineTuningJobRequestIntegrationsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

