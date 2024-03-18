# LoansApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLoanData**](LoansApi.md#getLoanData) | **GET** /Loans | Get a complete C4C loan data dataset for your credit analyses |


<a name="getLoanData"></a>
# **getLoanData**
> PagedList getLoanData(pageNumber, pageSize, loanstatus).execute();

Get a complete C4C loan data dataset for your credit analyses

**Note**: In order to consume this endpoint we need to grant a special access to your account. Please [contact us](https://crowd4cash.ch/contact) for further information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LoansApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer pageNumber = 56; // Page number you want to access
    Integer pageSize = 56; // Number of items per page. Max is 20
    Status loanstatus = Status.fromValue("All"); // Status values that need to be considered for filter
    try {
      PagedList result = client
              .loans
              .getLoanData(pageNumber, pageSize, loanstatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getLoans());
      System.out.println(result.getCurrentPage());
      System.out.println(result.getTotalPages());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalLoansCount());
      System.out.println(result.getHasPreviousPage());
      System.out.println(result.getHasNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#getLoanData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedList> response = client
              .loans
              .getLoanData(pageNumber, pageSize, loanstatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#getLoanData");
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
| **pageNumber** | **Integer**| Page number you want to access | |
| **pageSize** | **Integer**| Number of items per page. Max is 20 | |
| **loanstatus** | [**Status**](.md)| Status values that need to be considered for filter | [enum: All, Funded, Active, Closed, Defaulted] |

### Return type

[**PagedList**](PagedList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan Data Dataset |  -  |

