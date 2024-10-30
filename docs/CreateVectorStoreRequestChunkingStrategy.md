

# CreateVectorStoreRequestChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;auto&#x60;. |  |
|**_static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| STATIC | &quot;static&quot; |


