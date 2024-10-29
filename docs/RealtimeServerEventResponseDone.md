

# RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the final state.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;response.done\&quot;. |  |
|**response** | [**RealtimeServerEventResponseDoneResponse**](RealtimeServerEventResponseDoneResponse.md) |  |  |



