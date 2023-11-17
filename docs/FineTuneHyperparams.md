

# FineTuneHyperparams

The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/legacy-fine-tuning/hyperparameters) for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchSize** | **Integer** | The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  |  |
|**classificationNClasses** | **Integer** | The number of classes to use for computing classification metrics.  |  [optional] |
|**classificationPositiveClass** | **String** | The positive class to use for computing classification metrics.  |  [optional] |
|**computeClassificationMetrics** | **Boolean** | The classification metrics to compute using the validation dataset at the end of every epoch.  |  [optional] |
|**learningRateMultiplier** | **BigDecimal** | The learning rate multiplier to use for training.  |  |
|**nEpochs** | **Integer** | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.  |  |
|**promptLossWeight** | **BigDecimal** | The weight to use for loss on the prompt tokens.  |  |



