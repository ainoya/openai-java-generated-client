

# RealtimeClientEventConversationItemTruncate

Send this event when you want to truncate a previous assistant message’s audio.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | **String** | The event type, must be \&quot;conversation.item.truncate\&quot;. |  |
|**itemId** | **String** | The ID of the assistant message item to truncate. |  |
|**contentIndex** | **Integer** | The index of the content part to truncate. |  |
|**audioEndMs** | **Integer** | Inclusive duration up to which audio is truncated, in milliseconds. |  |



