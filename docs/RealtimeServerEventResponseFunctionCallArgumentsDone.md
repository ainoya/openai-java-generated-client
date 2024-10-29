

# RealtimeServerEventResponseFunctionCallArgumentsDone

Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;response.function_call_arguments.done\&quot;. |  |
|**responseId** | **String** | The ID of the response. |  |
|**itemId** | **String** | The ID of the function call item. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**callId** | **String** | The ID of the function call. |  |
|**arguments** | **String** | The final arguments as a JSON string. |  |



