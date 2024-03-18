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
 * rental location that is the borrower itself e.g. garage/shop/store
 */
@ApiModel(description = "rental location that is the borrower itself e.g. garage/shop/store")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntermediaryPartner {
  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partnerName";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_LEGAL_FORM = "legalForm";
  @SerializedName(SERIALIZED_NAME_LEGAL_FORM)
  private String legalForm;

  public static final String SERIALIZED_NAME_YEAR_ESTABLISHED = "yearEstablished";
  @SerializedName(SERIALIZED_NAME_YEAR_ESTABLISHED)
  private String yearEstablished;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER = "houseNumber";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER)
  private String houseNumber;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_NUMBER_OF_LOANS = "numberOfLoans";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_LOANS)
  private Integer numberOfLoans;

  public static final String SERIALIZED_NAME_ALLOWED_LIMIT_AMOUNT = "allowedLimitAmount";
  @SerializedName(SERIALIZED_NAME_ALLOWED_LIMIT_AMOUNT)
  private Double allowedLimitAmount;

  public static final String SERIALIZED_NAME_USED_LIMIT_AMOUNT = "usedLimitAmount";
  @SerializedName(SERIALIZED_NAME_USED_LIMIT_AMOUNT)
  private Double usedLimitAmount;

  public static final String SERIALIZED_NAME_REMAINING_LIMIT_AMOUNT = "remainingLimitAmount";
  @SerializedName(SERIALIZED_NAME_REMAINING_LIMIT_AMOUNT)
  private Double remainingLimitAmount;

  public IntermediaryPartner() {
  }

  public IntermediaryPartner partnerId(Integer partnerId) {
    
    
    
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Id of the partner
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2342", value = "Id of the partner")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    
    
    
    this.partnerId = partnerId;
  }


  public IntermediaryPartner partnerName(String partnerName) {
    
    
    
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * Name of the partner
   * @return partnerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Autorama AG", value = "Name of the partner")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    
    
    
    this.partnerName = partnerName;
  }


  public IntermediaryPartner legalForm(String legalForm) {
    
    
    
    
    this.legalForm = legalForm;
    return this;
  }

   /**
   * legal form of the partner
   * @return legalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GmbH", value = "legal form of the partner")

  public String getLegalForm() {
    return legalForm;
  }


  public void setLegalForm(String legalForm) {
    
    
    
    this.legalForm = legalForm;
  }


  public IntermediaryPartner yearEstablished(String yearEstablished) {
    
    
    
    
    this.yearEstablished = yearEstablished;
    return this;
  }

   /**
   * when the company was established
   * @return yearEstablished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017", value = "when the company was established")

  public String getYearEstablished() {
    return yearEstablished;
  }


  public void setYearEstablished(String yearEstablished) {
    
    
    
    this.yearEstablished = yearEstablished;
  }


  public IntermediaryPartner address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Street address of the garage/shop/store
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street address of the garage/shop/store")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public IntermediaryPartner houseNumber(String houseNumber) {
    
    
    
    
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * House number of the garage/shop/store
   * @return houseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "House number of the garage/shop/store")

  public String getHouseNumber() {
    return houseNumber;
  }


  public void setHouseNumber(String houseNumber) {
    
    
    
    this.houseNumber = houseNumber;
  }


  public IntermediaryPartner zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * Zip code of the garage/shop/store
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip code of the garage/shop/store")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
  }


  public IntermediaryPartner city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * City where the garage/shop/store resides
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City where the garage/shop/store resides")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public IntermediaryPartner phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of the garage/shop/store
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of the garage/shop/store")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public IntermediaryPartner iban(String iban) {
    
    
    
    
    this.iban = iban;
    return this;
  }

   /**
   * IBAN of the company
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IBAN of the company")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    
    
    
    this.iban = iban;
  }


  public IntermediaryPartner numberOfLoans(Integer numberOfLoans) {
    
    
    
    
    this.numberOfLoans = numberOfLoans;
    return this;
  }

   /**
   * total number of loans
   * @return numberOfLoans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "total number of loans")

  public Integer getNumberOfLoans() {
    return numberOfLoans;
  }


  public void setNumberOfLoans(Integer numberOfLoans) {
    
    
    
    this.numberOfLoans = numberOfLoans;
  }


  public IntermediaryPartner allowedLimitAmount(Double allowedLimitAmount) {
    
    
    
    
    this.allowedLimitAmount = allowedLimitAmount;
    return this;
  }

   /**
   * limit allowed by C4C e.g. 200&#39;000.00 CHF
   * @return allowedLimitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200000", value = "limit allowed by C4C e.g. 200'000.00 CHF")

  public Double getAllowedLimitAmount() {
    return allowedLimitAmount;
  }


  public void setAllowedLimitAmount(Double allowedLimitAmount) {
    
    
    
    this.allowedLimitAmount = allowedLimitAmount;
  }


  public IntermediaryPartner usedLimitAmount(Double usedLimitAmount) {
    
    
    
    
    this.usedLimitAmount = usedLimitAmount;
    return this;
  }

   /**
   * An amount that is already used out e.g. 150&#39;000.00 CHF
   * @return usedLimitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150000", value = "An amount that is already used out e.g. 150'000.00 CHF")

  public Double getUsedLimitAmount() {
    return usedLimitAmount;
  }


  public void setUsedLimitAmount(Double usedLimitAmount) {
    
    
    
    this.usedLimitAmount = usedLimitAmount;
  }


  public IntermediaryPartner remainingLimitAmount(Double remainingLimitAmount) {
    
    
    
    
    this.remainingLimitAmount = remainingLimitAmount;
    return this;
  }

   /**
   * available amount e.g. 50&#39;000.00 CHF
   * @return remainingLimitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50000", value = "available amount e.g. 50'000.00 CHF")

  public Double getRemainingLimitAmount() {
    return remainingLimitAmount;
  }


  public void setRemainingLimitAmount(Double remainingLimitAmount) {
    
    
    
    this.remainingLimitAmount = remainingLimitAmount;
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
   * @return the IntermediaryPartner instance itself
   */
  public IntermediaryPartner putAdditionalProperty(String key, Object value) {
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
    IntermediaryPartner intermediaryPartner = (IntermediaryPartner) o;
    return Objects.equals(this.partnerId, intermediaryPartner.partnerId) &&
        Objects.equals(this.partnerName, intermediaryPartner.partnerName) &&
        Objects.equals(this.legalForm, intermediaryPartner.legalForm) &&
        Objects.equals(this.yearEstablished, intermediaryPartner.yearEstablished) &&
        Objects.equals(this.address, intermediaryPartner.address) &&
        Objects.equals(this.houseNumber, intermediaryPartner.houseNumber) &&
        Objects.equals(this.zip, intermediaryPartner.zip) &&
        Objects.equals(this.city, intermediaryPartner.city) &&
        Objects.equals(this.phone, intermediaryPartner.phone) &&
        Objects.equals(this.iban, intermediaryPartner.iban) &&
        Objects.equals(this.numberOfLoans, intermediaryPartner.numberOfLoans) &&
        Objects.equals(this.allowedLimitAmount, intermediaryPartner.allowedLimitAmount) &&
        Objects.equals(this.usedLimitAmount, intermediaryPartner.usedLimitAmount) &&
        Objects.equals(this.remainingLimitAmount, intermediaryPartner.remainingLimitAmount)&&
        Objects.equals(this.additionalProperties, intermediaryPartner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, partnerName, legalForm, yearEstablished, address, houseNumber, zip, city, phone, iban, numberOfLoans, allowedLimitAmount, usedLimitAmount, remainingLimitAmount, additionalProperties);
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
    sb.append("class IntermediaryPartner {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    yearEstablished: ").append(toIndentedString(yearEstablished)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    numberOfLoans: ").append(toIndentedString(numberOfLoans)).append("\n");
    sb.append("    allowedLimitAmount: ").append(toIndentedString(allowedLimitAmount)).append("\n");
    sb.append("    usedLimitAmount: ").append(toIndentedString(usedLimitAmount)).append("\n");
    sb.append("    remainingLimitAmount: ").append(toIndentedString(remainingLimitAmount)).append("\n");
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
    openapiFields.add("partnerId");
    openapiFields.add("partnerName");
    openapiFields.add("legalForm");
    openapiFields.add("yearEstablished");
    openapiFields.add("address");
    openapiFields.add("houseNumber");
    openapiFields.add("zip");
    openapiFields.add("city");
    openapiFields.add("phone");
    openapiFields.add("iban");
    openapiFields.add("numberOfLoans");
    openapiFields.add("allowedLimitAmount");
    openapiFields.add("usedLimitAmount");
    openapiFields.add("remainingLimitAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntermediaryPartner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntermediaryPartner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntermediaryPartner is not found in the empty JSON string", IntermediaryPartner.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("partnerName").isJsonNull() && (jsonObj.get("partnerName") != null && !jsonObj.get("partnerName").isJsonNull()) && !jsonObj.get("partnerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerName").toString()));
      }
      if (!jsonObj.get("legalForm").isJsonNull() && (jsonObj.get("legalForm") != null && !jsonObj.get("legalForm").isJsonNull()) && !jsonObj.get("legalForm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalForm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalForm").toString()));
      }
      if (!jsonObj.get("yearEstablished").isJsonNull() && (jsonObj.get("yearEstablished") != null && !jsonObj.get("yearEstablished").isJsonNull()) && !jsonObj.get("yearEstablished").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yearEstablished` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yearEstablished").toString()));
      }
      if (!jsonObj.get("address").isJsonNull() && (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("houseNumber").isJsonNull() && (jsonObj.get("houseNumber") != null && !jsonObj.get("houseNumber").isJsonNull()) && !jsonObj.get("houseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `houseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("houseNumber").toString()));
      }
      if (!jsonObj.get("zip").isJsonNull() && (jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if (!jsonObj.get("city").isJsonNull() && (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("phone").isJsonNull() && (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("iban").isJsonNull() && (jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonNull()) && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntermediaryPartner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntermediaryPartner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntermediaryPartner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntermediaryPartner.class));

       return (TypeAdapter<T>) new TypeAdapter<IntermediaryPartner>() {
           @Override
           public void write(JsonWriter out, IntermediaryPartner value) throws IOException {
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
           public IntermediaryPartner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntermediaryPartner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntermediaryPartner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntermediaryPartner
  * @throws IOException if the JSON string is invalid with respect to IntermediaryPartner
  */
  public static IntermediaryPartner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntermediaryPartner.class);
  }

 /**
  * Convert an instance of IntermediaryPartner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

