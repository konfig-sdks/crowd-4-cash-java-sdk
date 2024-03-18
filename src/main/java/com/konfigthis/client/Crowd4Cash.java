package com.konfigthis.client;

import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BiddingApi;
import com.konfigthis.client.api.ContractsApi;
import com.konfigthis.client.api.LoansApi;
import com.konfigthis.client.api.OpportunitiesApi;
import com.konfigthis.client.api.PortfolioApi;
import com.konfigthis.client.api.ReportsApi;

public class Crowd4Cash {
    private ApiClient apiClient;
    public final ApplicationApi application;
    public final AuthenticationApi authentication;
    public final BiddingApi bidding;
    public final ContractsApi contracts;
    public final LoansApi loans;
    public final OpportunitiesApi opportunities;
    public final PortfolioApi portfolio;
    public final ReportsApi reports;

    public Crowd4Cash() {
        this(null);
    }

    public Crowd4Cash(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.application = new ApplicationApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.bidding = new BiddingApi(this.apiClient);
        this.contracts = new ContractsApi(this.apiClient);
        this.loans = new LoansApi(this.apiClient);
        this.opportunities = new OpportunitiesApi(this.apiClient);
        this.portfolio = new PortfolioApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
    }

}
