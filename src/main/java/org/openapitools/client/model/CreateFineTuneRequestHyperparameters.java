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

import tokyo.ainoya.openai.client.JSON;

/**
 * The hyperparameters used for the fine-tuning job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T09:29:35.418072Z[Etc/UTC]")
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuneRequestHyperparameters createFineTuneRequestHyperparameters = (CreateFineTuneRequestHyperparameters) o;
    return Objects.equals(this.nEpochs, createFineTuneRequestHyperparameters.nEpochs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nEpochs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuneRequestHyperparameters {\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateFineTuneRequestHyperparameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFineTuneRequestHyperparameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFineTuneRequestHyperparameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

