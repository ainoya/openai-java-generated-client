/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tokyo.ainoya.openai.client.api;

import tokyo.ainoya.openai.client.ApiCallback;
import tokyo.ainoya.openai.client.ApiClient;
import tokyo.ainoya.openai.client.ApiException;
import tokyo.ainoya.openai.client.ApiResponse;
import tokyo.ainoya.openai.client.Configuration;
import tokyo.ainoya.openai.client.Pair;
import tokyo.ainoya.openai.client.ProgressRequestBody;
import tokyo.ainoya.openai.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreateFineTuningJobRequest;
import org.openapitools.client.model.FineTuningJob;
import org.openapitools.client.model.ListFineTuningJobEventsResponse;
import org.openapitools.client.model.ListPaginatedFineTuningJobsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FineTuningApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FineTuningApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FineTuningApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for cancelFineTuningJob
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelFineTuningJobCall(String fineTuningJobId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fine_tuning/jobs/{fine_tuning_job_id}/cancel"
            .replace("{" + "fine_tuning_job_id" + "}", localVarApiClient.escapeString(fineTuningJobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelFineTuningJobValidateBeforeCall(String fineTuningJobId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new ApiException("Missing the required parameter 'fineTuningJobId' when calling cancelFineTuningJob(Async)");
        }

        return cancelFineTuningJobCall(fineTuningJobId, _callback);

    }

    /**
     * Immediately cancel a fine-tune job. 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return FineTuningJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FineTuningJob cancelFineTuningJob(String fineTuningJobId) throws ApiException {
        ApiResponse<FineTuningJob> localVarResp = cancelFineTuningJobWithHttpInfo(fineTuningJobId);
        return localVarResp.getData();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return ApiResponse&lt;FineTuningJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FineTuningJob> cancelFineTuningJobWithHttpInfo(String fineTuningJobId) throws ApiException {
        okhttp3.Call localVarCall = cancelFineTuningJobValidateBeforeCall(fineTuningJobId, null);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Immediately cancel a fine-tune job.  (asynchronously)
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelFineTuningJobAsync(String fineTuningJobId, final ApiCallback<FineTuningJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelFineTuningJobValidateBeforeCall(fineTuningJobId, _callback);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createFineTuningJob
     * @param createFineTuningJobRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFineTuningJobCall(CreateFineTuningJobRequest createFineTuningJobRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createFineTuningJobRequest;

        // create path and map variables
        String localVarPath = "/fine_tuning/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createFineTuningJobValidateBeforeCall(CreateFineTuningJobRequest createFineTuningJobRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createFineTuningJobRequest' is set
        if (createFineTuningJobRequest == null) {
            throw new ApiException("Missing the required parameter 'createFineTuningJobRequest' when calling createFineTuningJob(Async)");
        }

        return createFineTuningJobCall(createFineTuningJobRequest, _callback);

    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * @param createFineTuningJobRequest  (required)
     * @return FineTuningJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FineTuningJob createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest) throws ApiException {
        ApiResponse<FineTuningJob> localVarResp = createFineTuningJobWithHttpInfo(createFineTuningJobRequest);
        return localVarResp.getData();
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * @param createFineTuningJobRequest  (required)
     * @return ApiResponse&lt;FineTuningJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FineTuningJob> createFineTuningJobWithHttpInfo(CreateFineTuningJobRequest createFineTuningJobRequest) throws ApiException {
        okhttp3.Call localVarCall = createFineTuningJobValidateBeforeCall(createFineTuningJobRequest, null);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  (asynchronously)
     * 
     * @param createFineTuningJobRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFineTuningJobAsync(CreateFineTuningJobRequest createFineTuningJobRequest, final ApiCallback<FineTuningJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFineTuningJobValidateBeforeCall(createFineTuningJobRequest, _callback);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listFineTuningEvents
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFineTuningEventsCall(String fineTuningJobId, String after, Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fine_tuning/jobs/{fine_tuning_job_id}/events"
            .replace("{" + "fine_tuning_job_id" + "}", localVarApiClient.escapeString(fineTuningJobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listFineTuningEventsValidateBeforeCall(String fineTuningJobId, String after, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new ApiException("Missing the required parameter 'fineTuningJobId' when calling listFineTuningEvents(Async)");
        }

        return listFineTuningEventsCall(fineTuningJobId, after, limit, _callback);

    }

    /**
     * Get status updates for a fine-tuning job. 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ListFineTuningJobEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListFineTuningJobEventsResponse listFineTuningEvents(String fineTuningJobId, String after, Integer limit) throws ApiException {
        ApiResponse<ListFineTuningJobEventsResponse> localVarResp = listFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit);
        return localVarResp.getData();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ApiResponse&lt;ListFineTuningJobEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListFineTuningJobEventsResponse> listFineTuningEventsWithHttpInfo(String fineTuningJobId, String after, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listFineTuningEventsValidateBeforeCall(fineTuningJobId, after, limit, null);
        Type localVarReturnType = new TypeToken<ListFineTuningJobEventsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get status updates for a fine-tuning job.  (asynchronously)
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFineTuningEventsAsync(String fineTuningJobId, String after, Integer limit, final ApiCallback<ListFineTuningJobEventsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFineTuningEventsValidateBeforeCall(fineTuningJobId, after, limit, _callback);
        Type localVarReturnType = new TypeToken<ListFineTuningJobEventsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPaginatedFineTuningJobs
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaginatedFineTuningJobsCall(String after, Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fine_tuning/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPaginatedFineTuningJobsValidateBeforeCall(String after, Integer limit, final ApiCallback _callback) throws ApiException {
        return listPaginatedFineTuningJobsCall(after, limit, _callback);

    }

    /**
     * List your organization&#39;s fine-tuning jobs 
     * 
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return ListPaginatedFineTuningJobsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(String after, Integer limit) throws ApiException {
        ApiResponse<ListPaginatedFineTuningJobsResponse> localVarResp = listPaginatedFineTuningJobsWithHttpInfo(after, limit);
        return localVarResp.getData();
    }

    /**
     * List your organization&#39;s fine-tuning jobs 
     * 
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return ApiResponse&lt;ListPaginatedFineTuningJobsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListPaginatedFineTuningJobsResponse> listPaginatedFineTuningJobsWithHttpInfo(String after, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listPaginatedFineTuningJobsValidateBeforeCall(after, limit, null);
        Type localVarReturnType = new TypeToken<ListPaginatedFineTuningJobsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List your organization&#39;s fine-tuning jobs  (asynchronously)
     * 
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaginatedFineTuningJobsAsync(String after, Integer limit, final ApiCallback<ListPaginatedFineTuningJobsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaginatedFineTuningJobsValidateBeforeCall(after, limit, _callback);
        Type localVarReturnType = new TypeToken<ListPaginatedFineTuningJobsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveFineTuningJob
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveFineTuningJobCall(String fineTuningJobId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fine_tuning/jobs/{fine_tuning_job_id}"
            .replace("{" + "fine_tuning_job_id" + "}", localVarApiClient.escapeString(fineTuningJobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveFineTuningJobValidateBeforeCall(String fineTuningJobId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new ApiException("Missing the required parameter 'fineTuningJobId' when calling retrieveFineTuningJob(Async)");
        }

        return retrieveFineTuningJobCall(fineTuningJobId, _callback);

    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return FineTuningJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FineTuningJob retrieveFineTuningJob(String fineTuningJobId) throws ApiException {
        ApiResponse<FineTuningJob> localVarResp = retrieveFineTuningJobWithHttpInfo(fineTuningJobId);
        return localVarResp.getData();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return ApiResponse&lt;FineTuningJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FineTuningJob> retrieveFineTuningJobWithHttpInfo(String fineTuningJobId) throws ApiException {
        okhttp3.Call localVarCall = retrieveFineTuningJobValidateBeforeCall(fineTuningJobId, null);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  (asynchronously)
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveFineTuningJobAsync(String fineTuningJobId, final ApiCallback<FineTuningJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveFineTuningJobValidateBeforeCall(fineTuningJobId, _callback);
        Type localVarReturnType = new TypeToken<FineTuningJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
