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
 * Monthly income of the borrower
 */
@ApiModel(description = "Monthly income of the borrower")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Income {
  public static final String SERIALIZED_NAME_PROFESSION = "profession";
  @SerializedName(SERIALIZED_NAME_PROFESSION)
  private String profession;

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employmentType";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  private String employmentType;

  public static final String SERIALIZED_NAME_EMPLOYMENT_RELATIONSHIP_UNDER_NOTICE = "employmentRelationshipUnderNotice";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_RELATIONSHIP_UNDER_NOTICE)
  private String employmentRelationshipUnderNotice;

  public static final String SERIALIZED_NAME_WORK_SINCE = "workSince";
  @SerializedName(SERIALIZED_NAME_WORK_SINCE)
  private String workSince;

  public static final String SERIALIZED_NAME_NUMBER_OF_SALARIES = "numberOfSalaries";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SALARIES)
  private Integer numberOfSalaries;

  public static final String SERIALIZED_NAME_MONTHLY_NET_INCOME = "monthlyNetIncome";
  @SerializedName(SERIALIZED_NAME_MONTHLY_NET_INCOME)
  private Double monthlyNetIncome;

  public static final String SERIALIZED_NAME_BONUS_AVERAGE = "bonusAverage";
  @SerializedName(SERIALIZED_NAME_BONUS_AVERAGE)
  private Double bonusAverage;

  public static final String SERIALIZED_NAME_ADDITIONAL_INCOME = "additionalIncome";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INCOME)
  private String additionalIncome;

  public static final String SERIALIZED_NAME_ADDITIONAL_INCOME_TYPE = "additionalIncomeType";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INCOME_TYPE)
  private String additionalIncomeType;

  public static final String SERIALIZED_NAME_ADDITIONAL_INCOME_AMOUNT = "additionalIncomeAmount";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INCOME_AMOUNT)
  private Double additionalIncomeAmount;

  public static final String SERIALIZED_NAME_PARTNER_INCOME = "partnerIncome";
  @SerializedName(SERIALIZED_NAME_PARTNER_INCOME)
  private String partnerIncome;

  public static final String SERIALIZED_NAME_PARTNER_PROFESSION = "partnerProfession";
  @SerializedName(SERIALIZED_NAME_PARTNER_PROFESSION)
  private String partnerProfession;

  public static final String SERIALIZED_NAME_PARTNER_WORK_SINCE = "partnerWorkSince";
  @SerializedName(SERIALIZED_NAME_PARTNER_WORK_SINCE)
  private String partnerWorkSince;

  public static final String SERIALIZED_NAME_PARTNER_NUMBER_OF_SALARIES = "partnerNumberOfSalaries";
  @SerializedName(SERIALIZED_NAME_PARTNER_NUMBER_OF_SALARIES)
  private Integer partnerNumberOfSalaries;

  public static final String SERIALIZED_NAME_PARTNER_MONTHLY_NET_INCOME = "partnerMonthlyNetIncome";
  @SerializedName(SERIALIZED_NAME_PARTNER_MONTHLY_NET_INCOME)
  private Double partnerMonthlyNetIncome;

  public static final String SERIALIZED_NAME_PARTNER_BONUS_AVERAGE = "partnerBonusAverage";
  @SerializedName(SERIALIZED_NAME_PARTNER_BONUS_AVERAGE)
  private Double partnerBonusAverage;

  public Income() {
  }

  public Income profession(String profession) {
    
    
    
    
    this.profession = profession;
    return this;
  }

   /**
   * Profession description
   * @return profession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Health insurance specialist, Doctor, Marketing specialist, etc.", value = "Profession description")

  public String getProfession() {
    return profession;
  }


  public void setProfession(String profession) {
    
    
    
    this.profession = profession;
  }


  public Income employmentType(String employmentType) {
    
    
    
    
    this.employmentType = employmentType;
    return this;
  }

   /**
   * Type of employment
   * @return employmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Employed With Open-Ended Contract, Selfemployed", value = "Type of employment")

  public String getEmploymentType() {
    return employmentType;
  }


  public void setEmploymentType(String employmentType) {
    
    
    
    this.employmentType = employmentType;
  }


  public Income employmentRelationshipUnderNotice(String employmentRelationshipUnderNotice) {
    
    
    
    
    this.employmentRelationshipUnderNotice = employmentRelationshipUnderNotice;
    return this;
  }

   /**
   * Is the employment under notice
   * @return employmentRelationshipUnderNotice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Is the employment under notice")

  public String getEmploymentRelationshipUnderNotice() {
    return employmentRelationshipUnderNotice;
  }


  public void setEmploymentRelationshipUnderNotice(String employmentRelationshipUnderNotice) {
    
    
    
    this.employmentRelationshipUnderNotice = employmentRelationshipUnderNotice;
  }


  public Income workSince(String workSince) {
    
    
    
    
    this.workSince = workSince;
    return this;
  }

   /**
   * Date since started with the current employer
   * @return workSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = " 01.10.2015", value = "Date since started with the current employer")

  public String getWorkSince() {
    return workSince;
  }


  public void setWorkSince(String workSince) {
    
    
    
    this.workSince = workSince;
  }


  public Income numberOfSalaries(Integer numberOfSalaries) {
    
    
    
    
    this.numberOfSalaries = numberOfSalaries;
    return this;
  }

   /**
   * Number of salaries paid out to borrower
   * @return numberOfSalaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of salaries paid out to borrower")

  public Integer getNumberOfSalaries() {
    return numberOfSalaries;
  }


  public void setNumberOfSalaries(Integer numberOfSalaries) {
    
    
    
    this.numberOfSalaries = numberOfSalaries;
  }


  public Income monthlyNetIncome(Double monthlyNetIncome) {
    
    
    
    
    this.monthlyNetIncome = monthlyNetIncome;
    return this;
  }

   /**
   * Monthly net income of the borrower
   * @return monthlyNetIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14991.66", value = "Monthly net income of the borrower")

  public Double getMonthlyNetIncome() {
    return monthlyNetIncome;
  }


  public void setMonthlyNetIncome(Double monthlyNetIncome) {
    
    
    
    this.monthlyNetIncome = monthlyNetIncome;
  }


  public Income bonusAverage(Double bonusAverage) {
    
    
    
    
    this.bonusAverage = bonusAverage;
    return this;
  }

   /**
   * Average bonus of the last 3 years
   * @return bonusAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7000", value = "Average bonus of the last 3 years")

  public Double getBonusAverage() {
    return bonusAverage;
  }


  public void setBonusAverage(Double bonusAverage) {
    
    
    
    this.bonusAverage = bonusAverage;
  }


  public Income additionalIncome(String additionalIncome) {
    
    
    
    
    this.additionalIncome = additionalIncome;
    return this;
  }

   /**
   * Additional income included?
   * @return additionalIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Additional income included?")

  public String getAdditionalIncome() {
    return additionalIncome;
  }


  public void setAdditionalIncome(String additionalIncome) {
    
    
    
    this.additionalIncome = additionalIncome;
  }


  public Income additionalIncomeType(String additionalIncomeType) {
    
    
    
    
    this.additionalIncomeType = additionalIncomeType;
    return this;
  }

   /**
   * Source of additional income
   * @return additionalIncomeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rent", value = "Source of additional income")

  public String getAdditionalIncomeType() {
    return additionalIncomeType;
  }


  public void setAdditionalIncomeType(String additionalIncomeType) {
    
    
    
    this.additionalIncomeType = additionalIncomeType;
  }


  public Income additionalIncomeAmount(Double additionalIncomeAmount) {
    
    
    
    
    this.additionalIncomeAmount = additionalIncomeAmount;
    return this;
  }

   /**
   * Amount of the additional income
   * @return additionalIncomeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Amount of the additional income")

  public Double getAdditionalIncomeAmount() {
    return additionalIncomeAmount;
  }


  public void setAdditionalIncomeAmount(Double additionalIncomeAmount) {
    
    
    
    this.additionalIncomeAmount = additionalIncomeAmount;
  }


  public Income partnerIncome(String partnerIncome) {
    
    
    
    
    this.partnerIncome = partnerIncome;
    return this;
  }

   /**
   * Include partner income?
   * @return partnerIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Include partner income?")

  public String getPartnerIncome() {
    return partnerIncome;
  }


  public void setPartnerIncome(String partnerIncome) {
    
    
    
    this.partnerIncome = partnerIncome;
  }


  public Income partnerProfession(String partnerProfession) {
    
    
    
    
    this.partnerProfession = partnerProfession;
    return this;
  }

   /**
   * Profession description (Partner)
   * @return partnerProfession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Health insurance specialist, Doctor, Marketing specialist, etc.", value = "Profession description (Partner)")

  public String getPartnerProfession() {
    return partnerProfession;
  }


  public void setPartnerProfession(String partnerProfession) {
    
    
    
    this.partnerProfession = partnerProfession;
  }


  public Income partnerWorkSince(String partnerWorkSince) {
    
    
    
    
    this.partnerWorkSince = partnerWorkSince;
    return this;
  }

   /**
   * Date since started with the current employer (Partner)
   * @return partnerWorkSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = " 01.06.2018", value = "Date since started with the current employer (Partner)")

  public String getPartnerWorkSince() {
    return partnerWorkSince;
  }


  public void setPartnerWorkSince(String partnerWorkSince) {
    
    
    
    this.partnerWorkSince = partnerWorkSince;
  }


  public Income partnerNumberOfSalaries(Integer partnerNumberOfSalaries) {
    
    
    
    
    this.partnerNumberOfSalaries = partnerNumberOfSalaries;
    return this;
  }

   /**
   * Number of salaries paid out to partner
   * @return partnerNumberOfSalaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of salaries paid out to partner")

  public Integer getPartnerNumberOfSalaries() {
    return partnerNumberOfSalaries;
  }


  public void setPartnerNumberOfSalaries(Integer partnerNumberOfSalaries) {
    
    
    
    this.partnerNumberOfSalaries = partnerNumberOfSalaries;
  }


  public Income partnerMonthlyNetIncome(Double partnerMonthlyNetIncome) {
    
    
    
    
    this.partnerMonthlyNetIncome = partnerMonthlyNetIncome;
    return this;
  }

   /**
   * Monthly net income of the partner
   * @return partnerMonthlyNetIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6548.45", value = "Monthly net income of the partner")

  public Double getPartnerMonthlyNetIncome() {
    return partnerMonthlyNetIncome;
  }


  public void setPartnerMonthlyNetIncome(Double partnerMonthlyNetIncome) {
    
    
    
    this.partnerMonthlyNetIncome = partnerMonthlyNetIncome;
  }


  public Income partnerBonusAverage(Double partnerBonusAverage) {
    
    
    
    
    this.partnerBonusAverage = partnerBonusAverage;
    return this;
  }

   /**
   * Average bonus of partner of the last three years
   * @return partnerBonusAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "Average bonus of partner of the last three years")

  public Double getPartnerBonusAverage() {
    return partnerBonusAverage;
  }


  public void setPartnerBonusAverage(Double partnerBonusAverage) {
    
    
    
    this.partnerBonusAverage = partnerBonusAverage;
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
   * @return the Income instance itself
   */
  public Income putAdditionalProperty(String key, Object value) {
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
    Income income = (Income) o;
    return Objects.equals(this.profession, income.profession) &&
        Objects.equals(this.employmentType, income.employmentType) &&
        Objects.equals(this.employmentRelationshipUnderNotice, income.employmentRelationshipUnderNotice) &&
        Objects.equals(this.workSince, income.workSince) &&
        Objects.equals(this.numberOfSalaries, income.numberOfSalaries) &&
        Objects.equals(this.monthlyNetIncome, income.monthlyNetIncome) &&
        Objects.equals(this.bonusAverage, income.bonusAverage) &&
        Objects.equals(this.additionalIncome, income.additionalIncome) &&
        Objects.equals(this.additionalIncomeType, income.additionalIncomeType) &&
        Objects.equals(this.additionalIncomeAmount, income.additionalIncomeAmount) &&
        Objects.equals(this.partnerIncome, income.partnerIncome) &&
        Objects.equals(this.partnerProfession, income.partnerProfession) &&
        Objects.equals(this.partnerWorkSince, income.partnerWorkSince) &&
        Objects.equals(this.partnerNumberOfSalaries, income.partnerNumberOfSalaries) &&
        Objects.equals(this.partnerMonthlyNetIncome, income.partnerMonthlyNetIncome) &&
        Objects.equals(this.partnerBonusAverage, income.partnerBonusAverage)&&
        Objects.equals(this.additionalProperties, income.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(profession, employmentType, employmentRelationshipUnderNotice, workSince, numberOfSalaries, monthlyNetIncome, bonusAverage, additionalIncome, additionalIncomeType, additionalIncomeAmount, partnerIncome, partnerProfession, partnerWorkSince, partnerNumberOfSalaries, partnerMonthlyNetIncome, partnerBonusAverage, additionalProperties);
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
    sb.append("class Income {\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    employmentRelationshipUnderNotice: ").append(toIndentedString(employmentRelationshipUnderNotice)).append("\n");
    sb.append("    workSince: ").append(toIndentedString(workSince)).append("\n");
    sb.append("    numberOfSalaries: ").append(toIndentedString(numberOfSalaries)).append("\n");
    sb.append("    monthlyNetIncome: ").append(toIndentedString(monthlyNetIncome)).append("\n");
    sb.append("    bonusAverage: ").append(toIndentedString(bonusAverage)).append("\n");
    sb.append("    additionalIncome: ").append(toIndentedString(additionalIncome)).append("\n");
    sb.append("    additionalIncomeType: ").append(toIndentedString(additionalIncomeType)).append("\n");
    sb.append("    additionalIncomeAmount: ").append(toIndentedString(additionalIncomeAmount)).append("\n");
    sb.append("    partnerIncome: ").append(toIndentedString(partnerIncome)).append("\n");
    sb.append("    partnerProfession: ").append(toIndentedString(partnerProfession)).append("\n");
    sb.append("    partnerWorkSince: ").append(toIndentedString(partnerWorkSince)).append("\n");
    sb.append("    partnerNumberOfSalaries: ").append(toIndentedString(partnerNumberOfSalaries)).append("\n");
    sb.append("    partnerMonthlyNetIncome: ").append(toIndentedString(partnerMonthlyNetIncome)).append("\n");
    sb.append("    partnerBonusAverage: ").append(toIndentedString(partnerBonusAverage)).append("\n");
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
    openapiFields.add("profession");
    openapiFields.add("employmentType");
    openapiFields.add("employmentRelationshipUnderNotice");
    openapiFields.add("workSince");
    openapiFields.add("numberOfSalaries");
    openapiFields.add("monthlyNetIncome");
    openapiFields.add("bonusAverage");
    openapiFields.add("additionalIncome");
    openapiFields.add("additionalIncomeType");
    openapiFields.add("additionalIncomeAmount");
    openapiFields.add("partnerIncome");
    openapiFields.add("partnerProfession");
    openapiFields.add("partnerWorkSince");
    openapiFields.add("partnerNumberOfSalaries");
    openapiFields.add("partnerMonthlyNetIncome");
    openapiFields.add("partnerBonusAverage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Income
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Income.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Income is not found in the empty JSON string", Income.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("profession").isJsonNull() && (jsonObj.get("profession") != null && !jsonObj.get("profession").isJsonNull()) && !jsonObj.get("profession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profession").toString()));
      }
      if (!jsonObj.get("employmentType").isJsonNull() && (jsonObj.get("employmentType") != null && !jsonObj.get("employmentType").isJsonNull()) && !jsonObj.get("employmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employmentType").toString()));
      }
      if (!jsonObj.get("employmentRelationshipUnderNotice").isJsonNull() && (jsonObj.get("employmentRelationshipUnderNotice") != null && !jsonObj.get("employmentRelationshipUnderNotice").isJsonNull()) && !jsonObj.get("employmentRelationshipUnderNotice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employmentRelationshipUnderNotice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employmentRelationshipUnderNotice").toString()));
      }
      if (!jsonObj.get("workSince").isJsonNull() && (jsonObj.get("workSince") != null && !jsonObj.get("workSince").isJsonNull()) && !jsonObj.get("workSince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workSince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workSince").toString()));
      }
      if (!jsonObj.get("additionalIncome").isJsonNull() && (jsonObj.get("additionalIncome") != null && !jsonObj.get("additionalIncome").isJsonNull()) && !jsonObj.get("additionalIncome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalIncome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalIncome").toString()));
      }
      if (!jsonObj.get("additionalIncomeType").isJsonNull() && (jsonObj.get("additionalIncomeType") != null && !jsonObj.get("additionalIncomeType").isJsonNull()) && !jsonObj.get("additionalIncomeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalIncomeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalIncomeType").toString()));
      }
      if (!jsonObj.get("partnerIncome").isJsonNull() && (jsonObj.get("partnerIncome") != null && !jsonObj.get("partnerIncome").isJsonNull()) && !jsonObj.get("partnerIncome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerIncome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerIncome").toString()));
      }
      if (!jsonObj.get("partnerProfession").isJsonNull() && (jsonObj.get("partnerProfession") != null && !jsonObj.get("partnerProfession").isJsonNull()) && !jsonObj.get("partnerProfession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerProfession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerProfession").toString()));
      }
      if (!jsonObj.get("partnerWorkSince").isJsonNull() && (jsonObj.get("partnerWorkSince") != null && !jsonObj.get("partnerWorkSince").isJsonNull()) && !jsonObj.get("partnerWorkSince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerWorkSince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerWorkSince").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Income.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Income' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Income> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Income.class));

       return (TypeAdapter<T>) new TypeAdapter<Income>() {
           @Override
           public void write(JsonWriter out, Income value) throws IOException {
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
           public Income read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Income instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Income given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Income
  * @throws IOException if the JSON string is invalid with respect to Income
  */
  public static Income fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Income.class);
  }

 /**
  * Convert an instance of Income to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

