// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.resiliency.servicedriven1.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.resiliency.servicedriven1.ServiceDriven1Client;
import com.resiliency.servicedriven1.ServiceDriven1ClientBuilder;

class ServiceDriven1ClientTestBase extends TestBase {
    protected ServiceDriven1Client serviceDriven1Client;

    @Override
    protected void beforeTest() {
        ServiceDriven1ClientBuilder serviceDriven1Clientbuilder =
                new ServiceDriven1ClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            serviceDriven1Clientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            serviceDriven1Clientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        serviceDriven1Client = serviceDriven1Clientbuilder.buildClient();
    }
}