# PortfolioApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomizedPortfolio**](PortfolioApi.md#getCustomizedPortfolio) | **GET** /CustomPortfolio | Get your customized investment portfolio |
| [**getInvestments**](PortfolioApi.md#getInvestments) | **GET** /Portfolio | Get your investment portfolio |


<a name="getCustomizedPortfolio"></a>
# **getCustomizedPortfolio**
> Portfolio getCustomizedPortfolio().from(from).to(to).execute();

Get your customized investment portfolio

__Note__: If the standard portfolio doesn&#39;t suit your needs, please [contact C4C](https://crowd4cash.ch/contact) to request customization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfolioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    String from = "from_example"; // 
    String to = "to_example"; // 
    try {
      Portfolio result = client
              .portfolio
              .getCustomizedPortfolio()
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvestorAccount());
      System.out.println(result.getInvestments());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioApi#getCustomizedPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Portfolio> response = client
              .portfolio
              .getCustomizedPortfolio()
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioApi#getCustomizedPortfolio");
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
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investment Portfolio Info |  -  |

<a name="getInvestments"></a>
# **getInvestments**
> Portfolio getInvestments().from(from).to(to).execute();

Get your investment portfolio

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfolioApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    String from = "from_example";
    String to = "to_example";
    try {
      Portfolio result = client
              .portfolio
              .getInvestments()
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvestorAccount());
      System.out.println(result.getInvestments());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioApi#getInvestments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Portfolio> response = client
              .portfolio
              .getInvestments()
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioApi#getInvestments");
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
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Investment Portfolio Info |  -  |

