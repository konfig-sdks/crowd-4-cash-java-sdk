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
import com.konfigthis.client.model.Contract;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
@Disabled
public class ContractsApiTest {

    private static ContractsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContractsApi(apiClient);
    }

    /**
     * Get all your contracts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Contract response = api.getAll()
                .execute();
        // TODO: test validations
    }

    /**
     * Get specific rental loan contract
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoanContractTest() throws ApiException {
        Integer loanId = null;
        Contract response = api.getLoanContract(loanId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get specific contract
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificTest() throws ApiException {
        Integer loanId = null;
        Contract response = api.getSpecific(loanId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get specific intermediary loan contract
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificIntermediaryLoanContractTest() throws ApiException {
        Integer partnerId = null;
        Integer loanId = null;
        Contract response = api.getSpecificIntermediaryLoanContract(partnerId, loanId)
                .execute();
        // TODO: test validations
    }

}
