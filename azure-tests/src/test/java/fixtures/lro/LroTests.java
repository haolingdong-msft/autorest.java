/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package fixtures.lro;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import fixtures.lro.fluent.AutoRestLongRunningOperationTestService;
import fixtures.lro.fluent.models.ProductInner;
import fixtures.lro.fluent.models.SkuInner;
import fixtures.lro.fluent.models.SubProductInner;
import fixtures.lro.implementation.AutoRestLongRunningOperationTestServiceBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class LroTests {

    private static AutoRestLongRunningOperationTestService client;

    @BeforeAll
    public static void setup() {
        HttpPipeline pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(),
                new RetryPolicy(),
                new CookiePolicy()
                //, new HttpLoggingPolicy(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
        ).build();

        client = new AutoRestLongRunningOperationTestServiceBuilder()
                .endpoint("http://localhost:3000")
                .defaultPollInterval(Duration.ofMillis(1))
                .pipeline(pipeline)
                .buildClient();
    }

    @Test
    public void put200Succeeded() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().put200Succeeded(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put200SucceededNoState() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().put200SucceededNoState(product, Context.NONE);
        Assertions.assertEquals("100", response.id());
    }

    @Test
    public void put202Retry200() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().put202Retry200(product, Context.NONE);
        Assertions.assertEquals("100", response.id());
    }

    @Test
    public void put201CreatingSucceeded200() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().put201CreatingSucceeded200(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put200UpdatingSucceeded204() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().put200UpdatingSucceeded204(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put201CreatingFailed200() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        try {
            ProductInner response = client.getLROs().put201CreatingFailed200(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void put200Acceptedcanceled200() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        try {
            ProductInner response = client.getLROs().put200Acceptedcanceled200(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void putNoHeaderInRetry() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().putNoHeaderInRetry(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncRetrySucceeded() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().putAsyncRetrySucceeded(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncNoRetrySucceeded() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().putAsyncNoRetrySucceeded(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncRetryFailed() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        try {
            ProductInner response = client.getLROs().putAsyncRetryFailed(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void putAsyncNoRetrycanceled() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        try {
            ProductInner response = client.getLROs().putAsyncNoRetrycanceled(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void putAsyncNoHeaderInRetry() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().putAsyncNoHeaderInRetry(product, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putNonResource() throws Exception {
        SkuInner sku = new SkuInner();
        SkuInner response = client.getLROs().putNonResource(sku, Context.NONE);
        Assertions.assertEquals("100", response.id());
    }

    @Test
    public void putAsyncNonResource() throws Exception {
        SkuInner sku = new SkuInner();
        SkuInner response = client.getLROs().putAsyncNonResource(sku, Context.NONE);
        Assertions.assertEquals("100", response.id());
    }

    @Test
    public void putSubResource() throws Exception {
        SubProductInner subProduct = new SubProductInner();
        SubProductInner response = client.getLROs().putSubResource(subProduct, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncSubResource() throws Exception {
        SubProductInner subProduct = new SubProductInner();
        SubProductInner response = client.getLROs().putAsyncSubResource(subProduct, Context.NONE);
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202Accepted200Succeeded() throws Exception {
        ProductInner response = client.getLROs().deleteProvisioning202Accepted200Succeeded();
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202DeletingFailed200() throws Exception {
        ProductInner response = client.getLROs().deleteProvisioning202DeletingFailed200();
        Assertions.assertEquals("Failed", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202Deletingcanceled200() throws Exception {
        ProductInner response = client.getLROs().deleteProvisioning202Deletingcanceled200();
        Assertions.assertEquals("Canceled", response.provisioningState());
    }

    @Test
    public void delete204Succeeded() throws Exception {
        client.getLROs().delete204Succeeded();
    }

    @Test
    public void delete202Retry200() throws Exception {
        ProductInner response = client.getLROs().delete202Retry200();
    }

    @Test
    public void delete202NoRetry204() throws Exception {
        ProductInner response = client.getLROs().delete202NoRetry204();
    }

    @Test
    public void deleteNoHeaderInRetry() throws Exception {
        client.getLROs().deleteNoHeaderInRetry();
    }

    @Test
    public void deleteAsyncNoHeaderInRetry() throws Exception {
        client.getLROs().deleteAsyncNoHeaderInRetry();
    }

    @Test
    public void deleteAsyncRetrySucceeded() throws Exception {
        client.getLROs().deleteAsyncRetrySucceeded();
    }

    @Test
    public void deleteAsyncNoRetrySucceeded() throws Exception {
        client.getLROs().deleteAsyncNoRetrySucceeded();
    }

    @Test
    public void deleteAsyncRetryFailed() throws Exception {
        try {
            client.getLROs().deleteAsyncRetryFailed();
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void deleteAsyncRetrycanceled() throws Exception {
        try {
            client.getLROs().deleteAsyncRetrycanceled();
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void post200WithPayload() throws Exception {
        SkuInner response = client.getLROs().post200WithPayload();
        Assertions.assertEquals("1", response.id());
    }

    @Test
    public void post202Retry200() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        client.getLROs().post202Retry200(product, Context.NONE);
    }

    @Test
    public void post202NoRetry204() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().post202NoRetry204(product, Context.NONE);
    }

    @Test
    public void postAsyncRetrySucceeded() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().postAsyncRetrySucceeded(product, Context.NONE);
    }

    @Test
    public void postAsyncNoRetrySucceeded() throws Exception {
        ProductInner product = new ProductInner();
        product.withLocation("West US");
        ProductInner response = client.getLROs().postAsyncNoRetrySucceeded(product, Context.NONE);
    }

    @Test
    public void postAsyncRetryFailed() throws Exception {
        try {
            ProductInner product = new ProductInner();
            product.withLocation("West US");
            client.getLROs().postAsyncRetryFailed(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void postAsyncRetrycanceled() throws Exception {
        try {
            ProductInner product = new ProductInner();
            product.withLocation("West US");
            client.getLROs().postAsyncRetrycanceled(product, Context.NONE);
            Assertions.fail();
        } catch (ManagementException e) {
            Assertions.assertTrue(e.getMessage().toLowerCase(Locale.ROOT).contains("failed"));
        }
    }

    @Test
    public void putInlineComplete201() {
        ProductInner product = client.getLROs().put201Succeeded();
        Assertions.assertEquals("Succeeded", product.provisioningState());
    }

    @Test
    public void postDoubleHeadersFinalLocationGet() {
        ProductInner product = client.getLROs().postDoubleHeadersFinalLocationGet();
        Assertions.assertEquals("100", product.id());
    }

    @Test
    @Disabled("final-state-via not supported")
    public void postDoubleHeadersFinalAzureHeaderGet() {
        ProductInner product = client.getLROs().postDoubleHeadersFinalAzureHeaderGet();
        Assertions.assertEquals("100", product.id());
    }

    @Test
    public void postDoubleHeadersFinalAzureHeaderGetDefault() {
        ProductInner product = client.getLROs().postDoubleHeadersFinalAzureHeaderGetDefault();
        Assertions.assertEquals("100", product.id());
    }

    @Test
    public void post202List() {
        List<ProductInner> products = client.getLROs().post202List();
        Assertions.assertEquals("100", products.get(0).id());
    }
}
