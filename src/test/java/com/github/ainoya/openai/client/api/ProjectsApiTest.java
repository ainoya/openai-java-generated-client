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
import com.github.ainoya.client.model.ErrorResponse;
import com.github.ainoya.client.model.Project;
import com.github.ainoya.client.model.ProjectApiKey;
import com.github.ainoya.client.model.ProjectApiKeyDeleteResponse;
import com.github.ainoya.client.model.ProjectApiKeyListResponse;
import com.github.ainoya.client.model.ProjectCreateRequest;
import com.github.ainoya.client.model.ProjectListResponse;
import com.github.ainoya.client.model.ProjectServiceAccount;
import com.github.ainoya.client.model.ProjectServiceAccountCreateRequest;
import com.github.ainoya.client.model.ProjectServiceAccountCreateResponse;
import com.github.ainoya.client.model.ProjectServiceAccountDeleteResponse;
import com.github.ainoya.client.model.ProjectServiceAccountListResponse;
import com.github.ainoya.client.model.ProjectUpdateRequest;
import com.github.ainoya.client.model.ProjectUser;
import com.github.ainoya.client.model.ProjectUserCreateRequest;
import com.github.ainoya.client.model.ProjectUserDeleteResponse;
import com.github.ainoya.client.model.ProjectUserListResponse;
import com.github.ainoya.client.model.ProjectUserUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveProjectTest() throws ApiException {
        String projectId = null;
        Project response = api.archiveProject(projectId);
        // TODO: test validations
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ProjectCreateRequest projectCreateRequest = null;
        Project response = api.createProject(projectCreateRequest);
        // TODO: test validations
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectServiceAccountTest() throws ApiException {
        String projectId = null;
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = null;
        ProjectServiceAccountCreateResponse response = api.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest);
        // TODO: test validations
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectUserTest() throws ApiException {
        String projectId = null;
        ProjectUserCreateRequest projectUserCreateRequest = null;
        ProjectUser response = api.createProjectUser(projectId, projectUserCreateRequest);
        // TODO: test validations
    }

    /**
     * Deletes an API key from the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectApiKeyTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        ProjectApiKeyDeleteResponse response = api.deleteProjectApiKey(projectId, keyId);
        // TODO: test validations
    }

    /**
     * Deletes a service account from the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectServiceAccountTest() throws ApiException {
        String projectId = null;
        String serviceAccountId = null;
        ProjectServiceAccountDeleteResponse response = api.deleteProjectServiceAccount(projectId, serviceAccountId);
        // TODO: test validations
    }

    /**
     * Deletes a user from the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectUserTest() throws ApiException {
        String projectId = null;
        String userId = null;
        ProjectUserDeleteResponse response = api.deleteProjectUser(projectId, userId);
        // TODO: test validations
    }

    /**
     * Returns a list of API keys in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectApiKeysTest() throws ApiException {
        String projectId = null;
        Integer limit = null;
        String after = null;
        ProjectApiKeyListResponse response = api.listProjectApiKeys(projectId, limit, after);
        // TODO: test validations
    }

    /**
     * Returns a list of service accounts in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectServiceAccountsTest() throws ApiException {
        String projectId = null;
        Integer limit = null;
        String after = null;
        ProjectServiceAccountListResponse response = api.listProjectServiceAccounts(projectId, limit, after);
        // TODO: test validations
    }

    /**
     * Returns a list of users in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectUsersTest() throws ApiException {
        String projectId = null;
        Integer limit = null;
        String after = null;
        ProjectUserListResponse response = api.listProjectUsers(projectId, limit, after);
        // TODO: test validations
    }

    /**
     * Returns a list of projects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectsTest() throws ApiException {
        Integer limit = null;
        String after = null;
        Boolean includeArchived = null;
        ProjectListResponse response = api.listProjects(limit, after, includeArchived);
        // TODO: test validations
    }

    /**
     * Modifies a project in the organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyProjectTest() throws ApiException {
        String projectId = null;
        ProjectUpdateRequest projectUpdateRequest = null;
        Project response = api.modifyProject(projectId, projectUpdateRequest);
        // TODO: test validations
    }

    /**
     * Modifies a user&#39;s role in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyProjectUserTest() throws ApiException {
        String projectId = null;
        String userId = null;
        ProjectUserUpdateRequest projectUserUpdateRequest = null;
        ProjectUser response = api.modifyProjectUser(projectId, userId, projectUserUpdateRequest);
        // TODO: test validations
    }

    /**
     * Retrieves a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveProjectTest() throws ApiException {
        String projectId = null;
        Project response = api.retrieveProject(projectId);
        // TODO: test validations
    }

    /**
     * Retrieves an API key in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveProjectApiKeyTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        ProjectApiKey response = api.retrieveProjectApiKey(projectId, keyId);
        // TODO: test validations
    }

    /**
     * Retrieves a service account in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveProjectServiceAccountTest() throws ApiException {
        String projectId = null;
        String serviceAccountId = null;
        ProjectServiceAccount response = api.retrieveProjectServiceAccount(projectId, serviceAccountId);
        // TODO: test validations
    }

    /**
     * Retrieves a user in the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveProjectUserTest() throws ApiException {
        String projectId = null;
        String userId = null;
        ProjectUser response = api.retrieveProjectUser(projectId, userId);
        // TODO: test validations
    }

}
