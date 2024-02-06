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
import com.github.ainoya.client.model.ChatCompletionFunctions;
import com.github.ainoya.client.model.ChatCompletionRequestMessage;
import com.github.ainoya.client.model.ChatCompletionTool;
import com.github.ainoya.client.model.ChatCompletionToolChoiceOption;
import com.github.ainoya.client.model.CreateChatCompletionRequestFunctionCall;
import com.github.ainoya.client.model.CreateChatCompletionRequestResponseFormat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * CreateChatCompletionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-06T08:58:14.331730Z[Etc/UTC]")
public class CreateChatCompletionRequest {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  /**
   * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    _4_1106_PREVIEW("gpt-4-1106-preview"),
    
    _4_0125_PREVIEW("gpt-4-0125-preview"),
    
    _4_TURBO_PREVIEW("gpt-4-turbo-preview"),
    
    _4_VISION_PREVIEW("gpt-4-vision-preview"),
    
    _4("gpt-4"),
    
    _4_0314("gpt-4-0314"),
    
    _4_0613("gpt-4-0613"),
    
    _4_32K("gpt-4-32k"),
    
    _4_32K_0314("gpt-4-32k-0314"),
    
    _4_32K_0613("gpt-4-32k-0613"),
    
    _3_5_TURBO_1106("gpt-3.5-turbo-1106"),
    
    _3_5_TURBO("gpt-3.5-turbo"),
    
    _3_5_TURBO_16K("gpt-3.5-turbo-16k"),
    
    _3_5_TURBO_0301("gpt-3.5-turbo-0301"),
    
    _3_5_TURBO_0613("gpt-3.5-turbo-0613"),
    
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_FREQUENCY_PENALTY = "frequency_penalty";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_PENALTY)
  private BigDecimal frequencyPenalty = new BigDecimal("0");

  public static final String SERIALIZED_NAME_LOGIT_BIAS = "logit_bias";
  @SerializedName(SERIALIZED_NAME_LOGIT_BIAS)
  private Map<String, Integer> logitBias;

  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  private Integer maxTokens;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private Integer n = 1;

  public static final String SERIALIZED_NAME_PRESENCE_PENALTY = "presence_penalty";
  @SerializedName(SERIALIZED_NAME_PRESENCE_PENALTY)
  private BigDecimal presencePenalty = new BigDecimal("0");

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private CreateChatCompletionRequestResponseFormat responseFormat;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private String stop;

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private Boolean stream = false;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("1");

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP = new BigDecimal("1");

  public static final String SERIALIZED_NAME_TOOLS = "tools";
  @SerializedName(SERIALIZED_NAME_TOOLS)
  private List<ChatCompletionTool> tools;

  public static final String SERIALIZED_NAME_TOOL_CHOICE = "tool_choice";
  @SerializedName(SERIALIZED_NAME_TOOL_CHOICE)
  private ChatCompletionToolChoiceOption toolChoice;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_FUNCTION_CALL = "function_call";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTION_CALL)
  private CreateChatCompletionRequestFunctionCall functionCall;

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private List<ChatCompletionFunctions> functions;

  public CreateChatCompletionRequest() {
  }

  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
    
    this.messages = messages;
    return this;
  }

  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }


  public CreateChatCompletionRequest model(ModelEnum model) {
    
    this.model = model;
    return this;
  }

   /**
   * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
   * @return model
  **/
  @javax.annotation.Nonnull
  public ModelEnum getModel() {
    return model;
  }


  public void setModel(ModelEnum model) {
    this.model = model;
  }


  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/gpt/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
  **/
  @javax.annotation.Nullable
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }


  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }


  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    
    this.logitBias = logitBias;
    return this;
  }

  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null) {
      this.logitBias = new HashMap<>();
    }
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

   /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }


  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }


  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
   * @return maxTokens
  **/
  @javax.annotation.Nullable
  public Integer getMaxTokens() {
    return maxTokens;
  }


  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  public CreateChatCompletionRequest n(Integer n) {
    
    this.n = n;
    return this;
  }

   /**
   * How many chat completion choices to generate for each input message.
   * minimum: 1
   * maximum: 128
   * @return n
  **/
  @javax.annotation.Nullable
  public Integer getN() {
    return n;
  }


  public void setN(Integer n) {
    this.n = n;
  }


  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    
    this.presencePenalty = presencePenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/gpt/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
  **/
  @javax.annotation.Nullable
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }


  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }


  public CreateChatCompletionRequest responseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  @javax.annotation.Nullable
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }


  public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }


  public CreateChatCompletionRequest seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * This feature is in Beta.  If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return seed
  **/
  @javax.annotation.Nullable
  public Integer getSeed() {
    return seed;
  }


  public void setSeed(Integer seed) {
    this.seed = seed;
  }


  public CreateChatCompletionRequest stop(String stop) {
    
    this.stop = stop;
    return this;
  }

   /**
   * Up to 4 sequences where the API will stop generating further tokens. 
   * @return stop
  **/
  @javax.annotation.Nullable
  public String getStop() {
    return stop;
  }


  public void setStop(String stop) {
    this.stop = stop;
  }


  public CreateChatCompletionRequest stream(Boolean stream) {
    
    this.stream = stream;
    return this;
  }

   /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   * @return stream
  **/
  @javax.annotation.Nullable
  public Boolean getStream() {
    return stream;
  }


  public void setStream(Boolean stream) {
    this.stream = stream;
  }


  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    
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


  public CreateChatCompletionRequest topP(BigDecimal topP) {
    
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


  public CreateChatCompletionRequest tools(List<ChatCompletionTool> tools) {
    
    this.tools = tools;
    return this;
  }

  public CreateChatCompletionRequest addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. 
   * @return tools
  **/
  @javax.annotation.Nullable
  public List<ChatCompletionTool> getTools() {
    return tools;
  }


  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }


  public CreateChatCompletionRequest toolChoice(ChatCompletionToolChoiceOption toolChoice) {
    
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  @javax.annotation.Nullable
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }


  public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }


  public CreateChatCompletionRequest user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  @Deprecated
  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }


  @Deprecated
  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }


  @Deprecated
  public CreateChatCompletionRequest functions(List<ChatCompletionFunctions> functions) {
    
    this.functions = functions;
    return this;
  }

  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * Deprecated in favor of &#x60;tools&#x60;.  A list of functions the model may generate JSON inputs for. 
   * @return functions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }


  @Deprecated
  public void setFunctions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
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
   * @return the CreateChatCompletionRequest instance itself
   */
  public CreateChatCompletionRequest putAdditionalProperty(String key, Object value) {
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
    CreateChatCompletionRequest createChatCompletionRequest = (CreateChatCompletionRequest) o;
    return Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.model, createChatCompletionRequest.model) &&
        Objects.equals(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(this.n, createChatCompletionRequest.n) &&
        Objects.equals(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.responseFormat, createChatCompletionRequest.responseFormat) &&
        Objects.equals(this.seed, createChatCompletionRequest.seed) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.tools, createChatCompletionRequest.tools) &&
        Objects.equals(this.toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(this.user, createChatCompletionRequest.user) &&
        Objects.equals(this.functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions)&&
        Objects.equals(this.additionalProperties, createChatCompletionRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, frequencyPenalty, logitBias, maxTokens, n, presencePenalty, responseFormat, seed, stop, stream, temperature, topP, tools, toolChoice, user, functionCall, functions, additionalProperties);
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
    sb.append("class CreateChatCompletionRequest {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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
    openapiFields.add("messages");
    openapiFields.add("model");
    openapiFields.add("frequency_penalty");
    openapiFields.add("logit_bias");
    openapiFields.add("max_tokens");
    openapiFields.add("n");
    openapiFields.add("presence_penalty");
    openapiFields.add("response_format");
    openapiFields.add("seed");
    openapiFields.add("stop");
    openapiFields.add("stream");
    openapiFields.add("temperature");
    openapiFields.add("top_p");
    openapiFields.add("tools");
    openapiFields.add("tool_choice");
    openapiFields.add("user");
    openapiFields.add("function_call");
    openapiFields.add("functions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("model");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChatCompletionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChatCompletionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChatCompletionRequest is not found in the empty JSON string", CreateChatCompletionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateChatCompletionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        ChatCompletionRequestMessage.validateJsonElement(jsonArraymessages.get(i));
      };
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // validate the required field `model`
      ModelEnum.validateJsonElement(jsonObj.get("model"));
      // validate the optional field `response_format`
      if (jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) {
        CreateChatCompletionRequestResponseFormat.validateJsonElement(jsonObj.get("response_format"));
      }
      if ((jsonObj.get("stop") != null && !jsonObj.get("stop").isJsonNull()) && !jsonObj.get("stop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop").toString()));
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
            ChatCompletionTool.validateJsonElement(jsonArraytools.get(i));
          };
        }
      }
      // validate the optional field `tool_choice`
      if (jsonObj.get("tool_choice") != null && !jsonObj.get("tool_choice").isJsonNull()) {
        ChatCompletionToolChoiceOption.validateJsonElement(jsonObj.get("tool_choice"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // validate the optional field `function_call`
      if (jsonObj.get("function_call") != null && !jsonObj.get("function_call").isJsonNull()) {
        CreateChatCompletionRequestFunctionCall.validateJsonElement(jsonObj.get("function_call"));
      }
      if (jsonObj.get("functions") != null && !jsonObj.get("functions").isJsonNull()) {
        JsonArray jsonArrayfunctions = jsonObj.getAsJsonArray("functions");
        if (jsonArrayfunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("functions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `functions` to be an array in the JSON string but got `%s`", jsonObj.get("functions").toString()));
          }

          // validate the optional field `functions` (array)
          for (int i = 0; i < jsonArrayfunctions.size(); i++) {
            ChatCompletionFunctions.validateJsonElement(jsonArrayfunctions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChatCompletionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChatCompletionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChatCompletionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChatCompletionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChatCompletionRequest>() {
           @Override
           public void write(JsonWriter out, CreateChatCompletionRequest value) throws IOException {
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
           public CreateChatCompletionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateChatCompletionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateChatCompletionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChatCompletionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateChatCompletionRequest
  */
  public static CreateChatCompletionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChatCompletionRequest.class);
  }

 /**
  * Convert an instance of CreateChatCompletionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

