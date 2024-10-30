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

import com.github.ainoya.client.ApiException;
import com.github.ainoya.client.model.AuditLogEventType;
import com.github.ainoya.client.model.ListAuditLogsEffectiveAtParameter;
import com.github.ainoya.client.model.ListAuditLogsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditLogsApi
 */
@Disabled
public class AuditLogsApiTest {

    private final AuditLogsApi api = new AuditLogsApi();

    /**
     * List user actions and configuration changes within this organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAuditLogsTest() throws ApiException {
        ListAuditLogsEffectiveAtParameter effectiveAt = null;
        List<String> projectIds = null;
        List<AuditLogEventType> eventTypes = null;
        List<String> actorIds = null;
        List<String> actorEmails = null;
        List<String> resourceIds = null;
        Integer limit = null;
        String after = null;
        String before = null;
        ListAuditLogsResponse response = api.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
        // TODO: test validations
    }

}