

# RealtimeClientEventResponseCreateResponse

Configuration for the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modalities** | **List&lt;String&gt;** | The modalities for the response. |  [optional] |
|**instructions** | **String** | Instructions for the model. |  [optional] |
|**voice** | **String** | The voice the model uses to respond - one of &#x60;alloy&#x60;, &#x60;echo&#x60;, or &#x60;shimmer&#x60;. |  [optional] |
|**outputAudioFormat** | **String** | The format of output audio. |  [optional] |
|**tools** | [**List&lt;RealtimeClientEventResponseCreateResponseToolsInner&gt;**](RealtimeClientEventResponseCreateResponseToolsInner.md) | Tools (functions) available to the model. |  [optional] |
|**toolChoice** | **String** | How the model chooses tools. |  [optional] |
|**temperature** | **BigDecimal** | Sampling temperature. |  [optional] |
|**maxOutputTokens** | [**RealtimeClientEventResponseCreateResponseMaxOutputTokens**](RealtimeClientEventResponseCreateResponseMaxOutputTokens.md) |  |  [optional] |



