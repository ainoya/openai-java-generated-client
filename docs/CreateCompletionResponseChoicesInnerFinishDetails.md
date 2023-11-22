

# CreateCompletionResponseChoicesInnerFinishDetails

The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 

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
| CONTENT_FILTER | &quot;content_filter&quot; |



