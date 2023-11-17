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
import org.openapitools.client.model.CreateEditRequestModel;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreateEditRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T09:06:46.484286Z[Etc/UTC]")
public class CreateEditRequest {
  public static final String SERIALIZED_NAME_INSTRUCTION = "instruction";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION)
  private String instruction;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private CreateEditRequestModel model;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input = "";

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private Integer n = 1;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("1");

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP = new BigDecimal("1");

  public CreateEditRequest() {
  }

  public CreateEditRequest instruction(String instruction) {
    
    this.instruction = instruction;
    return this;
  }

   /**
   * The instruction that tells the model how to edit the prompt.
   * @return instruction
  **/
  @javax.annotation.Nonnull
  public String getInstruction() {
    return instruction;
  }


  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  public CreateEditRequest model(CreateEditRequestModel model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  public CreateEditRequestModel getModel() {
    return model;
  }


  public void setModel(CreateEditRequestModel model) {
    this.model = model;
  }


  public CreateEditRequest input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * The input text to use as a starting point for the edit.
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public CreateEditRequest n(Integer n) {
    
    this.n = n;
    return this;
  }

   /**
   * How many edits to generate for the input and instruction.
   * minimum: 1
   * maximum: 20
   * @return n
  **/
  @javax.annotation.Nullable
  public Integer getN() {
    return n;
  }


  public void setN(Integer n) {
    this.n = n;
  }


  public CreateEditRequest temperature(BigDecimal temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }


  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public CreateEditRequest topP(BigDecimal topP) {
    
    this.topP = topP;
    return this;
  }

   /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  @javax.annotation.Nullable
  public BigDecimal getTopP() {
    return topP;
  }


  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEditRequest createEditRequest = (CreateEditRequest) o;
    return Objects.equals(this.instruction, createEditRequest.instruction) &&
        Objects.equals(this.model, createEditRequest.model) &&
        Objects.equals(this.input, createEditRequest.input) &&
        Objects.equals(this.n, createEditRequest.n) &&
        Objects.equals(this.temperature, createEditRequest.temperature) &&
        Objects.equals(this.topP, createEditRequest.topP);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, model, input, n, temperature, topP);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditRequest {\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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
    openapiFields.add("instruction");
    openapiFields.add("model");
    openapiFields.add("input");
    openapiFields.add("n");
    openapiFields.add("temperature");
    openapiFields.add("top_p");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instruction");
    openapiRequiredFields.add("model");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateEditRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEditRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEditRequest is not found in the empty JSON string", CreateEditRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEditRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEditRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEditRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("instruction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instruction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instruction").toString()));
      }
      // validate the required field `model`
      CreateEditRequestModel.validateJsonElement(jsonObj.get("model"));
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEditRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEditRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEditRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEditRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEditRequest>() {
           @Override
           public void write(JsonWriter out, CreateEditRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEditRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEditRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEditRequest
  * @throws IOException if the JSON string is invalid with respect to CreateEditRequest
  */
  public static CreateEditRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEditRequest.class);
  }

 /**
  * Convert an instance of CreateEditRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

