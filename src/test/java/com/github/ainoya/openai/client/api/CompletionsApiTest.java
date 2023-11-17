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
import com.github.ainoya.client.model.CreateCompletionRequest;
import com.github.ainoya.client.model.CreateCompletionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompletionsApi
 */
@Disabled
public class CompletionsApiTest {

    private final CompletionsApi api = new CompletionsApi();

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCompletionTest() throws ApiException {
        CreateCompletionRequest createCompletionRequest = null;
        CreateCompletionResponse response = api.createCompletion(createCompletionRequest);
        // TODO: test validations
    }

}