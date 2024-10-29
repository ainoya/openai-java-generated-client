

# CreateChatCompletionRequestAudio

Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voice** | [**VoiceEnum**](#VoiceEnum) | Specifies the voice type. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;,  &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;.  |  |
|**format** | [**FormatEnum**](#FormatEnum) | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.   |  |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| ALLOY | &quot;alloy&quot; |
| ECHO | &quot;echo&quot; |
| FABLE | &quot;fable&quot; |
| ONYX | &quot;onyx&quot; |
| NOVA | &quot;nova&quot; |
| SHIMMER | &quot;shimmer&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |
| FLAC | &quot;flac&quot; |
| OPUS | &quot;opus&quot; |
| PCM16 | &quot;pcm16&quot; |



