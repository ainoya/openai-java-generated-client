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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.CreateCompletionRequestModel;
import org.openapitools.client.model.CreateCompletionRequestPrompt;
import org.openapitools.client.model.CreateCompletionRequestStop;
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

import tokyo.ainoya.openapi.client.JSON;

/**
 * CreateCompletionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T05:37:26.789366Z[Etc/UTC]")
public class CreateCompletionRequest {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private CreateCompletionRequestModel model;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private CreateCompletionRequestPrompt prompt = "<|endoftext|>";

  public static final String SERIALIZED_NAME_BEST_OF = "best_of";
  @SerializedName(SERIALIZED_NAME_BEST_OF)
  private Integer bestOf = 1;

  public static final String SERIALIZED_NAME_ECHO = "echo";
  @SerializedName(SERIALIZED_NAME_ECHO)
  private Boolean echo = false;

  public static final String SERIALIZED_NAME_FREQUENCY_PENALTY = "frequency_penalty";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_PENALTY)
  private BigDecimal frequencyPenalty = new BigDecimal("0");

  public static final String SERIALIZED_NAME_LOGIT_BIAS = "logit_bias";
  @SerializedName(SERIALIZED_NAME_LOGIT_BIAS)
  private Map<String, Integer> logitBias;

  public static final String SERIALIZED_NAME_LOGPROBS = "logprobs";
  @SerializedName(SERIALIZED_NAME_LOGPROBS)
  private Integer logprobs;

  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  private Integer maxTokens = 16;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private Integer n = 1;

  public static final String SERIALIZED_NAME_PRESENCE_PENALTY = "presence_penalty";
  @SerializedName(SERIALIZED_NAME_PRESENCE_PENALTY)
  private BigDecimal presencePenalty = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private CreateCompletionRequestStop stop = null;

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private Boolean stream = false;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("1");

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP = new BigDecimal("1");

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public CreateCompletionRequest() {
  }

  public CreateCompletionRequest model(CreateCompletionRequestModel model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  public CreateCompletionRequestModel getModel() {
    return model;
  }


  public void setModel(CreateCompletionRequestModel model) {
    this.model = model;
  }


  public CreateCompletionRequest prompt(CreateCompletionRequestPrompt prompt) {
    
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @javax.annotation.Nullable
  public CreateCompletionRequestPrompt getPrompt() {
    return prompt;
  }


  public void setPrompt(CreateCompletionRequestPrompt prompt) {
    this.prompt = prompt;
  }


  public CreateCompletionRequest bestOf(Integer bestOf) {
    
    this.bestOf = bestOf;
    return this;
  }

   /**
   * Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
   * minimum: 0
   * maximum: 20
   * @return bestOf
  **/
  @javax.annotation.Nullable
  public Integer getBestOf() {
    return bestOf;
  }


  public void setBestOf(Integer bestOf) {
    this.bestOf = bestOf;
  }


  public CreateCompletionRequest echo(Boolean echo) {
    
    this.echo = echo;
    return this;
  }

   /**
   * Echo back the prompt in addition to the completion 
   * @return echo
  **/
  @javax.annotation.Nullable
  public Boolean getEcho() {
    return echo;
  }


  public void setEcho(Boolean echo) {
    this.echo = echo;
  }


  public CreateCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    
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


  public CreateCompletionRequest logitBias(Map<String, Integer> logitBias) {
    
    this.logitBias = logitBias;
    return this;
  }

  public CreateCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null) {
      this.logitBias = new HashMap<>();
    }
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

   /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. 
   * @return logitBias
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }


  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }


  public CreateCompletionRequest logprobs(Integer logprobs) {
    
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Include the log probabilities on the &#x60;logprobs&#x60; most likely tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. 
   * minimum: 0
   * maximum: 5
   * @return logprobs
  **/
  @javax.annotation.Nullable
  public Integer getLogprobs() {
    return logprobs;
  }


  public void setLogprobs(Integer logprobs) {
    this.logprobs = logprobs;
  }


  public CreateCompletionRequest maxTokens(Integer maxTokens) {
    
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
   * minimum: 0
   * @return maxTokens
  **/
  @javax.annotation.Nullable
  public Integer getMaxTokens() {
    return maxTokens;
  }


  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  public CreateCompletionRequest n(Integer n) {
    
    this.n = n;
    return this;
  }

   /**
   * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
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


  public CreateCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    
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


  public CreateCompletionRequest seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
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


  public CreateCompletionRequest stop(CreateCompletionRequestStop stop) {
    
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @javax.annotation.Nullable
  public CreateCompletionRequestStop getStop() {
    return stop;
  }


  public void setStop(CreateCompletionRequestStop stop) {
    this.stop = stop;
  }


  public CreateCompletionRequest stream(Boolean stream) {
    
    this.stream = stream;
    return this;
  }

   /**
   * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   * @return stream
  **/
  @javax.annotation.Nullable
  public Boolean getStream() {
    return stream;
  }


  public void setStream(Boolean stream) {
    this.stream = stream;
  }


  public CreateCompletionRequest suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * The suffix that comes after a completion of inserted text.
   * @return suffix
  **/
  @javax.annotation.Nullable
  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public CreateCompletionRequest temperature(BigDecimal temperature) {
    
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


  public CreateCompletionRequest topP(BigDecimal topP) {
    
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


  public CreateCompletionRequest user(String user) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionRequest createCompletionRequest = (CreateCompletionRequest) o;
    return Objects.equals(this.model, createCompletionRequest.model) &&
        Objects.equals(this.prompt, createCompletionRequest.prompt) &&
        Objects.equals(this.bestOf, createCompletionRequest.bestOf) &&
        Objects.equals(this.echo, createCompletionRequest.echo) &&
        Objects.equals(this.frequencyPenalty, createCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createCompletionRequest.logitBias) &&
        Objects.equals(this.logprobs, createCompletionRequest.logprobs) &&
        Objects.equals(this.maxTokens, createCompletionRequest.maxTokens) &&
        Objects.equals(this.n, createCompletionRequest.n) &&
        Objects.equals(this.presencePenalty, createCompletionRequest.presencePenalty) &&
        Objects.equals(this.seed, createCompletionRequest.seed) &&
        Objects.equals(this.stop, createCompletionRequest.stop) &&
        Objects.equals(this.stream, createCompletionRequest.stream) &&
        Objects.equals(this.suffix, createCompletionRequest.suffix) &&
        Objects.equals(this.temperature, createCompletionRequest.temperature) &&
        Objects.equals(this.topP, createCompletionRequest.topP) &&
        Objects.equals(this.user, createCompletionRequest.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, prompt, bestOf, echo, frequencyPenalty, logitBias, logprobs, maxTokens, n, presencePenalty, seed, stop, stream, suffix, temperature, topP, user);
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
    sb.append("class CreateCompletionRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    bestOf: ").append(toIndentedString(bestOf)).append("\n");
    sb.append("    echo: ").append(toIndentedString(echo)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("model");
    openapiFields.add("prompt");
    openapiFields.add("best_of");
    openapiFields.add("echo");
    openapiFields.add("frequency_penalty");
    openapiFields.add("logit_bias");
    openapiFields.add("logprobs");
    openapiFields.add("max_tokens");
    openapiFields.add("n");
    openapiFields.add("presence_penalty");
    openapiFields.add("seed");
    openapiFields.add("stop");
    openapiFields.add("stream");
    openapiFields.add("suffix");
    openapiFields.add("temperature");
    openapiFields.add("top_p");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("prompt");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCompletionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCompletionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompletionRequest is not found in the empty JSON string", CreateCompletionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCompletionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCompletionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompletionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `model`
      CreateCompletionRequestModel.validateJsonElement(jsonObj.get("model"));
      // validate the required field `prompt`
      CreateCompletionRequestPrompt.validateJsonElement(jsonObj.get("prompt"));
      // validate the optional field `stop`
      if (jsonObj.get("stop") != null && !jsonObj.get("stop").isJsonNull()) {
        CreateCompletionRequestStop.validateJsonElement(jsonObj.get("stop"));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompletionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompletionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompletionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompletionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompletionRequest>() {
           @Override
           public void write(JsonWriter out, CreateCompletionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompletionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompletionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompletionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCompletionRequest
  */
  public static CreateCompletionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompletionRequest.class);
  }

 /**
  * Convert an instance of CreateCompletionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

