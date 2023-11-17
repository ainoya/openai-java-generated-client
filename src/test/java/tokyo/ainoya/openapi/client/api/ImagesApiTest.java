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
import org.openapitools.client.model.CreateImageEditRequestModel;
import org.openapitools.client.model.CreateImageRequest;
import java.io.File;
import org.openapitools.client.model.ImagesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImagesApi
 */
@Disabled
public class ImagesApiTest {

    private final ImagesApi api = new ImagesApi();

    /**
     * Creates an image given a prompt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createImageTest() throws ApiException {
        CreateImageRequest createImageRequest = null;
        ImagesResponse response = api.createImage(createImageRequest);
        // TODO: test validations
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createImageEditTest() throws ApiException {
        File image = null;
        String prompt = null;
        File mask = null;
        CreateImageEditRequestModel model = null;
        Integer n = null;
        String size = null;
        String responseFormat = null;
        String user = null;
        ImagesResponse response = api.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user);
        // TODO: test validations
    }

    /**
     * Creates a variation of a given image.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createImageVariationTest() throws ApiException {
        File image = null;
        String model = null;
        Integer n = null;
        String responseFormat = null;
        String size = null;
        String user = null;
        ImagesResponse response = api.createImageVariation(image, model, n, responseFormat, size, user);
        // TODO: test validations
    }

}
