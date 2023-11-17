# AssistantApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modifyAssistant**](AssistantApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |


<a id="modifyAssistant"></a>
# **modifyAssistant**
> AssistantObject modifyAssistant(assistantId, modifyAssistantRequest)

Modifies an assistant.

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.AssistantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    AssistantApi apiInstance = new AssistantApi(defaultClient);
    String assistantId = "assistantId_example"; // String | The ID of the assistant to modify.
    ModifyAssistantRequest modifyAssistantRequest = new ModifyAssistantRequest(); // ModifyAssistantRequest | 
    try {
      AssistantObject result = apiInstance.modifyAssistant(assistantId, modifyAssistantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssistantApi#modifyAssistant");
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
| **assistantId** | **String**| The ID of the assistant to modify. | |
| **modifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  | |

### Return type

[**AssistantObject**](AssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

