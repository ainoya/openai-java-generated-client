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
import com.github.ainoya.client.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner;
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
 * CreateThreadRequestToolResourcesFileSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:48:55.661559293Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateThreadRequestToolResourcesFileSearch {
  public static final String SERIALIZED_NAME_VECTOR_STORE_IDS = "vector_store_ids";
  @SerializedName(SERIALIZED_NAME_VECTOR_STORE_IDS)
  private List<String> vectorStoreIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_VECTOR_STORES = "vector_stores";
  @SerializedName(SERIALIZED_NAME_VECTOR_STORES)
  private List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

  public CreateThreadRequestToolResourcesFileSearch() {
  }

  public CreateThreadRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

  /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
   * @return vectorStoreIds
   */
  @javax.annotation.Nullable
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }


  public CreateThreadRequestToolResourcesFileSearch vectorStores(List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoresItem(CreateThreadRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
    if (this.vectorStores == null) {
      this.vectorStores = new ArrayList<>();
    }
    this.vectorStores.add(vectorStoresItem);
    return this;
  }

  /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
   * @return vectorStores
   */
  @javax.annotation.Nullable
  public List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }

  public void setVectorStores(List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
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
   * @return the CreateThreadRequestToolResourcesFileSearch instance itself
   */
  public CreateThreadRequestToolResourcesFileSearch putAdditionalProperty(String key, Object value) {
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
    CreateThreadRequestToolResourcesFileSearch createThreadRequestToolResourcesFileSearch = (CreateThreadRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, createThreadRequestToolResourcesFileSearch.vectorStoreIds) &&
        Objects.equals(this.vectorStores, createThreadRequestToolResourcesFileSearch.vectorStores)&&
        Objects.equals(this.additionalProperties, createThreadRequestToolResourcesFileSearch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds, vectorStores, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequestToolResourcesFileSearch {\n");
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
    sb.append("    vectorStores: ").append(toIndentedString(vectorStores)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateThreadRequestToolResourcesFileSearch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadRequestToolResourcesFileSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadRequestToolResourcesFileSearch is not found in the empty JSON string", CreateThreadRequestToolResourcesFileSearch.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("vector_store_ids") != null && !jsonObj.get("vector_store_ids").isJsonNull() && !jsonObj.get("vector_store_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector_store_ids` to be an array in the JSON string but got `%s`", jsonObj.get("vector_store_ids").toString()));
      }
      if (jsonObj.get("vector_stores") != null && !jsonObj.get("vector_stores").isJsonNull()) {
        JsonArray jsonArrayvectorStores = jsonObj.getAsJsonArray("vector_stores");
        if (jsonArrayvectorStores != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vector_stores").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vector_stores` to be an array in the JSON string but got `%s`", jsonObj.get("vector_stores").toString()));
          }

          // validate the optional field `vector_stores` (array)
          for (int i = 0; i < jsonArrayvectorStores.size(); i++) {
            CreateThreadRequestToolResourcesFileSearchVectorStoresInner.validateJsonElement(jsonArrayvectorStores.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadRequestToolResourcesFileSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadRequestToolResourcesFileSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadRequestToolResourcesFileSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadRequestToolResourcesFileSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadRequestToolResourcesFileSearch>() {
           @Override
           public void write(JsonWriter out, CreateThreadRequestToolResourcesFileSearch value) throws IOException {
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
           public CreateThreadRequestToolResourcesFileSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateThreadRequestToolResourcesFileSearch instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateThreadRequestToolResourcesFileSearch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateThreadRequestToolResourcesFileSearch
   * @throws IOException if the JSON string is invalid with respect to CreateThreadRequestToolResourcesFileSearch
   */
  public static CreateThreadRequestToolResourcesFileSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadRequestToolResourcesFileSearch.class);
  }

  /**
   * Convert an instance of CreateThreadRequestToolResourcesFileSearch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

