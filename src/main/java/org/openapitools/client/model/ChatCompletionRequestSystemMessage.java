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
 * ChatCompletionRequestSystemMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T09:29:35.418072Z[Etc/UTC]")
public class ChatCompletionRequestSystemMessage {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  /**
   * The role of the messages author, in this case &#x60;system&#x60;.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SYSTEM("system");

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

  public ChatCompletionRequestSystemMessage() {
  }

  public ChatCompletionRequestSystemMessage content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The contents of the system message.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ChatCompletionRequestSystemMessage role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case &#x60;system&#x60;.
   * @return role
  **/
  @javax.annotation.Nonnull
  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestSystemMessage chatCompletionRequestSystemMessage = (ChatCompletionRequestSystemMessage) o;
    return Objects.equals(this.content, chatCompletionRequestSystemMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestSystemMessage.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestSystemMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("role");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestSystemMessage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionRequestSystemMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionRequestSystemMessage is not found in the empty JSON string", ChatCompletionRequestSystemMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChatCompletionRequestSystemMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatCompletionRequestSystemMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatCompletionRequestSystemMessage.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionRequestSystemMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionRequestSystemMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionRequestSystemMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestSystemMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestSystemMessage>() {
           @Override
           public void write(JsonWriter out, ChatCompletionRequestSystemMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatCompletionRequestSystemMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatCompletionRequestSystemMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionRequestSystemMessage
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestSystemMessage
  */
  public static ChatCompletionRequestSystemMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionRequestSystemMessage.class);
  }

 /**
  * Convert an instance of ChatCompletionRequestSystemMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

