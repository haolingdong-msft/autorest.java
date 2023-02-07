// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.server.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.cadl.server.ServerClient;
import com.cadl.server.ServerClientBuilder;

class ServerClientTestBase extends TestBase {
    protected ServerClient serverClient;

    @Override
    protected void beforeTest() {
        ServerClientBuilder serverClientbuilder =
                new ServerClientBuilder()
                        .domain(Configuration.getGlobalConfiguration().get("DOMAIN", "httpbin"))
                        .tld(Configuration.getGlobalConfiguration().get("TLD", "org"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            serverClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            serverClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        serverClient = serverClientbuilder.buildClient();
    }
}
