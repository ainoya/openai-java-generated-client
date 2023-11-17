

# CreateFineTuningJobRequestHyperparameters

The hyperparameters used for the fine-tuning job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchSize** | [**BatchSizeEnum**](#BatchSizeEnum) | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance.  |  [optional] |
|**learningRateMultiplier** | [**LearningRateMultiplierEnum**](#LearningRateMultiplierEnum) | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting.  |  [optional] |
|**nEpochs** | [**NEpochsEnum**](#NEpochsEnum) | The number of epochs to train the model for. An epoch refers to one full cycle  through the training dataset.  |  [optional] |



## Enum: BatchSizeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



## Enum: LearningRateMultiplierEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



## Enum: NEpochsEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



