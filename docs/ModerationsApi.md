# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |


<a id="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text violates OpenAI&#39;s Content Policy

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.ModerationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ModerationsApi apiInstance = new ModerationsApi(defaultClient);
    CreateModerationRequest createModerationRequest = new CreateModerationRequest(); // CreateModerationRequest | 
    try {
      CreateModerationResponse result = apiInstance.createModeration(createModerationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationsApi#createModeration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

