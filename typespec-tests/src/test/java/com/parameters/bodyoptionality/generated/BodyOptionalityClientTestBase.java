// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.parameters.bodyoptionality.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import com.parameters.bodyoptionality.BodyOptionalityClient;
import com.parameters.bodyoptionality.BodyOptionalityClientBuilder;
import com.parameters.bodyoptionality.OptionalExplicitClient;

class BodyOptionalityClientTestBase extends TestProxyTestBase {
    protected BodyOptionalityClient bodyOptionalityClient;

    protected OptionalExplicitClient optionalExplicitClient;

    @Override
    protected void beforeTest() {
        BodyOptionalityClientBuilder bodyOptionalityClientbuilder = new BodyOptionalityClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
            .httpClient(HttpClient.createDefault())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            bodyOptionalityClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            bodyOptionalityClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        bodyOptionalityClient = bodyOptionalityClientbuilder.buildClient();

        BodyOptionalityClientBuilder optionalExplicitClientbuilder = new BodyOptionalityClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
            .httpClient(HttpClient.createDefault())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            optionalExplicitClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            optionalExplicitClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        optionalExplicitClient = optionalExplicitClientbuilder.buildOptionalExplicitClient();

    }
}
