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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Bid;
import com.konfigthis.client.model.BiddingResult;
import com.konfigthis.client.model.ConnectorBid;
import com.konfigthis.client.model.MultipleBiddingResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BiddingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BiddingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BiddingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call placeBidCall(Bid bid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bid;

        // create path and map variables
        String localVarPath = "/Bid";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call placeBidValidateBeforeCall(Bid bid, final ApiCallback _callback) throws ApiException {
        return placeBidCall(bid, _callback);

    }


    private ApiResponse<BiddingResult> placeBidWithHttpInfo(Bid bid) throws ApiException {
        okhttp3.Call localVarCall = placeBidValidateBeforeCall(bid, null);
        Type localVarReturnType = new TypeToken<BiddingResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call placeBidAsync(Bid bid, final ApiCallback<BiddingResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = placeBidValidateBeforeCall(bid, _callback);
        Type localVarReturnType = new TypeToken<BiddingResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class PlaceBidRequestBuilder {
        private final Integer loanId;
        private final Double amount;

        private PlaceBidRequestBuilder(Integer loanId, Double amount) {
            this.loanId = loanId;
            this.amount = amount;
        }

        /**
         * Build call for placeBid
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Bid bid = buildBodyParams();
            return placeBidCall(bid, _callback);
        }

        private Bid buildBodyParams() {
            Bid bid = new Bid();
            bid.loanId(this.loanId);
            bid.amount(this.amount);
            return bid;
        }

        /**
         * Execute placeBid request
         * @return BiddingResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public BiddingResult execute() throws ApiException {
            Bid bid = buildBodyParams();
            ApiResponse<BiddingResult> localVarResp = placeBidWithHttpInfo(bid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute placeBid request with HTTP info returned
         * @return ApiResponse&lt;BiddingResult&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BiddingResult> executeWithHttpInfo() throws ApiException {
            Bid bid = buildBodyParams();
            return placeBidWithHttpInfo(bid);
        }

        /**
         * Execute placeBid request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BiddingResult> _callback) throws ApiException {
            Bid bid = buildBodyParams();
            return placeBidAsync(bid, _callback);
        }
    }

    /**
     * Place a bid on certain loan
     * **Note**: Each successful bid creates a binding obligation on you. Once you place you may not retract your bid.
     * @return PlaceBidRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
     </table>
     */
    public PlaceBidRequestBuilder placeBid(Integer loanId, Double amount) throws IllegalArgumentException {
        if (loanId == null) throw new IllegalArgumentException("\"loanId\" is required but got null");
        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        return new PlaceBidRequestBuilder(loanId, amount);
    }
    private okhttp3.Call submitBidsCall(List<ConnectorBid> connectorBid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = connectorBid;

        // create path and map variables
        String localVarPath = "/Bids";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitBidsValidateBeforeCall(List<ConnectorBid> connectorBid, final ApiCallback _callback) throws ApiException {
        return submitBidsCall(connectorBid, _callback);

    }


    private ApiResponse<MultipleBiddingResult> submitBidsWithHttpInfo(List<ConnectorBid> connectorBid) throws ApiException {
        okhttp3.Call localVarCall = submitBidsValidateBeforeCall(connectorBid, null);
        Type localVarReturnType = new TypeToken<MultipleBiddingResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call submitBidsAsync(List<ConnectorBid> connectorBid, final ApiCallback<MultipleBiddingResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitBidsValidateBeforeCall(connectorBid, _callback);
        Type localVarReturnType = new TypeToken<MultipleBiddingResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SubmitBidsRequestBuilder {
        private List<ConnectorBid> connectorBid;

        private SubmitBidsRequestBuilder() {
        }

        /**
         * Set connectorBid
         * @param connectorBid  (optional)
         * @return SubmitBidsRequestBuilder
         */
        public SubmitBidsRequestBuilder connectorBid(List<ConnectorBid> connectorBid) {
            this.connectorBid = connectorBid;
            return this;
        }

        /**
         * Build call for submitBids
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            List<ConnectorBid> connectorBid = buildBodyParams();
            return submitBidsCall(connectorBid, _callback);
        }

        private List<ConnectorBid> buildBodyParams() {
            return this.connectorBid;
        }

        /**
         * Execute submitBids request
         * @return MultipleBiddingResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public MultipleBiddingResult execute() throws ApiException {
            List<ConnectorBid> connectorBid = buildBodyParams();
            ApiResponse<MultipleBiddingResult> localVarResp = submitBidsWithHttpInfo(connectorBid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute submitBids request with HTTP info returned
         * @return ApiResponse&lt;MultipleBiddingResult&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MultipleBiddingResult> executeWithHttpInfo() throws ApiException {
            List<ConnectorBid> connectorBid = buildBodyParams();
            return submitBidsWithHttpInfo(connectorBid);
        }

        /**
         * Execute submitBids request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MultipleBiddingResult> _callback) throws ApiException {
            List<ConnectorBid> connectorBid = buildBodyParams();
            return submitBidsAsync(connectorBid, _callback);
        }
    }

    /**
     * Place bids on behalf of your connected investor(s)
     * **Note**: Crowd4Cash allows you to invest as agent on behalf of other investors. You can submit multiple bids on the same request.
     * @return SubmitBidsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Bidding </td><td>  -  </td></tr>
     </table>
     */
    public SubmitBidsRequestBuilder submitBids() throws IllegalArgumentException {
        return new SubmitBidsRequestBuilder();
    }
}
