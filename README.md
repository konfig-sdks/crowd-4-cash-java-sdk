<div align="center">

[![Visit Crowd4cash](./header.png)](https://crowd4cash.ch&#x2F;)

# [Crowd4cash](https://crowd4cash.ch&#x2F;)

Access to the Crowd4Cash Crowdlending Platform through an API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Crowd4Cash&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>crowd-4-cash-java-sdk</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:crowd-4-cash-java-sdk:2.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/crowd-4-cash-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer loanId = 56; // Loan ID
    String handoverDate = "handoverDate_example"; // The date when the car is handed over to the subscriber
    try {
      ApplicationResult result = client
              .application
              .setDefinitiveHandoverDate()
              .loanId(loanId)
              .handoverDate(handoverDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getMessage());
      System.out.println(result.getLoanId());
      System.out.println(result.getEsr());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setDefinitiveHandoverDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationResult> response = client
              .application
              .setDefinitiveHandoverDate()
              .loanId(loanId)
              .handoverDate(handoverDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setDefinitiveHandoverDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api2.crowd4cash.ch*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**setDefinitiveHandoverDate**](docs/ApplicationApi.md#setDefinitiveHandoverDate) | **PUT** /IntermediaryLoan | Set the definitive Handover Date (a date when the item is handed over to the customer)
*ApplicationApi* | [**submitLoanApplication**](docs/ApplicationApi.md#submitLoanApplication) | **POST** /Loan | Apply for a regular loan - 100% online application
*ApplicationApi* | [**submitPartnerLoanApplication**](docs/ApplicationApi.md#submitPartnerLoanApplication) | **POST** /IntermediaryLoan | Apply for a loan on behalf of your partners e.g. garages/shops/stores
*ApplicationApi* | [**submitRentalLoanApplication**](docs/ApplicationApi.md#submitRentalLoanApplication) | **POST** /RentalLoan | Apply for a rental loan
*AuthenticationApi* | [**getToken**](docs/AuthenticationApi.md#getToken) | **POST** /Authenticate | Authenticate yourself and get an access token
*BiddingApi* | [**placeBid**](docs/BiddingApi.md#placeBid) | **POST** /Bid | Place a bid on certain loan
*BiddingApi* | [**submitBids**](docs/BiddingApi.md#submitBids) | **POST** /Bids | Place bids on behalf of your connected investor(s)
*ContractsApi* | [**getAll**](docs/ContractsApi.md#getAll) | **GET** /Contracts | Get all your contracts
*ContractsApi* | [**getLoanContract**](docs/ContractsApi.md#getLoanContract) | **GET** /Contracts/RentalLoan/{loanId} | Get specific rental loan contract
*ContractsApi* | [**getSpecific**](docs/ContractsApi.md#getSpecific) | **GET** /Contracts/{loanId} | Get specific contract
*ContractsApi* | [**getSpecificIntermediaryLoanContract**](docs/ContractsApi.md#getSpecificIntermediaryLoanContract) | **GET** /Contracts/{partnerId}/{loanId} | Get specific intermediary loan contract
*LoansApi* | [**getLoanData**](docs/LoansApi.md#getLoanData) | **GET** /Loans | Get a complete C4C loan data dataset for your credit analyses
*OpportunitiesApi* | [**getAvailableInvestments**](docs/OpportunitiesApi.md#getAvailableInvestments) | **GET** /Opportunities | Get available investment opportunities
*PortfolioApi* | [**getCustomizedPortfolio**](docs/PortfolioApi.md#getCustomizedPortfolio) | **GET** /CustomPortfolio | Get your customized investment portfolio
*PortfolioApi* | [**getInvestments**](docs/PortfolioApi.md#getInvestments) | **GET** /Portfolio | Get your investment portfolio
*ReportsApi* | [**getConnectorInvestments**](docs/ReportsApi.md#getConnectorInvestments) | **GET** /Connector | Get your connector account summary and investments of the connected investors
*ReportsApi* | [**getIntermediaryData**](docs/ReportsApi.md#getIntermediaryData) | **GET** /Intermediary | Get your intermediary account summary and your partner loans data
*ReportsApi* | [**rentalAccountSummary**](docs/ReportsApi.md#rentalAccountSummary) | **GET** /Rental | Get your rental account summary and your loans data


## Documentation for Models

 - [AccountDetails](docs/AccountDetails.md)
 - [AccountStatement](docs/AccountStatement.md)
 - [AccountStatementEntry](docs/AccountStatementEntry.md)
 - [AccountSummary](docs/AccountSummary.md)
 - [ActiveBid](docs/ActiveBid.md)
 - [AmortizationSchedule](docs/AmortizationSchedule.md)
 - [ApplicationResult](docs/ApplicationResult.md)
 - [AutoInvestSettings](docs/AutoInvestSettings.md)
 - [AutomaticBuilder](docs/AutomaticBuilder.md)
 - [AutomaticBuilderOption](docs/AutomaticBuilderOption.md)
 - [Bid](docs/Bid.md)
 - [BiddingResult](docs/BiddingResult.md)
 - [Company](docs/Company.md)
 - [ConnectedInvestor](docs/ConnectedInvestor.md)
 - [ConnectorBid](docs/ConnectorBid.md)
 - [ConnectorInvestment](docs/ConnectorInvestment.md)
 - [ConnectorReport](docs/ConnectorReport.md)
 - [ConnectorSummary](docs/ConnectorSummary.md)
 - [Contract](docs/Contract.md)
 - [Crif](docs/Crif.md)
 - [EarlyRepayment](docs/EarlyRepayment.md)
 - [Expenses](docs/Expenses.md)
 - [Financial](docs/Financial.md)
 - [Income](docs/Income.md)
 - [IntermediaryLoan](docs/IntermediaryLoan.md)
 - [IntermediaryLoanApplication](docs/IntermediaryLoanApplication.md)
 - [IntermediaryLoanHandoverDate](docs/IntermediaryLoanHandoverDate.md)
 - [IntermediaryPartner](docs/IntermediaryPartner.md)
 - [IntermediaryReport](docs/IntermediaryReport.md)
 - [IntermediarySummary](docs/IntermediarySummary.md)
 - [Investment](docs/Investment.md)
 - [InvestorAccount](docs/InvestorAccount.md)
 - [Loan](docs/Loan.md)
 - [LoanRating](docs/LoanRating.md)
 - [Login](docs/Login.md)
 - [ManualBuilder](docs/ManualBuilder.md)
 - [ManualBuilderOption](docs/ManualBuilderOption.md)
 - [ManualOptionRule](docs/ManualOptionRule.md)
 - [ModelPrivate](docs/ModelPrivate.md)
 - [MultipleBiddingResult](docs/MultipleBiddingResult.md)
 - [Opportunity](docs/Opportunity.md)
 - [PagedList](docs/PagedList.md)
 - [Portfolio](docs/Portfolio.md)
 - [Questionnaire](docs/Questionnaire.md)
 - [RentalApplicationResult](docs/RentalApplicationResult.md)
 - [RentalLoan](docs/RentalLoan.md)
 - [RentalLoanApplication](docs/RentalLoanApplication.md)
 - [RentalReport](docs/RentalReport.md)
 - [RentalSummary](docs/RentalSummary.md)
 - [Rentee](docs/Rentee.md)
 - [SchedulePayment](docs/SchedulePayment.md)
 - [Status](docs/Status.md)
 - [TechnicalData](docs/TechnicalData.md)
 - [Token](docs/Token.md)
 - [Transacions](docs/Transacions.md)
 - [YN](docs/YN.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
