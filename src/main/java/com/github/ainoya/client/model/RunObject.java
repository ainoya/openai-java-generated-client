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
import com.github.ainoya.client.model.AssistantObjectToolsInner;
import com.github.ainoya.client.model.RunObjectLastError;
import com.github.ainoya.client.model.RunObjectRequiredAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T05:21:58.409121Z[Etc/UTC]")
public class RunObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The object type, which is always &#x60;thread.run&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    THREAD_RUN("thread.run");

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

  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    REQUIRES_ACTION("requires_action"),
    
    CANCELLING("cancelling"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    COMPLETED("completed"),
    
    EXPIRED("expired");

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
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_REQUIRED_ACTION = "required_action";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACTION)
  private RunObjectRequiredAction requiredAction;

  public static final String SERIALIZED_NAME_LAST_ERROR = "last_error";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  private RunObjectLastError lastError;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private Integer expiresAt;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private Integer startedAt;

  public static final String SERIALIZED_NAME_CANCELLED_AT = "cancelled_at";
  @SerializedName(SERIALIZED_NAME_CANCELLED_AT)
  private Integer cancelledAt;

  public static final String SERIALIZED_NAME_FAILED_AT = "failed_at";
  @SerializedName(SERIALIZED_NAME_FAILED_AT)
  private Integer failedAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private Integer completedAt;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE_IDS = "file_ids";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<String> fileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public RunObject() {
  }

  public RunObject id(String id) {
    
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


  public RunObject _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always &#x60;thread.run&#x60;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public RunObject createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public RunObject threadId(String threadId) {
    
    this.threadId = threadId;
    return this;
  }

   /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   * @return threadId
  **/
  @javax.annotation.Nonnull
  public String getThreadId() {
    return threadId;
  }


  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public RunObject assistantId(String assistantId) {
    
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   * @return assistantId
  **/
  @javax.annotation.Nonnull
  public String getAssistantId() {
    return assistantId;
  }


  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  public RunObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    
    this.requiredAction = requiredAction;
    return this;
  }

   /**
   * Get requiredAction
   * @return requiredAction
  **/
  @javax.annotation.Nullable
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }


  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }


  public RunObject lastError(RunObjectLastError lastError) {
    
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @javax.annotation.Nullable
  public RunObjectLastError getLastError() {
    return lastError;
  }


  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }


  public RunObject expiresAt(Integer expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  public Integer getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RunObject startedAt(Integer startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  public Integer getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }


  public RunObject cancelledAt(Integer cancelledAt) {
    
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
  **/
  @javax.annotation.Nullable
  public Integer getCancelledAt() {
    return cancelledAt;
  }


  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }


  public RunObject failedAt(Integer failedAt) {
    
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
  **/
  @javax.annotation.Nullable
  public Integer getFailedAt() {
    return failedAt;
  }


  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }


  public RunObject completedAt(Integer completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  public Integer getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }


  public RunObject model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
  **/
  @javax.annotation.Nonnull
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public RunObject instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return instructions
  **/
  @javax.annotation.Nonnull
  public String getInstructions() {
    return instructions;
  }


  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public RunObject tools(List<AssistantObjectToolsInner> tools) {
    
    this.tools = tools;
    return this;
  }

  public RunObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return tools
  **/
  @javax.annotation.Nonnull
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }


  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }


  public RunObject fileIds(List<String> fileIds) {
    
    this.fileIds = fileIds;
    return this;
  }

  public RunObject addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
   * @return fileIds
  **/
  @javax.annotation.Nonnull
  public List<String> getFileIds() {
    return fileIds;
  }


  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }


  public RunObject metadata(Object metadata) {
    
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
   * @return the RunObject instance itself
   */
  public RunObject putAdditionalProperty(String key, Object value) {
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
    RunObject runObject = (RunObject) o;
    return Objects.equals(this.id, runObject.id) &&
        Objects.equals(this._object, runObject._object) &&
        Objects.equals(this.createdAt, runObject.createdAt) &&
        Objects.equals(this.threadId, runObject.threadId) &&
        Objects.equals(this.assistantId, runObject.assistantId) &&
        Objects.equals(this.status, runObject.status) &&
        Objects.equals(this.requiredAction, runObject.requiredAction) &&
        Objects.equals(this.lastError, runObject.lastError) &&
        Objects.equals(this.expiresAt, runObject.expiresAt) &&
        Objects.equals(this.startedAt, runObject.startedAt) &&
        Objects.equals(this.cancelledAt, runObject.cancelledAt) &&
        Objects.equals(this.failedAt, runObject.failedAt) &&
        Objects.equals(this.completedAt, runObject.completedAt) &&
        Objects.equals(this.model, runObject.model) &&
        Objects.equals(this.instructions, runObject.instructions) &&
        Objects.equals(this.tools, runObject.tools) &&
        Objects.equals(this.fileIds, runObject.fileIds) &&
        Objects.equals(this.metadata, runObject.metadata)&&
        Objects.equals(this.additionalProperties, runObject.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, model, instructions, tools, fileIds, metadata, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requiredAction: ").append(toIndentedString(requiredAction)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
    openapiFields.add("assistant_id");
    openapiFields.add("status");
    openapiFields.add("required_action");
    openapiFields.add("last_error");
    openapiFields.add("expires_at");
    openapiFields.add("started_at");
    openapiFields.add("cancelled_at");
    openapiFields.add("failed_at");
    openapiFields.add("completed_at");
    openapiFields.add("model");
    openapiFields.add("instructions");
    openapiFields.add("tools");
    openapiFields.add("file_ids");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("thread_id");
    openapiRequiredFields.add("assistant_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("last_error");
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("started_at");
    openapiRequiredFields.add("cancelled_at");
    openapiRequiredFields.add("failed_at");
    openapiRequiredFields.add("completed_at");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("instructions");
    openapiRequiredFields.add("tools");
    openapiRequiredFields.add("file_ids");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunObject is not found in the empty JSON string", RunObject.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunObject.openapiRequiredFields) {
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
      if (!jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the optional field `required_action`
      if (jsonObj.get("required_action") != null && !jsonObj.get("required_action").isJsonNull()) {
        RunObjectRequiredAction.validateJsonElement(jsonObj.get("required_action"));
      }
      // validate the required field `last_error`
      RunObjectLastError.validateJsonElement(jsonObj.get("last_error"));
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("tools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tools` to be an array in the JSON string but got `%s`", jsonObj.get("tools").toString()));
      }

      JsonArray jsonArraytools = jsonObj.getAsJsonArray("tools");
      // validate the required field `tools` (array)
      for (int i = 0; i < jsonArraytools.size(); i++) {
        AssistantObjectToolsInner.validateJsonElement(jsonArraytools.get(i));
      };
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
       if (!RunObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunObject.class));

       return (TypeAdapter<T>) new TypeAdapter<RunObject>() {
           @Override
           public void write(JsonWriter out, RunObject value) throws IOException {
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
           public RunObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RunObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RunObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunObject
  * @throws IOException if the JSON string is invalid with respect to RunObject
  */
  public static RunObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunObject.class);
  }

 /**
  * Convert an instance of RunObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

