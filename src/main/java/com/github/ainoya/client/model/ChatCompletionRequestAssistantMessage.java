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
import com.github.ainoya.client.model.ChatCompletionMessageToolCall;
import com.github.ainoya.client.model.ChatCompletionRequestAssistantMessageFunctionCall;
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
 * ChatCompletionRequestAssistantMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T01:19:53.351390Z[Etc/UTC]")
public class ChatCompletionRequestAssistantMessage {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
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

  public static final String SERIALIZED_NAME_TOOL_CALLS = "tool_calls";
  @SerializedName(SERIALIZED_NAME_TOOL_CALLS)
  private List<ChatCompletionMessageToolCall> toolCalls;

  public static final String SERIALIZED_NAME_FUNCTION_CALL = "function_call";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTION_CALL)
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  public ChatCompletionRequestAssistantMessage() {
  }

  public ChatCompletionRequestAssistantMessage content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The contents of the assistant message. 
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ChatCompletionRequestAssistantMessage role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   * @return role
  **/
  @javax.annotation.Nonnull
  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public ChatCompletionRequestAssistantMessage toolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
  **/
  @javax.annotation.Nullable
  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }


  public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }


  @Deprecated
  public ChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }


  @Deprecated
  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
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
   * @return the ChatCompletionRequestAssistantMessage instance itself
   */
  public ChatCompletionRequestAssistantMessage putAdditionalProperty(String key, Object value) {
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
    ChatCompletionRequestAssistantMessage chatCompletionRequestAssistantMessage = (ChatCompletionRequestAssistantMessage) o;
    return Objects.equals(this.content, chatCompletionRequestAssistantMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.toolCalls, chatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(this.functionCall, chatCompletionRequestAssistantMessage.functionCall)&&
        Objects.equals(this.additionalProperties, chatCompletionRequestAssistantMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, toolCalls, functionCall, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("role");
    openapiFields.add("tool_calls");
    openapiFields.add("function_call");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("role");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestAssistantMessage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionRequestAssistantMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionRequestAssistantMessage is not found in the empty JSON string", ChatCompletionRequestAssistantMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatCompletionRequestAssistantMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the required field `role`
      RoleEnum.validateJsonElement(jsonObj.get("role"));
      if (jsonObj.get("tool_calls") != null && !jsonObj.get("tool_calls").isJsonNull()) {
        JsonArray jsonArraytoolCalls = jsonObj.getAsJsonArray("tool_calls");
        if (jsonArraytoolCalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tool_calls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tool_calls` to be an array in the JSON string but got `%s`", jsonObj.get("tool_calls").toString()));
          }

          // validate the optional field `tool_calls` (array)
          for (int i = 0; i < jsonArraytoolCalls.size(); i++) {
            ChatCompletionMessageToolCall.validateJsonElement(jsonArraytoolCalls.get(i));
          };
        }
      }
      // validate the optional field `function_call`
      if (jsonObj.get("function_call") != null && !jsonObj.get("function_call").isJsonNull()) {
        ChatCompletionRequestAssistantMessageFunctionCall.validateJsonElement(jsonObj.get("function_call"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionRequestAssistantMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionRequestAssistantMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionRequestAssistantMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestAssistantMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestAssistantMessage>() {
           @Override
           public void write(JsonWriter out, ChatCompletionRequestAssistantMessage value) throws IOException {
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
           public ChatCompletionRequestAssistantMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ChatCompletionRequestAssistantMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChatCompletionRequestAssistantMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionRequestAssistantMessage
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestAssistantMessage
  */
  public static ChatCompletionRequestAssistantMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionRequestAssistantMessage.class);
  }

 /**
  * Convert an instance of ChatCompletionRequestAssistantMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

