# ContractsApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](ContractsApi.md#getAll) | **GET** /Contracts | Get all your contracts |
| [**getLoanContract**](ContractsApi.md#getLoanContract) | **GET** /Contracts/RentalLoan/{loanId} | Get specific rental loan contract |
| [**getSpecific**](ContractsApi.md#getSpecific) | **GET** /Contracts/{loanId} | Get specific contract |
| [**getSpecificIntermediaryLoanContract**](ContractsApi.md#getSpecificIntermediaryLoanContract) | **GET** /Contracts/{partnerId}/{loanId} | Get specific intermediary loan contract |


<a name="getAll"></a>
# **getAll**
> Contract getAll().execute();

Get all your contracts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      Contract result = client
              .contracts
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getLoanId());
      System.out.println(result.getContractName());
      System.out.println(result.getContractFile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contract> response = client
              .contracts
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Contract**](Contract.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan Agreements List |  -  |

<a name="getLoanContract"></a>
# **getLoanContract**
> Contract getLoanContract(loanId).execute();

Get specific rental loan contract

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer loanId = 56;
    try {
      Contract result = client
              .contracts
              .getLoanContract(loanId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLoanId());
      System.out.println(result.getContractName());
      System.out.println(result.getContractFile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getLoanContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contract> response = client
              .contracts
              .getLoanContract(loanId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getLoanContract");
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
| **loanId** | **Integer**|  | |

### Return type

[**Contract**](Contract.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan Agreement |  -  |

<a name="getSpecific"></a>
# **getSpecific**
> Contract getSpecific(loanId).execute();

Get specific contract

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer loanId = 56;
    try {
      Contract result = client
              .contracts
              .getSpecific(loanId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLoanId());
      System.out.println(result.getContractName());
      System.out.println(result.getContractFile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contract> response = client
              .contracts
              .getSpecific(loanId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSpecific");
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
| **loanId** | **Integer**|  | |

### Return type

[**Contract**](Contract.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan Agreement |  -  |

<a name="getSpecificIntermediaryLoanContract"></a>
# **getSpecificIntermediaryLoanContract**
> Contract getSpecificIntermediaryLoanContract(partnerId, loanId).execute();

Get specific intermediary loan contract

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Crowd4Cash;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.crowd4cash.ch";
    
    configuration.bearer  = "YOUR API KEY";
    Crowd4Cash client = new Crowd4Cash(configuration);
    Integer partnerId = 56;
    Integer loanId = 56;
    try {
      Contract result = client
              .contracts
              .getSpecificIntermediaryLoanContract(partnerId, loanId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLoanId());
      System.out.println(result.getContractName());
      System.out.println(result.getContractFile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSpecificIntermediaryLoanContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contract> response = client
              .contracts
              .getSpecificIntermediaryLoanContract(partnerId, loanId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSpecificIntermediaryLoanContract");
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
| **partnerId** | **Integer**|  | |
| **loanId** | **Integer**|  | |

### Return type

[**Contract**](Contract.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan Agreement |  -  |

