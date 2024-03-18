# BiddingApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**placeBid**](BiddingApi.md#placeBid) | **POST** /Bid | Place a bid on certain loan |
| [**submitBids**](BiddingApi.md#submitBids) | **POST** /Bids | Place bids on behalf of your connected investor(s) |


<a name="placeBid"></a>
# **placeBid**
> BiddingResult placeBid().bid(bid).execute();

Place a bid on certain loan

**Note**: Each successful bid creates a binding obligation on you. Once you place you may not retract your bid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BiddingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer loanId = 56; // Loan ID which you want to invest in
    Double amount = 3.4D; // Amount of the bid
    try {
      BiddingResult result = client
              .bidding
              .placeBid(loanId, amount)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling BiddingApi#placeBid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BiddingResult> response = client
              .bidding
              .placeBid(loanId, amount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BiddingApi#placeBid");
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
| **bid** | [**Bid**](Bid.md)|  | [optional] |

### Return type

[**BiddingResult**](BiddingResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Bidding |  -  |

<a name="submitBids"></a>
# **submitBids**
> MultipleBiddingResult submitBids().connectorBid(connectorBid).execute();

Place bids on behalf of your connected investor(s)

**Note**: Crowd4Cash allows you to invest as agent on behalf of other investors. You can submit multiple bids on the same request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BiddingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    try {
      MultipleBiddingResult result = client
              .bidding
              .submitBids()
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling BiddingApi#submitBids");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MultipleBiddingResult> response = client
              .bidding
              .submitBids()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BiddingApi#submitBids");
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
| **connectorBid** | [**List&lt;ConnectorBid&gt;**](ConnectorBid.md)|  | [optional] |

### Return type

[**MultipleBiddingResult**](MultipleBiddingResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Bidding |  -  |

