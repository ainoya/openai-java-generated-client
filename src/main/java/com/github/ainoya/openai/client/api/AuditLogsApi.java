/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.ainoya.openai.client.api;

import com.github.ainoya.client.ApiCallback;
import com.github.ainoya.client.ApiClient;
import com.github.ainoya.client.ApiException;
import com.github.ainoya.client.ApiResponse;
import com.github.ainoya.client.Configuration;
import com.github.ainoya.client.Pair;
import com.github.ainoya.client.ProgressRequestBody;
import com.github.ainoya.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.ainoya.client.model.AuditLogEventType;
import com.github.ainoya.client.model.ListAuditLogsEffectiveAtParameter;
import com.github.ainoya.client.model.ListAuditLogsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditLogsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuditLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditLogsApi(ApiClient apiClient) {
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
     * Build call for listAuditLogs
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Audit logs listed successfully. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAuditLogsCall(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/organization/audit_logs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effective_at", effectiveAt));
        }

        if (projectIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "project_ids[]", projectIds));
        }

        if (eventTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "event_types[]", eventTypes));
        }

        if (actorIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "actor_ids[]", actorIds));
        }

        if (actorEmails != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "actor_emails[]", actorEmails));
        }

        if (resourceIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "resource_ids[]", resourceIds));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

        if (before != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("before", before));
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
    private okhttp3.Call listAuditLogsValidateBeforeCall(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before, final ApiCallback _callback) throws ApiException {
        return listAuditLogsCall(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, _callback);

    }

    /**
     * List user actions and configuration changes within this organization.
     * 
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAuditLogsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Audit logs listed successfully. </td><td>  -  </td></tr>
     </table>
     */
    public ListAuditLogsResponse listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws ApiException {
        ApiResponse<ListAuditLogsResponse> localVarResp = listAuditLogsWithHttpInfo(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
        return localVarResp.getData();
    }

    /**
     * List user actions and configuration changes within this organization.
     * 
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ApiResponse&lt;ListAuditLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Audit logs listed successfully. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListAuditLogsResponse> listAuditLogsWithHttpInfo(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws ApiException {
        okhttp3.Call localVarCall = listAuditLogsValidateBeforeCall(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, null);
        Type localVarReturnType = new TypeToken<ListAuditLogsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List user actions and configuration changes within this organization. (asynchronously)
     * 
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Audit logs listed successfully. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAuditLogsAsync(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before, final ApiCallback<ListAuditLogsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAuditLogsValidateBeforeCall(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, _callback);
        Type localVarReturnType = new TypeToken<ListAuditLogsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
