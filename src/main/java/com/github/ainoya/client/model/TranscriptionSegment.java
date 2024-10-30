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
 * TranscriptionSegment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T00:41:41.163543671Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TranscriptionSegment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SEEK = "seek";
  @SerializedName(SERIALIZED_NAME_SEEK)
  private Integer seek;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Float start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Float end;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<Integer> tokens = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Float temperature;

  public static final String SERIALIZED_NAME_AVG_LOGPROB = "avg_logprob";
  @SerializedName(SERIALIZED_NAME_AVG_LOGPROB)
  private Float avgLogprob;

  public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
  private Float compressionRatio;

  public static final String SERIALIZED_NAME_NO_SPEECH_PROB = "no_speech_prob";
  @SerializedName(SERIALIZED_NAME_NO_SPEECH_PROB)
  private Float noSpeechProb;

  public TranscriptionSegment() {
  }

  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the segment.
   * @return id
   */
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

  /**
   * Seek offset of the segment.
   * @return seek
   */
  @javax.annotation.Nonnull
  public Integer getSeek() {
    return seek;
  }

  public void setSeek(Integer seek) {
    this.seek = seek;
  }


  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

  /**
   * Start time of the segment in seconds.
   * @return start
   */
  @javax.annotation.Nonnull
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }


  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

  /**
   * End time of the segment in seconds.
   * @return end
   */
  @javax.annotation.Nonnull
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }


  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text content of the segment.
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  public TranscriptionSegment addTokensItem(Integer tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Array of token IDs for the text content.
   * @return tokens
   */
  @javax.annotation.Nonnull
  public List<Integer> getTokens() {
    return tokens;
  }

  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }


  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Temperature parameter used for generating the segment.
   * @return temperature
   */
  @javax.annotation.Nonnull
  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }


  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   * @return avgLogprob
   */
  @javax.annotation.Nonnull
  public Float getAvgLogprob() {
    return avgLogprob;
  }

  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }


  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   * @return compressionRatio
   */
  @javax.annotation.Nonnull
  public Float getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }


  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
    return this;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
   * @return noSpeechProb
   */
  @javax.annotation.Nonnull
  public Float getNoSpeechProb() {
    return noSpeechProb;
  }

  public void setNoSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
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
   * @return the TranscriptionSegment instance itself
   */
  public TranscriptionSegment putAdditionalProperty(String key, Object value) {
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
    TranscriptionSegment transcriptionSegment = (TranscriptionSegment) o;
    return Objects.equals(this.id, transcriptionSegment.id) &&
        Objects.equals(this.seek, transcriptionSegment.seek) &&
        Objects.equals(this.start, transcriptionSegment.start) &&
        Objects.equals(this.end, transcriptionSegment.end) &&
        Objects.equals(this.text, transcriptionSegment.text) &&
        Objects.equals(this.tokens, transcriptionSegment.tokens) &&
        Objects.equals(this.temperature, transcriptionSegment.temperature) &&
        Objects.equals(this.avgLogprob, transcriptionSegment.avgLogprob) &&
        Objects.equals(this.compressionRatio, transcriptionSegment.compressionRatio) &&
        Objects.equals(this.noSpeechProb, transcriptionSegment.noSpeechProb)&&
        Objects.equals(this.additionalProperties, transcriptionSegment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSegment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seek: ").append(toIndentedString(seek)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    avgLogprob: ").append(toIndentedString(avgLogprob)).append("\n");
    sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
    sb.append("    noSpeechProb: ").append(toIndentedString(noSpeechProb)).append("\n");
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
    openapiFields.add("seek");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("text");
    openapiFields.add("tokens");
    openapiFields.add("temperature");
    openapiFields.add("avg_logprob");
    openapiFields.add("compression_ratio");
    openapiFields.add("no_speech_prob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("seek");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("tokens");
    openapiRequiredFields.add("temperature");
    openapiRequiredFields.add("avg_logprob");
    openapiRequiredFields.add("compression_ratio");
    openapiRequiredFields.add("no_speech_prob");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TranscriptionSegment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranscriptionSegment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranscriptionSegment is not found in the empty JSON string", TranscriptionSegment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TranscriptionSegment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tokens") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tokens").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokens` to be an array in the JSON string but got `%s`", jsonObj.get("tokens").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranscriptionSegment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranscriptionSegment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranscriptionSegment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranscriptionSegment.class));

       return (TypeAdapter<T>) new TypeAdapter<TranscriptionSegment>() {
           @Override
           public void write(JsonWriter out, TranscriptionSegment value) throws IOException {
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
           public TranscriptionSegment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TranscriptionSegment instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TranscriptionSegment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TranscriptionSegment
   * @throws IOException if the JSON string is invalid with respect to TranscriptionSegment
   */
  public static TranscriptionSegment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranscriptionSegment.class);
  }

  /**
   * Convert an instance of TranscriptionSegment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

