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


package tokyo.ainoya.openapi.client.api;

import tokyo.ainoya.openapi.client.ApiCallback;
import tokyo.ainoya.openapi.client.ApiClient;
import tokyo.ainoya.openapi.client.ApiException;
import tokyo.ainoya.openapi.client.ApiResponse;
import tokyo.ainoya.openapi.client.Configuration;
import tokyo.ainoya.openapi.client.Pair;
import tokyo.ainoya.openapi.client.ProgressRequestBody;
import tokyo.ainoya.openapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreateImageEditRequestModel;
import org.openapitools.client.model.CreateImageRequest;
import java.io.File;
import org.openapitools.client.model.ImagesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ImagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImagesApi(ApiClient apiClient) {
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
     * Build call for createImage
     * @param createImageRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageCall(CreateImageRequest createImageRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createImageRequest;

        // create path and map variables
        String localVarPath = "/images/generations";

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
    private okhttp3.Call createImageValidateBeforeCall(CreateImageRequest createImageRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createImageRequest' is set
        if (createImageRequest == null) {
            throw new ApiException("Missing the required parameter 'createImageRequest' when calling createImage(Async)");
        }

        return createImageCall(createImageRequest, _callback);

    }

    /**
     * Creates an image given a prompt.
     * 
     * @param createImageRequest  (required)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ImagesResponse createImage(CreateImageRequest createImageRequest) throws ApiException {
        ApiResponse<ImagesResponse> localVarResp = createImageWithHttpInfo(createImageRequest);
        return localVarResp.getData();
    }

    /**
     * Creates an image given a prompt.
     * 
     * @param createImageRequest  (required)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesResponse> createImageWithHttpInfo(CreateImageRequest createImageRequest) throws ApiException {
        okhttp3.Call localVarCall = createImageValidateBeforeCall(createImageRequest, null);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates an image given a prompt. (asynchronously)
     * 
     * @param createImageRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageAsync(CreateImageRequest createImageRequest, final ApiCallback<ImagesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createImageValidateBeforeCall(createImageRequest, _callback);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createImageEdit
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageEditCall(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/images/edits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (image != null) {
            localVarFormParams.put("image", image);
        }

        if (prompt != null) {
            localVarFormParams.put("prompt", prompt);
        }

        if (mask != null) {
            localVarFormParams.put("mask", mask);
        }

        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (n != null) {
            localVarFormParams.put("n", n);
        }

        if (size != null) {
            localVarFormParams.put("size", size);
        }

        if (responseFormat != null) {
            localVarFormParams.put("response_format", responseFormat);
        }

        if (user != null) {
            localVarFormParams.put("user", user);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createImageEditValidateBeforeCall(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new ApiException("Missing the required parameter 'image' when calling createImageEdit(Async)");
        }

        // verify the required parameter 'prompt' is set
        if (prompt == null) {
            throw new ApiException("Missing the required parameter 'prompt' when calling createImageEdit(Async)");
        }

        return createImageEditCall(image, prompt, mask, model, n, size, responseFormat, user, _callback);

    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ImagesResponse createImageEdit(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) throws ApiException {
        ApiResponse<ImagesResponse> localVarResp = createImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user);
        return localVarResp.getData();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesResponse> createImageEditWithHttpInfo(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) throws ApiException {
        okhttp3.Call localVarCall = createImageEditValidateBeforeCall(image, prompt, mask, model, n, size, responseFormat, user, null);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates an edited or extended image given an original image and a prompt. (asynchronously)
     * 
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageEditAsync(File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, final ApiCallback<ImagesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createImageEditValidateBeforeCall(image, prompt, mask, model, n, size, responseFormat, user, _callback);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createImageVariation
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageVariationCall(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/images/variations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (image != null) {
            localVarFormParams.put("image", image);
        }

        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (n != null) {
            localVarFormParams.put("n", n);
        }

        if (responseFormat != null) {
            localVarFormParams.put("response_format", responseFormat);
        }

        if (size != null) {
            localVarFormParams.put("size", size);
        }

        if (user != null) {
            localVarFormParams.put("user", user);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createImageVariationValidateBeforeCall(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new ApiException("Missing the required parameter 'image' when calling createImageVariation(Async)");
        }

        return createImageVariationCall(image, model, n, responseFormat, size, user, _callback);

    }

    /**
     * Creates a variation of a given image.
     * 
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ImagesResponse createImageVariation(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) throws ApiException {
        ApiResponse<ImagesResponse> localVarResp = createImageVariationWithHttpInfo(image, model, n, responseFormat, size, user);
        return localVarResp.getData();
    }

    /**
     * Creates a variation of a given image.
     * 
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesResponse> createImageVariationWithHttpInfo(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) throws ApiException {
        okhttp3.Call localVarCall = createImageVariationValidateBeforeCall(image, model, n, responseFormat, size, user, null);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a variation of a given image. (asynchronously)
     * 
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to \&quot;dall-e-2\&quot;)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to \&quot;url\&quot;)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to \&quot;1024x1024\&quot;)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createImageVariationAsync(File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, final ApiCallback<ImagesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createImageVariationValidateBeforeCall(image, model, n, responseFormat, size, user, _callback);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
