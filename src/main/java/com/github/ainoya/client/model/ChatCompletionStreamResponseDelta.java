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
import com.github.ainoya.client.model.ChatCompletionMessageToolCallChunk;
import com.github.ainoya.client.model.ChatCompletionStreamResponseDeltaFunctionCall;
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
 * A chat completion delta generated by streamed model responses.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T05:29:56.631434Z[Etc/UTC]")
public class ChatCompletionStreamResponseDelta {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_FUNCTION_CALL = "function_call";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTION_CALL)
  private ChatCompletionStreamResponseDeltaFunctionCall functionCall;

  public static final String SERIALIZED_NAME_TOOL_CALLS = "tool_calls";
  @SerializedName(SERIALIZED_NAME_TOOL_CALLS)
  private List<ChatCompletionMessageToolCallChunk> toolCalls;

  /**
   * The role of the author of this message.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SYSTEM("system"),
    
    USER("user"),
    
    ASSISTANT("assistant"),
    
    TOOL("tool");

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

  public ChatCompletionStreamResponseDelta() {
  }

  public ChatCompletionStreamResponseDelta content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The contents of the chunk message.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  @Deprecated
  public ChatCompletionStreamResponseDelta functionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    
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
  public ChatCompletionStreamResponseDeltaFunctionCall getFunctionCall() {
    return functionCall;
  }


  @Deprecated
  public void setFunctionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
  }


  public ChatCompletionStreamResponseDelta toolCalls(List<ChatCompletionMessageToolCallChunk> toolCalls) {
    
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionStreamResponseDelta addToolCallsItem(ChatCompletionMessageToolCallChunk toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * Get toolCalls
   * @return toolCalls
  **/
  @javax.annotation.Nullable
  public List<ChatCompletionMessageToolCallChunk> getToolCalls() {
    return toolCalls;
  }


  public void setToolCalls(List<ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
  }


  public ChatCompletionStreamResponseDelta role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role of the author of this message.
   * @return role
  **/
  @javax.annotation.Nullable
  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
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
   * @return the ChatCompletionStreamResponseDelta instance itself
   */
  public ChatCompletionStreamResponseDelta putAdditionalProperty(String key, Object value) {
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
    ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
    return Objects.equals(this.content, chatCompletionStreamResponseDelta.content) &&
        Objects.equals(this.functionCall, chatCompletionStreamResponseDelta.functionCall) &&
        Objects.equals(this.toolCalls, chatCompletionStreamResponseDelta.toolCalls) &&
        Objects.equals(this.role, chatCompletionStreamResponseDelta.role)&&
        Objects.equals(this.additionalProperties, chatCompletionStreamResponseDelta.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, functionCall, toolCalls, role, additionalProperties);
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
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("function_call");
    openapiFields.add("tool_calls");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionStreamResponseDelta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionStreamResponseDelta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionStreamResponseDelta is not found in the empty JSON string", ChatCompletionStreamResponseDelta.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the optional field `function_call`
      if (jsonObj.get("function_call") != null && !jsonObj.get("function_call").isJsonNull()) {
        ChatCompletionStreamResponseDeltaFunctionCall.validateJsonElement(jsonObj.get("function_call"));
      }
      if (jsonObj.get("tool_calls") != null && !jsonObj.get("tool_calls").isJsonNull()) {
        JsonArray jsonArraytoolCalls = jsonObj.getAsJsonArray("tool_calls");
        if (jsonArraytoolCalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tool_calls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tool_calls` to be an array in the JSON string but got `%s`", jsonObj.get("tool_calls").toString()));
          }

          // validate the optional field `tool_calls` (array)
          for (int i = 0; i < jsonArraytoolCalls.size(); i++) {
            ChatCompletionMessageToolCallChunk.validateJsonElement(jsonArraytoolCalls.get(i));
          };
        }
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) {
        RoleEnum.validateJsonElement(jsonObj.get("role"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionStreamResponseDelta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionStreamResponseDelta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionStreamResponseDelta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionStreamResponseDelta.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionStreamResponseDelta>() {
           @Override
           public void write(JsonWriter out, ChatCompletionStreamResponseDelta value) throws IOException {
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
           public ChatCompletionStreamResponseDelta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ChatCompletionStreamResponseDelta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChatCompletionStreamResponseDelta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionStreamResponseDelta
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionStreamResponseDelta
  */
  public static ChatCompletionStreamResponseDelta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionStreamResponseDelta.class);
  }

 /**
  * Convert an instance of ChatCompletionStreamResponseDelta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

