package tokyo.ainoya.openai.client.example;

import org.openapitools.client.model.*;
import tokyo.ainoya.openai.client.ApiClient;
import tokyo.ainoya.openai.client.ApiException;
import tokyo.ainoya.openai.client.Configuration;
import tokyo.ainoya.openai.client.auth.*;
import tokyo.ainoya.openai.client.api.ChatApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleChatApi {
    public static void main(String[] args) {
        // set timeout 60 seconds because openai chat completion api takes long time
        ApiClient defaultClient = Configuration.getDefaultApiClient().setReadTimeout(
                60 * 1000
        );
        defaultClient.setBasePath("https://api.openai.com/v1");

        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");

        // get openai api key from environment variable OPENAI_API_KEY
        ApiKeyAuth.setBearerToken(System.getenv("OPENAI_API_KEY"));


        ChatCompletionRequestUserMessageContent content = new ChatCompletionRequestUserMessageContent();

        content.setActualInstance("Hello");

        ChatCompletionRequestUserMessage uMsg = new ChatCompletionRequestUserMessage().content(
                content
        );


        ChatCompletionRequestMessage msg = new ChatCompletionRequestMessage();

        msg.setActualInstance(
                uMsg.role(ChatCompletionRequestUserMessage.RoleEnum.USER)
        );

        ChatApi apiInstance = new ChatApi(defaultClient);
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest()
                .model(CreateChatCompletionRequest.ModelEnum._3_5_TURBO)
                .messages(
                        Collections.singletonList(
                                msg
                        )
                );
        try {
            CreateChatCompletionResponse result = apiInstance.createChatCompletion(createChatCompletionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChatApi#createChatCompletion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
