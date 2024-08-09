// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.authentication.oauth2.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.authentication.oauth2.OAuth2Client;
import com.authentication.oauth2.OAuth2ClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.utils.MockTokenCredential;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

class OAuth2ClientTestBase extends TestProxyTestBase {
    protected OAuth2Client oAuth2Client;

    @Override
    protected void beforeTest() {
        OAuth2ClientBuilder oAuth2Clientbuilder
            = new OAuth2ClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            oAuth2Clientbuilder.httpClient(interceptorManager.getPlaybackClient())
                .credential(new MockTokenCredential());
        } else if (getTestMode() == TestMode.RECORD) {
            oAuth2Clientbuilder.addPolicy(interceptorManager.getRecordPolicy())
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            oAuth2Clientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        oAuth2Client = oAuth2Clientbuilder.buildClient();

    }
}
