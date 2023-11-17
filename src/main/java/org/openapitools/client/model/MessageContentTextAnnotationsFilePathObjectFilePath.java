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
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import tokyo.ainoya.openai.client.JSON;

/**
 * MessageContentTextAnnotationsFilePathObjectFilePath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T06:35:52.646593Z[Etc/UTC]")
public class MessageContentTextAnnotationsFilePathObjectFilePath {
  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public MessageContentTextAnnotationsFilePathObjectFilePath() {
  }

  public MessageContentTextAnnotationsFilePathObjectFilePath fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * The ID of the file that was generated.
   * @return fileId
  **/
  @javax.annotation.Nonnull
  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextAnnotationsFilePathObjectFilePath messageContentTextAnnotationsFilePathObjectFilePath = (MessageContentTextAnnotationsFilePathObjectFilePath) o;
    return Objects.equals(this.fileId, messageContentTextAnnotationsFilePathObjectFilePath.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFilePathObjectFilePath {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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
    openapiFields.add("file_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessageContentTextAnnotationsFilePathObjectFilePath
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageContentTextAnnotationsFilePathObjectFilePath.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageContentTextAnnotationsFilePathObjectFilePath is not found in the empty JSON string", MessageContentTextAnnotationsFilePathObjectFilePath.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessageContentTextAnnotationsFilePathObjectFilePath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageContentTextAnnotationsFilePathObjectFilePath` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageContentTextAnnotationsFilePathObjectFilePath.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("file_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageContentTextAnnotationsFilePathObjectFilePath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageContentTextAnnotationsFilePathObjectFilePath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageContentTextAnnotationsFilePathObjectFilePath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageContentTextAnnotationsFilePathObjectFilePath.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageContentTextAnnotationsFilePathObjectFilePath>() {
           @Override
           public void write(JsonWriter out, MessageContentTextAnnotationsFilePathObjectFilePath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageContentTextAnnotationsFilePathObjectFilePath read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageContentTextAnnotationsFilePathObjectFilePath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageContentTextAnnotationsFilePathObjectFilePath
  * @throws IOException if the JSON string is invalid with respect to MessageContentTextAnnotationsFilePathObjectFilePath
  */
  public static MessageContentTextAnnotationsFilePathObjectFilePath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageContentTextAnnotationsFilePathObjectFilePath.class);
  }

 /**
  * Convert an instance of MessageContentTextAnnotationsFilePathObjectFilePath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

