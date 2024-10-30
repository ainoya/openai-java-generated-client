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
 * A list of the categories along with their scores as predicted by model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T00:41:41.163543671Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateModerationResponseResultsInnerCategoryScores {
  public static final String SERIALIZED_NAME_HATE = "hate";
  @SerializedName(SERIALIZED_NAME_HATE)
  private BigDecimal hate;

  public static final String SERIALIZED_NAME_HATE_THREATENING = "hate/threatening";
  @SerializedName(SERIALIZED_NAME_HATE_THREATENING)
  private BigDecimal hateThreatening;

  public static final String SERIALIZED_NAME_HARASSMENT = "harassment";
  @SerializedName(SERIALIZED_NAME_HARASSMENT)
  private BigDecimal harassment;

  public static final String SERIALIZED_NAME_HARASSMENT_THREATENING = "harassment/threatening";
  @SerializedName(SERIALIZED_NAME_HARASSMENT_THREATENING)
  private BigDecimal harassmentThreatening;

  public static final String SERIALIZED_NAME_ILLICIT = "illicit";
  @SerializedName(SERIALIZED_NAME_ILLICIT)
  private BigDecimal illicit;

  public static final String SERIALIZED_NAME_ILLICIT_VIOLENT = "illicit/violent";
  @SerializedName(SERIALIZED_NAME_ILLICIT_VIOLENT)
  private BigDecimal illicitViolent;

  public static final String SERIALIZED_NAME_SELF_HARM = "self-harm";
  @SerializedName(SERIALIZED_NAME_SELF_HARM)
  private BigDecimal selfHarm;

  public static final String SERIALIZED_NAME_SELF_HARM_INTENT = "self-harm/intent";
  @SerializedName(SERIALIZED_NAME_SELF_HARM_INTENT)
  private BigDecimal selfHarmIntent;

  public static final String SERIALIZED_NAME_SELF_HARM_INSTRUCTIONS = "self-harm/instructions";
  @SerializedName(SERIALIZED_NAME_SELF_HARM_INSTRUCTIONS)
  private BigDecimal selfHarmInstructions;

  public static final String SERIALIZED_NAME_SEXUAL = "sexual";
  @SerializedName(SERIALIZED_NAME_SEXUAL)
  private BigDecimal sexual;

  public static final String SERIALIZED_NAME_SEXUAL_MINORS = "sexual/minors";
  @SerializedName(SERIALIZED_NAME_SEXUAL_MINORS)
  private BigDecimal sexualMinors;

  public static final String SERIALIZED_NAME_VIOLENCE = "violence";
  @SerializedName(SERIALIZED_NAME_VIOLENCE)
  private BigDecimal violence;

  public static final String SERIALIZED_NAME_VIOLENCE_GRAPHIC = "violence/graphic";
  @SerializedName(SERIALIZED_NAME_VIOLENCE_GRAPHIC)
  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores() {
  }

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

  /**
   * The score for the category &#39;hate&#39;.
   * @return hate
   */
  @javax.annotation.Nonnull
  public BigDecimal getHate() {
    return hate;
  }

  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }


  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  /**
   * The score for the category &#39;hate/threatening&#39;.
   * @return hateThreatening
   */
  @javax.annotation.Nonnull
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }


  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

  /**
   * The score for the category &#39;harassment&#39;.
   * @return harassment
   */
  @javax.annotation.Nonnull
  public BigDecimal getHarassment() {
    return harassment;
  }

  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }


  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  /**
   * The score for the category &#39;harassment/threatening&#39;.
   * @return harassmentThreatening
   */
  @javax.annotation.Nonnull
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }


  public CreateModerationResponseResultsInnerCategoryScores illicit(BigDecimal illicit) {
    this.illicit = illicit;
    return this;
  }

  /**
   * The score for the category &#39;illicit&#39;.
   * @return illicit
   */
  @javax.annotation.Nonnull
  public BigDecimal getIllicit() {
    return illicit;
  }

  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }


  public CreateModerationResponseResultsInnerCategoryScores illicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  /**
   * The score for the category &#39;illicit/violent&#39;.
   * @return illicitViolent
   */
  @javax.annotation.Nonnull
  public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }


  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  /**
   * The score for the category &#39;self-harm&#39;.
   * @return selfHarm
   */
  @javax.annotation.Nonnull
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }


  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  /**
   * The score for the category &#39;self-harm/intent&#39;.
   * @return selfHarmIntent
   */
  @javax.annotation.Nonnull
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }


  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  /**
   * The score for the category &#39;self-harm/instructions&#39;.
   * @return selfHarmInstructions
   */
  @javax.annotation.Nonnull
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }


  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

  /**
   * The score for the category &#39;sexual&#39;.
   * @return sexual
   */
  @javax.annotation.Nonnull
  public BigDecimal getSexual() {
    return sexual;
  }

  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }


  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  /**
   * The score for the category &#39;sexual/minors&#39;.
   * @return sexualMinors
   */
  @javax.annotation.Nonnull
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }


  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

  /**
   * The score for the category &#39;violence&#39;.
   * @return violence
   */
  @javax.annotation.Nonnull
  public BigDecimal getViolence() {
    return violence;
  }

  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }


  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  /**
   * The score for the category &#39;violence/graphic&#39;.
   * @return violenceGraphic
   */
  @javax.annotation.Nonnull
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
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
   * @return the CreateModerationResponseResultsInnerCategoryScores instance itself
   */
  public CreateModerationResponseResultsInnerCategoryScores putAdditionalProperty(String key, Object value) {
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
    CreateModerationResponseResultsInnerCategoryScores createModerationResponseResultsInnerCategoryScores = (CreateModerationResponseResultsInnerCategoryScores) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategoryScores.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategoryScores.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategoryScores.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategoryScores.harassmentThreatening) &&
        Objects.equals(this.illicit, createModerationResponseResultsInnerCategoryScores.illicit) &&
        Objects.equals(this.illicitViolent, createModerationResponseResultsInnerCategoryScores.illicitViolent) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategoryScores.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategoryScores.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic)&&
        Objects.equals(this.additionalProperties, createModerationResponseResultsInnerCategoryScores.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
    sb.append("    illicit: ").append(toIndentedString(illicit)).append("\n");
    sb.append("    illicitViolent: ").append(toIndentedString(illicitViolent)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    selfHarmIntent: ").append(toIndentedString(selfHarmIntent)).append("\n");
    sb.append("    selfHarmInstructions: ").append(toIndentedString(selfHarmInstructions)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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
    openapiFields.add("hate");
    openapiFields.add("hate/threatening");
    openapiFields.add("harassment");
    openapiFields.add("harassment/threatening");
    openapiFields.add("illicit");
    openapiFields.add("illicit/violent");
    openapiFields.add("self-harm");
    openapiFields.add("self-harm/intent");
    openapiFields.add("self-harm/instructions");
    openapiFields.add("sexual");
    openapiFields.add("sexual/minors");
    openapiFields.add("violence");
    openapiFields.add("violence/graphic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hate");
    openapiRequiredFields.add("hate/threatening");
    openapiRequiredFields.add("harassment");
    openapiRequiredFields.add("harassment/threatening");
    openapiRequiredFields.add("illicit");
    openapiRequiredFields.add("illicit/violent");
    openapiRequiredFields.add("self-harm");
    openapiRequiredFields.add("self-harm/intent");
    openapiRequiredFields.add("self-harm/instructions");
    openapiRequiredFields.add("sexual");
    openapiRequiredFields.add("sexual/minors");
    openapiRequiredFields.add("violence");
    openapiRequiredFields.add("violence/graphic");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateModerationResponseResultsInnerCategoryScores
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateModerationResponseResultsInnerCategoryScores.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateModerationResponseResultsInnerCategoryScores is not found in the empty JSON string", CreateModerationResponseResultsInnerCategoryScores.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateModerationResponseResultsInnerCategoryScores.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateModerationResponseResultsInnerCategoryScores.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateModerationResponseResultsInnerCategoryScores' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateModerationResponseResultsInnerCategoryScores> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateModerationResponseResultsInnerCategoryScores.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateModerationResponseResultsInnerCategoryScores>() {
           @Override
           public void write(JsonWriter out, CreateModerationResponseResultsInnerCategoryScores value) throws IOException {
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
           public CreateModerationResponseResultsInnerCategoryScores read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateModerationResponseResultsInnerCategoryScores instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateModerationResponseResultsInnerCategoryScores given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateModerationResponseResultsInnerCategoryScores
   * @throws IOException if the JSON string is invalid with respect to CreateModerationResponseResultsInnerCategoryScores
   */
  public static CreateModerationResponseResultsInnerCategoryScores fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateModerationResponseResultsInnerCategoryScores.class);
  }

  /**
   * Convert an instance of CreateModerationResponseResultsInnerCategoryScores to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

