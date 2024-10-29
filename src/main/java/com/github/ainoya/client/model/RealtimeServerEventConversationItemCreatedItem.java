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
import com.github.ainoya.client.model.RealtimeServerEventConversationItemCreatedItemContentInner;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * The item that was created.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:48:55.661559293Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RealtimeServerEventConversationItemCreatedItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<RealtimeServerEventConversationItemCreatedItemContentInner> content = new ArrayList<>();

  public static final String SERIALIZED_NAME_CALL_ID = "call_id";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public RealtimeServerEventConversationItemCreatedItem() {
  }

  public RealtimeServerEventConversationItemCreatedItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the item.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RealtimeServerEventConversationItemCreatedItem _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, must be \&quot;realtime.item\&quot;.
   * @return _object
   */
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  public RealtimeServerEventConversationItemCreatedItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the item (\&quot;message\&quot;, \&quot;function_call\&quot;, \&quot;function_call_output\&quot;).
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public RealtimeServerEventConversationItemCreatedItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the item (\&quot;completed\&quot;, \&quot;in_progress\&quot;, \&quot;incomplete\&quot;).
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public RealtimeServerEventConversationItemCreatedItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role associated with the item (\&quot;user\&quot;, \&quot;assistant\&quot;, \&quot;system\&quot;).
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public RealtimeServerEventConversationItemCreatedItem content(List<RealtimeServerEventConversationItemCreatedItemContentInner> content) {
    this.content = content;
    return this;
  }

  public RealtimeServerEventConversationItemCreatedItem addContentItem(RealtimeServerEventConversationItemCreatedItemContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the item.
   * @return content
   */
  @javax.annotation.Nullable
  public List<RealtimeServerEventConversationItemCreatedItemContentInner> getContent() {
    return content;
  }

  public void setContent(List<RealtimeServerEventConversationItemCreatedItemContentInner> content) {
    this.content = content;
  }


  public RealtimeServerEventConversationItemCreatedItem callId(String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The ID of the function call (for \&quot;function_call\&quot; items).
   * @return callId
   */
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }


  public RealtimeServerEventConversationItemCreatedItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function being called.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RealtimeServerEventConversationItemCreatedItem arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The arguments of the function call.
   * @return arguments
   */
  @javax.annotation.Nullable
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  public RealtimeServerEventConversationItemCreatedItem output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The output of the function call (for \&quot;function_call_output\&quot; items).
   * @return output
   */
  @javax.annotation.Nullable
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
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
   * @return the RealtimeServerEventConversationItemCreatedItem instance itself
   */
  public RealtimeServerEventConversationItemCreatedItem putAdditionalProperty(String key, Object value) {
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
    RealtimeServerEventConversationItemCreatedItem realtimeServerEventConversationItemCreatedItem = (RealtimeServerEventConversationItemCreatedItem) o;
    return Objects.equals(this.id, realtimeServerEventConversationItemCreatedItem.id) &&
        Objects.equals(this._object, realtimeServerEventConversationItemCreatedItem._object) &&
        Objects.equals(this.type, realtimeServerEventConversationItemCreatedItem.type) &&
        Objects.equals(this.status, realtimeServerEventConversationItemCreatedItem.status) &&
        Objects.equals(this.role, realtimeServerEventConversationItemCreatedItem.role) &&
        Objects.equals(this.content, realtimeServerEventConversationItemCreatedItem.content) &&
        Objects.equals(this.callId, realtimeServerEventConversationItemCreatedItem.callId) &&
        Objects.equals(this.name, realtimeServerEventConversationItemCreatedItem.name) &&
        Objects.equals(this.arguments, realtimeServerEventConversationItemCreatedItem.arguments) &&
        Objects.equals(this.output, realtimeServerEventConversationItemCreatedItem.output)&&
        Objects.equals(this.additionalProperties, realtimeServerEventConversationItemCreatedItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, type, status, role, content, callId, name, arguments, output, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemCreatedItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("role");
    openapiFields.add("content");
    openapiFields.add("call_id");
    openapiFields.add("name");
    openapiFields.add("arguments");
    openapiFields.add("output");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeServerEventConversationItemCreatedItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeServerEventConversationItemCreatedItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeServerEventConversationItemCreatedItem is not found in the empty JSON string", RealtimeServerEventConversationItemCreatedItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        JsonArray jsonArraycontent = jsonObj.getAsJsonArray("content");
        if (jsonArraycontent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("content").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
          }

          // validate the optional field `content` (array)
          for (int i = 0; i < jsonArraycontent.size(); i++) {
            RealtimeServerEventConversationItemCreatedItemContentInner.validateJsonElement(jsonArraycontent.get(i));
          };
        }
      }
      if ((jsonObj.get("call_id") != null && !jsonObj.get("call_id").isJsonNull()) && !jsonObj.get("call_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `call_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("call_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonNull()) && !jsonObj.get("arguments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
      if ((jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull()) && !jsonObj.get("output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeServerEventConversationItemCreatedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeServerEventConversationItemCreatedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeServerEventConversationItemCreatedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeServerEventConversationItemCreatedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeServerEventConversationItemCreatedItem>() {
           @Override
           public void write(JsonWriter out, RealtimeServerEventConversationItemCreatedItem value) throws IOException {
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
           public RealtimeServerEventConversationItemCreatedItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RealtimeServerEventConversationItemCreatedItem instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RealtimeServerEventConversationItemCreatedItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeServerEventConversationItemCreatedItem
   * @throws IOException if the JSON string is invalid with respect to RealtimeServerEventConversationItemCreatedItem
   */
  public static RealtimeServerEventConversationItemCreatedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeServerEventConversationItemCreatedItem.class);
  }

  /**
   * Convert an instance of RealtimeServerEventConversationItemCreatedItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

