

# RealtimeServerEventConversationItemTruncated

Returned when an earlier assistant audio message item is truncated by the client.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;conversation.item.truncated\&quot;. |  |
|**itemId** | **String** | The ID of the assistant message item that was truncated. |  |
|**contentIndex** | **Integer** | The index of the content part that was truncated. |  |
|**audioEndMs** | **Integer** | The duration up to which the audio was truncated, in milliseconds. |  |



