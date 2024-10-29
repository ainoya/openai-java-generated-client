

# RealtimeServerEventResponseOutputItemAdded

Returned when a new Item is created during response generation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;response.output_item.added\&quot;. |  |
|**responseId** | **String** | The ID of the response to which the item belongs. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**item** | [**RealtimeServerEventResponseOutputItemAddedItem**](RealtimeServerEventResponseOutputItemAddedItem.md) |  |  |



