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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FineTuneEvent;
import org.openapitools.client.model.FineTuneHyperparams;
import org.openapitools.client.model.OpenAIFile;

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
 * The &#x60;FineTune&#x60; object represents a legacy fine-tune job that has been created through the API. 
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T09:06:46.484286Z[Etc/UTC]")
public class FineTune {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<FineTuneEvent> events;

  public static final String SERIALIZED_NAME_FINE_TUNED_MODEL = "fine_tuned_model";
  @SerializedName(SERIALIZED_NAME_FINE_TUNED_MODEL)
  private String fineTunedModel;

  public static final String SERIALIZED_NAME_HYPERPARAMS = "hyperparams";
  @SerializedName(SERIALIZED_NAME_HYPERPARAMS)
  private FineTuneHyperparams hyperparams;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  /**
   * The object type, which is always \&quot;fine-tune\&quot;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    FINE_TUNE("fine-tune");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_RESULT_FILES = "result_files";
  @SerializedName(SERIALIZED_NAME_RESULT_FILES)
  private List<OpenAIFile> resultFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRAINING_FILES = "training_files";
  @SerializedName(SERIALIZED_NAME_TRAINING_FILES)
  private List<OpenAIFile> trainingFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;

  public static final String SERIALIZED_NAME_VALIDATION_FILES = "validation_files";
  @SerializedName(SERIALIZED_NAME_VALIDATION_FILES)
  private List<OpenAIFile> validationFiles = new ArrayList<>();

  public FineTune() {
  }

  public FineTune id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The object identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FineTune createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public FineTune events(List<FineTuneEvent> events) {
    
    this.events = events;
    return this;
  }

  public FineTune addEventsItem(FineTuneEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The list of events that have been observed in the lifecycle of the FineTune job.
   * @return events
  **/
  @javax.annotation.Nullable
  public List<FineTuneEvent> getEvents() {
    return events;
  }


  public void setEvents(List<FineTuneEvent> events) {
    this.events = events;
  }


  public FineTune fineTunedModel(String fineTunedModel) {
    
    this.fineTunedModel = fineTunedModel;
    return this;
  }

   /**
   * The name of the fine-tuned model that is being created.
   * @return fineTunedModel
  **/
  @javax.annotation.Nullable
  public String getFineTunedModel() {
    return fineTunedModel;
  }


  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }


  public FineTune hyperparams(FineTuneHyperparams hyperparams) {
    
    this.hyperparams = hyperparams;
    return this;
  }

   /**
   * Get hyperparams
   * @return hyperparams
  **/
  @javax.annotation.Nonnull
  public FineTuneHyperparams getHyperparams() {
    return hyperparams;
  }


  public void setHyperparams(FineTuneHyperparams hyperparams) {
    this.hyperparams = hyperparams;
  }


  public FineTune model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * The base model that is being fine-tuned.
   * @return model
  **/
  @javax.annotation.Nonnull
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public FineTune _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always \&quot;fine-tune\&quot;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public FineTune organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization that owns the fine-tuning job.
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public FineTune resultFiles(List<OpenAIFile> resultFiles) {
    
    this.resultFiles = resultFiles;
    return this;
  }

  public FineTune addResultFilesItem(OpenAIFile resultFilesItem) {
    if (this.resultFiles == null) {
      this.resultFiles = new ArrayList<>();
    }
    this.resultFiles.add(resultFilesItem);
    return this;
  }

   /**
   * The compiled results files for the fine-tuning job.
   * @return resultFiles
  **/
  @javax.annotation.Nonnull
  public List<OpenAIFile> getResultFiles() {
    return resultFiles;
  }


  public void setResultFiles(List<OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }


  public FineTune status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the fine-tuning job, which can be either &#x60;created&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public FineTune trainingFiles(List<OpenAIFile> trainingFiles) {
    
    this.trainingFiles = trainingFiles;
    return this;
  }

  public FineTune addTrainingFilesItem(OpenAIFile trainingFilesItem) {
    if (this.trainingFiles == null) {
      this.trainingFiles = new ArrayList<>();
    }
    this.trainingFiles.add(trainingFilesItem);
    return this;
  }

   /**
   * The list of files used for training.
   * @return trainingFiles
  **/
  @javax.annotation.Nonnull
  public List<OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }


  public void setTrainingFiles(List<OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }


  public FineTune updatedAt(Integer updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  public Integer getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  public FineTune validationFiles(List<OpenAIFile> validationFiles) {
    
    this.validationFiles = validationFiles;
    return this;
  }

  public FineTune addValidationFilesItem(OpenAIFile validationFilesItem) {
    if (this.validationFiles == null) {
      this.validationFiles = new ArrayList<>();
    }
    this.validationFiles.add(validationFilesItem);
    return this;
  }

   /**
   * The list of files used for validation.
   * @return validationFiles
  **/
  @javax.annotation.Nonnull
  public List<OpenAIFile> getValidationFiles() {
    return validationFiles;
  }


  public void setValidationFiles(List<OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTune fineTune = (FineTune) o;
    return Objects.equals(this.id, fineTune.id) &&
        Objects.equals(this.createdAt, fineTune.createdAt) &&
        Objects.equals(this.events, fineTune.events) &&
        Objects.equals(this.fineTunedModel, fineTune.fineTunedModel) &&
        Objects.equals(this.hyperparams, fineTune.hyperparams) &&
        Objects.equals(this.model, fineTune.model) &&
        Objects.equals(this._object, fineTune._object) &&
        Objects.equals(this.organizationId, fineTune.organizationId) &&
        Objects.equals(this.resultFiles, fineTune.resultFiles) &&
        Objects.equals(this.status, fineTune.status) &&
        Objects.equals(this.trainingFiles, fineTune.trainingFiles) &&
        Objects.equals(this.updatedAt, fineTune.updatedAt) &&
        Objects.equals(this.validationFiles, fineTune.validationFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, events, fineTunedModel, hyperparams, model, _object, organizationId, resultFiles, status, trainingFiles, updatedAt, validationFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTune {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    fineTunedModel: ").append(toIndentedString(fineTunedModel)).append("\n");
    sb.append("    hyperparams: ").append(toIndentedString(hyperparams)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    resultFiles: ").append(toIndentedString(resultFiles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trainingFiles: ").append(toIndentedString(trainingFiles)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    validationFiles: ").append(toIndentedString(validationFiles)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("events");
    openapiFields.add("fine_tuned_model");
    openapiFields.add("hyperparams");
    openapiFields.add("model");
    openapiFields.add("object");
    openapiFields.add("organization_id");
    openapiFields.add("result_files");
    openapiFields.add("status");
    openapiFields.add("training_files");
    openapiFields.add("updated_at");
    openapiFields.add("validation_files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("fine_tuned_model");
    openapiRequiredFields.add("hyperparams");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("result_files");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("training_files");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("validation_files");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FineTune
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FineTune.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FineTune is not found in the empty JSON string", FineTune.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FineTune.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FineTune` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FineTune.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
          }

          // validate the optional field `events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            FineTuneEvent.validateJsonElement(jsonArrayevents.get(i));
          };
        }
      }
      if ((jsonObj.get("fine_tuned_model") != null && !jsonObj.get("fine_tuned_model").isJsonNull()) && !jsonObj.get("fine_tuned_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fine_tuned_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fine_tuned_model").toString()));
      }
      // validate the required field `hyperparams`
      FineTuneHyperparams.validateJsonElement(jsonObj.get("hyperparams"));
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if (!jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("result_files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_files` to be an array in the JSON string but got `%s`", jsonObj.get("result_files").toString()));
      }

      JsonArray jsonArrayresultFiles = jsonObj.getAsJsonArray("result_files");
      // validate the required field `result_files` (array)
      for (int i = 0; i < jsonArrayresultFiles.size(); i++) {
        OpenAIFile.validateJsonElement(jsonArrayresultFiles.get(i));
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("training_files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `training_files` to be an array in the JSON string but got `%s`", jsonObj.get("training_files").toString()));
      }

      JsonArray jsonArraytrainingFiles = jsonObj.getAsJsonArray("training_files");
      // validate the required field `training_files` (array)
      for (int i = 0; i < jsonArraytrainingFiles.size(); i++) {
        OpenAIFile.validateJsonElement(jsonArraytrainingFiles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("validation_files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_files` to be an array in the JSON string but got `%s`", jsonObj.get("validation_files").toString()));
      }

      JsonArray jsonArrayvalidationFiles = jsonObj.getAsJsonArray("validation_files");
      // validate the required field `validation_files` (array)
      for (int i = 0; i < jsonArrayvalidationFiles.size(); i++) {
        OpenAIFile.validateJsonElement(jsonArrayvalidationFiles.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FineTune.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FineTune' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FineTune> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FineTune.class));

       return (TypeAdapter<T>) new TypeAdapter<FineTune>() {
           @Override
           public void write(JsonWriter out, FineTune value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FineTune read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FineTune given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FineTune
  * @throws IOException if the JSON string is invalid with respect to FineTune
  */
  public static FineTune fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FineTune.class);
  }

 /**
  * Convert an instance of FineTune to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

