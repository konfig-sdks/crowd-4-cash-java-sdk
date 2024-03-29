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


import com.konfigthis.client.model.LoanRating;
import com.konfigthis.client.model.Opportunity;
import com.konfigthis.client.model.YN;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OpportunitiesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OpportunitiesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OpportunitiesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAvailableInvestmentsCall(LoanRating rating, Double loanAmount, String loanType, Double availableAmount, Double interestRate, Integer duration, YN insurance, YN collateral, Integer borrowerAge, String borrowerNationality, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Opportunities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (rating != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Rating", rating));
        }

        if (loanAmount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("LoanAmount", loanAmount));
        }

        if (loanType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("LoanType", loanType));
        }

        if (availableAmount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("AvailableAmount", availableAmount));
        }

        if (interestRate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("InterestRate", interestRate));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Duration", duration));
        }

        if (insurance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Insurance", insurance));
        }

        if (collateral != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Collateral", collateral));
        }

        if (borrowerAge != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("BorrowerAge", borrowerAge));
        }

        if (borrowerNationality != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("BorrowerNationality", borrowerNationality));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAvailableInvestmentsValidateBeforeCall(LoanRating rating, Double loanAmount, String loanType, Double availableAmount, Double interestRate, Integer duration, YN insurance, YN collateral, Integer borrowerAge, String borrowerNationality, final ApiCallback _callback) throws ApiException {
        return getAvailableInvestmentsCall(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality, _callback);

    }


    private ApiResponse<Opportunity> getAvailableInvestmentsWithHttpInfo(LoanRating rating, Double loanAmount, String loanType, Double availableAmount, Double interestRate, Integer duration, YN insurance, YN collateral, Integer borrowerAge, String borrowerNationality) throws ApiException {
        okhttp3.Call localVarCall = getAvailableInvestmentsValidateBeforeCall(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality, null);
        Type localVarReturnType = new TypeToken<Opportunity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAvailableInvestmentsAsync(LoanRating rating, Double loanAmount, String loanType, Double availableAmount, Double interestRate, Integer duration, YN insurance, YN collateral, Integer borrowerAge, String borrowerNationality, final ApiCallback<Opportunity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAvailableInvestmentsValidateBeforeCall(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality, _callback);
        Type localVarReturnType = new TypeToken<Opportunity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAvailableInvestmentsRequestBuilder {
        private LoanRating rating;
        private Double loanAmount;
        private String loanType;
        private Double availableAmount;
        private Double interestRate;
        private Integer duration;
        private YN insurance;
        private YN collateral;
        private Integer borrowerAge;
        private String borrowerNationality;

        private GetAvailableInvestmentsRequestBuilder() {
        }

        /**
         * Set rating
         * @param rating Evaluation of the credit risk based on a borrower&#39;s credit history, quality of the collateral, and the likelihood of repayment e.g. AA (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder rating(LoanRating rating) {
            this.rating = rating;
            return this;
        }
        
        /**
         * Set loanAmount
         * @param loanAmount Loan amount e.g. 25000 (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder loanAmount(Double loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }
        
        /**
         * Set loanType
         * @param loanType Type of the loan e.g. Private, SME (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder loanType(String loanType) {
            this.loanType = loanType;
            return this;
        }
        
        /**
         * Set availableAmount
         * @param availableAmount Available amount to be invested at the moment of our API consuming e.g. 2000 (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder availableAmount(Double availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        
        /**
         * Set interestRate
         * @param interestRate Interest rate of the loan in % e.g. 5.6 (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder interestRate(Double interestRate) {
            this.interestRate = interestRate;
            return this;
        }
        
        /**
         * Set duration
         * @param duration Duration in months e.g. 24 (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder duration(Integer duration) {
            this.duration = duration;
            return this;
        }
        
        /**
         * Set insurance
         * @param insurance Is loan issured? - Yes, No (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder insurance(YN insurance) {
            this.insurance = insurance;
            return this;
        }
        
        /**
         * Set collateral
         * @param collateral Is loan collaterialized? - Yes, No (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder collateral(YN collateral) {
            this.collateral = collateral;
            return this;
        }
        
        /**
         * Set borrowerAge
         * @param borrowerAge Age of the borrower e.g. 42 (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder borrowerAge(Integer borrowerAge) {
            this.borrowerAge = borrowerAge;
            return this;
        }
        
        /**
         * Set borrowerNationality
         * @param borrowerNationality Nationality of the borrower, e.g Switzerland, Liechtenstein ... (optional)
         * @return GetAvailableInvestmentsRequestBuilder
         */
        public GetAvailableInvestmentsRequestBuilder borrowerNationality(String borrowerNationality) {
            this.borrowerNationality = borrowerNationality;
            return this;
        }
        
        /**
         * Build call for getAvailableInvestments
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Investment Opportunities List </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAvailableInvestmentsCall(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality, _callback);
        }


        /**
         * Execute getAvailableInvestments request
         * @return Opportunity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Investment Opportunities List </td><td>  -  </td></tr>
         </table>
         */
        public Opportunity execute() throws ApiException {
            ApiResponse<Opportunity> localVarResp = getAvailableInvestmentsWithHttpInfo(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAvailableInvestments request with HTTP info returned
         * @return ApiResponse&lt;Opportunity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Investment Opportunities List </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Opportunity> executeWithHttpInfo() throws ApiException {
            return getAvailableInvestmentsWithHttpInfo(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality);
        }

        /**
         * Execute getAvailableInvestments request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Investment Opportunities List </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Opportunity> _callback) throws ApiException {
            return getAvailableInvestmentsAsync(rating, loanAmount, loanType, availableAmount, interestRate, duration, insurance, collateral, borrowerAge, borrowerNationality, _callback);
        }
    }

    /**
     * Get available investment opportunities
     * __Note__: C4C offers a private, secure and uncomplicated way for the investors to discover, analyze, review and invest.
     * @return GetAvailableInvestmentsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Investment Opportunities List </td><td>  -  </td></tr>
     </table>
     */
    public GetAvailableInvestmentsRequestBuilder getAvailableInvestments() throws IllegalArgumentException {
        return new GetAvailableInvestmentsRequestBuilder();
    }
}
