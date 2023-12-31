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


package com.github.ainoya.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantFileObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantObjectToolsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantToolsCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantToolsFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.AssistantToolsRetrieval.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionFunctionCallOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionFunctions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionMessageToolCall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionMessageToolCallChunk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionMessageToolCallChunkFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionMessageToolCallFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionNamedToolChoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionNamedToolChoiceFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestAssistantMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestAssistantMessageFunctionCall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestFunctionMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestMessageContentPart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestMessageContentPartImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestMessageContentPartImageImageUrl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestMessageContentPartText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestSystemMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestToolMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestUserMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionRequestUserMessageContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionResponseMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionStreamResponseDelta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionStreamResponseDeltaFunctionCall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionTool.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ChatCompletionToolChoiceOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CompletionUsage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateAssistantFileRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateAssistantRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionFunctionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionFunctionResponseChoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionRequestFunctionCall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionRequestResponseFormat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionResponseChoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionStreamResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateChatCompletionStreamResponseChoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionRequestModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionRequestStop.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionResponseChoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateCompletionResponseChoicesInnerLogprobs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEditRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEditRequestModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEditResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEditResponseChoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEmbeddingRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEmbeddingRequestInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEmbeddingResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateEmbeddingResponseUsage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateFineTuneRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateFineTuneRequestHyperparameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateFineTuningJobRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateFineTuningJobRequestHyperparameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateImageEditRequestModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateImageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateMessageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationRequestInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationResponseResultsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationResponseResultsInnerCategories.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateModerationResponseResultsInnerCategoryScores.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateRunRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateSpeechRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateThreadAndRunRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateThreadAndRunRequestToolsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateThreadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateTranscriptionRequestModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateTranscriptionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.CreateTranslationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteAssistantFileResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteAssistantResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteFileResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteMessageResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteModelResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.DeleteThreadResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.Embedding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ErrorResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTune.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuneEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuneHyperparams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuningJob.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuningJobError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuningJobEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FineTuningJobHyperparameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.FunctionObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.Image.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ImagesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListAssistantFilesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListAssistantsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListFilesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListFineTuneEventsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListFineTunesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListFineTuningJobEventsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListMessageFilesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListMessagesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListModelsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListPaginatedFineTuningJobsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListRunStepsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListRunsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ListThreadsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentImageFileObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentImageFileObjectImageFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextAnnotationsFileCitationObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextAnnotationsFileCitationObjectFileCitation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextAnnotationsFilePathObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextAnnotationsFilePathObjectFilePath.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextObjectText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageContentTextObjectTextAnnotationsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageFileObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.MessageObjectContentInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.Model.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ModifyAssistantRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ModifyMessageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ModifyRunRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ModifyThreadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.OpenAIFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunObjectLastError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunObjectRequiredAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunObjectRequiredActionSubmitToolOutputs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsMessageCreationObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsMessageCreationObjectMessageCreation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputImageObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputImageObjectImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsCodeOutputLogsObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsFunctionObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsFunctionObjectFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsObjectToolCallsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepDetailsToolCallsRetrievalObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepObjectLastError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunStepObjectStepDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunToolCallObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.RunToolCallObjectFunction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.SubmitToolOutputsRunRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.SubmitToolOutputsRunRequestToolOutputsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.github.ainoya.client.model.ThreadObject.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
