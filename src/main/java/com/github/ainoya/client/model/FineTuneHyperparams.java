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

import com.github.ainoya.client.JSON;

/**
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/legacy-fine-tuning/hyperparameters) for more details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-06T08:58:14.331730Z[Etc/UTC]")
public class FineTuneHyperparams {
  public static final String SERIALIZED_NAME_BATCH_SIZE = "batch_size";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private Integer batchSize;

  public static final String SERIALIZED_NAME_CLASSIFICATION_N_CLASSES = "classification_n_classes";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_N_CLASSES)
  private Integer classificationNClasses;

  public static final String SERIALIZED_NAME_CLASSIFICATION_POSITIVE_CLASS = "classification_positive_class";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_POSITIVE_CLASS)
  private String classificationPositiveClass;

  public static final String SERIALIZED_NAME_COMPUTE_CLASSIFICATION_METRICS = "compute_classification_metrics";
  @SerializedName(SERIALIZED_NAME_COMPUTE_CLASSIFICATION_METRICS)
  private Boolean computeClassificationMetrics;

  public static final String SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER = "learning_rate_multiplier";
  @SerializedName(SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER)
  private BigDecimal learningRateMultiplier;

  public static final String SERIALIZED_NAME_N_EPOCHS = "n_epochs";
  @SerializedName(SERIALIZED_NAME_N_EPOCHS)
  private Integer nEpochs;

  public static final String SERIALIZED_NAME_PROMPT_LOSS_WEIGHT = "prompt_loss_weight";
  @SerializedName(SERIALIZED_NAME_PROMPT_LOSS_WEIGHT)
  private BigDecimal promptLossWeight;

  public FineTuneHyperparams() {
  }

  public FineTuneHyperparams batchSize(Integer batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

   /**
   * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass. 
   * @return batchSize
  **/
  @javax.annotation.Nonnull
  public Integer getBatchSize() {
    return batchSize;
  }


  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }


  public FineTuneHyperparams classificationNClasses(Integer classificationNClasses) {
    
    this.classificationNClasses = classificationNClasses;
    return this;
  }

   /**
   * The number of classes to use for computing classification metrics. 
   * @return classificationNClasses
  **/
  @javax.annotation.Nullable
  public Integer getClassificationNClasses() {
    return classificationNClasses;
  }


  public void setClassificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }


  public FineTuneHyperparams classificationPositiveClass(String classificationPositiveClass) {
    
    this.classificationPositiveClass = classificationPositiveClass;
    return this;
  }

   /**
   * The positive class to use for computing classification metrics. 
   * @return classificationPositiveClass
  **/
  @javax.annotation.Nullable
  public String getClassificationPositiveClass() {
    return classificationPositiveClass;
  }


  public void setClassificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }


  public FineTuneHyperparams computeClassificationMetrics(Boolean computeClassificationMetrics) {
    
    this.computeClassificationMetrics = computeClassificationMetrics;
    return this;
  }

   /**
   * The classification metrics to compute using the validation dataset at the end of every epoch. 
   * @return computeClassificationMetrics
  **/
  @javax.annotation.Nullable
  public Boolean getComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }


  public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }


  public FineTuneHyperparams learningRateMultiplier(BigDecimal learningRateMultiplier) {
    
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * The learning rate multiplier to use for training. 
   * @return learningRateMultiplier
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLearningRateMultiplier() {
    return learningRateMultiplier;
  }


  public void setLearningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }


  public FineTuneHyperparams nEpochs(Integer nEpochs) {
    
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
   * @return nEpochs
  **/
  @javax.annotation.Nonnull
  public Integer getnEpochs() {
    return nEpochs;
  }


  public void setnEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
  }


  public FineTuneHyperparams promptLossWeight(BigDecimal promptLossWeight) {
    
    this.promptLossWeight = promptLossWeight;
    return this;
  }

   /**
   * The weight to use for loss on the prompt tokens. 
   * @return promptLossWeight
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPromptLossWeight() {
    return promptLossWeight;
  }


  public void setPromptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
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
   * @return the FineTuneHyperparams instance itself
   */
  public FineTuneHyperparams putAdditionalProperty(String key, Object value) {
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
    FineTuneHyperparams fineTuneHyperparams = (FineTuneHyperparams) o;
    return Objects.equals(this.batchSize, fineTuneHyperparams.batchSize) &&
        Objects.equals(this.classificationNClasses, fineTuneHyperparams.classificationNClasses) &&
        Objects.equals(this.classificationPositiveClass, fineTuneHyperparams.classificationPositiveClass) &&
        Objects.equals(this.computeClassificationMetrics, fineTuneHyperparams.computeClassificationMetrics) &&
        Objects.equals(this.learningRateMultiplier, fineTuneHyperparams.learningRateMultiplier) &&
        Objects.equals(this.nEpochs, fineTuneHyperparams.nEpochs) &&
        Objects.equals(this.promptLossWeight, fineTuneHyperparams.promptLossWeight)&&
        Objects.equals(this.additionalProperties, fineTuneHyperparams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, classificationNClasses, classificationPositiveClass, computeClassificationMetrics, learningRateMultiplier, nEpochs, promptLossWeight, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneHyperparams {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    classificationNClasses: ").append(toIndentedString(classificationNClasses)).append("\n");
    sb.append("    classificationPositiveClass: ").append(toIndentedString(classificationPositiveClass)).append("\n");
    sb.append("    computeClassificationMetrics: ").append(toIndentedString(computeClassificationMetrics)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
    sb.append("    promptLossWeight: ").append(toIndentedString(promptLossWeight)).append("\n");
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
    openapiFields.add("batch_size");
    openapiFields.add("classification_n_classes");
    openapiFields.add("classification_positive_class");
    openapiFields.add("compute_classification_metrics");
    openapiFields.add("learning_rate_multiplier");
    openapiFields.add("n_epochs");
    openapiFields.add("prompt_loss_weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batch_size");
    openapiRequiredFields.add("learning_rate_multiplier");
    openapiRequiredFields.add("n_epochs");
    openapiRequiredFields.add("prompt_loss_weight");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FineTuneHyperparams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FineTuneHyperparams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FineTuneHyperparams is not found in the empty JSON string", FineTuneHyperparams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FineTuneHyperparams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("classification_positive_class") != null && !jsonObj.get("classification_positive_class").isJsonNull()) && !jsonObj.get("classification_positive_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification_positive_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification_positive_class").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FineTuneHyperparams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FineTuneHyperparams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FineTuneHyperparams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FineTuneHyperparams.class));

       return (TypeAdapter<T>) new TypeAdapter<FineTuneHyperparams>() {
           @Override
           public void write(JsonWriter out, FineTuneHyperparams value) throws IOException {
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
           public FineTuneHyperparams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             FineTuneHyperparams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FineTuneHyperparams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FineTuneHyperparams
  * @throws IOException if the JSON string is invalid with respect to FineTuneHyperparams
  */
  public static FineTuneHyperparams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FineTuneHyperparams.class);
  }

 /**
  * Convert an instance of FineTuneHyperparams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

