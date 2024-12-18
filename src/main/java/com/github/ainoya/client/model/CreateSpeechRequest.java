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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * CreateSpeechRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateSpeechRequest {
  /**
   * Gets or Sets model
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    _1("tts-1"),
    
    _1_HD("tts-1-hd");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelEnum fromValue(String value) {
      for (ModelEnum b : ModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private ModelEnum model;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  /**
   * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
   */
  @JsonAdapter(VoiceEnum.Adapter.class)
  public enum VoiceEnum {
    ALLOY("alloy"),
    
    ECHO("echo"),
    
    FABLE("fable"),
    
    ONYX("onyx"),
    
    NOVA("nova"),
    
    SHIMMER("shimmer");

    private String value;

    VoiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoiceEnum fromValue(String value) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VoiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VoiceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VoiceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private VoiceEnum voice;

  /**
   * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
   */
  @JsonAdapter(ResponseFormatEnum.Adapter.class)
  public enum ResponseFormatEnum {
    MP3("mp3"),
    
    OPUS("opus"),
    
    AAC("aac"),
    
    FLAC("flac"),
    
    WAV("wav"),
    
    PCM("pcm");

    private String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseFormatEnum fromValue(String value) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResponseFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private BigDecimal speed = new BigDecimal("1");

  public CreateSpeechRequest() {
  }

  public CreateSpeechRequest model(ModelEnum model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nonnull
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }


  public CreateSpeechRequest input(String input) {
    this.input = input;
    return this;
  }

  /**
   * The text to generate audio for. The maximum length is 4096 characters.
   * @return input
   */
  @javax.annotation.Nonnull
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }


  public CreateSpeechRequest voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  /**
   * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
   * @return voice
   */
  @javax.annotation.Nonnull
  public VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }


  public CreateSpeechRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  /**
   * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
   * @return responseFormat
   */
  @javax.annotation.Nullable
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }


  public CreateSpeechRequest speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

  /**
   * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
   * minimum: 0.25
   * maximum: 4
   * @return speed
   */
  @javax.annotation.Nullable
  public BigDecimal getSpeed() {
    return speed;
  }

  public void setSpeed(BigDecimal speed) {
    this.speed = speed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSpeechRequest createSpeechRequest = (CreateSpeechRequest) o;
    return Objects.equals(this.model, createSpeechRequest.model) &&
        Objects.equals(this.input, createSpeechRequest.input) &&
        Objects.equals(this.voice, createSpeechRequest.voice) &&
        Objects.equals(this.responseFormat, createSpeechRequest.responseFormat) &&
        Objects.equals(this.speed, createSpeechRequest.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, input, voice, responseFormat, speed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSpeechRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
    openapiFields.add("model");
    openapiFields.add("input");
    openapiFields.add("voice");
    openapiFields.add("response_format");
    openapiFields.add("speed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("input");
    openapiRequiredFields.add("voice");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateSpeechRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSpeechRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSpeechRequest is not found in the empty JSON string", CreateSpeechRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSpeechRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSpeechRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSpeechRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the required field `model`
      ModelEnum.validateJsonElement(jsonObj.get("model"));
      if (!jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if (!jsonObj.get("voice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice").toString()));
      }
      // validate the required field `voice`
      VoiceEnum.validateJsonElement(jsonObj.get("voice"));
      if ((jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) && !jsonObj.get("response_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_format").toString()));
      }
      // validate the optional field `response_format`
      if (jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) {
        ResponseFormatEnum.validateJsonElement(jsonObj.get("response_format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSpeechRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSpeechRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSpeechRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSpeechRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSpeechRequest>() {
           @Override
           public void write(JsonWriter out, CreateSpeechRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSpeechRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateSpeechRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateSpeechRequest
   * @throws IOException if the JSON string is invalid with respect to CreateSpeechRequest
   */
  public static CreateSpeechRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSpeechRequest.class);
  }

  /**
   * Convert an instance of CreateSpeechRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

