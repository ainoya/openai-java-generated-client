# EditsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEdit**](EditsApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |


<a id="createEdit"></a>
# **createEdit**
> CreateEditResponse createEdit(createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```java
// Import classes:
import com.github.ainoya.client.ApiClient;
import com.github.ainoya.client.ApiException;
import com.github.ainoya.client.Configuration;
import com.github.ainoya.client.auth.*;
import com.github.ainoya.client.models.*;
import com.github.ainoya.openai.client.api.EditsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    EditsApi apiInstance = new EditsApi(defaultClient);
    CreateEditRequest createEditRequest = new CreateEditRequest(); // CreateEditRequest | 
    try {
      CreateEditResponse result = apiInstance.createEdit(createEditRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EditsApi#createEdit");
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
| **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  | |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

