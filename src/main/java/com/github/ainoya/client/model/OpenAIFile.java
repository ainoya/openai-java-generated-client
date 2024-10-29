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
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:48:55.661559293Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OpenAIFile {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BYTES = "bytes";
  @SerializedName(SERIALIZED_NAME_BYTES)
  private Integer bytes;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  /**
   * The object type, which is always &#x60;file&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    FILE("file");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object;

  /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
  public enum PurposeEnum {
    ASSISTANTS("assistants"),
    
    ASSISTANTS_OUTPUT("assistants_output"),
    
    BATCH("batch"),
    
    BATCH_OUTPUT("batch_output"),
    
    FINE_TUNE("fine-tune"),
    
    FINE_TUNE_RESULTS("fine-tune-results"),
    
    VISION("vision");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PurposeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurposeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurposeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PurposeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PurposeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private PurposeEnum purpose;

  /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UPLOADED("uploaded"),
    
    PROCESSED("processed"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "status_details";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private String statusDetails;

  public OpenAIFile() {
  }

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The file identifier, which can be referenced in the API endpoints.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * The size of the file, in bytes.
   * @return bytes
   */
  @javax.annotation.Nonnull
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }


  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the file was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file.
   * @return filename
   */
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  public OpenAIFile _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;file&#x60;.
   * @return _object
   */
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public OpenAIFile purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   * @return purpose
   */
  @javax.annotation.Nonnull
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  @Deprecated
  public OpenAIFile status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   * @return status
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  @Deprecated
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Deprecated
  public OpenAIFile statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
   * @return statusDetails
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getStatusDetails() {
    return statusDetails;
  }

  @Deprecated
  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
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
   * @return the OpenAIFile instance itself
   */
  public OpenAIFile putAdditionalProperty(String key, Object value) {
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
    OpenAIFile openAIFile = (OpenAIFile) o;
    return Objects.equals(this.id, openAIFile.id) &&
        Objects.equals(this.bytes, openAIFile.bytes) &&
        Objects.equals(this.createdAt, openAIFile.createdAt) &&
        Objects.equals(this.filename, openAIFile.filename) &&
        Objects.equals(this._object, openAIFile._object) &&
        Objects.equals(this.purpose, openAIFile.purpose) &&
        Objects.equals(this.status, openAIFile.status) &&
        Objects.equals(this.statusDetails, openAIFile.statusDetails)&&
        Objects.equals(this.additionalProperties, openAIFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bytes, createdAt, filename, _object, purpose, status, statusDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIFile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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
    openapiFields.add("bytes");
    openapiFields.add("created_at");
    openapiFields.add("filename");
    openapiFields.add("object");
    openapiFields.add("purpose");
    openapiFields.add("status");
    openapiFields.add("status_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("bytes");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("purpose");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpenAIFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenAIFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenAIFile is not found in the empty JSON string", OpenAIFile.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OpenAIFile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if (!jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      // validate the required field `purpose`
      PurposeEnum.validateJsonElement(jsonObj.get("purpose"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("status_details") != null && !jsonObj.get("status_details").isJsonNull()) && !jsonObj.get("status_details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenAIFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenAIFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenAIFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenAIFile.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenAIFile>() {
           @Override
           public void write(JsonWriter out, OpenAIFile value) throws IOException {
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
           public OpenAIFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OpenAIFile instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OpenAIFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpenAIFile
   * @throws IOException if the JSON string is invalid with respect to OpenAIFile
   */
  public static OpenAIFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenAIFile.class);
  }

  /**
   * Convert an instance of OpenAIFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

