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
import java.util.Arrays;
import org.openapitools.client.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.client.model.CreateModerationResponseResultsInnerCategoryScores;

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
 * CreateModerationResponseResultsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T02:02:15.250875Z[Etc/UTC]")
public class CreateModerationResponseResultsInner {
  public static final String SERIALIZED_NAME_FLAGGED = "flagged";
  @SerializedName(SERIALIZED_NAME_FLAGGED)
  private Boolean flagged;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private CreateModerationResponseResultsInnerCategories categories;

  public static final String SERIALIZED_NAME_CATEGORY_SCORES = "category_scores";
  @SerializedName(SERIALIZED_NAME_CATEGORY_SCORES)
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  public CreateModerationResponseResultsInner() {
  }

  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    
    this.flagged = flagged;
    return this;
  }

   /**
   * Whether the content violates [OpenAI&#39;s usage policies](/policies/usage-policies).
   * @return flagged
  **/
  @javax.annotation.Nonnull
  public Boolean getFlagged() {
    return flagged;
  }


  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }


  public CreateModerationResponseResultsInner categories(CreateModerationResponseResultsInnerCategories categories) {
    
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }


  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }


  public CreateModerationResponseResultsInner categoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    
    this.categoryScores = categoryScores;
    return this;
  }

   /**
   * Get categoryScores
   * @return categoryScores
  **/
  @javax.annotation.Nonnull
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }


  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInner createModerationResponseResultsInner = (CreateModerationResponseResultsInner) o;
    return Objects.equals(this.flagged, createModerationResponseResultsInner.flagged) &&
        Objects.equals(this.categories, createModerationResponseResultsInner.categories) &&
        Objects.equals(this.categoryScores, createModerationResponseResultsInner.categoryScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagged, categories, categoryScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
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
    openapiFields.add("flagged");
    openapiFields.add("categories");
    openapiFields.add("category_scores");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("flagged");
    openapiRequiredFields.add("categories");
    openapiRequiredFields.add("category_scores");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateModerationResponseResultsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateModerationResponseResultsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateModerationResponseResultsInner is not found in the empty JSON string", CreateModerationResponseResultsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateModerationResponseResultsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateModerationResponseResultsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateModerationResponseResultsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `categories`
      CreateModerationResponseResultsInnerCategories.validateJsonElement(jsonObj.get("categories"));
      // validate the required field `category_scores`
      CreateModerationResponseResultsInnerCategoryScores.validateJsonElement(jsonObj.get("category_scores"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateModerationResponseResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateModerationResponseResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateModerationResponseResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateModerationResponseResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateModerationResponseResultsInner>() {
           @Override
           public void write(JsonWriter out, CreateModerationResponseResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateModerationResponseResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateModerationResponseResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateModerationResponseResultsInner
  * @throws IOException if the JSON string is invalid with respect to CreateModerationResponseResultsInner
  */
  public static CreateModerationResponseResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateModerationResponseResultsInner.class);
  }

 /**
  * Convert an instance of CreateModerationResponseResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

