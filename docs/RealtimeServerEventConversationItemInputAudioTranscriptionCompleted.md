

# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

Returned when input audio transcription is enabled and a transcription succeeds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;conversation.item.input_audio_transcription.completed\&quot;. |  |
|**itemId** | **String** | The ID of the user message item. |  |
|**contentIndex** | **Integer** | The index of the content part containing the audio. |  |
|**transcript** | **String** | The transcribed text. |  |



