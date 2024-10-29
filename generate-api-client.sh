#!/usr/bin/env bash
set -euo pipefail

# get version from 1st argument
RELEASE_VERSION=$1

# check if the version is set
if [ -z "$RELEASE_VERSION" ]; then
    echo "Usage: $0 <version>"
    exit 1
fi

docker run --rm -v "${PWD}":/local openapitools/openapi-generator-cli:v7.9.0 generate \
    -i /local/openapi.yaml --template-dir=/local/custom_template \
    -g java \
    --additional-properties=disallowAdditionalPropertiesIfNotPresent=false,artifactId=openai-java-generated-client,groupId=com.github.ainoya,invokerPackage=com.github.ainoya.client,modelPackage=com.github.ainoya.client.model,developmerName="Naoki Ainoya",developerEmail="ainonic@gmail.com",developerOrganization="ainoya.dev",developerOrganizationUrl="https://ainoya.dev",artifactVersion="${RELEASE_VERSION}" \
    --api-package com.github.ainoya.openai.client.api \
    -o /local/ && ./gradlew test
