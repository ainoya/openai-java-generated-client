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

import tokyo.ainoya.openapi.client.ApiException;
import org.openapitools.client.model.CreateChatCompletionRequest;
import org.openapitools.client.model.CreateChatCompletionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChatApi
 */
@Disabled
public class ChatApiTest {

    private final ChatApi api = new ChatApi();

    /**
     * Creates a model response for the given chat conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createChatCompletionTest() throws ApiException {
        CreateChatCompletionRequest createChatCompletionRequest = null;
        CreateChatCompletionResponse response = api.createChatCompletion(createChatCompletionRequest);
        // TODO: test validations
    }

}