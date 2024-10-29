

# RealtimeServerEventConversationItemCreatedItem

The item that was created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the item. |  [optional] |
|**_object** | **String** | The object type, must be \&quot;realtime.item\&quot;. |  [optional] |
|**type** | **String** | The type of the item (\&quot;message\&quot;, \&quot;function_call\&quot;, \&quot;function_call_output\&quot;). |  [optional] |
|**status** | **String** | The status of the item (\&quot;completed\&quot;, \&quot;in_progress\&quot;, \&quot;incomplete\&quot;). |  [optional] |
|**role** | **String** | The role associated with the item (\&quot;user\&quot;, \&quot;assistant\&quot;, \&quot;system\&quot;). |  [optional] |
|**content** | [**List&lt;RealtimeServerEventConversationItemCreatedItemContentInner&gt;**](RealtimeServerEventConversationItemCreatedItemContentInner.md) | The content of the item. |  [optional] |
|**callId** | **String** | The ID of the function call (for \&quot;function_call\&quot; items). |  [optional] |
|**name** | **String** | The name of the function being called. |  [optional] |
|**arguments** | **String** | The arguments of the function call. |  [optional] |
|**output** | **String** | The output of the function call (for \&quot;function_call_output\&quot; items). |  [optional] |



