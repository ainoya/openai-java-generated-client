

# CreateChatCompletionFunctionResponseChoicesInnerFinishDetails

The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**stop** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STOP | &quot;stop&quot; |
| LENGTH | &quot;length&quot; |
| FUNCTION_CALL | &quot;function_call&quot; |
| CONTENT_FILTER | &quot;content_filter&quot; |


