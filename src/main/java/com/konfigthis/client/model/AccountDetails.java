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
 * AccountDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountDetails {
  public static final String SERIALIZED_NAME_AVAILABLE_CASH = "availableCash";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CASH)
  private Double availableCash;

  public static final String SERIALIZED_NAME_AVAILABLE_CASH_CURRENCY = "availableCashCurrency";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CASH_CURRENCY)
  private String availableCashCurrency;

  public static final String SERIALIZED_NAME_ACCOUNT_VALUE = "accountValue";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VALUE)
  private Double accountValue;

  public static final String SERIALIZED_NAME_INVESTED_AMOUNT = "investedAmount";
  @SerializedName(SERIALIZED_NAME_INVESTED_AMOUNT)
  private Double investedAmount;

  public static final String SERIALIZED_NAME_NUMBER_OF_INVESTMENTS = "numberOfInvestments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INVESTMENTS)
  private Integer numberOfInvestments;

  public static final String SERIALIZED_NAME_LOSSES = "losses";
  @SerializedName(SERIALIZED_NAME_LOSSES)
  private Double losses;

  public AccountDetails() {
  }

  public AccountDetails availableCash(Double availableCash) {
    
    
    
    
    this.availableCash = availableCash;
    return this;
  }

   /**
   * Receivables that are not paid to investor
   * @return availableCash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "250.32", value = "Receivables that are not paid to investor")

  public Double getAvailableCash() {
    return availableCash;
  }


  public void setAvailableCash(Double availableCash) {
    
    
    
    this.availableCash = availableCash;
  }


  public AccountDetails availableCashCurrency(String availableCashCurrency) {
    
    
    
    
    this.availableCashCurrency = availableCashCurrency;
    return this;
  }

   /**
   * Currency
   * @return availableCashCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHF", value = "Currency")

  public String getAvailableCashCurrency() {
    return availableCashCurrency;
  }


  public void setAvailableCashCurrency(String availableCashCurrency) {
    
    
    
    this.availableCashCurrency = availableCashCurrency;
  }


  public AccountDetails accountValue(Double accountValue) {
    
    
    
    
    this.accountValue = accountValue;
    return this;
  }

   /**
   * Current principal balance + available cash
   * @return accountValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4750.32", value = "Current principal balance + available cash")

  public Double getAccountValue() {
    return accountValue;
  }


  public void setAccountValue(Double accountValue) {
    
    
    
    this.accountValue = accountValue;
  }


  public AccountDetails investedAmount(Double investedAmount) {
    
    
    
    
    this.investedAmount = investedAmount;
    return this;
  }

   /**
   * Current principal balance
   * @return investedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4500", value = "Current principal balance")

  public Double getInvestedAmount() {
    return investedAmount;
  }


  public void setInvestedAmount(Double investedAmount) {
    
    
    
    this.investedAmount = investedAmount;
  }


  public AccountDetails numberOfInvestments(Integer numberOfInvestments) {
    
    
    
    
    this.numberOfInvestments = numberOfInvestments;
    return this;
  }

   /**
   * Current number of investments
   * @return numberOfInvestments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Current number of investments")

  public Integer getNumberOfInvestments() {
    return numberOfInvestments;
  }


  public void setNumberOfInvestments(Integer numberOfInvestments) {
    
    
    
    this.numberOfInvestments = numberOfInvestments;
  }


  public AccountDetails losses(Double losses) {
    
    
    
    
    this.losses = losses;
    return this;
  }

   /**
   * The sum of \&quot;bad debt\&quot; and \&quot;default\&quot;
   * @return losses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "250", value = "The sum of \"bad debt\" and \"default\"")

  public Double getLosses() {
    return losses;
  }


  public void setLosses(Double losses) {
    
    
    
    this.losses = losses;
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
   * @return the AccountDetails instance itself
   */
  public AccountDetails putAdditionalProperty(String key, Object value) {
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
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.availableCash, accountDetails.availableCash) &&
        Objects.equals(this.availableCashCurrency, accountDetails.availableCashCurrency) &&
        Objects.equals(this.accountValue, accountDetails.accountValue) &&
        Objects.equals(this.investedAmount, accountDetails.investedAmount) &&
        Objects.equals(this.numberOfInvestments, accountDetails.numberOfInvestments) &&
        Objects.equals(this.losses, accountDetails.losses)&&
        Objects.equals(this.additionalProperties, accountDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCash, availableCashCurrency, accountValue, investedAmount, numberOfInvestments, losses, additionalProperties);
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
    sb.append("class AccountDetails {\n");
    sb.append("    availableCash: ").append(toIndentedString(availableCash)).append("\n");
    sb.append("    availableCashCurrency: ").append(toIndentedString(availableCashCurrency)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    investedAmount: ").append(toIndentedString(investedAmount)).append("\n");
    sb.append("    numberOfInvestments: ").append(toIndentedString(numberOfInvestments)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
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
    openapiFields.add("availableCash");
    openapiFields.add("availableCashCurrency");
    openapiFields.add("accountValue");
    openapiFields.add("investedAmount");
    openapiFields.add("numberOfInvestments");
    openapiFields.add("losses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDetails is not found in the empty JSON string", AccountDetails.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("availableCashCurrency").isJsonNull() && (jsonObj.get("availableCashCurrency") != null && !jsonObj.get("availableCashCurrency").isJsonNull()) && !jsonObj.get("availableCashCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableCashCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableCashCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDetails>() {
           @Override
           public void write(JsonWriter out, AccountDetails value) throws IOException {
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
           public AccountDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountDetails
  * @throws IOException if the JSON string is invalid with respect to AccountDetails
  */
  public static AccountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDetails.class);
  }

 /**
  * Convert an instance of AccountDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

