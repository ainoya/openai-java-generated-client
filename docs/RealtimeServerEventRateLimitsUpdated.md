

# RealtimeServerEventRateLimitsUpdated

Emitted after every \"response.done\" event to indicate the updated rate limits.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;rate_limits.updated\&quot;. |  |
|**rateLimits** | [**List&lt;RealtimeServerEventRateLimitsUpdatedRateLimitsInner&gt;**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. |  |



