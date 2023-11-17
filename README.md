# OpenAI API Java Client generated from OpenAPI specification with openapi-generator

## Overview

This repository contains a Java client library for the OpenAI API, generated using the OpenAPI Generator tool. The library is based on the official OpenAPI specification provided by OpenAI, which can be found at [openai/openai-openapi](https://github.com/openai/openai-openapi).

## Motivation

While attempting to generate the client library directly from the official OpenAPI spec file, several issues were encountered, primarily due to certain syntax elements like `oneOf` that led to generation errors. To overcome these challenges, modifications were made to the original spec file to ensure successful client generation and functional integrity of the resulting Java client.

## Modifications and Testing

Several definitions in the spec file that caused errors during generation were identified and rectified. This included, but was not limited to, addressing issues with `oneOf` syntax. It is important to note that these modifications might have led to some original parameters becoming unavailable. For transparency and comparison, the original API spec has been saved as `openapi.orig.yaml`, and the modified file used for generation is `openapi.yaml`.

To view the specific changes made, you can use the command: `diff -Nru openapi.yaml openapi.orig.yaml`.

All automatically generated tests have been run and passed, ensuring the reliability of the modified spec.

## Ongoing Verification

It is acknowledged that with a better understanding of the `openapi-generator` options, it might be possible to generate the client from the original spec without modifications. This aspect is currently under continuous review and exploration.

## Usage and Contribution

We encourage users and developers to contribute to this repository, especially in improving the generation process and enhancing the library. Any updates or fixes that enable the use of the original spec file without modifications would be particularly valuable.

## Disclaimer

This client library is an independent effort and is not officially affiliated with OpenAI. Users should exercise due diligence and refer to OpenAI's official documentation and API guidelines for accurate information.

---


# openai-java-generated-client

OpenAI API

- API version: 2.0.0

    - Build date: 2023-11-17T09:48:42.629078Z[Etc/UTC]

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

    For more information, please visit [https://help.openai.com/](https://help.openai.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
    2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>dev.ainoya</groupId>
    <artifactId>openai-java-generated-client</artifactId>
    <version>2.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
repositories {
mavenCentral()     // Needed if the 'openai-java-generated-client' jar has been published to maven central.
mavenLocal()       // Needed if the 'openai-java-generated-client' jar has been published to the local maven repo.
}

dependencies {
implementation "dev.ainoya:openai-java-generated-client:2.0.0"
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openai-java-generated-client-2.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

    import dev.ainoya.client.*;
    import dev.ainoya.client.auth.*;
    import dev.ainoya.client.model.*;
    import tokyo.ainoya.openai.client.api.AssistantApi;

    public class AssistantApiExample {

    public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

    AssistantApi apiInstance = new AssistantApi(defaultClient);
        String assistantId = "assistantId_example"; // String | The ID of the assistant to modify.
        ModifyAssistantRequest modifyAssistantRequest = new ModifyAssistantRequest(); // ModifyAssistantRequest | 
    try {
    AssistantObject result = apiInstance.modifyAssistant(assistantId, modifyAssistantRequest);
        System.out.println(result);
    } catch (ApiException e) {
    System.err.println("Exception when calling AssistantApi#modifyAssistant");
    System.err.println("Status code: " + e.getCode());
    System.err.println("Reason: " + e.getResponseBody());
    System.err.println("Response headers: " + e.getResponseHeaders());
    e.printStackTrace();
    }
    }
    }

```

## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssistantApi* | [**modifyAssistant**](docs/AssistantApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
*AssistantsApi* | [**cancelRun**](docs/AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
*AssistantsApi* | [**createAssistant**](docs/AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
*AssistantsApi* | [**createAssistantFile**](docs/AssistantsApi.md#createAssistantFile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
*AssistantsApi* | [**createMessage**](docs/AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
*AssistantsApi* | [**createRun**](docs/AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
*AssistantsApi* | [**createThread**](docs/AssistantsApi.md#createThread) | **POST** /threads | Create a thread.
*AssistantsApi* | [**createThreadAndRun**](docs/AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
*AssistantsApi* | [**deleteAssistant**](docs/AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
*AssistantsApi* | [**deleteAssistantFile**](docs/AssistantsApi.md#deleteAssistantFile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
*AssistantsApi* | [**deleteThread**](docs/AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
*AssistantsApi* | [**getAssistant**](docs/AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
*AssistantsApi* | [**getAssistantFile**](docs/AssistantsApi.md#getAssistantFile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
*AssistantsApi* | [**getMessage**](docs/AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
*AssistantsApi* | [**getMessageFile**](docs/AssistantsApi.md#getMessageFile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
*AssistantsApi* | [**getRun**](docs/AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
*AssistantsApi* | [**getRunStep**](docs/AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
*AssistantsApi* | [**getThread**](docs/AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
*AssistantsApi* | [**listAssistantFiles**](docs/AssistantsApi.md#listAssistantFiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
*AssistantsApi* | [**listAssistants**](docs/AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
*AssistantsApi* | [**listMessageFiles**](docs/AssistantsApi.md#listMessageFiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
*AssistantsApi* | [**listMessages**](docs/AssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
*AssistantsApi* | [**listRunSteps**](docs/AssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
*AssistantsApi* | [**listRuns**](docs/AssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
*AssistantsApi* | [**modifyMessage**](docs/AssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
*AssistantsApi* | [**modifyRun**](docs/AssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
*AssistantsApi* | [**modifyThread**](docs/AssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
*AssistantsApi* | [**submitToolOuputsToRun**](docs/AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
*AudioApi* | [**createSpeech**](docs/AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
*AudioApi* | [**createTranscription**](docs/AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
*AudioApi* | [**createTranslation**](docs/AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
*ChatApi* | [**createChatCompletion**](docs/ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
*CompletionsApi* | [**createCompletion**](docs/CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
*EditsApi* | [**createEdit**](docs/EditsApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
*EmbeddingsApi* | [**createEmbedding**](docs/EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
*FilesApi* | [**createFile**](docs/FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints/features. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files for can be a maximum of 512MB. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
*FilesApi* | [**listFiles**](docs/FilesApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
*FilesApi* | [**retrieveFile**](docs/FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
*FineTunesApi* | [**cancelFineTune**](docs/FineTunesApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*FineTunesApi* | [**createFineTune**](docs/FineTunesApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning) 
*FineTunesApi* | [**listFineTuneEvents**](docs/FineTunesApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*FineTunesApi* | [**listFineTunes**](docs/FineTunesApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
*FineTunesApi* | [**retrieveFineTune**](docs/FineTunesApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning) 
*FineTuningApi* | [**cancelFineTuningJob**](docs/FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
*FineTuningApi* | [**createFineTuningJob**](docs/FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*FineTuningApi* | [**listFineTuningEvents**](docs/FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
*FineTuningApi* | [**listPaginatedFineTuningJobs**](docs/FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
*FineTuningApi* | [**retrieveFineTuningJob**](docs/FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*ImagesApi* | [**createImage**](docs/ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
*ImagesApi* | [**createImageEdit**](docs/ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
*ImagesApi* | [**createImageVariation**](docs/ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
*ModelsApi* | [**deleteModel**](docs/ModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*ModelsApi* | [**listModels**](docs/ModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*ModelsApi* | [**retrieveModel**](docs/ModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*ModerationsApi* | [**createModeration**](docs/ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy


## Documentation for Models

 - [AssistantFileObject](docs/AssistantFileObject.md)
 - [AssistantObject](docs/AssistantObject.md)
 - [AssistantObjectToolsInner](docs/AssistantObjectToolsInner.md)
 - [AssistantToolsCode](docs/AssistantToolsCode.md)
 - [AssistantToolsFunction](docs/AssistantToolsFunction.md)
 - [AssistantToolsRetrieval](docs/AssistantToolsRetrieval.md)
 - [ChatCompletionFunctionCallOption](docs/ChatCompletionFunctionCallOption.md)
 - [ChatCompletionFunctions](docs/ChatCompletionFunctions.md)
 - [ChatCompletionMessageToolCall](docs/ChatCompletionMessageToolCall.md)
 - [ChatCompletionMessageToolCallChunk](docs/ChatCompletionMessageToolCallChunk.md)
 - [ChatCompletionMessageToolCallChunkFunction](docs/ChatCompletionMessageToolCallChunkFunction.md)
 - [ChatCompletionMessageToolCallFunction](docs/ChatCompletionMessageToolCallFunction.md)
 - [ChatCompletionNamedToolChoice](docs/ChatCompletionNamedToolChoice.md)
 - [ChatCompletionNamedToolChoiceFunction](docs/ChatCompletionNamedToolChoiceFunction.md)
 - [ChatCompletionRequestAssistantMessage](docs/ChatCompletionRequestAssistantMessage.md)
 - [ChatCompletionRequestAssistantMessageFunctionCall](docs/ChatCompletionRequestAssistantMessageFunctionCall.md)
 - [ChatCompletionRequestFunctionMessage](docs/ChatCompletionRequestFunctionMessage.md)
 - [ChatCompletionRequestMessage](docs/ChatCompletionRequestMessage.md)
 - [ChatCompletionRequestMessageContentPart](docs/ChatCompletionRequestMessageContentPart.md)
 - [ChatCompletionRequestMessageContentPartImage](docs/ChatCompletionRequestMessageContentPartImage.md)
 - [ChatCompletionRequestMessageContentPartImageImageUrl](docs/ChatCompletionRequestMessageContentPartImageImageUrl.md)
 - [ChatCompletionRequestMessageContentPartText](docs/ChatCompletionRequestMessageContentPartText.md)
 - [ChatCompletionRequestSystemMessage](docs/ChatCompletionRequestSystemMessage.md)
 - [ChatCompletionRequestToolMessage](docs/ChatCompletionRequestToolMessage.md)
 - [ChatCompletionRequestUserMessage](docs/ChatCompletionRequestUserMessage.md)
 - [ChatCompletionRequestUserMessageContent](docs/ChatCompletionRequestUserMessageContent.md)
 - [ChatCompletionResponseMessage](docs/ChatCompletionResponseMessage.md)
 - [ChatCompletionRole](docs/ChatCompletionRole.md)
 - [ChatCompletionStreamResponseDelta](docs/ChatCompletionStreamResponseDelta.md)
 - [ChatCompletionStreamResponseDeltaFunctionCall](docs/ChatCompletionStreamResponseDeltaFunctionCall.md)
 - [ChatCompletionTool](docs/ChatCompletionTool.md)
 - [ChatCompletionToolChoiceOption](docs/ChatCompletionToolChoiceOption.md)
 - [CompletionUsage](docs/CompletionUsage.md)
 - [CreateAssistantFileRequest](docs/CreateAssistantFileRequest.md)
 - [CreateAssistantRequest](docs/CreateAssistantRequest.md)
 - [CreateChatCompletionFunctionResponse](docs/CreateChatCompletionFunctionResponse.md)
 - [CreateChatCompletionFunctionResponseChoicesInner](docs/CreateChatCompletionFunctionResponseChoicesInner.md)
 - [CreateChatCompletionRequest](docs/CreateChatCompletionRequest.md)
 - [CreateChatCompletionRequestFunctionCall](docs/CreateChatCompletionRequestFunctionCall.md)
 - [CreateChatCompletionRequestResponseFormat](docs/CreateChatCompletionRequestResponseFormat.md)
 - [CreateChatCompletionResponse](docs/CreateChatCompletionResponse.md)
 - [CreateChatCompletionResponseChoicesInner](docs/CreateChatCompletionResponseChoicesInner.md)
 - [CreateChatCompletionStreamResponse](docs/CreateChatCompletionStreamResponse.md)
 - [CreateChatCompletionStreamResponseChoicesInner](docs/CreateChatCompletionStreamResponseChoicesInner.md)
 - [CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [CreateCompletionRequestModel](docs/CreateCompletionRequestModel.md)
 - [CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [CreateEditRequest](docs/CreateEditRequest.md)
 - [CreateEditRequestModel](docs/CreateEditRequestModel.md)
 - [CreateEditResponse](docs/CreateEditResponse.md)
 - [CreateEditResponseChoicesInner](docs/CreateEditResponseChoicesInner.md)
 - [CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [CreateFineTuneRequestHyperparameters](docs/CreateFineTuneRequestHyperparameters.md)
 - [CreateFineTuningJobRequest](docs/CreateFineTuningJobRequest.md)
 - [CreateFineTuningJobRequestHyperparameters](docs/CreateFineTuningJobRequestHyperparameters.md)
 - [CreateImageEditRequestModel](docs/CreateImageEditRequestModel.md)
 - [CreateImageRequest](docs/CreateImageRequest.md)
 - [CreateMessageRequest](docs/CreateMessageRequest.md)
 - [CreateModerationRequest](docs/CreateModerationRequest.md)
 - [CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [CreateModerationResponse](docs/CreateModerationResponse.md)
 - [CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [CreateRunRequest](docs/CreateRunRequest.md)
 - [CreateSpeechRequest](docs/CreateSpeechRequest.md)
 - [CreateThreadAndRunRequest](docs/CreateThreadAndRunRequest.md)
 - [CreateThreadAndRunRequestToolsInner](docs/CreateThreadAndRunRequestToolsInner.md)
 - [CreateThreadRequest](docs/CreateThreadRequest.md)
 - [CreateTranscriptionRequestModel](docs/CreateTranscriptionRequestModel.md)
 - [CreateTranscriptionResponse](docs/CreateTranscriptionResponse.md)
 - [CreateTranslationResponse](docs/CreateTranslationResponse.md)
 - [DeleteAssistantFileResponse](docs/DeleteAssistantFileResponse.md)
 - [DeleteAssistantResponse](docs/DeleteAssistantResponse.md)
 - [DeleteFileResponse](docs/DeleteFileResponse.md)
 - [DeleteMessageResponse](docs/DeleteMessageResponse.md)
 - [DeleteModelResponse](docs/DeleteModelResponse.md)
 - [DeleteThreadResponse](docs/DeleteThreadResponse.md)
 - [Embedding](docs/Embedding.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FineTune](docs/FineTune.md)
 - [FineTuneEvent](docs/FineTuneEvent.md)
 - [FineTuneHyperparams](docs/FineTuneHyperparams.md)
 - [FineTuningJob](docs/FineTuningJob.md)
 - [FineTuningJobError](docs/FineTuningJobError.md)
 - [FineTuningJobEvent](docs/FineTuningJobEvent.md)
 - [FineTuningJobHyperparameters](docs/FineTuningJobHyperparameters.md)
 - [FunctionObject](docs/FunctionObject.md)
 - [Image](docs/Image.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [ListAssistantFilesResponse](docs/ListAssistantFilesResponse.md)
 - [ListAssistantsResponse](docs/ListAssistantsResponse.md)
 - [ListFilesResponse](docs/ListFilesResponse.md)
 - [ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [ListFineTuningJobEventsResponse](docs/ListFineTuningJobEventsResponse.md)
 - [ListMessageFilesResponse](docs/ListMessageFilesResponse.md)
 - [ListMessagesResponse](docs/ListMessagesResponse.md)
 - [ListModelsResponse](docs/ListModelsResponse.md)
 - [ListPaginatedFineTuningJobsResponse](docs/ListPaginatedFineTuningJobsResponse.md)
 - [ListRunStepsResponse](docs/ListRunStepsResponse.md)
 - [ListRunsResponse](docs/ListRunsResponse.md)
 - [ListThreadsResponse](docs/ListThreadsResponse.md)
 - [MessageContentImageFileObject](docs/MessageContentImageFileObject.md)
 - [MessageContentImageFileObjectImageFile](docs/MessageContentImageFileObjectImageFile.md)
 - [MessageContentTextAnnotationsFileCitationObject](docs/MessageContentTextAnnotationsFileCitationObject.md)
 - [MessageContentTextAnnotationsFileCitationObjectFileCitation](docs/MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
 - [MessageContentTextAnnotationsFilePathObject](docs/MessageContentTextAnnotationsFilePathObject.md)
 - [MessageContentTextAnnotationsFilePathObjectFilePath](docs/MessageContentTextAnnotationsFilePathObjectFilePath.md)
 - [MessageContentTextObject](docs/MessageContentTextObject.md)
 - [MessageContentTextObjectText](docs/MessageContentTextObjectText.md)
 - [MessageContentTextObjectTextAnnotationsInner](docs/MessageContentTextObjectTextAnnotationsInner.md)
 - [MessageFileObject](docs/MessageFileObject.md)
 - [MessageObject](docs/MessageObject.md)
 - [MessageObjectContentInner](docs/MessageObjectContentInner.md)
 - [Model](docs/Model.md)
 - [ModifyAssistantRequest](docs/ModifyAssistantRequest.md)
 - [ModifyMessageRequest](docs/ModifyMessageRequest.md)
 - [ModifyRunRequest](docs/ModifyRunRequest.md)
 - [ModifyThreadRequest](docs/ModifyThreadRequest.md)
 - [OpenAIFile](docs/OpenAIFile.md)
 - [RunObject](docs/RunObject.md)
 - [RunObjectLastError](docs/RunObjectLastError.md)
 - [RunObjectRequiredAction](docs/RunObjectRequiredAction.md)
 - [RunObjectRequiredActionSubmitToolOutputs](docs/RunObjectRequiredActionSubmitToolOutputs.md)
 - [RunStepDetailsMessageCreationObject](docs/RunStepDetailsMessageCreationObject.md)
 - [RunStepDetailsMessageCreationObjectMessageCreation](docs/RunStepDetailsMessageCreationObjectMessageCreation.md)
 - [RunStepDetailsToolCallsCodeObject](docs/RunStepDetailsToolCallsCodeObject.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreter](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)
 - [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner](docs/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md)
 - [RunStepDetailsToolCallsCodeOutputImageObject](docs/RunStepDetailsToolCallsCodeOutputImageObject.md)
 - [RunStepDetailsToolCallsCodeOutputImageObjectImage](docs/RunStepDetailsToolCallsCodeOutputImageObjectImage.md)
 - [RunStepDetailsToolCallsCodeOutputLogsObject](docs/RunStepDetailsToolCallsCodeOutputLogsObject.md)
 - [RunStepDetailsToolCallsFunctionObject](docs/RunStepDetailsToolCallsFunctionObject.md)
 - [RunStepDetailsToolCallsFunctionObjectFunction](docs/RunStepDetailsToolCallsFunctionObjectFunction.md)
 - [RunStepDetailsToolCallsObject](docs/RunStepDetailsToolCallsObject.md)
 - [RunStepDetailsToolCallsObjectToolCallsInner](docs/RunStepDetailsToolCallsObjectToolCallsInner.md)
 - [RunStepDetailsToolCallsRetrievalObject](docs/RunStepDetailsToolCallsRetrievalObject.md)
 - [RunStepObject](docs/RunStepObject.md)
 - [RunStepObjectLastError](docs/RunStepObjectLastError.md)
 - [RunStepObjectStepDetails](docs/RunStepObjectStepDetails.md)
 - [RunToolCallObject](docs/RunToolCallObject.md)
 - [RunToolCallObjectFunction](docs/RunToolCallObjectFunction.md)
 - [SubmitToolOutputsRunRequest](docs/SubmitToolOutputsRunRequest.md)
 - [SubmitToolOutputsRunRequestToolOutputsInner](docs/SubmitToolOutputsRunRequestToolOutputsInner.md)
 - [ThreadObject](docs/ThreadObject.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
    <a id="ApiKeyAuth"></a>
    ### ApiKeyAuth


        - **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


