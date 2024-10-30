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
import com.github.ainoya.client.model.RealtimeClientEventResponseCreateResponseMaxOutputTokens;
import com.github.ainoya.client.model.RealtimeClientEventResponseCreateResponseToolsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Configuration for the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RealtimeClientEventResponseCreateResponse {
  public static final String SERIALIZED_NAME_MODALITIES = "modalities";
  @SerializedName(SERIALIZED_NAME_MODALITIES)
  private List<String> modalities = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private String voice;

  public static final String SERIALIZED_NAME_OUTPUT_AUDIO_FORMAT = "output_audio_format";
  @SerializedName(SERIALIZED_NAME_OUTPUT_AUDIO_FORMAT)
  private String outputAudioFormat;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<RealtimeClientEventResponseCreateResponseToolsInner> tools = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOOL_CHOICE = "tool_choice";
  @SerializedName(SERIALIZED_NAME_TOOL_CHOICE)
  private String toolChoice;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature;

  public static final String SERIALIZED_NAME_MAX_OUTPUT_TOKENS = "max_output_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_OUTPUT_TOKENS)
  private RealtimeClientEventResponseCreateResponseMaxOutputTokens maxOutputTokens;

  public RealtimeClientEventResponseCreateResponse() {
  }

  public RealtimeClientEventResponseCreateResponse modalities(List<String> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeClientEventResponseCreateResponse addModalitiesItem(String modalitiesItem) {
    if (this.modalities == null) {
      this.modalities = new ArrayList<>();
    }
    this.modalities.add(modalitiesItem);
    return this;
  }

  /**
   * The modalities for the response.
   * @return modalities
   */
  @javax.annotation.Nullable
  public List<String> getModalities() {
    return modalities;
  }

  public void setModalities(List<String> modalities) {
    this.modalities = modalities;
  }


  public RealtimeClientEventResponseCreateResponse instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Instructions for the model.
   * @return instructions
   */
  @javax.annotation.Nullable
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public RealtimeClientEventResponseCreateResponse voice(String voice) {
    this.voice = voice;
    return this;
  }

  /**
   * The voice the model uses to respond - one of &#x60;alloy&#x60;, &#x60;echo&#x60;, or &#x60;shimmer&#x60;.
   * @return voice
   */
  @javax.annotation.Nullable
  public String getVoice() {
    return voice;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }


  public RealtimeClientEventResponseCreateResponse outputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  /**
   * The format of output audio.
   * @return outputAudioFormat
   */
  @javax.annotation.Nullable
  public String getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }


  public RealtimeClientEventResponseCreateResponse tools(List<RealtimeClientEventResponseCreateResponseToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeClientEventResponseCreateResponse addToolsItem(RealtimeClientEventResponseCreateResponseToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * Tools (functions) available to the model.
   * @return tools
   */
  @javax.annotation.Nullable
  public List<RealtimeClientEventResponseCreateResponseToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<RealtimeClientEventResponseCreateResponseToolsInner> tools) {
    this.tools = tools;
  }


  public RealtimeClientEventResponseCreateResponse toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools.
   * @return toolChoice
   */
  @javax.annotation.Nullable
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }


  public RealtimeClientEventResponseCreateResponse temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Sampling temperature.
   * @return temperature
   */
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public RealtimeClientEventResponseCreateResponse maxOutputTokens(RealtimeClientEventResponseCreateResponseMaxOutputTokens maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
    return this;
  }

  /**
   * Get maxOutputTokens
   * @return maxOutputTokens
   */
  @javax.annotation.Nullable
  public RealtimeClientEventResponseCreateResponseMaxOutputTokens getMaxOutputTokens() {
    return maxOutputTokens;
  }

  public void setMaxOutputTokens(RealtimeClientEventResponseCreateResponseMaxOutputTokens maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
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
   * @return the RealtimeClientEventResponseCreateResponse instance itself
   */
  public RealtimeClientEventResponseCreateResponse putAdditionalProperty(String key, Object value) {
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
    RealtimeClientEventResponseCreateResponse realtimeClientEventResponseCreateResponse = (RealtimeClientEventResponseCreateResponse) o;
    return Objects.equals(this.modalities, realtimeClientEventResponseCreateResponse.modalities) &&
        Objects.equals(this.instructions, realtimeClientEventResponseCreateResponse.instructions) &&
        Objects.equals(this.voice, realtimeClientEventResponseCreateResponse.voice) &&
        Objects.equals(this.outputAudioFormat, realtimeClientEventResponseCreateResponse.outputAudioFormat) &&
        Objects.equals(this.tools, realtimeClientEventResponseCreateResponse.tools) &&
        Objects.equals(this.toolChoice, realtimeClientEventResponseCreateResponse.toolChoice) &&
        Objects.equals(this.temperature, realtimeClientEventResponseCreateResponse.temperature) &&
        Objects.equals(this.maxOutputTokens, realtimeClientEventResponseCreateResponse.maxOutputTokens)&&
        Objects.equals(this.additionalProperties, realtimeClientEventResponseCreateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, instructions, voice, outputAudioFormat, tools, toolChoice, temperature, maxOutputTokens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventResponseCreateResponse {\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxOutputTokens: ").append(toIndentedString(maxOutputTokens)).append("\n");
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
    openapiFields.add("modalities");
    openapiFields.add("instructions");
    openapiFields.add("voice");
    openapiFields.add("output_audio_format");
    openapiFields.add("tools");
    openapiFields.add("tool_choice");
    openapiFields.add("temperature");
    openapiFields.add("max_output_tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeClientEventResponseCreateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeClientEventResponseCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeClientEventResponseCreateResponse is not found in the empty JSON string", RealtimeClientEventResponseCreateResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("modalities") != null && !jsonObj.get("modalities").isJsonNull() && !jsonObj.get("modalities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modalities` to be an array in the JSON string but got `%s`", jsonObj.get("modalities").toString()));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      if ((jsonObj.get("voice") != null && !jsonObj.get("voice").isJsonNull()) && !jsonObj.get("voice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice").toString()));
      }
      if ((jsonObj.get("output_audio_format") != null && !jsonObj.get("output_audio_format").isJsonNull()) && !jsonObj.get("output_audio_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output_audio_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output_audio_format").toString()));
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
            RealtimeClientEventResponseCreateResponseToolsInner.validateJsonElement(jsonArraytools.get(i));
          };
        }
      }
      if ((jsonObj.get("tool_choice") != null && !jsonObj.get("tool_choice").isJsonNull()) && !jsonObj.get("tool_choice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tool_choice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tool_choice").toString()));
      }
      // validate the optional field `max_output_tokens`
      if (jsonObj.get("max_output_tokens") != null && !jsonObj.get("max_output_tokens").isJsonNull()) {
        RealtimeClientEventResponseCreateResponseMaxOutputTokens.validateJsonElement(jsonObj.get("max_output_tokens"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeClientEventResponseCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeClientEventResponseCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeClientEventResponseCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeClientEventResponseCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeClientEventResponseCreateResponse>() {
           @Override
           public void write(JsonWriter out, RealtimeClientEventResponseCreateResponse value) throws IOException {
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
           public RealtimeClientEventResponseCreateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RealtimeClientEventResponseCreateResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RealtimeClientEventResponseCreateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeClientEventResponseCreateResponse
   * @throws IOException if the JSON string is invalid with respect to RealtimeClientEventResponseCreateResponse
   */
  public static RealtimeClientEventResponseCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeClientEventResponseCreateResponse.class);
  }

  /**
   * Convert an instance of RealtimeClientEventResponseCreateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
