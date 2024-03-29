/*
 * C4C REST API
 * Access to the Crowd4Cash Crowdlending Platform through an API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: info@crowd4cash.ch
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * A loan that was made on behalf of your partner
 */
@ApiModel(description = "A loan that was made on behalf of your partner")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntermediaryLoan {
  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Integer loanId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partnerName";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_APPROVED = "dateApproved";
  @SerializedName(SERIALIZED_NAME_DATE_APPROVED)
  private String dateApproved;

  public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loanAmount";
  @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
  private Double loanAmount;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interestRate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Double interestRate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_LOAN_RATING = "loanRating";
  @SerializedName(SERIALIZED_NAME_LOAN_RATING)
  private String loanRating;

  public static final String SERIALIZED_NAME_LOAN_STATUS = "loanStatus";
  @SerializedName(SERIALIZED_NAME_LOAN_STATUS)
  private String loanStatus;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "lastPaymentDate";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private String lastPaymentDate;

  public static final String SERIALIZED_NAME_PERFORMANCE_STATUS = "performanceStatus";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_STATUS)
  private String performanceStatus;

  public static final String SERIALIZED_NAME_DAYS_LATE = "daysLate";
  @SerializedName(SERIALIZED_NAME_DAYS_LATE)
  private Integer daysLate;

  public static final String SERIALIZED_NAME_COLLATERAL = "collateral";
  @SerializedName(SERIALIZED_NAME_COLLATERAL)
  private String collateral;

  public static final String SERIALIZED_NAME_COLLATERAL_TYPE = "collateralType";
  @SerializedName(SERIALIZED_NAME_COLLATERAL_TYPE)
  private String collateralType;

  public static final String SERIALIZED_NAME_INSURANCE = "insurance";
  @SerializedName(SERIALIZED_NAME_INSURANCE)
  private String insurance;

  public static final String SERIALIZED_NAME_TOTAL_PRINCIPAL_REMAINING = "totalPrincipalRemaining";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRINCIPAL_REMAINING)
  private Double totalPrincipalRemaining;

  public static final String SERIALIZED_NAME_NUMBER_OF_UNPAID_ANNUITIES = "numberOfUnpaidAnnuities";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_UNPAID_ANNUITIES)
  private Integer numberOfUnpaidAnnuities;

  public static final String SERIALIZED_NAME_TOTAL_REPAID_PRINCIPAL = "totalRepaidPrincipal";
  @SerializedName(SERIALIZED_NAME_TOTAL_REPAID_PRINCIPAL)
  private Double totalRepaidPrincipal;

  public static final String SERIALIZED_NAME_TOTAL_REPAID_INTEREST = "totalRepaidInterest";
  @SerializedName(SERIALIZED_NAME_TOTAL_REPAID_INTEREST)
  private Double totalRepaidInterest;

  public static final String SERIALIZED_NAME_DISBURSEMENT_DATE = "disbursementDate";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_DATE)
  private String disbursementDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private String maturityDate;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public IntermediaryLoan() {
  }

  public IntermediaryLoan loanId(Integer loanId) {
    
    
    
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Loan Id
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "443", value = "Loan Id")

  public Integer getLoanId() {
    return loanId;
  }


  public void setLoanId(Integer loanId) {
    
    
    
    this.loanId = loanId;
  }


  public IntermediaryLoan partnerId(Integer partnerId) {
    
    
    
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Partner Id
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2538", value = "Partner Id")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    
    
    
    this.partnerId = partnerId;
  }


  public IntermediaryLoan partnerName(String partnerName) {
    
    
    
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * Name of the partner
   * @return partnerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Auto Center Bühler GmbH", value = "Name of the partner")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    
    
    
    this.partnerName = partnerName;
  }


  public IntermediaryLoan dateCreated(String dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date of applicaton
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "04.06.2022", value = "Date of applicaton")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public IntermediaryLoan dateApproved(String dateApproved) {
    
    
    
    
    this.dateApproved = dateApproved;
    return this;
  }

   /**
   * Date of approval
   * @return dateApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.06.2022", value = "Date of approval")

  public String getDateApproved() {
    return dateApproved;
  }


  public void setDateApproved(String dateApproved) {
    
    
    
    this.dateApproved = dateApproved;
  }


  public IntermediaryLoan loanAmount(Double loanAmount) {
    
    
    
    
    this.loanAmount = loanAmount;
    return this;
  }

   /**
   * Loan amount total
   * @return loanAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "155000", value = "Loan amount total")

  public Double getLoanAmount() {
    return loanAmount;
  }


  public void setLoanAmount(Double loanAmount) {
    
    
    
    this.loanAmount = loanAmount;
  }


  public IntermediaryLoan interestRate(Double interestRate) {
    
    
    
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Interest rate of the loan
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.25", value = "Interest rate of the loan")

  public Double getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Double interestRate) {
    
    
    
    this.interestRate = interestRate;
  }


  public IntermediaryLoan duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration in months
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "Duration in months")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public IntermediaryLoan loanRating(String loanRating) {
    
    
    
    
    this.loanRating = loanRating;
    return this;
  }

   /**
   * Rating of the loan - AA, A, B, C, D
   * @return loanRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AA", value = "Rating of the loan - AA, A, B, C, D")

  public String getLoanRating() {
    return loanRating;
  }


  public void setLoanRating(String loanRating) {
    
    
    
    this.loanRating = loanRating;
  }


  public IntermediaryLoan loanStatus(String loanStatus) {
    
    
    
    
    this.loanStatus = loanStatus;
    return this;
  }

   /**
   * Status of the loan
   * @return loanStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Active", value = "Status of the loan")

  public String getLoanStatus() {
    return loanStatus;
  }


  public void setLoanStatus(String loanStatus) {
    
    
    
    this.loanStatus = loanStatus;
  }


  public IntermediaryLoan lastPaymentDate(String lastPaymentDate) {
    
    
    
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * Date of last payment received by the investor
   * @return lastPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.12.2022", value = "Date of last payment received by the investor")

  public String getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(String lastPaymentDate) {
    
    
    
    this.lastPaymentDate = lastPaymentDate;
  }


  public IntermediaryLoan performanceStatus(String performanceStatus) {
    
    
    
    
    this.performanceStatus = performanceStatus;
    return this;
  }

   /**
   * Payment status - performing, late 1 to 15 days, Defaulted
   * @return performanceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Performing", value = "Payment status - performing, late 1 to 15 days, Defaulted")

  public String getPerformanceStatus() {
    return performanceStatus;
  }


  public void setPerformanceStatus(String performanceStatus) {
    
    
    
    this.performanceStatus = performanceStatus;
  }


  public IntermediaryLoan daysLate(Integer daysLate) {
    
    
    
    
    this.daysLate = daysLate;
    return this;
  }

   /**
   * Number od days late
   * @return daysLate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Number od days late")

  public Integer getDaysLate() {
    return daysLate;
  }


  public void setDaysLate(Integer daysLate) {
    
    
    
    this.daysLate = daysLate;
  }


  public IntermediaryLoan collateral(String collateral) {
    
    
    
    
    this.collateral = collateral;
    return this;
  }

   /**
   * Is loan collaterialized? - Yes, No
   * @return collateral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is loan collaterialized? - Yes, No")

  public String getCollateral() {
    return collateral;
  }


  public void setCollateral(String collateral) {
    
    
    
    this.collateral = collateral;
  }


  public IntermediaryLoan collateralType(String collateralType) {
    
    
    
    
    this.collateralType = collateralType;
    return this;
  }

   /**
   * Collater Type - Real estate, Vehicle, Guarantor, Stock
   * @return collateralType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vehicle", value = "Collater Type - Real estate, Vehicle, Guarantor, Stock")

  public String getCollateralType() {
    return collateralType;
  }


  public void setCollateralType(String collateralType) {
    
    
    
    this.collateralType = collateralType;
  }


  public IntermediaryLoan insurance(String insurance) {
    
    
    
    
    this.insurance = insurance;
    return this;
  }

   /**
   * Is loan insured? - Yes, No
   * @return insurance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Is loan insured? - Yes, No")

  public String getInsurance() {
    return insurance;
  }


  public void setInsurance(String insurance) {
    
    
    
    this.insurance = insurance;
  }


  public IntermediaryLoan totalPrincipalRemaining(Double totalPrincipalRemaining) {
    
    
    
    
    this.totalPrincipalRemaining = totalPrincipalRemaining;
    return this;
  }

   /**
   * Unpaid Principal
   * @return totalPrincipalRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110233.625", value = "Unpaid Principal")

  public Double getTotalPrincipalRemaining() {
    return totalPrincipalRemaining;
  }


  public void setTotalPrincipalRemaining(Double totalPrincipalRemaining) {
    
    
    
    this.totalPrincipalRemaining = totalPrincipalRemaining;
  }


  public IntermediaryLoan numberOfUnpaidAnnuities(Integer numberOfUnpaidAnnuities) {
    
    
    
    
    this.numberOfUnpaidAnnuities = numberOfUnpaidAnnuities;
    return this;
  }

   /**
   * Number of annuities that have been not paid yet.
   * @return numberOfUnpaidAnnuities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Number of annuities that have been not paid yet.")

  public Integer getNumberOfUnpaidAnnuities() {
    return numberOfUnpaidAnnuities;
  }


  public void setNumberOfUnpaidAnnuities(Integer numberOfUnpaidAnnuities) {
    
    
    
    this.numberOfUnpaidAnnuities = numberOfUnpaidAnnuities;
  }


  public IntermediaryLoan totalRepaidPrincipal(Double totalRepaidPrincipal) {
    
    
    
    
    this.totalRepaidPrincipal = totalRepaidPrincipal;
    return this;
  }

   /**
   * Currently paid principal
   * @return totalRepaidPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "44766.375", value = "Currently paid principal")

  public Double getTotalRepaidPrincipal() {
    return totalRepaidPrincipal;
  }


  public void setTotalRepaidPrincipal(Double totalRepaidPrincipal) {
    
    
    
    this.totalRepaidPrincipal = totalRepaidPrincipal;
  }


  public IntermediaryLoan totalRepaidInterest(Double totalRepaidInterest) {
    
    
    
    
    this.totalRepaidInterest = totalRepaidInterest;
    return this;
  }

   /**
   * Currently paid interest
   * @return totalRepaidInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11147.345", value = "Currently paid interest")

  public Double getTotalRepaidInterest() {
    return totalRepaidInterest;
  }


  public void setTotalRepaidInterest(Double totalRepaidInterest) {
    
    
    
    this.totalRepaidInterest = totalRepaidInterest;
  }


  public IntermediaryLoan disbursementDate(String disbursementDate) {
    
    
    
    
    this.disbursementDate = disbursementDate;
    return this;
  }

   /**
   * Date when the loan is paid to borrower
   * @return disbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20.06.2012", value = "Date when the loan is paid to borrower")

  public String getDisbursementDate() {
    return disbursementDate;
  }


  public void setDisbursementDate(String disbursementDate) {
    
    
    
    this.disbursementDate = disbursementDate;
  }


  public IntermediaryLoan maturityDate(String maturityDate) {
    
    
    
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Date of the last instalment
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26.06.2023", value = "Date of the last instalment")

  public String getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(String maturityDate) {
    
    
    
    this.maturityDate = maturityDate;
  }


  public IntermediaryLoan notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Description of the loan purpose
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Due to a worse year in 2018, liquidity has been weakened and certain renewals in the company are needed.", value = "Description of the loan purpose")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public IntermediaryLoan link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * Web page where loan is desplayed in UI
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://crowd4cash.ch/loan-details/443", value = "Web page where loan is desplayed in UI")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the IntermediaryLoan instance itself
   */
  public IntermediaryLoan putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediaryLoan intermediaryLoan = (IntermediaryLoan) o;
    return Objects.equals(this.loanId, intermediaryLoan.loanId) &&
        Objects.equals(this.partnerId, intermediaryLoan.partnerId) &&
        Objects.equals(this.partnerName, intermediaryLoan.partnerName) &&
        Objects.equals(this.dateCreated, intermediaryLoan.dateCreated) &&
        Objects.equals(this.dateApproved, intermediaryLoan.dateApproved) &&
        Objects.equals(this.loanAmount, intermediaryLoan.loanAmount) &&
        Objects.equals(this.interestRate, intermediaryLoan.interestRate) &&
        Objects.equals(this.duration, intermediaryLoan.duration) &&
        Objects.equals(this.loanRating, intermediaryLoan.loanRating) &&
        Objects.equals(this.loanStatus, intermediaryLoan.loanStatus) &&
        Objects.equals(this.lastPaymentDate, intermediaryLoan.lastPaymentDate) &&
        Objects.equals(this.performanceStatus, intermediaryLoan.performanceStatus) &&
        Objects.equals(this.daysLate, intermediaryLoan.daysLate) &&
        Objects.equals(this.collateral, intermediaryLoan.collateral) &&
        Objects.equals(this.collateralType, intermediaryLoan.collateralType) &&
        Objects.equals(this.insurance, intermediaryLoan.insurance) &&
        Objects.equals(this.totalPrincipalRemaining, intermediaryLoan.totalPrincipalRemaining) &&
        Objects.equals(this.numberOfUnpaidAnnuities, intermediaryLoan.numberOfUnpaidAnnuities) &&
        Objects.equals(this.totalRepaidPrincipal, intermediaryLoan.totalRepaidPrincipal) &&
        Objects.equals(this.totalRepaidInterest, intermediaryLoan.totalRepaidInterest) &&
        Objects.equals(this.disbursementDate, intermediaryLoan.disbursementDate) &&
        Objects.equals(this.maturityDate, intermediaryLoan.maturityDate) &&
        Objects.equals(this.notes, intermediaryLoan.notes) &&
        Objects.equals(this.link, intermediaryLoan.link)&&
        Objects.equals(this.additionalProperties, intermediaryLoan.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanId, partnerId, partnerName, dateCreated, dateApproved, loanAmount, interestRate, duration, loanRating, loanStatus, lastPaymentDate, performanceStatus, daysLate, collateral, collateralType, insurance, totalPrincipalRemaining, numberOfUnpaidAnnuities, totalRepaidPrincipal, totalRepaidInterest, disbursementDate, maturityDate, notes, link, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntermediaryLoan {\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateApproved: ").append(toIndentedString(dateApproved)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    loanRating: ").append(toIndentedString(loanRating)).append("\n");
    sb.append("    loanStatus: ").append(toIndentedString(loanStatus)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    performanceStatus: ").append(toIndentedString(performanceStatus)).append("\n");
    sb.append("    daysLate: ").append(toIndentedString(daysLate)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    collateralType: ").append(toIndentedString(collateralType)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    totalPrincipalRemaining: ").append(toIndentedString(totalPrincipalRemaining)).append("\n");
    sb.append("    numberOfUnpaidAnnuities: ").append(toIndentedString(numberOfUnpaidAnnuities)).append("\n");
    sb.append("    totalRepaidPrincipal: ").append(toIndentedString(totalRepaidPrincipal)).append("\n");
    sb.append("    totalRepaidInterest: ").append(toIndentedString(totalRepaidInterest)).append("\n");
    sb.append("    disbursementDate: ").append(toIndentedString(disbursementDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("loanId");
    openapiFields.add("partnerId");
    openapiFields.add("partnerName");
    openapiFields.add("dateCreated");
    openapiFields.add("dateApproved");
    openapiFields.add("loanAmount");
    openapiFields.add("interestRate");
    openapiFields.add("duration");
    openapiFields.add("loanRating");
    openapiFields.add("loanStatus");
    openapiFields.add("lastPaymentDate");
    openapiFields.add("performanceStatus");
    openapiFields.add("daysLate");
    openapiFields.add("collateral");
    openapiFields.add("collateralType");
    openapiFields.add("insurance");
    openapiFields.add("totalPrincipalRemaining");
    openapiFields.add("numberOfUnpaidAnnuities");
    openapiFields.add("totalRepaidPrincipal");
    openapiFields.add("totalRepaidInterest");
    openapiFields.add("disbursementDate");
    openapiFields.add("maturityDate");
    openapiFields.add("notes");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntermediaryLoan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntermediaryLoan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntermediaryLoan is not found in the empty JSON string", IntermediaryLoan.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("partnerName").isJsonNull() && (jsonObj.get("partnerName") != null && !jsonObj.get("partnerName").isJsonNull()) && !jsonObj.get("partnerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerName").toString()));
      }
      if (!jsonObj.get("dateCreated").isJsonNull() && (jsonObj.get("dateCreated") != null && !jsonObj.get("dateCreated").isJsonNull()) && !jsonObj.get("dateCreated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateCreated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateCreated").toString()));
      }
      if (!jsonObj.get("dateApproved").isJsonNull() && (jsonObj.get("dateApproved") != null && !jsonObj.get("dateApproved").isJsonNull()) && !jsonObj.get("dateApproved").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateApproved` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateApproved").toString()));
      }
      if (!jsonObj.get("loanRating").isJsonNull() && (jsonObj.get("loanRating") != null && !jsonObj.get("loanRating").isJsonNull()) && !jsonObj.get("loanRating").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loanRating` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loanRating").toString()));
      }
      if (!jsonObj.get("loanStatus").isJsonNull() && (jsonObj.get("loanStatus") != null && !jsonObj.get("loanStatus").isJsonNull()) && !jsonObj.get("loanStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loanStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loanStatus").toString()));
      }
      if (!jsonObj.get("lastPaymentDate").isJsonNull() && (jsonObj.get("lastPaymentDate") != null && !jsonObj.get("lastPaymentDate").isJsonNull()) && !jsonObj.get("lastPaymentDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastPaymentDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastPaymentDate").toString()));
      }
      if (!jsonObj.get("performanceStatus").isJsonNull() && (jsonObj.get("performanceStatus") != null && !jsonObj.get("performanceStatus").isJsonNull()) && !jsonObj.get("performanceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performanceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performanceStatus").toString()));
      }
      if (!jsonObj.get("collateral").isJsonNull() && (jsonObj.get("collateral") != null && !jsonObj.get("collateral").isJsonNull()) && !jsonObj.get("collateral").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collateral` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collateral").toString()));
      }
      if (!jsonObj.get("collateralType").isJsonNull() && (jsonObj.get("collateralType") != null && !jsonObj.get("collateralType").isJsonNull()) && !jsonObj.get("collateralType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collateralType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collateralType").toString()));
      }
      if (!jsonObj.get("insurance").isJsonNull() && (jsonObj.get("insurance") != null && !jsonObj.get("insurance").isJsonNull()) && !jsonObj.get("insurance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insurance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insurance").toString()));
      }
      if (!jsonObj.get("disbursementDate").isJsonNull() && (jsonObj.get("disbursementDate") != null && !jsonObj.get("disbursementDate").isJsonNull()) && !jsonObj.get("disbursementDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disbursementDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disbursementDate").toString()));
      }
      if (!jsonObj.get("maturityDate").isJsonNull() && (jsonObj.get("maturityDate") != null && !jsonObj.get("maturityDate").isJsonNull()) && !jsonObj.get("maturityDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maturityDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maturityDate").toString()));
      }
      if (!jsonObj.get("notes").isJsonNull() && (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (!jsonObj.get("link").isJsonNull() && (jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntermediaryLoan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntermediaryLoan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntermediaryLoan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntermediaryLoan.class));

       return (TypeAdapter<T>) new TypeAdapter<IntermediaryLoan>() {
           @Override
           public void write(JsonWriter out, IntermediaryLoan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IntermediaryLoan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntermediaryLoan instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntermediaryLoan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntermediaryLoan
  * @throws IOException if the JSON string is invalid with respect to IntermediaryLoan
  */
  public static IntermediaryLoan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntermediaryLoan.class);
  }

 /**
  * Convert an instance of IntermediaryLoan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

