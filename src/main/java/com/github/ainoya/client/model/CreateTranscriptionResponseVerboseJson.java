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
import com.github.ainoya.client.model.TranscriptionSegment;
import com.github.ainoya.client.model.TranscriptionWord;
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
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:48:55.661559293Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateTranscriptionResponseVerboseJson {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_WORDS = "words";
  @SerializedName(SERIALIZED_NAME_WORDS)
  private List<TranscriptionWord> words = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private List<TranscriptionSegment> segments = new ArrayList<>();

  public CreateTranscriptionResponseVerboseJson() {
  }

  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the input audio.
   * @return language
   */
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public CreateTranscriptionResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the input audio.
   * @return duration
   */
  @javax.annotation.Nonnull
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public CreateTranscriptionResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The transcribed text.
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public CreateTranscriptionResponseVerboseJson words(List<TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addWordsItem(TranscriptionWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

  /**
   * Extracted words and their corresponding timestamps.
   * @return words
   */
  @javax.annotation.Nullable
  public List<TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }


  public CreateTranscriptionResponseVerboseJson segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
   */
  @javax.annotation.Nullable
  public List<TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<TranscriptionSegment> segments) {
    this.segments = segments;
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
   * @return the CreateTranscriptionResponseVerboseJson instance itself
   */
  public CreateTranscriptionResponseVerboseJson putAdditionalProperty(String key, Object value) {
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(this.language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(this.duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(this.text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(this.words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(this.segments, createTranscriptionResponseVerboseJson.segments)&&
        Objects.equals(this.additionalProperties, createTranscriptionResponseVerboseJson.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, words, segments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionResponseVerboseJson {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("duration");
    openapiFields.add("text");
    openapiFields.add("words");
    openapiFields.add("segments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTranscriptionResponseVerboseJson
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTranscriptionResponseVerboseJson.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTranscriptionResponseVerboseJson is not found in the empty JSON string", CreateTranscriptionResponseVerboseJson.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTranscriptionResponseVerboseJson.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (!jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("words") != null && !jsonObj.get("words").isJsonNull()) {
        JsonArray jsonArraywords = jsonObj.getAsJsonArray("words");
        if (jsonArraywords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("words").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `words` to be an array in the JSON string but got `%s`", jsonObj.get("words").toString()));
          }

          // validate the optional field `words` (array)
          for (int i = 0; i < jsonArraywords.size(); i++) {
            TranscriptionWord.validateJsonElement(jsonArraywords.get(i));
          };
        }
      }
      if (jsonObj.get("segments") != null && !jsonObj.get("segments").isJsonNull()) {
        JsonArray jsonArraysegments = jsonObj.getAsJsonArray("segments");
        if (jsonArraysegments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("segments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `segments` to be an array in the JSON string but got `%s`", jsonObj.get("segments").toString()));
          }

          // validate the optional field `segments` (array)
          for (int i = 0; i < jsonArraysegments.size(); i++) {
            TranscriptionSegment.validateJsonElement(jsonArraysegments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTranscriptionResponseVerboseJson.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTranscriptionResponseVerboseJson' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTranscriptionResponseVerboseJson> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTranscriptionResponseVerboseJson.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTranscriptionResponseVerboseJson>() {
           @Override
           public void write(JsonWriter out, CreateTranscriptionResponseVerboseJson value) throws IOException {
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
           public CreateTranscriptionResponseVerboseJson read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateTranscriptionResponseVerboseJson instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateTranscriptionResponseVerboseJson given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTranscriptionResponseVerboseJson
   * @throws IOException if the JSON string is invalid with respect to CreateTranscriptionResponseVerboseJson
   */
  public static CreateTranscriptionResponseVerboseJson fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTranscriptionResponseVerboseJson.class);
  }

  /**
   * Convert an instance of CreateTranscriptionResponseVerboseJson to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

