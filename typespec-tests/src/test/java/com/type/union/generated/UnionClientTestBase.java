// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import com.type.union.EnumsOnlyClient;
import com.type.union.FloatsOnlyClient;
import com.type.union.IntsOnlyClient;
import com.type.union.MixedLiteralsClient;
import com.type.union.MixedTypesClient;
import com.type.union.ModelsOnlyClient;
import com.type.union.StringAndArrayClient;
import com.type.union.StringExtensibleClient;
import com.type.union.StringExtensibleNamedClient;
import com.type.union.StringsOnlyClient;
import com.type.union.UnionClientBuilder;

class UnionClientTestBase extends TestProxyTestBase {
    protected StringsOnlyClient stringsOnlyClient;

    protected StringExtensibleClient stringExtensibleClient;

    protected StringExtensibleNamedClient stringExtensibleNamedClient;

    protected IntsOnlyClient intsOnlyClient;

    protected FloatsOnlyClient floatsOnlyClient;

    protected ModelsOnlyClient modelsOnlyClient;

    protected EnumsOnlyClient enumsOnlyClient;

    protected StringAndArrayClient stringAndArrayClient;

    protected MixedLiteralsClient mixedLiteralsClient;

    protected MixedTypesClient mixedTypesClient;

    @Override
    protected void beforeTest() {
        UnionClientBuilder stringsOnlyClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            stringsOnlyClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            stringsOnlyClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        stringsOnlyClient = stringsOnlyClientbuilder.buildStringsOnlyClient();

        UnionClientBuilder stringExtensibleClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            stringExtensibleClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            stringExtensibleClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        stringExtensibleClient = stringExtensibleClientbuilder.buildStringExtensibleClient();

        UnionClientBuilder stringExtensibleNamedClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            stringExtensibleNamedClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            stringExtensibleNamedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        stringExtensibleNamedClient = stringExtensibleNamedClientbuilder.buildStringExtensibleNamedClient();

        UnionClientBuilder intsOnlyClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            intsOnlyClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            intsOnlyClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        intsOnlyClient = intsOnlyClientbuilder.buildIntsOnlyClient();

        UnionClientBuilder floatsOnlyClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            floatsOnlyClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            floatsOnlyClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        floatsOnlyClient = floatsOnlyClientbuilder.buildFloatsOnlyClient();

        UnionClientBuilder modelsOnlyClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            modelsOnlyClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            modelsOnlyClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        modelsOnlyClient = modelsOnlyClientbuilder.buildModelsOnlyClient();

        UnionClientBuilder enumsOnlyClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            enumsOnlyClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            enumsOnlyClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        enumsOnlyClient = enumsOnlyClientbuilder.buildEnumsOnlyClient();

        UnionClientBuilder stringAndArrayClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            stringAndArrayClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            stringAndArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        stringAndArrayClient = stringAndArrayClientbuilder.buildStringAndArrayClient();

        UnionClientBuilder mixedLiteralsClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            mixedLiteralsClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            mixedLiteralsClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        mixedLiteralsClient = mixedLiteralsClientbuilder.buildMixedLiteralsClient();

        UnionClientBuilder mixedTypesClientbuilder
            = new UnionClientBuilder().endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            mixedTypesClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            mixedTypesClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        mixedTypesClient = mixedTypesClientbuilder.buildMixedTypesClient();

    }
}
