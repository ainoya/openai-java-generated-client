

# MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.message&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the message was created. |  |
|**threadId** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. |  |
|**role** | [**RoleEnum**](#RoleEnum) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  |
|**content** | [**List&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. |  |
|**assistantId** | **String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. |  |
|**runId** | **String** | If applicable, the ID of the [run](/docs/api-reference/runs) associated with the authoring of this message. |  |
|**fileIds** | **List&lt;String&gt;** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. |  |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD_MESSAGE | &quot;thread.message&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |



