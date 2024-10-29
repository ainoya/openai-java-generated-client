

# RealtimeServerEventInputAudioBufferSpeechStarted

Returned in server turn detection mode when speech is detected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;input_audio_buffer.speech_started\&quot;. |  |
|**audioStartMs** | **Integer** | Milliseconds since the session started when speech was detected. |  |
|**itemId** | **String** | The ID of the user message item that will be created when speech stops. |  |



