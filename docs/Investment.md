

# Investment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Investment ID - auto-generated |  [optional] |
|**dateCreated** | **String** | Date when the loan application is submitted |  [optional] |
|**dateApproved** | **String** | Date when the loan is approved |  [optional] |
|**loanAmount** | **Double** | Loan amount |  [optional] |
|**lastPaymentDate** | **String** | Date of last payment received by the investor |  [optional] |
|**interestRate** | **Double** | Interest rate of the loan |  [optional] |
|**paymentFrequency** | **String** | Payment frequency defines how often payments will be made |  [optional] |
|**duration** | **Integer** | Duration in months |  [optional] |
|**borrowerType** | **String** | Type of the borrower - Private or SME |  [optional] |
|**biddingType** | **String** | Type of the loan - Private or SME |  [optional] |
|**loanType** | **String** | Loan type - POS loan, Private and SME |  [optional] |
|**loanPurpose** | **String** | Purpose of the loan |  [optional] |
|**loanRating** | **String** | Rating of the loan - AA, A, B, C, D |  [optional] |
|**loanStatus** | **String** | Status of the loan |  [optional] |
|**performanceStatus** | **String** | Payment status - performing, late 1 to 15 days, Defaulted |  [optional] |
|**daysLate** | **Integer** | Number od days late |  [optional] |
|**collateral** | **String** | Is loan collaterialized? - Yes, No |  [optional] |
|**collateralType** | **String** | Collater Type - Real estate, Vehicle, Guarantor, Stock |  [optional] |
|**insurance** | **String** | Is loan insured? - Yes, No |  [optional] |
|**totalPrincipalRemaining** | **Double** | Unpaid Principal |  [optional] |
|**totalRepaidPrincipal** | **Double** | Currently paid principal |  [optional] |
|**totalRepaidInterest** | **Double** | Currently paid interest |  [optional] |
|**biddingEnd** | **String** | End date of the project |  [optional] |
|**investmentDate** | **OffsetDateTime** | Date when the bid is placed |  [optional] |
|**purchaseDate** | **String** | Date when the bid is paid by the investor |  [optional] |
|**disbursementDate** | **OffsetDateTime** | Date when the loan is paid to borrower |  [optional] |
|**maturityDate** | **OffsetDateTime** | Date of the last instalment |  [optional] |
|**share** | **Double** | Share of outstanding Principal held by Fund |  [optional] |
|**vFac** | **Double** | Value Factor |  [optional] |
|**loanPosition** | **Double** | Current Principal Balance according to Vfac |  [optional] [readonly] |
|**autoInvestId** | **Integer** | Auto Invest Id. It can be null if auto invest is turned off |  [optional] |
|**notes** | **String** | Description of the loan purpose |  [optional] |
|**link** | **String** | Web page where loan is desplayed in UI |  [optional] |
|**bid** | [**Bid**](Bid.md) |  |  [optional] |
|**borrowerPrivate** | [**ModelPrivate**](ModelPrivate.md) |  |  [optional] |
|**borrowerCompany** | [**Company**](Company.md) |  |  [optional] |
|**income** | [**Income**](Income.md) |  |  [optional] |
|**expense** | [**Expenses**](Expenses.md) |  |  [optional] |
|**crif** | [**Crif**](Crif.md) |  |  [optional] |
|**questionnaire** | [**Questionnaire**](Questionnaire.md) |  |  [optional] |
|**financial** | [**Financial**](Financial.md) |  |  [optional] |
|**amortizationSchedule** | [**AmortizationSchedule**](AmortizationSchedule.md) |  |  [optional] |
|**earlyRepayment** | [**EarlyRepayment**](EarlyRepayment.md) |  |  [optional] |
|**accountStatement** | [**AccountStatement**](AccountStatement.md) |  |  [optional] |
|**technicalData** | [**TechnicalData**](TechnicalData.md) |  |  [optional] |



