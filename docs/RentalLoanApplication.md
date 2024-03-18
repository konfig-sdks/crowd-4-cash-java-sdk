

# RentalLoanApplication

A loan application that is submitted by the rental on behalf of their rentee(s)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiRequester** | **String** | Name or E-mail of the user who makes the API call |  [optional] |
|**renteeGender** | **String** | Rentee gender acronym. M stands for male and F for female. |  |
|**renteeFirstName** | **String** | First name of the rentee |  |
|**renteeLastName** | **String** | Last name of the rentee |  |
|**renteeBirthdate** | **String** | Birthdate of the rentee. Expected format: dd.MM.yyyy |  [optional] |
|**renteeEmail** | **String** | E-mail address of the rentee |  |
|**renteeMobilePhoneNumber** | **String** | Rentee mobile phone number - the last 8 digits only |  |
|**renteeStreetAddress** | **String** | Street address of the rentee |  [optional] |
|**renteeHouseNumber** | **String** | House number of the rentee |  [optional] |
|**renteeZipCode** | **String** | Zip code of the rentee |  [optional] |
|**renteeCity** | **String** | City of the rentee |  [optional] |
|**purchaseItem** | **String** | Description of the item you buy |  |
|**itemStatus** | **String** | Status of the item |  [optional] |
|**itemName** | **String** | Name of the item |  |
|**itemType** | **String** | Type of the item e.g. Electric Scooter, E-Motorcycle etc. |  [optional] |
|**itemBrand** | **String** | Brand of the item |  [optional] |
|**itemModel** | **String** | Model of the item |  [optional] |
|**itemColor** | **String** | Color of the item |  [optional] |
|**itemMarketValue** | **Double** | Market value of the item that is rented. |  |
|**serialNumber** | **String** | Serial number (aka VIN or Chassis No.) |  [optional] |
|**identificationNumber** | **String** | Identification number (aka Stammnummer) |  [optional] |
|**rentalAmount** | **Double** | Rental amount per month |  |
|**rentDate** | **String** | The first date of the rental period. Expected format: dd.MM.yyyy |  [optional] |
|**idFrontPhoto** | **String** | Front Side of the Identity Document (National ID, Passport or Permit). Please notice that you must first convert it to Base64 and then send to our API. |  |
|**idFrontExtension** | **String** | Front Side file extension. |  |
|**idBackPhoto** | **String** | Back Side of the Identity Document (National ID, Passport or Permit). Please notice that you must first convert it to Base64 and then send to our API. |  |
|**idBackExtension** | **String** | Back Side file extension. |  |
|**selfiePhoto** | **String** | Selfie of the Rentee. Please notice that you must first convert it to Base64 and then send to our API. |  |
|**selfieExtension** | **String** | Selfie file extension. |  |
|**contractFile** | **String** | Copy of the Contract. Please notice that you must first convert it to Base64 and then send to our API. |  |
|**contractFileExtension** | **String** | Contract file extension. |  |



