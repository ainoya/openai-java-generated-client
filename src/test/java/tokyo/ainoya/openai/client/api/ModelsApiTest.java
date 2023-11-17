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

import dev.ainoya.client.ApiException;
import dev.ainoya.client.model.DeleteModelResponse;
import dev.ainoya.client.model.ListModelsResponse;
import dev.ainoya.client.model.Model;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelsApi
 */
@Disabled
public class ModelsApiTest {

    private final ModelsApi api = new ModelsApi();

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String model = null;
        DeleteModelResponse response = api.deleteModel(model);
        // TODO: test validations
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listModelsTest() throws ApiException {
        ListModelsResponse response = api.listModels();
        // TODO: test validations
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveModelTest() throws ApiException {
        String model = null;
        Model response = api.retrieveModel(model);
        // TODO: test validations
    }

}
