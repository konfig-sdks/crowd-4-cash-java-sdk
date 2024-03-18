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
 * ManualOptionRule
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ManualOptionRule {
  public static final String SERIALIZED_NAME_LOAN_RATING = "loanRating";
  @SerializedName(SERIALIZED_NAME_LOAN_RATING)
  private String loanRating;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT_FOR_INVESTMENT = "totalAmountForInvestment";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT_FOR_INVESTMENT)
  private Double totalAmountForInvestment;

  public static final String SERIALIZED_NAME_MINIMUM_INTEREST_RATE = "minimumInterestRate";
  @SerializedName(SERIALIZED_NAME_MINIMUM_INTEREST_RATE)
  private Double minimumInterestRate;

  public static final String SERIALIZED_NAME_MINIMUM_PER_BID = "minimumPerBid";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PER_BID)
  private Double minimumPerBid;

  public static final String SERIALIZED_NAME_MAXIMUM_PER_BID = "maximumPerBid";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_PER_BID)
  private Double maximumPerBid;

  public static final String SERIALIZED_NAME_REINVEST = "reinvest";
  @SerializedName(SERIALIZED_NAME_REINVEST)
  private Boolean reinvest;

  public static final String SERIALIZED_NAME_SECONDARY_MARKET = "secondaryMarket";
  @SerializedName(SERIALIZED_NAME_SECONDARY_MARKET)
  private Boolean secondaryMarket;

  public static final String SERIALIZED_NAME_DURATION_FROM = "durationFrom";
  @SerializedName(SERIALIZED_NAME_DURATION_FROM)
  private Integer durationFrom;

  public static final String SERIALIZED_NAME_DURATION_TO = "durationTo";
  @SerializedName(SERIALIZED_NAME_DURATION_TO)
  private Integer durationTo;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public ManualOptionRule() {
  }

  public ManualOptionRule loanRating(String loanRating) {
    
    
    
    
    this.loanRating = loanRating;
    return this;
  }

   /**
   * Get loanRating
   * @return loanRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B", value = "")

  public String getLoanRating() {
    return loanRating;
  }


  public void setLoanRating(String loanRating) {
    
    
    
    this.loanRating = loanRating;
  }


  public ManualOptionRule totalAmountForInvestment(Double totalAmountForInvestment) {
    
    
    
    
    this.totalAmountForInvestment = totalAmountForInvestment;
    return this;
  }

   /**
   * Total amount that can be invested using manual autoinvest
   * @return totalAmountForInvestment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "Total amount that can be invested using manual autoinvest")

  public Double getTotalAmountForInvestment() {
    return totalAmountForInvestment;
  }


  public void setTotalAmountForInvestment(Double totalAmountForInvestment) {
    
    
    
    this.totalAmountForInvestment = totalAmountForInvestment;
  }


  public ManualOptionRule minimumInterestRate(Double minimumInterestRate) {
    
    
    
    
    this.minimumInterestRate = minimumInterestRate;
    return this;
  }

   /**
   * Minimum interest rate of the loan in which investor wants to invest
   * @return minimumInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Minimum interest rate of the loan in which investor wants to invest")

  public Double getMinimumInterestRate() {
    return minimumInterestRate;
  }


  public void setMinimumInterestRate(Double minimumInterestRate) {
    
    
    
    this.minimumInterestRate = minimumInterestRate;
  }


  public ManualOptionRule minimumPerBid(Double minimumPerBid) {
    
    
    
    
    this.minimumPerBid = minimumPerBid;
    return this;
  }

   /**
   * Minimum bid amount per loan
   * @return minimumPerBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "Minimum bid amount per loan")

  public Double getMinimumPerBid() {
    return minimumPerBid;
  }


  public void setMinimumPerBid(Double minimumPerBid) {
    
    
    
    this.minimumPerBid = minimumPerBid;
  }


  public ManualOptionRule maximumPerBid(Double maximumPerBid) {
    
    
    
    
    this.maximumPerBid = maximumPerBid;
    return this;
  }

   /**
   * Maximum bid amount per loan
   * @return maximumPerBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3500", value = "Maximum bid amount per loan")

  public Double getMaximumPerBid() {
    return maximumPerBid;
  }


  public void setMaximumPerBid(Double maximumPerBid) {
    
    
    
    this.maximumPerBid = maximumPerBid;
  }


  public ManualOptionRule reinvest(Boolean reinvest) {
    
    
    
    
    this.reinvest = reinvest;
    return this;
  }

   /**
   * Can investments be reinvested? - yes, no
   * @return reinvest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can investments be reinvested? - yes, no")

  public Boolean getReinvest() {
    return reinvest;
  }


  public void setReinvest(Boolean reinvest) {
    
    
    
    this.reinvest = reinvest;
  }


  public ManualOptionRule secondaryMarket(Boolean secondaryMarket) {
    
    
    
    
    this.secondaryMarket = secondaryMarket;
    return this;
  }

   /**
   * Can investment be sold on the secondary market? - yes, no
   * @return secondaryMarket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can investment be sold on the secondary market? - yes, no")

  public Boolean getSecondaryMarket() {
    return secondaryMarket;
  }


  public void setSecondaryMarket(Boolean secondaryMarket) {
    
    
    
    this.secondaryMarket = secondaryMarket;
  }


  public ManualOptionRule durationFrom(Integer durationFrom) {
    
    
    
    
    this.durationFrom = durationFrom;
    return this;
  }

   /**
   * Date when manual autoinvest starts to be used
   * @return durationFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when manual autoinvest starts to be used")

  public Integer getDurationFrom() {
    return durationFrom;
  }


  public void setDurationFrom(Integer durationFrom) {
    
    
    
    this.durationFrom = durationFrom;
  }


  public ManualOptionRule durationTo(Integer durationTo) {
    
    
    
    
    this.durationTo = durationTo;
    return this;
  }

   /**
   * Date when manual autoinvest ends to be used
   * @return durationTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when manual autoinvest ends to be used")

  public Integer getDurationTo() {
    return durationTo;
  }


  public void setDurationTo(Integer durationTo) {
    
    
    
    this.durationTo = durationTo;
  }


  public ManualOptionRule isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is manual autoinvest enabled? yes. no
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is manual autoinvest enabled? yes. no")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public ManualOptionRule currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHF", value = "Currency")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
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
   * @return the ManualOptionRule instance itself
   */
  public ManualOptionRule putAdditionalProperty(String key, Object value) {
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
    ManualOptionRule manualOptionRule = (ManualOptionRule) o;
    return Objects.equals(this.loanRating, manualOptionRule.loanRating) &&
        Objects.equals(this.totalAmountForInvestment, manualOptionRule.totalAmountForInvestment) &&
        Objects.equals(this.minimumInterestRate, manualOptionRule.minimumInterestRate) &&
        Objects.equals(this.minimumPerBid, manualOptionRule.minimumPerBid) &&
        Objects.equals(this.maximumPerBid, manualOptionRule.maximumPerBid) &&
        Objects.equals(this.reinvest, manualOptionRule.reinvest) &&
        Objects.equals(this.secondaryMarket, manualOptionRule.secondaryMarket) &&
        Objects.equals(this.durationFrom, manualOptionRule.durationFrom) &&
        Objects.equals(this.durationTo, manualOptionRule.durationTo) &&
        Objects.equals(this.isEnabled, manualOptionRule.isEnabled) &&
        Objects.equals(this.currency, manualOptionRule.currency)&&
        Objects.equals(this.additionalProperties, manualOptionRule.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanRating, totalAmountForInvestment, minimumInterestRate, minimumPerBid, maximumPerBid, reinvest, secondaryMarket, durationFrom, durationTo, isEnabled, currency, additionalProperties);
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
    sb.append("class ManualOptionRule {\n");
    sb.append("    loanRating: ").append(toIndentedString(loanRating)).append("\n");
    sb.append("    totalAmountForInvestment: ").append(toIndentedString(totalAmountForInvestment)).append("\n");
    sb.append("    minimumInterestRate: ").append(toIndentedString(minimumInterestRate)).append("\n");
    sb.append("    minimumPerBid: ").append(toIndentedString(minimumPerBid)).append("\n");
    sb.append("    maximumPerBid: ").append(toIndentedString(maximumPerBid)).append("\n");
    sb.append("    reinvest: ").append(toIndentedString(reinvest)).append("\n");
    sb.append("    secondaryMarket: ").append(toIndentedString(secondaryMarket)).append("\n");
    sb.append("    durationFrom: ").append(toIndentedString(durationFrom)).append("\n");
    sb.append("    durationTo: ").append(toIndentedString(durationTo)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("loanRating");
    openapiFields.add("totalAmountForInvestment");
    openapiFields.add("minimumInterestRate");
    openapiFields.add("minimumPerBid");
    openapiFields.add("maximumPerBid");
    openapiFields.add("reinvest");
    openapiFields.add("secondaryMarket");
    openapiFields.add("durationFrom");
    openapiFields.add("durationTo");
    openapiFields.add("isEnabled");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManualOptionRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManualOptionRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualOptionRule is not found in the empty JSON string", ManualOptionRule.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("loanRating").isJsonNull() && (jsonObj.get("loanRating") != null && !jsonObj.get("loanRating").isJsonNull()) && !jsonObj.get("loanRating").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loanRating` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loanRating").toString()));
      }
      if (!jsonObj.get("currency").isJsonNull() && (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualOptionRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualOptionRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualOptionRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualOptionRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualOptionRule>() {
           @Override
           public void write(JsonWriter out, ManualOptionRule value) throws IOException {
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
           public ManualOptionRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ManualOptionRule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ManualOptionRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualOptionRule
  * @throws IOException if the JSON string is invalid with respect to ManualOptionRule
  */
  public static ManualOptionRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualOptionRule.class);
  }

 /**
  * Convert an instance of ManualOptionRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

