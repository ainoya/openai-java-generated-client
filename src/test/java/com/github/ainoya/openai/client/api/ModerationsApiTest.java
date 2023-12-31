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


package com.github.ainoya.openai.client.api;

import com.github.ainoya.client.ApiException;
import com.github.ainoya.client.model.CreateModerationRequest;
import com.github.ainoya.client.model.CreateModerationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModerationsApi
 */
@Disabled
public class ModerationsApiTest {

    private final ModerationsApi api = new ModerationsApi();

    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createModerationTest() throws ApiException {
        CreateModerationRequest createModerationRequest = null;
        CreateModerationResponse response = api.createModeration(createModerationRequest);
        // TODO: test validations
    }

}
