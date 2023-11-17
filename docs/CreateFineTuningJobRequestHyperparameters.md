

# CreateFineTuningJobRequestHyperparameters

The hyperparameters used for the fine-tuning job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchSize** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  |  [optional] |
|**learningRateMultiplier** | [**LearningRateMultiplierEnum**](#LearningRateMultiplierEnum) | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting.  |  [optional] |
|**nEpochs** | [**NEpochsEnum**](#NEpochsEnum) | The number of epochs to train the model for. An epoch refers to one full cycle  through the training dataset.  |  [optional] |



## Enum: LearningRateMultiplierEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



## Enum: NEpochsEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



