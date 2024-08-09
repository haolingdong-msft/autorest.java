// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.enumdiscriminator.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import com.type.model.inheritance.enumdiscriminator.EnumDiscriminatorClient;
import com.type.model.inheritance.enumdiscriminator.EnumDiscriminatorClientBuilder;

class EnumDiscriminatorClientTestBase extends TestProxyTestBase {
    protected EnumDiscriminatorClient enumDiscriminatorClient;

    @Override
    protected void beforeTest() {
        EnumDiscriminatorClientBuilder enumDiscriminatorClientbuilder = new EnumDiscriminatorClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
            .httpClient(HttpClient.createDefault())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            enumDiscriminatorClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            enumDiscriminatorClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        enumDiscriminatorClient = enumDiscriminatorClientbuilder.buildClient();

    }
}
