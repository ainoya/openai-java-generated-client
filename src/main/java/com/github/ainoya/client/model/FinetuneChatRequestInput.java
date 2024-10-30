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
import com.github.ainoya.client.model.ChatCompletionFunctions;
import com.github.ainoya.client.model.ChatCompletionTool;
import com.github.ainoya.client.model.FinetuneChatRequestInputMessagesInner;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * The per-line training example of a fine-tuning input file for chat models
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FinetuneChatRequestInput {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<FinetuneChatRequestInputMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<ChatCompletionTool> tools = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARALLEL_TOOL_CALLS = "parallel_tool_calls";
  @SerializedName(SERIALIZED_NAME_PARALLEL_TOOL_CALLS)
  private Boolean parallelToolCalls;

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  public FinetuneChatRequestInput() {
  }

  public FinetuneChatRequestInput messages(List<FinetuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public FinetuneChatRequestInput addMessagesItem(FinetuneChatRequestInputMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   */
  @javax.annotation.Nullable
  public List<FinetuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<FinetuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }


  public FinetuneChatRequestInput tools(List<ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  public FinetuneChatRequestInput addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tools the model may generate JSON inputs for.
   * @return tools
   */
  @javax.annotation.Nullable
  public List<ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }


  public FinetuneChatRequestInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling/parallel-function-calling) during tool use.
   * @return parallelToolCalls
   */
  @javax.annotation.Nullable
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }


  @Deprecated
  public FinetuneChatRequestInput functions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  public FinetuneChatRequestInput addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

  /**
   * A list of functions the model may generate JSON inputs for.
   * @return functions
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  @Deprecated
  public void setFunctions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
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
   * @return the FinetuneChatRequestInput instance itself
   */
  public FinetuneChatRequestInput putAdditionalProperty(String key, Object value) {
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
    FinetuneChatRequestInput finetuneChatRequestInput = (FinetuneChatRequestInput) o;
    return Objects.equals(this.messages, finetuneChatRequestInput.messages) &&
        Objects.equals(this.tools, finetuneChatRequestInput.tools) &&
        Objects.equals(this.parallelToolCalls, finetuneChatRequestInput.parallelToolCalls) &&
        Objects.equals(this.functions, finetuneChatRequestInput.functions)&&
        Objects.equals(this.additionalProperties, finetuneChatRequestInput.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, tools, parallelToolCalls, functions, additionalProperties);
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
    sb.append("class FinetuneChatRequestInput {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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
    openapiFields.add("messages");
    openapiFields.add("tools");
    openapiFields.add("parallel_tool_calls");
    openapiFields.add("functions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FinetuneChatRequestInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinetuneChatRequestInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinetuneChatRequestInput is not found in the empty JSON string", FinetuneChatRequestInput.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull()) {
        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
        if (jsonArraymessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
          }

          // validate the optional field `messages` (array)
          for (int i = 0; i < jsonArraymessages.size(); i++) {
            FinetuneChatRequestInputMessagesInner.validateJsonElement(jsonArraymessages.get(i));
          };
        }
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
            ChatCompletionTool.validateJsonElement(jsonArraytools.get(i));
          };
        }
      }
      if (jsonObj.get("functions") != null && !jsonObj.get("functions").isJsonNull()) {
        JsonArray jsonArrayfunctions = jsonObj.getAsJsonArray("functions");
        if (jsonArrayfunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("functions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `functions` to be an array in the JSON string but got `%s`", jsonObj.get("functions").toString()));
          }

          // validate the optional field `functions` (array)
          for (int i = 0; i < jsonArrayfunctions.size(); i++) {
            ChatCompletionFunctions.validateJsonElement(jsonArrayfunctions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinetuneChatRequestInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinetuneChatRequestInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinetuneChatRequestInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinetuneChatRequestInput.class));

       return (TypeAdapter<T>) new TypeAdapter<FinetuneChatRequestInput>() {
           @Override
           public void write(JsonWriter out, FinetuneChatRequestInput value) throws IOException {
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
           public FinetuneChatRequestInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FinetuneChatRequestInput instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of FinetuneChatRequestInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FinetuneChatRequestInput
   * @throws IOException if the JSON string is invalid with respect to FinetuneChatRequestInput
   */
  public static FinetuneChatRequestInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinetuneChatRequestInput.class);
  }

  /**
   * Convert an instance of FinetuneChatRequestInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
