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
 * The role of the author of a message
 */
@JsonAdapter(ChatCompletionRole.Adapter.class)
public enum ChatCompletionRole {
  
  SYSTEM("system"),
  
  USER("user"),
  
  ASSISTANT("assistant"),
  
  TOOL("tool"),
  
  FUNCTION("function");

  private String value;

  ChatCompletionRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChatCompletionRole fromValue(String value) {
    for (ChatCompletionRole b : ChatCompletionRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChatCompletionRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChatCompletionRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChatCompletionRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChatCompletionRole.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ChatCompletionRole.fromValue(value);
  }
}

