

# RealtimeServerEventResponseOutputItemAddedItem

The item that was added.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the item. |  [optional] |
|**_object** | **String** | The object type, must be \&quot;realtime.item\&quot;. |  [optional] |
|**type** | **String** | The type of the item (\&quot;message\&quot;, \&quot;function_call\&quot;, \&quot;function_call_output\&quot;). |  [optional] |
|**status** | **String** | The status of the item (\&quot;in_progress\&quot;, \&quot;completed\&quot;). |  [optional] |
|**role** | **String** | The role associated with the item (\&quot;assistant\&quot;). |  [optional] |
|**content** | [**List&lt;RealtimeServerEventResponseOutputItemAddedItemContentInner&gt;**](RealtimeServerEventResponseOutputItemAddedItemContentInner.md) | The content of the item. |  [optional] |



