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


package com.github.ainoya.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.github.ainoya.client.JSON;

/**
 * The hyperparameters used for the fine-tuning job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T01:56:26.046112Z[Etc/UTC]")
public class CreateFineTuneRequestHyperparameters {
  /**
   * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
   */
  @JsonAdapter(NEpochsEnum.Adapter.class)
  public enum NEpochsEnum {
    AUTO("auto");

    private String value;

    NEpochsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NEpochsEnum fromValue(String value) {
      for (NEpochsEnum b : NEpochsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NEpochsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NEpochsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NEpochsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NEpochsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NEpochsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_N_EPOCHS = "n_epochs";
  @SerializedName(SERIALIZED_NAME_N_EPOCHS)
  private NEpochsEnum nEpochs = NEpochsEnum.AUTO;

  public CreateFineTuneRequestHyperparameters() {
  }

  public CreateFineTuneRequestHyperparameters nEpochs(NEpochsEnum nEpochs) {
    
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
   * @return nEpochs
  **/
  @javax.annotation.Nullable
  public NEpochsEnum getnEpochs() {
    return nEpochs;
  }


  public void setnEpochs(NEpochsEnum nEpochs) {
    this.nEpochs = nEpochs;
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
   * @return the CreateFineTuneRequestHyperparameters instance itself
   */
  public CreateFineTuneRequestHyperparameters putAdditionalProperty(String key, Object value) {
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
    CreateFineTuneRequestHyperparameters createFineTuneRequestHyperparameters = (CreateFineTuneRequestHyperparameters) o;
    return Objects.equals(this.nEpochs, createFineTuneRequestHyperparameters.nEpochs)&&
        Objects.equals(this.additionalProperties, createFineTuneRequestHyperparameters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nEpochs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuneRequestHyperparameters {\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
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
    openapiFields.add("n_epochs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateFineTuneRequestHyperparameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFineTuneRequestHyperparameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFineTuneRequestHyperparameters is not found in the empty JSON string", CreateFineTuneRequestHyperparameters.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("n_epochs") != null && !jsonObj.get("n_epochs").isJsonNull()) && !jsonObj.get("n_epochs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `n_epochs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("n_epochs").toString()));
      }
      // validate the optional field `n_epochs`
      if (jsonObj.get("n_epochs") != null && !jsonObj.get("n_epochs").isJsonNull()) {
        NEpochsEnum.validateJsonElement(jsonObj.get("n_epochs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFineTuneRequestHyperparameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFineTuneRequestHyperparameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFineTuneRequestHyperparameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFineTuneRequestHyperparameters.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFineTuneRequestHyperparameters>() {
           @Override
           public void write(JsonWriter out, CreateFineTuneRequestHyperparameters value) throws IOException {
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFineTuneRequestHyperparameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateFineTuneRequestHyperparameters instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateFineTuneRequestHyperparameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFineTuneRequestHyperparameters
  * @throws IOException if the JSON string is invalid with respect to CreateFineTuneRequestHyperparameters
  */
  public static CreateFineTuneRequestHyperparameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFineTuneRequestHyperparameters.class);
  }

 /**
  * Convert an instance of CreateFineTuneRequestHyperparameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

