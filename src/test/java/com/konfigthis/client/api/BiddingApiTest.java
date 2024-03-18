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
import com.konfigthis.client.model.Bid;
import com.konfigthis.client.model.BiddingResult;
import com.konfigthis.client.model.ConnectorBid;
import com.konfigthis.client.model.MultipleBiddingResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BiddingApi
 */
@Disabled
public class BiddingApiTest {

    private static BiddingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BiddingApi(apiClient);
    }

    /**
     * Place a bid on certain loan
     *
     * **Note**: Each successful bid creates a binding obligation on you. Once you place you may not retract your bid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void placeBidTest() throws ApiException {
        Integer loanId = null;
        Double amount = null;
        BiddingResult response = api.placeBid(loanId, amount)
                .execute();
        // TODO: test validations
    }

    /**
     * Place bids on behalf of your connected investor(s)
     *
     * **Note**: Crowd4Cash allows you to invest as agent on behalf of other investors. You can submit multiple bids on the same request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitBidsTest() throws ApiException {
        MultipleBiddingResult response = api.submitBids()
                .execute();
        // TODO: test validations
    }

}
