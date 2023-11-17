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
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import tokyo.ainoya.openai.client.JSON;

/**
 * MessageContentTextObjectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T06:35:52.646593Z[Etc/UTC]")
public class MessageContentTextObjectText {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<MessageContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

  public MessageContentTextObjectText() {
  }

  public MessageContentTextObjectText value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The data that makes up the text.
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public MessageContentTextObjectText annotations(List<MessageContentTextObjectTextAnnotationsInner> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public MessageContentTextObjectText addAnnotationsItem(MessageContentTextObjectTextAnnotationsInner annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nonnull
  public List<MessageContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(List<MessageContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextObjectText messageContentTextObjectText = (MessageContentTextObjectText) o;
    return Objects.equals(this.value, messageContentTextObjectText.value) &&
        Objects.equals(this.annotations, messageContentTextObjectText.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObjectText {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("annotations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("annotations");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MessageContentTextObjectText
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageContentTextObjectText.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageContentTextObjectText is not found in the empty JSON string", MessageContentTextObjectText.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessageContentTextObjectText.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageContentTextObjectText` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageContentTextObjectText.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("annotations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotations` to be an array in the JSON string but got `%s`", jsonObj.get("annotations").toString()));
      }

      JsonArray jsonArrayannotations = jsonObj.getAsJsonArray("annotations");
      // validate the required field `annotations` (array)
      for (int i = 0; i < jsonArrayannotations.size(); i++) {
        MessageContentTextObjectTextAnnotationsInner.validateJsonElement(jsonArrayannotations.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageContentTextObjectText.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageContentTextObjectText' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageContentTextObjectText> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageContentTextObjectText.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageContentTextObjectText>() {
           @Override
           public void write(JsonWriter out, MessageContentTextObjectText value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageContentTextObjectText read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageContentTextObjectText given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageContentTextObjectText
  * @throws IOException if the JSON string is invalid with respect to MessageContentTextObjectText
  */
  public static MessageContentTextObjectText fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageContentTextObjectText.class);
  }

 /**
  * Convert an instance of MessageContentTextObjectText to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

