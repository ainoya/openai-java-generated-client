

# RealtimeClientEventSessionUpdateSession

Session configuration to update.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modalities** | **List&lt;String&gt;** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. |  [optional] |
|**instructions** | **String** | The default system instructions prepended to model calls. |  [optional] |
|**voice** | **String** | The voice the model uses to respond - one of &#x60;alloy&#x60;, &#x60;echo&#x60;, or  &#x60;shimmer&#x60;. Cannot be changed once the model has responded with audio  at least once. |  [optional] |
|**inputAudioFormat** | **String** | The format of input audio. Options are \&quot;pcm16\&quot;, \&quot;g711_ulaw\&quot;, or \&quot;g711_alaw\&quot;. |  [optional] |
|**outputAudioFormat** | **String** | The format of output audio. Options are \&quot;pcm16\&quot;, \&quot;g711_ulaw\&quot;, or \&quot;g711_alaw\&quot;. |  [optional] |
|**inputAudioTranscription** | [**RealtimeClientEventSessionUpdateSessionInputAudioTranscription**](RealtimeClientEventSessionUpdateSessionInputAudioTranscription.md) |  |  [optional] |
|**turnDetection** | [**RealtimeClientEventSessionUpdateSessionTurnDetection**](RealtimeClientEventSessionUpdateSessionTurnDetection.md) |  |  [optional] |
|**tools** | [**List&lt;RealtimeClientEventSessionUpdateSessionToolsInner&gt;**](RealtimeClientEventSessionUpdateSessionToolsInner.md) | Tools (functions) available to the model. |  [optional] |
|**toolChoice** | **String** | How the model chooses tools. Options are \&quot;auto\&quot;, \&quot;none\&quot;, \&quot;required\&quot;, or specify a function. |  [optional] |
|**temperature** | **BigDecimal** | Sampling temperature for the model. |  [optional] |
|**maxOutputTokens** | [**RealtimeClientEventResponseCreateResponseMaxOutputTokens**](RealtimeClientEventResponseCreateResponseMaxOutputTokens.md) |  |  [optional] |



