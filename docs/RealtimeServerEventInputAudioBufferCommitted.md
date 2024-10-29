

# RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or automatically in server VAD mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;input_audio_buffer.committed\&quot;. |  |
|**previousItemId** | **String** | The ID of the preceding item after which the new item will be inserted. |  |
|**itemId** | **String** | The ID of the user message item that will be created. |  |



