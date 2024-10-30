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
import com.github.ainoya.client.model.CreateEmbeddingRequestInput;
import com.github.ainoya.client.model.CreateEmbeddingRequestModel;
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
 * CreateEmbeddingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateEmbeddingRequest {
  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private CreateEmbeddingRequestInput input;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private CreateEmbeddingRequestModel model;

  /**
   * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
   */
  @JsonAdapter(EncodingFormatEnum.Adapter.class)
  public enum EncodingFormatEnum {
    FLOAT("float"),
    
    BASE64("base64");

    private String value;

    EncodingFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingFormatEnum fromValue(String value) {
      for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncodingFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EncodingFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENCODING_FORMAT = "encoding_format";
  @SerializedName(SERIALIZED_NAME_ENCODING_FORMAT)
  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private Integer dimensions;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public CreateEmbeddingRequest() {
  }

  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @javax.annotation.Nonnull
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }


  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nonnull
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }


  public CreateEmbeddingRequest encodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
    return this;
  }

  /**
   * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
   * @return encodingFormat
   */
  @javax.annotation.Nullable
  public EncodingFormatEnum getEncodingFormat() {
    return encodingFormat;
  }

  public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }


  public CreateEmbeddingRequest dimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
   * minimum: 1
   * @return dimensions
   */
  @javax.annotation.Nullable
  public Integer getDimensions() {
    return dimensions;
  }

  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }


  public CreateEmbeddingRequest user(String user) {
    this.user = user;
    return this;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
   */
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
    return Objects.equals(this.input, createEmbeddingRequest.input) &&
        Objects.equals(this.model, createEmbeddingRequest.model) &&
        Objects.equals(this.encodingFormat, createEmbeddingRequest.encodingFormat) &&
        Objects.equals(this.dimensions, createEmbeddingRequest.dimensions) &&
        Objects.equals(this.user, createEmbeddingRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model, encodingFormat, dimensions, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("input");
    openapiFields.add("model");
    openapiFields.add("encoding_format");
    openapiFields.add("dimensions");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("input");
    openapiRequiredFields.add("model");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEmbeddingRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEmbeddingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEmbeddingRequest is not found in the empty JSON string", CreateEmbeddingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEmbeddingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEmbeddingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEmbeddingRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `input`
      CreateEmbeddingRequestInput.validateJsonElement(jsonObj.get("input"));
      // validate the required field `model`
      CreateEmbeddingRequestModel.validateJsonElement(jsonObj.get("model"));
      if ((jsonObj.get("encoding_format") != null && !jsonObj.get("encoding_format").isJsonNull()) && !jsonObj.get("encoding_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding_format").toString()));
      }
      // validate the optional field `encoding_format`
      if (jsonObj.get("encoding_format") != null && !jsonObj.get("encoding_format").isJsonNull()) {
        EncodingFormatEnum.validateJsonElement(jsonObj.get("encoding_format"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEmbeddingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEmbeddingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEmbeddingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEmbeddingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEmbeddingRequest>() {
           @Override
           public void write(JsonWriter out, CreateEmbeddingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEmbeddingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEmbeddingRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEmbeddingRequest
   * @throws IOException if the JSON string is invalid with respect to CreateEmbeddingRequest
   */
  public static CreateEmbeddingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEmbeddingRequest.class);
  }

  /**
   * Convert an instance of CreateEmbeddingRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

