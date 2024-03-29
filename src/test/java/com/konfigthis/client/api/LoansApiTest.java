/*
 * C4C REST API
 * Access to the Crowd4Cash Crowdlending Platform through an API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: info@crowd4cash.ch
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.PagedList;
import com.konfigthis.client.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoansApi
 */
@Disabled
public class LoansApiTest {

    private static LoansApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LoansApi(apiClient);
    }

    /**
     * Get a complete C4C loan data dataset for your credit analyses
     *
     * **Note**: In order to consume this endpoint we need to grant a special access to your account. Please [contact us](https://crowd4cash.ch/contact) for further information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoanDataTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        Status loanstatus = null;
        PagedList response = api.getLoanData(pageNumber, pageSize, loanstatus)
                .execute();
        // TODO: test validations
    }

}
