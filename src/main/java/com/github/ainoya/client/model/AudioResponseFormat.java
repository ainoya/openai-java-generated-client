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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 */
@JsonAdapter(AudioResponseFormat.Adapter.class)
public enum AudioResponseFormat {
  
  JSON("json"),
  
  TEXT("text"),
  
  SRT("srt"),
  
  VERBOSE_JSON("verbose_json"),
  
  VTT("vtt");

  private String value;

  AudioResponseFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudioResponseFormat fromValue(String value) {
    for (AudioResponseFormat b : AudioResponseFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudioResponseFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudioResponseFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudioResponseFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudioResponseFormat.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AudioResponseFormat.fromValue(value);
  }
}
