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


import org.openapitools.client.model.CreateEditRequest;
import org.openapitools.client.model.CreateEditResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EditsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EditsApi(ApiClient apiClient) {
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
     * Build call for createEdit
     * @param createEditRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call createEditCall(CreateEditRequest createEditRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createEditRequest;

        // create path and map variables
        String localVarPath = "/edits";

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createEditValidateBeforeCall(CreateEditRequest createEditRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createEditRequest' is set
        if (createEditRequest == null) {
            throw new ApiException("Missing the required parameter 'createEditRequest' when calling createEdit(Async)");
        }

        return createEditCall(createEditRequest, _callback);

    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * 
     * @param createEditRequest  (required)
     * @return CreateEditResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public CreateEditResponse createEdit(CreateEditRequest createEditRequest) throws ApiException {
        ApiResponse<CreateEditResponse> localVarResp = createEditWithHttpInfo(createEditRequest);
        return localVarResp.getData();
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * 
     * @param createEditRequest  (required)
     * @return ApiResponse&lt;CreateEditResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<CreateEditResponse> createEditWithHttpInfo(CreateEditRequest createEditRequest) throws ApiException {
        okhttp3.Call localVarCall = createEditValidateBeforeCall(createEditRequest, null);
        Type localVarReturnType = new TypeToken<CreateEditResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters. (asynchronously)
     * 
     * @param createEditRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call createEditAsync(CreateEditRequest createEditRequest, final ApiCallback<CreateEditResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEditValidateBeforeCall(createEditRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateEditResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
