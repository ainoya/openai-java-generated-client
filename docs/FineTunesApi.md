# FineTunesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFineTune**](FineTunesApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createFineTune**](FineTunesApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning)  |
| [**listFineTuneEvents**](FineTunesApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
| [**listFineTunes**](FineTunesApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs  |
| [**retrieveFineTune**](FineTunesApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning)  |


<a id="cancelFineTune"></a>
# **cancelFineTune**
> FineTune cancelFineTune(fineTuneId)

Immediately cancel a fine-tune job. 

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.FineTunesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FineTunesApi apiInstance = new FineTunesApi(defaultClient);
    String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F"; // String | The ID of the fine-tune job to cancel 
    try {
      FineTune result = apiInstance.cancelFineTune(fineTuneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FineTunesApi#cancelFineTune");
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
| **fineTuneId** | **String**| The ID of the fine-tune job to cancel  | |

### Return type

[**FineTune**](FineTune.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createFineTune"></a>
# **createFineTune**
> FineTune createFineTune(createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning) 

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.FineTunesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FineTunesApi apiInstance = new FineTunesApi(defaultClient);
    CreateFineTuneRequest createFineTuneRequest = new CreateFineTuneRequest(); // CreateFineTuneRequest | 
    try {
      FineTune result = apiInstance.createFineTune(createFineTuneRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FineTunesApi#createFineTune");
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
| **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | |

### Return type

[**FineTune**](FineTune.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFineTuneEvents"></a>
# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, stream)

Get fine-grained status updates for a fine-tune job. 

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.FineTunesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FineTunesApi apiInstance = new FineTunesApi(defaultClient);
    String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F"; // String | The ID of the fine-tune job to get events for. 
    Boolean stream = false; // Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
    try {
      ListFineTuneEventsResponse result = apiInstance.listFineTuneEvents(fineTuneId, stream);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FineTunesApi#listFineTuneEvents");
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
| **fineTuneId** | **String**| The ID of the fine-tune job to get events for.  | |
| **stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false] |

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFineTunes"></a>
# **listFineTunes**
> ListFineTunesResponse listFineTunes()

List your organization&#39;s fine-tuning jobs 

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.FineTunesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FineTunesApi apiInstance = new FineTunesApi(defaultClient);
    try {
      ListFineTunesResponse result = apiInstance.listFineTunes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FineTunesApi#listFineTunes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="retrieveFineTune"></a>
# **retrieveFineTune**
> FineTune retrieveFineTune(fineTuneId)

Gets info about the fine-tune job.  [Learn more about fine-tuning](/docs/guides/legacy-fine-tuning) 

### Example
```java
// Import classes:
import dev.ainoya.client.ApiClient;
import dev.ainoya.client.ApiException;
import dev.ainoya.client.Configuration;
import dev.ainoya.client.auth.*;
import dev.ainoya.client.models.*;
import tokyo.ainoya.openai.client.api.FineTunesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FineTunesApi apiInstance = new FineTunesApi(defaultClient);
    String fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F"; // String | The ID of the fine-tune job 
    try {
      FineTune result = apiInstance.retrieveFineTune(fineTuneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FineTunesApi#retrieveFineTune");
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
| **fineTuneId** | **String**| The ID of the fine-tune job  | |

### Return type

[**FineTune**](FineTune.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

