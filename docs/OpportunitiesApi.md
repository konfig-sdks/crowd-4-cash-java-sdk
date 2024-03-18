# OpportunitiesApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailableInvestments**](OpportunitiesApi.md#getAvailableInvestments) | **GET** /Opportunities | Get available investment opportunities |


<a name="getAvailableInvestments"></a>
# **getAvailableInvestments**
> Opportunity getAvailableInvestments().rating(rating).loanAmount(loanAmount).loanType(loanType).availableAmount(availableAmount).interestRate(interestRate).duration(duration).insurance(insurance).collateral(collateral).borrowerAge(borrowerAge).borrowerNationality(borrowerNationality).execute();

Get available investment opportunities

__Note__: C4C offers a private, secure and uncomplicated way for the investors to discover, analyze, review and invest.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OpportunitiesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    LoanRating rating = LoanRating.fromValue("AA"); // Evaluation of the credit risk based on a borrower's credit history, quality of the collateral, and the likelihood of repayment e.g. AA
    Double loanAmount = 3.4D; // Loan amount e.g. 25000
    String loanType = "loanType_example"; // Type of the loan e.g. Private, SME
    Double availableAmount = 3.4D; // Available amount to be invested at the moment of our API consuming e.g. 2000
    Double interestRate = 3.4D; // Interest rate of the loan in % e.g. 5.6
    Integer duration = 56; // Duration in months e.g. 24
    YN insurance = YN.fromValue("false"); // Is loan issured? - Yes, No
    YN collateral = YN.fromValue("false"); // Is loan collaterialized? - Yes, No
    Integer borrowerAge = 56; // Age of the borrower e.g. 42
    String borrowerNationality = "borrowerNationality_example"; // Nationality of the borrower, e.g Switzerland, Liechtenstein ...
    try {
      Opportunity result = client
              .opportunities
              .getAvailableInvestments()
              .rating(rating)
              .loanAmount(loanAmount)
              .loanType(loanType)
              .availableAmount(availableAmount)
              .interestRate(interestRate)
              .duration(duration)
              .insurance(insurance)
              .collateral(collateral)
              .borrowerAge(borrowerAge)
              .borrowerNationality(borrowerNationality)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateApproved());
      System.out.println(result.getLoanAmount());
      System.out.println(result.getInterestRate());
      System.out.println(result.getPaymentFrequency());
      System.out.println(result.getDuration());
      System.out.println(result.getBorrowerType());
      System.out.println(result.getBiddingType());
      System.out.println(result.getLoanType());
      System.out.println(result.getLoanPurpose());
      System.out.println(result.getLoanRating());
      System.out.println(result.getLoanStatus());
      System.out.println(result.getPerformanceStatus());
      System.out.println(result.getCollateral());
      System.out.println(result.getCollateralType());
      System.out.println(result.getInsurance());
      System.out.println(result.getOpenAmount());
      System.out.println(result.getBiddingEnd());
      System.out.println(result.getNotes());
      System.out.println(result.getLink());
      System.out.println(result.getBorrowerPrivate());
      System.out.println(result.getBorrowerCompany());
      System.out.println(result.getIncome());
      System.out.println(result.getExpenses());
      System.out.println(result.getQuestionnaire());
      System.out.println(result.getFinancial());
      System.out.println(result.getTechnicalData());
      System.out.println(result.getBids());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunitiesApi#getAvailableInvestments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Opportunity> response = client
              .opportunities
              .getAvailableInvestments()
              .rating(rating)
              .loanAmount(loanAmount)
              .loanType(loanType)
              .availableAmount(availableAmount)
              .interestRate(interestRate)
              .duration(duration)
              .insurance(insurance)
              .collateral(collateral)
              .borrowerAge(borrowerAge)
              .borrowerNationality(borrowerNationality)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpportunitiesApi#getAvailableInvestments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rating** | [**LoanRating**](.md)| Evaluation of the credit risk based on a borrower&#39;s credit history, quality of the collateral, and the likelihood of repayment e.g. AA | [optional] [enum: AA, A, B, C, D] |
| **loanAmount** | **Double**| Loan amount e.g. 25000 | [optional] |
| **loanType** | **String**| Type of the loan e.g. Private, SME | [optional] |
| **availableAmount** | **Double**| Available amount to be invested at the moment of our API consuming e.g. 2000 | [optional] |
| **interestRate** | **Double**| Interest rate of the loan in % e.g. 5.6 | [optional] |
| **duration** | **Integer**| Duration in months e.g. 24 | [optional] |
| **insurance** | [**YN**](.md)| Is loan issured? - Yes, No | [optional] [enum: false, true] |
| **collateral** | [**YN**](.md)| Is loan collaterialized? - Yes, No | [optional] [enum: false, true] |
| **borrowerAge** | **Integer**| Age of the borrower e.g. 42 | [optional] |
| **borrowerNationality** | **String**| Nationality of the borrower, e.g Switzerland, Liechtenstein ... | [optional] |

### Return type

[**Opportunity**](Opportunity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investment Opportunities List |  -  |

