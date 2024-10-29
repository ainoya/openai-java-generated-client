

# AssistantObject

Represents an `assistant` that can call the model and use tools.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;assistant&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the assistant was created. |  |
|**name** | **String** | The name of the assistant. The maximum length is 256 characters.  |  |
|**description** | **String** | The description of the assistant. The maximum length is 512 characters.  |  |
|**model** | **String** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  |  |
|**instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  |  |
|**tools** | [**List&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  |  |
|**toolResources** | [**AssistantObjectToolResources**](AssistantObjectToolResources.md) |  |  [optional] |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
|**temperature** | **BigDecimal** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional] |
|**topP** | **BigDecimal** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  |  [optional] |
|**responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ASSISTANT | &quot;assistant&quot; |



