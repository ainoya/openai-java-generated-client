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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tokyo.ainoya.openapi.client.JSON;

/**
 * A list of the categories along with their scores as predicted by model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T05:53:00.096330Z[Etc/UTC]")
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
  **/
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
  **/
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
  **/
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
  **/
  @javax.annotation.Nonnull
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }


  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }


  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * The score for the category &#39;self-harm&#39;.
   * @return selfHarm
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  @javax.annotation.Nonnull
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }


  public void setViolenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
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
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategoryScores.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategoryScores.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    selfHarmIntent: ").append(toIndentedString(selfHarmIntent)).append("\n");
    sb.append("    selfHarmInstructions: ").append(toIndentedString(selfHarmInstructions)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateModerationResponseResultsInnerCategoryScores.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateModerationResponseResultsInnerCategoryScores` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateModerationResponseResultsInnerCategoryScores read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

