

# FineTuningJobHyperparameters

The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nEpochs** | [**NEpochsEnum**](#NEpochsEnum) | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \&quot;auto\&quot; decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs. |  |



## Enum: NEpochsEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



