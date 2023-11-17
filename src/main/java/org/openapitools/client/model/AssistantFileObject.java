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
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T06:35:52.646593Z[Etc/UTC]")
public class AssistantFileObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ASSISTANT_FILE("assistant.file");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public AssistantFileObject() {
  }

  public AssistantFileObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AssistantFileObject _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public AssistantFileObject createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the assistant file was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public AssistantFileObject assistantId(String assistantId) {
    
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The assistant ID that the file is attached to.
   * @return assistantId
  **/
  @javax.annotation.Nonnull
  public String getAssistantId() {
    return assistantId;
  }


  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantFileObject assistantFileObject = (AssistantFileObject) o;
    return Objects.equals(this.id, assistantFileObject.id) &&
        Objects.equals(this._object, assistantFileObject._object) &&
        Objects.equals(this.createdAt, assistantFileObject.createdAt) &&
        Objects.equals(this.assistantId, assistantFileObject.assistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, assistantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantFileObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("assistant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("assistant_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssistantFileObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssistantFileObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssistantFileObject is not found in the empty JSON string", AssistantFileObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssistantFileObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssistantFileObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssistantFileObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if (!jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssistantFileObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssistantFileObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssistantFileObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssistantFileObject.class));

       return (TypeAdapter<T>) new TypeAdapter<AssistantFileObject>() {
           @Override
           public void write(JsonWriter out, AssistantFileObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssistantFileObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssistantFileObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssistantFileObject
  * @throws IOException if the JSON string is invalid with respect to AssistantFileObject
  */
  public static AssistantFileObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssistantFileObject.class);
  }

 /**
  * Convert an instance of AssistantFileObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

