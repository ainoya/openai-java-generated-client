

# RealtimeServerEventResponseOutputItemDone

Returned when an Item is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | **String** | The event type, must be \&quot;response.output_item.done\&quot;. |  |
|**responseId** | **String** | The ID of the response to which the item belongs. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**item** | [**RealtimeServerEventResponseOutputItemDoneItem**](RealtimeServerEventResponseOutputItemDoneItem.md) |  |  |



