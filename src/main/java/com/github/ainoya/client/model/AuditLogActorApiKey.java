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
import com.github.ainoya.client.model.AuditLogActorServiceAccount;
import com.github.ainoya.client.model.AuditLogActorUser;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * The API Key used to perform the audit logged action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AuditLogActorApiKey {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    
    SERVICE_ACCOUNT("service_account");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AuditLogActorUser user;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "service_account";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private AuditLogActorServiceAccount serviceAccount;

  public AuditLogActorApiKey() {
  }

  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking id of the API key.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AuditLogActorApiKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AuditLogActorApiKey user(AuditLogActorUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public AuditLogActorUser getUser() {
    return user;
  }

  public void setUser(AuditLogActorUser user) {
    this.user = user;
  }


  public AuditLogActorApiKey serviceAccount(AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Get serviceAccount
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  public AuditLogActorServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
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
   * @return the AuditLogActorApiKey instance itself
   */
  public AuditLogActorApiKey putAdditionalProperty(String key, Object value) {
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
    AuditLogActorApiKey auditLogActorApiKey = (AuditLogActorApiKey) o;
    return Objects.equals(this.id, auditLogActorApiKey.id) &&
        Objects.equals(this.type, auditLogActorApiKey.type) &&
        Objects.equals(this.user, auditLogActorApiKey.user) &&
        Objects.equals(this.serviceAccount, auditLogActorApiKey.serviceAccount)&&
        Objects.equals(this.additionalProperties, auditLogActorApiKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, user, serviceAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActorApiKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("user");
    openapiFields.add("service_account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuditLogActorApiKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditLogActorApiKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogActorApiKey is not found in the empty JSON string", AuditLogActorApiKey.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        AuditLogActorUser.validateJsonElement(jsonObj.get("user"));
      }
      // validate the optional field `service_account`
      if (jsonObj.get("service_account") != null && !jsonObj.get("service_account").isJsonNull()) {
        AuditLogActorServiceAccount.validateJsonElement(jsonObj.get("service_account"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogActorApiKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogActorApiKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogActorApiKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogActorApiKey.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogActorApiKey>() {
           @Override
           public void write(JsonWriter out, AuditLogActorApiKey value) throws IOException {
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
           public AuditLogActorApiKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AuditLogActorApiKey instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AuditLogActorApiKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuditLogActorApiKey
   * @throws IOException if the JSON string is invalid with respect to AuditLogActorApiKey
   */
  public static AuditLogActorApiKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogActorApiKey.class);
  }

  /**
   * Convert an instance of AuditLogActorApiKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

