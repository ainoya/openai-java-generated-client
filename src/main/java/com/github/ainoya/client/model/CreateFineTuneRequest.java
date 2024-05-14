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
import com.github.ainoya.client.model.CreateFineTuneRequestHyperparameters;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import com.github.ainoya.client.JSON;

/**
 * CreateFineTuneRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T09:32:24.604030Z[Etc/UTC]")
public class CreateFineTuneRequest {
  public static final String SERIALIZED_NAME_TRAINING_FILE = "training_file";
  @SerializedName(SERIALIZED_NAME_TRAINING_FILE)
  private String trainingFile;

  public static final String SERIALIZED_NAME_BATCH_SIZE = "batch_size";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private Integer batchSize;

  public static final String SERIALIZED_NAME_CLASSIFICATION_BETAS = "classification_betas";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_BETAS)
  private List<BigDecimal> classificationBetas;

  public static final String SERIALIZED_NAME_CLASSIFICATION_N_CLASSES = "classification_n_classes";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_N_CLASSES)
  private Integer classificationNClasses;

  public static final String SERIALIZED_NAME_CLASSIFICATION_POSITIVE_CLASS = "classification_positive_class";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_POSITIVE_CLASS)
  private String classificationPositiveClass;

  public static final String SERIALIZED_NAME_COMPUTE_CLASSIFICATION_METRICS = "compute_classification_metrics";
  @SerializedName(SERIALIZED_NAME_COMPUTE_CLASSIFICATION_METRICS)
  private Boolean computeClassificationMetrics = false;

  public static final String SERIALIZED_NAME_HYPERPARAMETERS = "hyperparameters";
  @SerializedName(SERIALIZED_NAME_HYPERPARAMETERS)
  private CreateFineTuneRequestHyperparameters hyperparameters;

  public static final String SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER = "learning_rate_multiplier";
  @SerializedName(SERIALIZED_NAME_LEARNING_RATE_MULTIPLIER)
  private BigDecimal learningRateMultiplier;

  /**
   * The name of the base model to fine-tune. You can select one of \&quot;ada\&quot;, \&quot;babbage\&quot;, \&quot;curie\&quot;, \&quot;davinci\&quot;, or a fine-tuned model created after 2022-04-21 and before 2023-08-22. To learn more about these models, see the [Models](/docs/models) documentation. 
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    ADA("ada"),
    
    BABBAGE("babbage"),
    
    CURIE("curie"),
    
    DAVINCI("davinci");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelEnum fromValue(String value) {
      for (ModelEnum b : ModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private ModelEnum model = ModelEnum.CURIE;

  public static final String SERIALIZED_NAME_PROMPT_LOSS_WEIGHT = "prompt_loss_weight";
  @SerializedName(SERIALIZED_NAME_PROMPT_LOSS_WEIGHT)
  private BigDecimal promptLossWeight = new BigDecimal("0.01");

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_VALIDATION_FILE = "validation_file";
  @SerializedName(SERIALIZED_NAME_VALIDATION_FILE)
  private String validationFile;

  public CreateFineTuneRequest() {
  }

  public CreateFineTuneRequest trainingFile(String trainingFile) {
    
    this.trainingFile = trainingFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/legacy-fine-tuning/creating-training-data) for more details. 
   * @return trainingFile
  **/
  @javax.annotation.Nonnull
  public String getTrainingFile() {
    return trainingFile;
  }


  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }


  public CreateFineTuneRequest batchSize(Integer batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

   /**
   * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets. 
   * @return batchSize
  **/
  @javax.annotation.Nullable
  public Integer getBatchSize() {
    return batchSize;
  }


  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }


  public CreateFineTuneRequest classificationBetas(List<BigDecimal> classificationBetas) {
    
    this.classificationBetas = classificationBetas;
    return this;
  }

  public CreateFineTuneRequest addClassificationBetasItem(BigDecimal classificationBetasItem) {
    if (this.classificationBetas == null) {
      this.classificationBetas = new ArrayList<>();
    }
    this.classificationBetas.add(classificationBetasItem);
    return this;
  }

   /**
   * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
   * @return classificationBetas
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getClassificationBetas() {
    return classificationBetas;
  }


  public void setClassificationBetas(List<BigDecimal> classificationBetas) {
    this.classificationBetas = classificationBetas;
  }


  public CreateFineTuneRequest classificationNClasses(Integer classificationNClasses) {
    
    this.classificationNClasses = classificationNClasses;
    return this;
  }

   /**
   * The number of classes in a classification task.  This parameter is required for multiclass classification. 
   * @return classificationNClasses
  **/
  @javax.annotation.Nullable
  public Integer getClassificationNClasses() {
    return classificationNClasses;
  }


  public void setClassificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }


  public CreateFineTuneRequest classificationPositiveClass(String classificationPositiveClass) {
    
    this.classificationPositiveClass = classificationPositiveClass;
    return this;
  }

   /**
   * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
   * @return classificationPositiveClass
  **/
  @javax.annotation.Nullable
  public String getClassificationPositiveClass() {
    return classificationPositiveClass;
  }


  public void setClassificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }


  public CreateFineTuneRequest computeClassificationMetrics(Boolean computeClassificationMetrics) {
    
    this.computeClassificationMetrics = computeClassificationMetrics;
    return this;
  }

   /**
   * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/legacy-fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification. 
   * @return computeClassificationMetrics
  **/
  @javax.annotation.Nullable
  public Boolean getComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }


  public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }


  public CreateFineTuneRequest hyperparameters(CreateFineTuneRequestHyperparameters hyperparameters) {
    
    this.hyperparameters = hyperparameters;
    return this;
  }

   /**
   * Get hyperparameters
   * @return hyperparameters
  **/
  @javax.annotation.Nullable
  public CreateFineTuneRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }


  public void setHyperparameters(CreateFineTuneRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }


  public CreateFineTuneRequest learningRateMultiplier(BigDecimal learningRateMultiplier) {
    
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
   * @return learningRateMultiplier
  **/
  @javax.annotation.Nullable
  public BigDecimal getLearningRateMultiplier() {
    return learningRateMultiplier;
  }


  public void setLearningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }


  public CreateFineTuneRequest model(ModelEnum model) {
    
    this.model = model;
    return this;
  }

   /**
   * The name of the base model to fine-tune. You can select one of \&quot;ada\&quot;, \&quot;babbage\&quot;, \&quot;curie\&quot;, \&quot;davinci\&quot;, or a fine-tuned model created after 2022-04-21 and before 2023-08-22. To learn more about these models, see the [Models](/docs/models) documentation. 
   * @return model
  **/
  @javax.annotation.Nullable
  public ModelEnum getModel() {
    return model;
  }


  public void setModel(ModelEnum model) {
    this.model = model;
  }


  public CreateFineTuneRequest promptLossWeight(BigDecimal promptLossWeight) {
    
    this.promptLossWeight = promptLossWeight;
    return this;
  }

   /**
   * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
   * @return promptLossWeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getPromptLossWeight() {
    return promptLossWeight;
  }


  public void setPromptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
  }


  public CreateFineTuneRequest suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;. 
   * @return suffix
  **/
  @javax.annotation.Nullable
  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public CreateFineTuneRequest validationFile(String validationFile) {
    
    this.validationFile = validationFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/legacy-fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/legacy-fine-tuning/creating-training-data) for more details. 
   * @return validationFile
  **/
  @javax.annotation.Nullable
  public String getValidationFile() {
    return validationFile;
  }


  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
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
   * @return the CreateFineTuneRequest instance itself
   */
  public CreateFineTuneRequest putAdditionalProperty(String key, Object value) {
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
    CreateFineTuneRequest createFineTuneRequest = (CreateFineTuneRequest) o;
    return Objects.equals(this.trainingFile, createFineTuneRequest.trainingFile) &&
        Objects.equals(this.batchSize, createFineTuneRequest.batchSize) &&
        Objects.equals(this.classificationBetas, createFineTuneRequest.classificationBetas) &&
        Objects.equals(this.classificationNClasses, createFineTuneRequest.classificationNClasses) &&
        Objects.equals(this.classificationPositiveClass, createFineTuneRequest.classificationPositiveClass) &&
        Objects.equals(this.computeClassificationMetrics, createFineTuneRequest.computeClassificationMetrics) &&
        Objects.equals(this.hyperparameters, createFineTuneRequest.hyperparameters) &&
        Objects.equals(this.learningRateMultiplier, createFineTuneRequest.learningRateMultiplier) &&
        Objects.equals(this.model, createFineTuneRequest.model) &&
        Objects.equals(this.promptLossWeight, createFineTuneRequest.promptLossWeight) &&
        Objects.equals(this.suffix, createFineTuneRequest.suffix) &&
        Objects.equals(this.validationFile, createFineTuneRequest.validationFile)&&
        Objects.equals(this.additionalProperties, createFineTuneRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainingFile, batchSize, classificationBetas, classificationNClasses, classificationPositiveClass, computeClassificationMetrics, hyperparameters, learningRateMultiplier, model, promptLossWeight, suffix, validationFile, additionalProperties);
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
    sb.append("class CreateFineTuneRequest {\n");
    sb.append("    trainingFile: ").append(toIndentedString(trainingFile)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    classificationBetas: ").append(toIndentedString(classificationBetas)).append("\n");
    sb.append("    classificationNClasses: ").append(toIndentedString(classificationNClasses)).append("\n");
    sb.append("    classificationPositiveClass: ").append(toIndentedString(classificationPositiveClass)).append("\n");
    sb.append("    computeClassificationMetrics: ").append(toIndentedString(computeClassificationMetrics)).append("\n");
    sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    promptLossWeight: ").append(toIndentedString(promptLossWeight)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    validationFile: ").append(toIndentedString(validationFile)).append("\n");
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
    openapiFields.add("training_file");
    openapiFields.add("batch_size");
    openapiFields.add("classification_betas");
    openapiFields.add("classification_n_classes");
    openapiFields.add("classification_positive_class");
    openapiFields.add("compute_classification_metrics");
    openapiFields.add("hyperparameters");
    openapiFields.add("learning_rate_multiplier");
    openapiFields.add("model");
    openapiFields.add("prompt_loss_weight");
    openapiFields.add("suffix");
    openapiFields.add("validation_file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("training_file");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateFineTuneRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateFineTuneRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFineTuneRequest is not found in the empty JSON string", CreateFineTuneRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFineTuneRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("training_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `training_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("training_file").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("classification_betas") != null && !jsonObj.get("classification_betas").isJsonNull() && !jsonObj.get("classification_betas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification_betas` to be an array in the JSON string but got `%s`", jsonObj.get("classification_betas").toString()));
      }
      if ((jsonObj.get("classification_positive_class") != null && !jsonObj.get("classification_positive_class").isJsonNull()) && !jsonObj.get("classification_positive_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification_positive_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification_positive_class").toString()));
      }
      // validate the optional field `hyperparameters`
      if (jsonObj.get("hyperparameters") != null && !jsonObj.get("hyperparameters").isJsonNull()) {
        CreateFineTuneRequestHyperparameters.validateJsonElement(jsonObj.get("hyperparameters"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the optional field `model`
      if (jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) {
        ModelEnum.validateJsonElement(jsonObj.get("model"));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      if ((jsonObj.get("validation_file") != null && !jsonObj.get("validation_file").isJsonNull()) && !jsonObj.get("validation_file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_file").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFineTuneRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFineTuneRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFineTuneRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFineTuneRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFineTuneRequest>() {
           @Override
           public void write(JsonWriter out, CreateFineTuneRequest value) throws IOException {
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
           public CreateFineTuneRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateFineTuneRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateFineTuneRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFineTuneRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFineTuneRequest
  */
  public static CreateFineTuneRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFineTuneRequest.class);
  }

 /**
  * Convert an instance of CreateFineTuneRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

