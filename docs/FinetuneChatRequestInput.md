

# FinetuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messages** | [**List&lt;FinetuneChatRequestInputMessagesInner&gt;**](FinetuneChatRequestInputMessagesInner.md) |  |  [optional] |
|**tools** | [**List&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. |  [optional] |
|**parallelToolCalls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling/parallel-function-calling) during tool use. |  [optional] |
|**functions** | [**List&lt;ChatCompletionFunctions&gt;**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. |  [optional] |



