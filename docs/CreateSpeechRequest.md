

# CreateSpeechRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  |  |
|**input** | **String** | The text to generate audio for. The maximum length is 4096 characters. |  |
|**voice** | [**VoiceEnum**](#VoiceEnum) | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. |  |
|**responseFormat** | [**ResponseFormatEnum**](#ResponseFormatEnum) | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, and &#x60;flac&#x60;. |  [optional] |
|**speed** | **BigDecimal** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. |  [optional] |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| ALLOY | &quot;alloy&quot; |
| ECHO | &quot;echo&quot; |
| FABLE | &quot;fable&quot; |
| ONYX | &quot;onyx&quot; |
| NOVA | &quot;nova&quot; |
| SHIMMER | &quot;shimmer&quot; |



## Enum: ResponseFormatEnum

| Name | Value |
|---- | -----|
| MP3 | &quot;mp3&quot; |
| OPUS | &quot;opus&quot; |
| AAC | &quot;aac&quot; |
| FLAC | &quot;flac&quot; |



