

# FunctionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of what the function does, used by the model to choose when and how to call the function. |  [optional] |
|**name** | **String** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. |  |
|**parameters** | **Map&lt;String, Object&gt;** | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.  To describe a function that accepts no parameters, provide the value &#x60;{\&quot;type\&quot;: \&quot;object\&quot;, \&quot;properties\&quot;: {}}&#x60;. |  |



