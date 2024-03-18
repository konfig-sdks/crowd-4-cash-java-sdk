

# IntermediaryLoanApplication

A loan application that is submitted by the intermediary company on behalf of their partner(s)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partnerId** | **Integer** | ID of the partner that is buying an item. This ID can be taken from the Report endpoint and Intermediary route. |  [optional] |
|**purchaseItem** | **String** | Description of the item you buy e.g. Car |  [optional] |
|**itemStatus** | **String** | Status of the item |  [optional] |
|**itemName** | **String** | Name of the item |  [optional] |
|**itemType** | **String** | Type of the item e.g. SUV, Van, Saloon, Cabriolet etc. |  [optional] |
|**itemBrand** | **String** | Brand of the item |  [optional] |
|**itemModel** | **String** | Model of the item |  [optional] |
|**itemColor** | **String** | Color of the item |  [optional] |
|**itemMarketValue** | **Double** | Market value of the item you want to buy. Please notice that the Loan Amount will be 80% of this value. |  [optional] |
|**manufactureDate** | **String** | Date when the car was manufactured |  [optional] |
|**firstRegistration** | **String** | Date when the item was registered very first time |  [optional] |
|**mileage** | **String** | Mileage of the item |  [optional] |
|**itemCertificate** | **String** | Certificate of the item |  [optional] |
|**serialNumber** | **String** | Serial number (aka VIN or Chassis No.) |  |
|**identificationNumber** | **String** | Identification number (aka Stammnummer) |  |
|**rentalAmount** | **Double** | Rental amount per month |  [optional] |
|**handoverDate** | **String** | The expected/approximate handover date (date when the car is expected to be handed over to the subscriber). Expected format: dd.MM.yyyy |  [optional] |



