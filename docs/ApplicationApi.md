# ApplicationApi

All URIs are relative to *https://api2.crowd4cash.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**setDefinitiveHandoverDate**](ApplicationApi.md#setDefinitiveHandoverDate) | **PUT** /IntermediaryLoan | Set the definitive Handover Date (a date when the item is handed over to the customer) |
| [**submitLoanApplication**](ApplicationApi.md#submitLoanApplication) | **POST** /Loan | Apply for a regular loan - 100% online application |
| [**submitPartnerLoanApplication**](ApplicationApi.md#submitPartnerLoanApplication) | **POST** /IntermediaryLoan | Apply for a loan on behalf of your partners e.g. garages/shops/stores |
| [**submitRentalLoanApplication**](ApplicationApi.md#submitRentalLoanApplication) | **POST** /RentalLoan | Apply for a rental loan |


<a name="setDefinitiveHandoverDate"></a>
# **setDefinitiveHandoverDate**
> ApplicationResult setDefinitiveHandoverDate().intermediaryLoanHandoverDate(intermediaryLoanHandoverDate).execute();

Set the definitive Handover Date (a date when the item is handed over to the customer)

**Note**: It&#39;s valid only for loans made indirectly through the intermediary.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **intermediaryLoanHandoverDate** | [**IntermediaryLoanHandoverDate**](IntermediaryLoanHandoverDate.md)|  | [optional] |

### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="submitLoanApplication"></a>
# **submitLoanApplication**
> ApplicationResult submitLoanApplication().body(body).execute();

Apply for a regular loan - 100% online application

**Note**: Approval and funding times vary, but typically it takes only 24 hours.

### Example
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
    try {
      ApplicationResult result = client
              .application
              .submitLoanApplication()
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getMessage());
      System.out.println(result.getLoanId());
      System.out.println(result.getEsr());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitLoanApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationResult> response = client
              .application
              .submitLoanApplication()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitLoanApplication");
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
| **body** | **Object**|  | [optional] |

### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Loan Application |  -  |

<a name="submitPartnerLoanApplication"></a>
# **submitPartnerLoanApplication**
> ApplicationResult submitPartnerLoanApplication().intermediaryLoanApplication(intermediaryLoanApplication).execute();

Apply for a loan on behalf of your partners e.g. garages/shops/stores

**Note**: Each successful application creates a binding obligation on you. Once you apply you may not retract the application.

### Example
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
    String serialNumber = "serialNumber_example"; // Serial number (aka VIN or Chassis No.)
    String identificationNumber = "identificationNumber_example"; // Identification number (aka Stammnummer)
    Integer partnerId = 56; // ID of the partner that is buying an item. This ID can be taken from the Report endpoint and Intermediary route.
    String purchaseItem = "purchaseItem_example"; // Description of the item you buy e.g. Car
    String itemStatus = "itemStatus_example"; // Status of the item
    String itemName = "itemName_example"; // Name of the item
    String itemType = "itemType_example"; // Type of the item e.g. SUV, Van, Saloon, Cabriolet etc.
    String itemBrand = "itemBrand_example"; // Brand of the item
    String itemModel = "itemModel_example"; // Model of the item
    String itemColor = "itemColor_example"; // Color of the item
    Double itemMarketValue = 3.4D; // Market value of the item you want to buy. Please notice that the Loan Amount will be 80% of this value.
    String manufactureDate = "manufactureDate_example"; // Date when the car was manufactured
    String firstRegistration = "firstRegistration_example"; // Date when the item was registered very first time
    String mileage = "mileage_example"; // Mileage of the item
    String itemCertificate = "itemCertificate_example"; // Certificate of the item
    Double rentalAmount = 3.4D; // Rental amount per month
    String handoverDate = "handoverDate_example"; // The expected/approximate handover date (date when the car is expected to be handed over to the subscriber). Expected format: dd.MM.yyyy
    try {
      ApplicationResult result = client
              .application
              .submitPartnerLoanApplication(serialNumber, identificationNumber)
              .partnerId(partnerId)
              .purchaseItem(purchaseItem)
              .itemStatus(itemStatus)
              .itemName(itemName)
              .itemType(itemType)
              .itemBrand(itemBrand)
              .itemModel(itemModel)
              .itemColor(itemColor)
              .itemMarketValue(itemMarketValue)
              .manufactureDate(manufactureDate)
              .firstRegistration(firstRegistration)
              .mileage(mileage)
              .itemCertificate(itemCertificate)
              .rentalAmount(rentalAmount)
              .handoverDate(handoverDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getMessage());
      System.out.println(result.getLoanId());
      System.out.println(result.getEsr());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitPartnerLoanApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationResult> response = client
              .application
              .submitPartnerLoanApplication(serialNumber, identificationNumber)
              .partnerId(partnerId)
              .purchaseItem(purchaseItem)
              .itemStatus(itemStatus)
              .itemName(itemName)
              .itemType(itemType)
              .itemBrand(itemBrand)
              .itemModel(itemModel)
              .itemColor(itemColor)
              .itemMarketValue(itemMarketValue)
              .manufactureDate(manufactureDate)
              .firstRegistration(firstRegistration)
              .mileage(mileage)
              .itemCertificate(itemCertificate)
              .rentalAmount(rentalAmount)
              .handoverDate(handoverDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitPartnerLoanApplication");
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
| **intermediaryLoanApplication** | [**IntermediaryLoanApplication**](IntermediaryLoanApplication.md)|  | [optional] |

### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Loan Application |  -  |

<a name="submitRentalLoanApplication"></a>
# **submitRentalLoanApplication**
> RentalApplicationResult submitRentalLoanApplication().rentalLoanApplication(rentalLoanApplication).execute();

Apply for a rental loan

**Note**: Each successful application creates a binding obligation on you. Once you apply you may not retract the application.

### Example
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
    String renteeGender = "renteeGender_example"; // Rentee gender acronym. M stands for male and F for female.
    String renteeFirstName = "renteeFirstName_example"; // First name of the rentee
    String renteeLastName = "renteeLastName_example"; // Last name of the rentee
    String renteeEmail = "renteeEmail_example"; // E-mail address of the rentee
    String renteeMobilePhoneNumber = "renteeMobilePhoneNumber_example"; // Rentee mobile phone number - the last 8 digits only
    String purchaseItem = "purchaseItem_example"; // Description of the item you buy
    String itemName = "itemName_example"; // Name of the item
    Double itemMarketValue = 3.4D; // Market value of the item that is rented.
    Double rentalAmount = 3.4D; // Rental amount per month
    String idFrontPhoto = "idFrontPhoto_example"; // Front Side of the Identity Document (National ID, Passport or Permit). Please notice that you must first convert it to Base64 and then send to our API.
    String idFrontExtension = "idFrontExtension_example"; // Front Side file extension.
    String idBackPhoto = "idBackPhoto_example"; // Back Side of the Identity Document (National ID, Passport or Permit). Please notice that you must first convert it to Base64 and then send to our API.
    String idBackExtension = "idBackExtension_example"; // Back Side file extension.
    String selfiePhoto = "selfiePhoto_example"; // Selfie of the Rentee. Please notice that you must first convert it to Base64 and then send to our API.
    String selfieExtension = "selfieExtension_example"; // Selfie file extension.
    String contractFile = "contractFile_example"; // Copy of the Contract. Please notice that you must first convert it to Base64 and then send to our API.
    String contractFileExtension = "contractFileExtension_example"; // Contract file extension.
    String apiRequester = "apiRequester_example"; // Name or E-mail of the user who makes the API call
    String renteeBirthdate = "renteeBirthdate_example"; // Birthdate of the rentee. Expected format: dd.MM.yyyy
    String renteeStreetAddress = "renteeStreetAddress_example"; // Street address of the rentee
    String renteeHouseNumber = "renteeHouseNumber_example"; // House number of the rentee
    String renteeZipCode = "renteeZipCode_example"; // Zip code of the rentee
    String renteeCity = "renteeCity_example"; // City of the rentee
    String itemStatus = "itemStatus_example"; // Status of the item
    String itemType = "itemType_example"; // Type of the item e.g. Electric Scooter, E-Motorcycle etc.
    String itemBrand = "itemBrand_example"; // Brand of the item
    String itemModel = "itemModel_example"; // Model of the item
    String itemColor = "itemColor_example"; // Color of the item
    String serialNumber = "serialNumber_example"; // Serial number (aka VIN or Chassis No.)
    String identificationNumber = "identificationNumber_example"; // Identification number (aka Stammnummer)
    String rentDate = "rentDate_example"; // The first date of the rental period. Expected format: dd.MM.yyyy
    try {
      RentalApplicationResult result = client
              .application
              .submitRentalLoanApplication(renteeGender, renteeFirstName, renteeLastName, renteeEmail, renteeMobilePhoneNumber, purchaseItem, itemName, itemMarketValue, rentalAmount, idFrontPhoto, idFrontExtension, idBackPhoto, idBackExtension, selfiePhoto, selfieExtension, contractFile, contractFileExtension)
              .apiRequester(apiRequester)
              .renteeBirthdate(renteeBirthdate)
              .renteeStreetAddress(renteeStreetAddress)
              .renteeHouseNumber(renteeHouseNumber)
              .renteeZipCode(renteeZipCode)
              .renteeCity(renteeCity)
              .itemStatus(itemStatus)
              .itemType(itemType)
              .itemBrand(itemBrand)
              .itemModel(itemModel)
              .itemColor(itemColor)
              .serialNumber(serialNumber)
              .identificationNumber(identificationNumber)
              .rentDate(rentDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getResult());
      System.out.println(result.getMessage());
      System.out.println(result.getLoanId());
      System.out.println(result.getEsr());
      System.out.println(result.getRentalAmountWithInsurance());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitRentalLoanApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RentalApplicationResult> response = client
              .application
              .submitRentalLoanApplication(renteeGender, renteeFirstName, renteeLastName, renteeEmail, renteeMobilePhoneNumber, purchaseItem, itemName, itemMarketValue, rentalAmount, idFrontPhoto, idFrontExtension, idBackPhoto, idBackExtension, selfiePhoto, selfieExtension, contractFile, contractFileExtension)
              .apiRequester(apiRequester)
              .renteeBirthdate(renteeBirthdate)
              .renteeStreetAddress(renteeStreetAddress)
              .renteeHouseNumber(renteeHouseNumber)
              .renteeZipCode(renteeZipCode)
              .renteeCity(renteeCity)
              .itemStatus(itemStatus)
              .itemType(itemType)
              .itemBrand(itemBrand)
              .itemModel(itemModel)
              .itemColor(itemColor)
              .serialNumber(serialNumber)
              .identificationNumber(identificationNumber)
              .rentDate(rentDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#submitRentalLoanApplication");
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
| **rentalLoanApplication** | [**RentalLoanApplication**](RentalLoanApplication.md)|  | [optional] |

### Return type

[**RentalApplicationResult**](RentalApplicationResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Loan Application |  -  |

