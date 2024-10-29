

# RealtimeClientEventConversationItemCreate

Send this event when adding an item to the conversation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | **String** | The event type, must be \&quot;conversation.item.create\&quot;. |  |
|**previousItemId** | **String** | The ID of the preceding item after which the new item will be inserted. |  [optional] |
|**item** | [**RealtimeClientEventConversationItemCreateItem**](RealtimeClientEventConversationItemCreateItem.md) |  |  |



