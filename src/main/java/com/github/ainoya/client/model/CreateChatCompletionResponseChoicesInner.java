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
import com.github.ainoya.client.model.ChatCompletionResponseMessage;
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

import com.github.ainoya.client.JSON;

/**
 * CreateChatCompletionResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T01:19:53.351390Z[Etc/UTC]")
public class CreateChatCompletionResponseChoicesInner {
  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   */
  @JsonAdapter(FinishReasonEnum.Adapter.class)
  public enum FinishReasonEnum {
    STOP("stop"),
    
    LENGTH("length"),
    
    TOOL_CALLS("tool_calls"),
    
    CONTENT_FILTER("content_filter"),
    
    FUNCTION_CALL("function_call");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinishReasonEnum fromValue(String value) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FinishReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinishReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FinishReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FinishReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FinishReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FINISH_REASON = "finish_reason";
  @SerializedName(SERIALIZED_NAME_FINISH_REASON)
  private FinishReasonEnum finishReason;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private ChatCompletionResponseMessage message;

  public CreateChatCompletionResponseChoicesInner() {
  }

  public CreateChatCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    
    this.finishReason = finishReason;
    return this;
  }

   /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   * @return finishReason
  **/
  @javax.annotation.Nullable
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }


  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }


  public CreateChatCompletionResponseChoicesInner index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * The index of the choice in the list of choices.
   * @return index
  **/
  @javax.annotation.Nonnull
  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public CreateChatCompletionResponseChoicesInner message(ChatCompletionResponseMessage message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }


  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
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
   * @return the CreateChatCompletionResponseChoicesInner instance itself
   */
  public CreateChatCompletionResponseChoicesInner putAdditionalProperty(String key, Object value) {
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
    CreateChatCompletionResponseChoicesInner createChatCompletionResponseChoicesInner = (CreateChatCompletionResponseChoicesInner) o;
    return Objects.equals(this.finishReason, createChatCompletionResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createChatCompletionResponseChoicesInner.index) &&
        Objects.equals(this.message, createChatCompletionResponseChoicesInner.message)&&
        Objects.equals(this.additionalProperties, createChatCompletionResponseChoicesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInner {\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("finish_reason");
    openapiFields.add("index");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChatCompletionResponseChoicesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChatCompletionResponseChoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChatCompletionResponseChoicesInner is not found in the empty JSON string", CreateChatCompletionResponseChoicesInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateChatCompletionResponseChoicesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("finish_reason") != null && !jsonObj.get("finish_reason").isJsonNull()) && !jsonObj.get("finish_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_reason").toString()));
      }
      // validate the optional field `finish_reason`
      if (jsonObj.get("finish_reason") != null && !jsonObj.get("finish_reason").isJsonNull()) {
        FinishReasonEnum.validateJsonElement(jsonObj.get("finish_reason"));
      }
      // validate the required field `message`
      ChatCompletionResponseMessage.validateJsonElement(jsonObj.get("message"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChatCompletionResponseChoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChatCompletionResponseChoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChatCompletionResponseChoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChatCompletionResponseChoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChatCompletionResponseChoicesInner>() {
           @Override
           public void write(JsonWriter out, CreateChatCompletionResponseChoicesInner value) throws IOException {
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChatCompletionResponseChoicesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateChatCompletionResponseChoicesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateChatCompletionResponseChoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChatCompletionResponseChoicesInner
  * @throws IOException if the JSON string is invalid with respect to CreateChatCompletionResponseChoicesInner
  */
  public static CreateChatCompletionResponseChoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChatCompletionResponseChoicesInner.class);
  }

 /**
  * Convert an instance of CreateChatCompletionResponseChoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

