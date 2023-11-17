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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.client.model.CreateThreadRequest;
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

import tokyo.ainoya.openapi.client.JSON;

/**
 * CreateThreadAndRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T05:22:39.518974Z[Etc/UTC]")
public class CreateThreadAndRunRequest {
  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public static final String SERIALIZED_NAME_THREAD = "thread";
  @SerializedName(SERIALIZED_NAME_THREAD)
  private CreateThreadRequest thread;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<CreateThreadAndRunRequestToolsInner> tools;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CreateThreadAndRunRequest() {
  }

  public CreateThreadAndRunRequest assistantId(String assistantId) {
    
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
  **/
  @javax.annotation.Nonnull
  public String getAssistantId() {
    return assistantId;
  }


  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  public CreateThreadAndRunRequest thread(CreateThreadRequest thread) {
    
    this.thread = thread;
    return this;
  }

   /**
   * Get thread
   * @return thread
  **/
  @javax.annotation.Nullable
  public CreateThreadRequest getThread() {
    return thread;
  }


  public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
  }


  public CreateThreadAndRunRequest model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
   * @return model
  **/
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public CreateThreadAndRunRequest instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
  **/
  @javax.annotation.Nullable
  public String getInstructions() {
    return instructions;
  }


  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public CreateThreadAndRunRequest tools(List<CreateThreadAndRunRequestToolsInner> tools) {
    
    this.tools = tools;
    return this;
  }

  public CreateThreadAndRunRequest addToolsItem(CreateThreadAndRunRequestToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
  **/
  @javax.annotation.Nullable
  public List<CreateThreadAndRunRequestToolsInner> getTools() {
    return tools;
  }


  public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
  }


  public CreateThreadAndRunRequest metadata(Object metadata) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadAndRunRequest createThreadAndRunRequest = (CreateThreadAndRunRequest) o;
    return Objects.equals(this.assistantId, createThreadAndRunRequest.assistantId) &&
        Objects.equals(this.thread, createThreadAndRunRequest.thread) &&
        Objects.equals(this.model, createThreadAndRunRequest.model) &&
        Objects.equals(this.instructions, createThreadAndRunRequest.instructions) &&
        Objects.equals(this.tools, createThreadAndRunRequest.tools) &&
        Objects.equals(this.metadata, createThreadAndRunRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, model, instructions, tools, metadata);
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
    sb.append("class CreateThreadAndRunRequest {\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("assistant_id");
    openapiFields.add("thread");
    openapiFields.add("model");
    openapiFields.add("instructions");
    openapiFields.add("tools");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assistant_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateThreadAndRunRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadAndRunRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadAndRunRequest is not found in the empty JSON string", CreateThreadAndRunRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateThreadAndRunRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateThreadAndRunRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateThreadAndRunRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      // validate the optional field `thread`
      if (jsonObj.get("thread") != null && !jsonObj.get("thread").isJsonNull()) {
        CreateThreadRequest.validateJsonElement(jsonObj.get("thread"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      if (jsonObj.get("tools") != null && !jsonObj.get("tools").isJsonNull()) {
        JsonArray jsonArraytools = jsonObj.getAsJsonArray("tools");
        if (jsonArraytools != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tools").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tools` to be an array in the JSON string but got `%s`", jsonObj.get("tools").toString()));
          }

          // validate the optional field `tools` (array)
          for (int i = 0; i < jsonArraytools.size(); i++) {
            CreateThreadAndRunRequestToolsInner.validateJsonElement(jsonArraytools.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadAndRunRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadAndRunRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadAndRunRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadAndRunRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadAndRunRequest>() {
           @Override
           public void write(JsonWriter out, CreateThreadAndRunRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateThreadAndRunRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateThreadAndRunRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateThreadAndRunRequest
  * @throws IOException if the JSON string is invalid with respect to CreateThreadAndRunRequest
  */
  public static CreateThreadAndRunRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadAndRunRequest.class);
  }

 /**
  * Convert an instance of CreateThreadAndRunRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

