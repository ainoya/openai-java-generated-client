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
import org.openapitools.client.model.CreateCompletionResponseChoicesInnerLogprobs;

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

import tokyo.ainoya.openai.client.JSON;

/**
 * CreateCompletionResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T07:41:33.457679Z[Etc/UTC]")
public class CreateCompletionResponseChoicesInner {
  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
   */
  @JsonAdapter(FinishReasonEnum.Adapter.class)
  public enum FinishReasonEnum {
    STOP("stop"),
    
    LENGTH("length"),
    
    CONTENT_FILTER("content_filter");

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

  public static final String SERIALIZED_NAME_LOGPROBS = "logprobs";
  @SerializedName(SERIALIZED_NAME_LOGPROBS)
  private CreateCompletionResponseChoicesInnerLogprobs logprobs;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public CreateCompletionResponseChoicesInner() {
  }

  public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    
    this.finishReason = finishReason;
    return this;
  }

   /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
   * @return finishReason
  **/
  @javax.annotation.Nonnull
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }


  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }


  public CreateCompletionResponseChoicesInner index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nonnull
  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public CreateCompletionResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Get logprobs
   * @return logprobs
  **/
  @javax.annotation.Nullable
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }


  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }


  public CreateCompletionResponseChoicesInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
    return Objects.equals(this.finishReason, createCompletionResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createCompletionResponseChoicesInner.index) &&
        Objects.equals(this.logprobs, createCompletionResponseChoicesInner.logprobs) &&
        Objects.equals(this.text, createCompletionResponseChoicesInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInner {\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("logprobs");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("finish_reason");
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("logprobs");
    openapiRequiredFields.add("text");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCompletionResponseChoicesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCompletionResponseChoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompletionResponseChoicesInner is not found in the empty JSON string", CreateCompletionResponseChoicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCompletionResponseChoicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCompletionResponseChoicesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompletionResponseChoicesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("finish_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_reason").toString()));
      }
      // validate the required field `finish_reason`
      FinishReasonEnum.validateJsonElement(jsonObj.get("finish_reason"));
      // validate the required field `logprobs`
      CreateCompletionResponseChoicesInnerLogprobs.validateJsonElement(jsonObj.get("logprobs"));
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompletionResponseChoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompletionResponseChoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompletionResponseChoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompletionResponseChoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompletionResponseChoicesInner>() {
           @Override
           public void write(JsonWriter out, CreateCompletionResponseChoicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompletionResponseChoicesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompletionResponseChoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompletionResponseChoicesInner
  * @throws IOException if the JSON string is invalid with respect to CreateCompletionResponseChoicesInner
  */
  public static CreateCompletionResponseChoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompletionResponseChoicesInner.class);
  }

 /**
  * Convert an instance of CreateCompletionResponseChoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

