

# Opportunity

Investment opportunity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Loan ID |  [optional] |
|**dateCreated** | **String** | Date when the loan application has been submitted. |  [optional] |
|**dateApproved** | **String** | Date when the loan application has been reviewed and approved. |  [optional] |
|**loanAmount** | **Double** | An amount the borrower promises to repay |  [optional] |
|**interestRate** | **Double** | Interest rate in % |  [optional] |
|**paymentFrequency** | **String** | Payment frequency defines how often payments will be made |  [optional] |
|**duration** | **Integer** | Duration in months |  [optional] |
|**borrowerType** | **String** | Borrower Type (Private or SME) |  [optional] |
|**biddingType** | **String** | Loan type |  [optional] |
|**loanType** | **String** | Loan type e.g. POS loan, Private or SME |  [optional] |
|**loanPurpose** | **String** | Loan purpose category e.g. Education, Furnishing, Vehicle purchase, Wedding, Taxes, Refinancing etc. |  [optional] |
|**loanRating** | **String** | Crowd4Cash Rating |  [optional] |
|**loanStatus** | **String** | Loan status e.g. In funding, Funded, Active, Closed, Defaulted etc. |  [optional] |
|**performanceStatus** | **String** | Payment status e.g. Performing, Late 1 to 15 days, Late 16 to 30 days, Late more than 120 days, Defaulted, Cancelled, Finished prematurely, Paid off, etc. |  [optional] |
|**collateral** | **String** | Is oan collaterialized? |  [optional] |
|**collateralType** | **String** | Collater Type - Real estate, Vehicle, Guarantor, Stock |  [optional] |
|**insurance** | **String** | Is loan insured? |  [optional] |
|**openAmount** | **Double** | An amount that is not funded yet |  [optional] |
|**biddingEnd** | **String** | End date of the project |  [optional] |
|**notes** | **String** | Description of the loan purpose |  [optional] |
|**link** | **String** | Web page where loan is displayed in UI |  [optional] |
|**borrowerPrivate** | [**ModelPrivate**](ModelPrivate.md) |  |  [optional] |
|**borrowerCompany** | [**Company**](Company.md) |  |  [optional] |
|**income** | [**Income**](Income.md) |  |  [optional] |
|**expenses** | [**Expenses**](Expenses.md) |  |  [optional] |
|**questionnaire** | [**Questionnaire**](Questionnaire.md) |  |  [optional] |
|**financial** | [**Financial**](Financial.md) |  |  [optional] |
|**technicalData** | [**TechnicalData**](TechnicalData.md) |  |  [optional] |
|**bids** | [**List&lt;ActiveBid&gt;**](ActiveBid.md) |  |  [optional] |



