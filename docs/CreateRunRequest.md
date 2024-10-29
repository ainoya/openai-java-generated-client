

# CreateRunRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. |  |
|**model** | [**ModelEnum**](#ModelEnum) |  |  [optional] |
|**instructions** | **String** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional] |
|**additionalInstructions** | **String** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. |  [optional] |
|**additionalMessages** | [**List&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. |  [optional] |
|**tools** | [**List&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional] |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |
|**temperature** | **BigDecimal** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional] |
|**topP** | **BigDecimal** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  |  [optional] |
|**stream** | **Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional] |
|**maxPromptTokens** | **Integer** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
|**maxCompletionTokens** | **Integer** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
|**truncationStrategy** | [**TruncationObject**](TruncationObject.md) |  |  [optional] |
|**toolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  [optional] |
|**parallelToolCalls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling/parallel-function-calling) during tool use. |  [optional] |
|**responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  [optional] |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| _4O | &quot;gpt-4o&quot; |
| _4O_2024_08_06 | &quot;gpt-4o-2024-08-06&quot; |
| _4O_2024_05_13 | &quot;gpt-4o-2024-05-13&quot; |
| _4O_2024_08_062 | &quot;gpt-4o-2024-08-06&quot; |
| _4O_MINI | &quot;gpt-4o-mini&quot; |
| _4O_MINI_2024_07_18 | &quot;gpt-4o-mini-2024-07-18&quot; |
| _4_TURBO | &quot;gpt-4-turbo&quot; |
| _4_TURBO_2024_04_09 | &quot;gpt-4-turbo-2024-04-09&quot; |
| _4_0125_PREVIEW | &quot;gpt-4-0125-preview&quot; |
| _4_TURBO_PREVIEW | &quot;gpt-4-turbo-preview&quot; |
| _4_1106_PREVIEW | &quot;gpt-4-1106-preview&quot; |
| _4_VISION_PREVIEW | &quot;gpt-4-vision-preview&quot; |
| _4 | &quot;gpt-4&quot; |
| _4_0314 | &quot;gpt-4-0314&quot; |
| _4_0613 | &quot;gpt-4-0613&quot; |
| _4_32K | &quot;gpt-4-32k&quot; |
| _4_32K_0314 | &quot;gpt-4-32k-0314&quot; |
| _4_32K_0613 | &quot;gpt-4-32k-0613&quot; |
| _3_5_TURBO | &quot;gpt-3.5-turbo&quot; |
| _3_5_TURBO_16K | &quot;gpt-3.5-turbo-16k&quot; |
| _3_5_TURBO_0613 | &quot;gpt-3.5-turbo-0613&quot; |
| _3_5_TURBO_1106 | &quot;gpt-3.5-turbo-1106&quot; |
| _3_5_TURBO_0125 | &quot;gpt-3.5-turbo-0125&quot; |
| _3_5_TURBO_16K_0613 | &quot;gpt-3.5-turbo-16k-0613&quot; |



