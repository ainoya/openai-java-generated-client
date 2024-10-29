

# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

Returned when input audio transcription is configured, and a transcription request for a user message failed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;conversation.item.input_audio_transcription.failed\&quot;. |  |
|**itemId** | **String** | The ID of the user message item. |  |
|**contentIndex** | **Integer** | The index of the content part containing the audio. |  |
|**error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  |  |



