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
import com.github.ainoya.client.model.AssistantsApiResponseFormatOption;
import com.github.ainoya.client.model.AssistantsApiToolChoiceOption;
import com.github.ainoya.client.model.CreateThreadAndRunRequestToolResources;
import com.github.ainoya.client.model.CreateThreadAndRunRequestToolsInner;
import com.github.ainoya.client.model.CreateThreadRequest;
import com.github.ainoya.client.model.TruncationObject;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.ainoya.client.JSON;

/**
 * CreateThreadAndRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-30T01:20:46.396706715Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateThreadAndRunRequest {
  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public static final String SERIALIZED_NAME_THREAD = "thread";
  @SerializedName(SERIALIZED_NAME_THREAD)
  private CreateThreadRequest thread;

  /**
   * Gets or Sets model
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    _4O("gpt-4o"),
    
    _4O_2024_08_06("gpt-4o-2024-08-06"),
    
    _4O_2024_05_13("gpt-4o-2024-05-13"),
    
    _4O_2024_08_062("gpt-4o-2024-08-06"),
    
    _4O_MINI("gpt-4o-mini"),
    
    _4O_MINI_2024_07_18("gpt-4o-mini-2024-07-18"),
    
    _4_TURBO("gpt-4-turbo"),
    
    _4_TURBO_2024_04_09("gpt-4-turbo-2024-04-09"),
    
    _4_0125_PREVIEW("gpt-4-0125-preview"),
    
    _4_TURBO_PREVIEW("gpt-4-turbo-preview"),
    
    _4_1106_PREVIEW("gpt-4-1106-preview"),
    
    _4_VISION_PREVIEW("gpt-4-vision-preview"),
    
    _4("gpt-4"),
    
    _4_0314("gpt-4-0314"),
    
    _4_0613("gpt-4-0613"),
    
    _4_32K("gpt-4-32k"),
    
    _4_32K_0314("gpt-4-32k-0314"),
    
    _4_32K_0613("gpt-4-32k-0613"),
    
    _3_5_TURBO("gpt-3.5-turbo"),
    
    _3_5_TURBO_16K("gpt-3.5-turbo-16k"),
    
    _3_5_TURBO_0613("gpt-3.5-turbo-0613"),
    
    _3_5_TURBO_1106("gpt-3.5-turbo-1106"),
    
    _3_5_TURBO_0125("gpt-3.5-turbo-0125"),
    
    _3_5_TURBO_16K_0613("gpt-3.5-turbo-16k-0613");

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
  private ModelEnum model;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<CreateThreadAndRunRequestToolsInner> tools;

  public static final String SERIALIZED_NAME_TOOL_RESOURCES = "tool_resources";
  @SerializedName(SERIALIZED_NAME_TOOL_RESOURCES)
  private CreateThreadAndRunRequestToolResources toolResources;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("1");

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP = new BigDecimal("1");

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private Boolean stream;

  public static final String SERIALIZED_NAME_MAX_PROMPT_TOKENS = "max_prompt_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_PROMPT_TOKENS)
  private Integer maxPromptTokens;

  public static final String SERIALIZED_NAME_MAX_COMPLETION_TOKENS = "max_completion_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_COMPLETION_TOKENS)
  private Integer maxCompletionTokens;

  public static final String SERIALIZED_NAME_TRUNCATION_STRATEGY = "truncation_strategy";
  @SerializedName(SERIALIZED_NAME_TRUNCATION_STRATEGY)
  private TruncationObject truncationStrategy;

  public static final String SERIALIZED_NAME_TOOL_CHOICE = "tool_choice";
  @SerializedName(SERIALIZED_NAME_TOOL_CHOICE)
  private AssistantsApiToolChoiceOption toolChoice;

  public static final String SERIALIZED_NAME_PARALLEL_TOOL_CALLS = "parallel_tool_calls";
  @SerializedName(SERIALIZED_NAME_PARALLEL_TOOL_CALLS)
  private Boolean parallelToolCalls;

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private AssistantsApiResponseFormatOption responseFormat;

  public CreateThreadAndRunRequest() {
  }

  public CreateThreadAndRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
   */
  @javax.annotation.Nonnull
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  public CreateThreadAndRunRequest thread(CreateThreadRequest thread) {
    this.thread = thread;
    return this;
  }

  /**
   * Get thread
   * @return thread
   */
  @javax.annotation.Nullable
  public CreateThreadRequest getThread() {
    return thread;
  }

  public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
  }


  public CreateThreadAndRunRequest model(ModelEnum model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nullable
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }


  public CreateThreadAndRunRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
   */
  @javax.annotation.Nullable
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public CreateThreadAndRunRequest tools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateThreadAndRunRequest addToolsItem(CreateThreadAndRunRequestToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
   */
  @javax.annotation.Nullable
  public List<CreateThreadAndRunRequestToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
  }


  public CreateThreadAndRunRequest toolResources(CreateThreadAndRunRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  /**
   * Get toolResources
   * @return toolResources
   */
  @javax.annotation.Nullable
  public CreateThreadAndRunRequestToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(CreateThreadAndRunRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }


  public CreateThreadAndRunRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CreateThreadAndRunRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
   */
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public CreateThreadAndRunRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
   */
  @javax.annotation.Nullable
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  public CreateThreadAndRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  /**
   * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
   * @return stream
   */
  @javax.annotation.Nullable
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }


  public CreateThreadAndRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

  /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
   * minimum: 256
   * @return maxPromptTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }


  public CreateThreadAndRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

  /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
   * minimum: 256
   * @return maxCompletionTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }


  public CreateThreadAndRunRequest truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

  /**
   * Get truncationStrategy
   * @return truncationStrategy
   */
  @javax.annotation.Nullable
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }


  public CreateThreadAndRunRequest toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * Get toolChoice
   * @return toolChoice
   */
  @javax.annotation.Nullable
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }


  public CreateThreadAndRunRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling/parallel-function-calling) during tool use.
   * @return parallelToolCalls
   */
  @javax.annotation.Nullable
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }


  public CreateThreadAndRunRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  /**
   * Get responseFormat
   * @return responseFormat
   */
  @javax.annotation.Nullable
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadAndRunRequest createThreadAndRunRequest = (CreateThreadAndRunRequest) o;
    return Objects.equals(this.assistantId, createThreadAndRunRequest.assistantId) &&
        Objects.equals(this.thread, createThreadAndRunRequest.thread) &&
        Objects.equals(this.model, createThreadAndRunRequest.model) &&
        Objects.equals(this.instructions, createThreadAndRunRequest.instructions) &&
        Objects.equals(this.tools, createThreadAndRunRequest.tools) &&
        Objects.equals(this.toolResources, createThreadAndRunRequest.toolResources) &&
        Objects.equals(this.metadata, createThreadAndRunRequest.metadata) &&
        Objects.equals(this.temperature, createThreadAndRunRequest.temperature) &&
        Objects.equals(this.topP, createThreadAndRunRequest.topP) &&
        Objects.equals(this.stream, createThreadAndRunRequest.stream) &&
        Objects.equals(this.maxPromptTokens, createThreadAndRunRequest.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, createThreadAndRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createThreadAndRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createThreadAndRunRequest.toolChoice) &&
        Objects.equals(this.parallelToolCalls, createThreadAndRunRequest.parallelToolCalls) &&
        Objects.equals(this.responseFormat, createThreadAndRunRequest.responseFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, model, instructions, tools, toolResources, metadata, temperature, topP, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, parallelToolCalls, responseFormat);
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
    sb.append("class CreateThreadAndRunRequest {\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
    openapiFields.add("assistant_id");
    openapiFields.add("thread");
    openapiFields.add("model");
    openapiFields.add("instructions");
    openapiFields.add("tools");
    openapiFields.add("tool_resources");
    openapiFields.add("metadata");
    openapiFields.add("temperature");
    openapiFields.add("top_p");
    openapiFields.add("stream");
    openapiFields.add("max_prompt_tokens");
    openapiFields.add("max_completion_tokens");
    openapiFields.add("truncation_strategy");
    openapiFields.add("tool_choice");
    openapiFields.add("parallel_tool_calls");
    openapiFields.add("response_format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assistant_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateThreadAndRunRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadAndRunRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadAndRunRequest is not found in the empty JSON string", CreateThreadAndRunRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateThreadAndRunRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateThreadAndRunRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateThreadAndRunRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      // validate the optional field `thread`
      if (jsonObj.get("thread") != null && !jsonObj.get("thread").isJsonNull()) {
        CreateThreadRequest.validateJsonElement(jsonObj.get("thread"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the optional field `model`
      if (jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) {
        ModelEnum.validateJsonElement(jsonObj.get("model"));
      }
      if ((jsonObj.get("instructions") != null && !jsonObj.get("instructions").isJsonNull()) && !jsonObj.get("instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructions").toString()));
      }
      if (jsonObj.get("tools") != null && !jsonObj.get("tools").isJsonNull()) {
        JsonArray jsonArraytools = jsonObj.getAsJsonArray("tools");
        if (jsonArraytools != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tools").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tools` to be an array in the JSON string but got `%s`", jsonObj.get("tools").toString()));
          }

          // validate the optional field `tools` (array)
          for (int i = 0; i < jsonArraytools.size(); i++) {
            CreateThreadAndRunRequestToolsInner.validateJsonElement(jsonArraytools.get(i));
          };
        }
      }
      // validate the optional field `tool_resources`
      if (jsonObj.get("tool_resources") != null && !jsonObj.get("tool_resources").isJsonNull()) {
        CreateThreadAndRunRequestToolResources.validateJsonElement(jsonObj.get("tool_resources"));
      }
      // validate the optional field `truncation_strategy`
      if (jsonObj.get("truncation_strategy") != null && !jsonObj.get("truncation_strategy").isJsonNull()) {
        TruncationObject.validateJsonElement(jsonObj.get("truncation_strategy"));
      }
      // validate the optional field `tool_choice`
      if (jsonObj.get("tool_choice") != null && !jsonObj.get("tool_choice").isJsonNull()) {
        AssistantsApiToolChoiceOption.validateJsonElement(jsonObj.get("tool_choice"));
      }
      // validate the optional field `response_format`
      if (jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) {
        AssistantsApiResponseFormatOption.validateJsonElement(jsonObj.get("response_format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadAndRunRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadAndRunRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadAndRunRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadAndRunRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadAndRunRequest>() {
           @Override
           public void write(JsonWriter out, CreateThreadAndRunRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateThreadAndRunRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateThreadAndRunRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateThreadAndRunRequest
   * @throws IOException if the JSON string is invalid with respect to CreateThreadAndRunRequest
   */
  public static CreateThreadAndRunRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadAndRunRequest.class);
  }

  /**
   * Convert an instance of CreateThreadAndRunRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

