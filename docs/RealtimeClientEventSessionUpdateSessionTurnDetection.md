

# RealtimeClientEventSessionUpdateSessionTurnDetection

Configuration for turn detection. Can be set to `null` to turn off.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of turn detection, only \&quot;server_vad\&quot; is currently supported. |  [optional] |
|**threshold** | **BigDecimal** | Activation threshold for VAD (0.0 to 1.0). |  [optional] |
|**prefixPaddingMs** | **Integer** | Amount of audio to include before speech starts (in milliseconds). |  [optional] |
|**silenceDurationMs** | **Integer** | Duration of silence to detect speech stop (in milliseconds). |  [optional] |



