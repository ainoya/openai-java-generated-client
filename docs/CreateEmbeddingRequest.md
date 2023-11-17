

# CreateEmbeddingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  |  |
|**model** | [**ModelEnum**](#ModelEnum) |  |  |
|**encodingFormat** | [**EncodingFormatEnum**](#EncodingFormatEnum) | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). |  [optional] |
|**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional] |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| TEXT_EMBEDDING_ADA_002 | &quot;text-embedding-ada-002&quot; |



## Enum: EncodingFormatEnum

| Name | Value |
|---- | -----|
| FLOAT | &quot;float&quot; |
| BASE64 | &quot;base64&quot; |



