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
import com.github.ainoya.client.model.MessageObjectContentInner;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T04:42:30.516763Z[Etc/UTC]")
public class MessageObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The object type, which is always &#x60;thread.message&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    THREAD_MESSAGE("thread.message");

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

  public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
  @SerializedName(SERIALIZED_NAME_THREAD_ID)
  private String threadId;

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    USER("user"),
    
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RoleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<MessageObjectContentInner> content = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public static final String SERIALIZED_NAME_RUN_ID = "run_id";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  public static final String SERIALIZED_NAME_FILE_IDS = "file_ids";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<String> fileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public MessageObject() {
  }

  public MessageObject id(String id) {
    
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


  public MessageObject _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always &#x60;thread.message&#x60;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public MessageObject createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the message was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public MessageObject threadId(String threadId) {
    
    this.threadId = threadId;
    return this;
  }

   /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   * @return threadId
  **/
  @javax.annotation.Nonnull
  public String getThreadId() {
    return threadId;
  }


  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public MessageObject role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
  **/
  @javax.annotation.Nonnull
  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public MessageObject content(List<MessageObjectContentInner> content) {
    
    this.content = content;
    return this;
  }

  public MessageObject addContentItem(MessageObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * The content of the message in array of text and/or images.
   * @return content
  **/
  @javax.annotation.Nonnull
  public List<MessageObjectContentInner> getContent() {
    return content;
  }


  public void setContent(List<MessageObjectContentInner> content) {
    this.content = content;
  }


  public MessageObject assistantId(String assistantId) {
    
    this.assistantId = assistantId;
    return this;
  }

   /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   * @return assistantId
  **/
  @javax.annotation.Nullable
  public String getAssistantId() {
    return assistantId;
  }


  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  public MessageObject runId(String runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * If applicable, the ID of the [run](/docs/api-reference/runs) associated with the authoring of this message.
   * @return runId
  **/
  @javax.annotation.Nullable
  public String getRunId() {
    return runId;
  }


  public void setRunId(String runId) {
    this.runId = runId;
  }


  public MessageObject fileIds(List<String> fileIds) {
    
    this.fileIds = fileIds;
    return this;
  }

  public MessageObject addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   * @return fileIds
  **/
  @javax.annotation.Nonnull
  public List<String> getFileIds() {
    return fileIds;
  }


  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }


  public MessageObject metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
   * @return the MessageObject instance itself
   */
  public MessageObject putAdditionalProperty(String key, Object value) {
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
    MessageObject messageObject = (MessageObject) o;
    return Objects.equals(this.id, messageObject.id) &&
        Objects.equals(this._object, messageObject._object) &&
        Objects.equals(this.createdAt, messageObject.createdAt) &&
        Objects.equals(this.threadId, messageObject.threadId) &&
        Objects.equals(this.role, messageObject.role) &&
        Objects.equals(this.content, messageObject.content) &&
        Objects.equals(this.assistantId, messageObject.assistantId) &&
        Objects.equals(this.runId, messageObject.runId) &&
        Objects.equals(this.fileIds, messageObject.fileIds) &&
        Objects.equals(this.metadata, messageObject.metadata)&&
        Objects.equals(this.additionalProperties, messageObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, role, content, assistantId, runId, fileIds, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("thread_id");
    openapiFields.add("role");
    openapiFields.add("content");
    openapiFields.add("assistant_id");
    openapiFields.add("run_id");
    openapiFields.add("file_ids");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("thread_id");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("assistant_id");
    openapiRequiredFields.add("run_id");
    openapiRequiredFields.add("file_ids");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessageObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageObject is not found in the empty JSON string", MessageObject.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageObject.openapiRequiredFields) {
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
      if (!jsonObj.get("thread_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thread_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thread_id").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the required field `role`
      RoleEnum.validateJsonElement(jsonObj.get("role"));
      // ensure the json data is an array
      if (!jsonObj.get("content").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }

      JsonArray jsonArraycontent = jsonObj.getAsJsonArray("content");
      // validate the required field `content` (array)
      for (int i = 0; i < jsonArraycontent.size(); i++) {
        MessageObjectContentInner.validateJsonElement(jsonArraycontent.get(i));
      };
      if ((jsonObj.get("assistant_id") != null && !jsonObj.get("assistant_id").isJsonNull()) && !jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      if ((jsonObj.get("run_id") != null && !jsonObj.get("run_id").isJsonNull()) && !jsonObj.get("run_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("file_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("file_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_ids` to be an array in the JSON string but got `%s`", jsonObj.get("file_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageObject.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageObject>() {
           @Override
           public void write(JsonWriter out, MessageObject value) throws IOException {
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
           public MessageObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MessageObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MessageObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageObject
  * @throws IOException if the JSON string is invalid with respect to MessageObject
  */
  public static MessageObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageObject.class);
  }

 /**
  * Convert an instance of MessageObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

