

# RealtimeServerEventSessionCreatedSession

The session resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the session. |  [optional] |
|**_object** | **String** | The object type, must be \&quot;realtime.session\&quot;. |  [optional] |
|**model** | **String** | The default model used for this session. |  [optional] |
|**modalities** | **List&lt;String&gt;** | The set of modalities the model can respond with. |  [optional] |
|**instructions** | **String** | The default system instructions. |  [optional] |
|**voice** | **String** | The voice the model uses to respond - one of &#x60;alloy&#x60;, &#x60;echo&#x60;, or &#x60;shimmer&#x60;. |  [optional] |
|**inputAudioFormat** | **String** | The format of input audio. |  [optional] |
|**outputAudioFormat** | **String** | The format of output audio. |  [optional] |
|**inputAudioTranscription** | [**RealtimeServerEventSessionCreatedSessionInputAudioTranscription**](RealtimeServerEventSessionCreatedSessionInputAudioTranscription.md) |  |  [optional] |
|**turnDetection** | [**RealtimeServerEventSessionCreatedSessionTurnDetection**](RealtimeServerEventSessionCreatedSessionTurnDetection.md) |  |  [optional] |
|**tools** | [**List&lt;RealtimeClientEventResponseCreateResponseToolsInner&gt;**](RealtimeClientEventResponseCreateResponseToolsInner.md) | Tools (functions) available to the model. |  [optional] |
|**toolChoice** | **String** | How the model chooses tools. |  [optional] |
|**temperature** | **BigDecimal** | Sampling temperature. |  [optional] |
|**maxOutputTokens** | [**RealtimeServerEventSessionCreatedSessionMaxOutputTokens**](RealtimeServerEventSessionCreatedSessionMaxOutputTokens.md) |  |  [optional] |



