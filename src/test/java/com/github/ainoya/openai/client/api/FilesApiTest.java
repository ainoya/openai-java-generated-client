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
import com.github.ainoya.client.model.DeleteFileResponse;
import java.io.File;
import com.github.ainoya.client.model.ListFilesResponse;
import com.github.ainoya.client.model.OpenAIFile;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Disabled
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 100 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFileTest() throws ApiException {
        File _file = null;
        String purpose = null;
        OpenAIFile response = api.createFile(_file, purpose);
        // TODO: test validations
    }

    /**
     * Delete a file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        String fileId = null;
        DeleteFileResponse response = api.deleteFile(fileId);
        // TODO: test validations
    }

    /**
     * Returns the contents of the specified file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        String fileId = null;
        String response = api.downloadFile(fileId);
        // TODO: test validations
    }

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFilesTest() throws ApiException {
        String purpose = null;
        ListFilesResponse response = api.listFiles(purpose);
        // TODO: test validations
    }

    /**
     * Returns information about a specific file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveFileTest() throws ApiException {
        String fileId = null;
        OpenAIFile response = api.retrieveFile(fileId);
        // TODO: test validations
    }

}
