

# ChatCompletionRequestFunctionMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | The role of the messages author, in this case &#x60;function&#x60;. |  |
|**content** | **String** | The return value from the function call, to return to the model. |  |
|**name** | **String** | The name of the function to call. |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |


## Implemented Interfaces

* ChatCompletionRequestMessage


