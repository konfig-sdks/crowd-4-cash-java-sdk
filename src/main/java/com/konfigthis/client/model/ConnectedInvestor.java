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
 * An investor whose investments are made indirectly through connector
 */
@ApiModel(description = "An investor whose investments are made indirectly through connector")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectedInvestor {
  public static final String SERIALIZED_NAME_INVESTOR_ID = "investorId";
  @SerializedName(SERIALIZED_NAME_INVESTOR_ID)
  private Integer investorId;

  public static final String SERIALIZED_NAME_INVESTOR_TYPE = "investorType";
  @SerializedName(SERIALIZED_NAME_INVESTOR_TYPE)
  private String investorType;

  public static final String SERIALIZED_NAME_INVESTOR_NAME = "investorName";
  @SerializedName(SERIALIZED_NAME_INVESTOR_NAME)
  private String investorName;

  public static final String SERIALIZED_NAME_PENDING_INVESTMENTS_COUNT = "pendingInvestmentsCount";
  @SerializedName(SERIALIZED_NAME_PENDING_INVESTMENTS_COUNT)
  private Integer pendingInvestmentsCount;

  public static final String SERIALIZED_NAME_PENDING_INVESTMENTS_TOTAL = "pendingInvestmentsTotal";
  @SerializedName(SERIALIZED_NAME_PENDING_INVESTMENTS_TOTAL)
  private Double pendingInvestmentsTotal;

  public static final String SERIALIZED_NAME_ACTIVE_INVESTMENTS_COUNT = "activeInvestmentsCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_INVESTMENTS_COUNT)
  private Integer activeInvestmentsCount;

  public static final String SERIALIZED_NAME_ACTIVE_INVESTMENTS_TOTAL = "activeInvestmentsTotal";
  @SerializedName(SERIALIZED_NAME_ACTIVE_INVESTMENTS_TOTAL)
  private Double activeInvestmentsTotal;

  public ConnectedInvestor() {
  }

  public ConnectedInvestor investorId(Integer investorId) {
    
    
    
    
    this.investorId = investorId;
    return this;
  }

   /**
   * Id of the investor
   * @return investorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "570", value = "Id of the investor")

  public Integer getInvestorId() {
    return investorId;
  }


  public void setInvestorId(Integer investorId) {
    
    
    
    this.investorId = investorId;
  }


  public ConnectedInvestor investorType(String investorType) {
    
    
    
    
    this.investorType = investorType;
    return this;
  }

   /**
   * Type of the investor Private/Company
   * @return investorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Company", value = "Type of the investor Private/Company")

  public String getInvestorType() {
    return investorType;
  }


  public void setInvestorType(String investorType) {
    
    
    
    this.investorType = investorType;
  }


  public ConnectedInvestor investorName(String investorName) {
    
    
    
    
    this.investorName = investorName;
    return this;
  }

   /**
   * Name of the investor
   * @return investorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Connected AG", value = "Name of the investor")

  public String getInvestorName() {
    return investorName;
  }


  public void setInvestorName(String investorName) {
    
    
    
    this.investorName = investorName;
  }


  public ConnectedInvestor pendingInvestmentsCount(Integer pendingInvestmentsCount) {
    
    
    
    
    this.pendingInvestmentsCount = pendingInvestmentsCount;
    return this;
  }

   /**
   * Number of pending investments
   * @return pendingInvestmentsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "Number of pending investments")

  public Integer getPendingInvestmentsCount() {
    return pendingInvestmentsCount;
  }


  public void setPendingInvestmentsCount(Integer pendingInvestmentsCount) {
    
    
    
    this.pendingInvestmentsCount = pendingInvestmentsCount;
  }


  public ConnectedInvestor pendingInvestmentsTotal(Double pendingInvestmentsTotal) {
    
    
    
    
    this.pendingInvestmentsTotal = pendingInvestmentsTotal;
    return this;
  }

   /**
   * Total amount of pending investments
   * @return pendingInvestmentsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27000", value = "Total amount of pending investments")

  public Double getPendingInvestmentsTotal() {
    return pendingInvestmentsTotal;
  }


  public void setPendingInvestmentsTotal(Double pendingInvestmentsTotal) {
    
    
    
    this.pendingInvestmentsTotal = pendingInvestmentsTotal;
  }


  public ConnectedInvestor activeInvestmentsCount(Integer activeInvestmentsCount) {
    
    
    
    
    this.activeInvestmentsCount = activeInvestmentsCount;
    return this;
  }

   /**
   * Number of active investments
   * @return activeInvestmentsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "Number of active investments")

  public Integer getActiveInvestmentsCount() {
    return activeInvestmentsCount;
  }


  public void setActiveInvestmentsCount(Integer activeInvestmentsCount) {
    
    
    
    this.activeInvestmentsCount = activeInvestmentsCount;
  }


  public ConnectedInvestor activeInvestmentsTotal(Double activeInvestmentsTotal) {
    
    
    
    
    this.activeInvestmentsTotal = activeInvestmentsTotal;
    return this;
  }

   /**
   * Total amount of active investments
   * @return activeInvestmentsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "62000", value = "Total amount of active investments")

  public Double getActiveInvestmentsTotal() {
    return activeInvestmentsTotal;
  }


  public void setActiveInvestmentsTotal(Double activeInvestmentsTotal) {
    
    
    
    this.activeInvestmentsTotal = activeInvestmentsTotal;
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
   * @return the ConnectedInvestor instance itself
   */
  public ConnectedInvestor putAdditionalProperty(String key, Object value) {
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
    ConnectedInvestor connectedInvestor = (ConnectedInvestor) o;
    return Objects.equals(this.investorId, connectedInvestor.investorId) &&
        Objects.equals(this.investorType, connectedInvestor.investorType) &&
        Objects.equals(this.investorName, connectedInvestor.investorName) &&
        Objects.equals(this.pendingInvestmentsCount, connectedInvestor.pendingInvestmentsCount) &&
        Objects.equals(this.pendingInvestmentsTotal, connectedInvestor.pendingInvestmentsTotal) &&
        Objects.equals(this.activeInvestmentsCount, connectedInvestor.activeInvestmentsCount) &&
        Objects.equals(this.activeInvestmentsTotal, connectedInvestor.activeInvestmentsTotal)&&
        Objects.equals(this.additionalProperties, connectedInvestor.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(investorId, investorType, investorName, pendingInvestmentsCount, pendingInvestmentsTotal, activeInvestmentsCount, activeInvestmentsTotal, additionalProperties);
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
    sb.append("class ConnectedInvestor {\n");
    sb.append("    investorId: ").append(toIndentedString(investorId)).append("\n");
    sb.append("    investorType: ").append(toIndentedString(investorType)).append("\n");
    sb.append("    investorName: ").append(toIndentedString(investorName)).append("\n");
    sb.append("    pendingInvestmentsCount: ").append(toIndentedString(pendingInvestmentsCount)).append("\n");
    sb.append("    pendingInvestmentsTotal: ").append(toIndentedString(pendingInvestmentsTotal)).append("\n");
    sb.append("    activeInvestmentsCount: ").append(toIndentedString(activeInvestmentsCount)).append("\n");
    sb.append("    activeInvestmentsTotal: ").append(toIndentedString(activeInvestmentsTotal)).append("\n");
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
    openapiFields.add("investorId");
    openapiFields.add("investorType");
    openapiFields.add("investorName");
    openapiFields.add("pendingInvestmentsCount");
    openapiFields.add("pendingInvestmentsTotal");
    openapiFields.add("activeInvestmentsCount");
    openapiFields.add("activeInvestmentsTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectedInvestor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectedInvestor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectedInvestor is not found in the empty JSON string", ConnectedInvestor.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("investorType").isJsonNull() && (jsonObj.get("investorType") != null && !jsonObj.get("investorType").isJsonNull()) && !jsonObj.get("investorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `investorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("investorType").toString()));
      }
      if (!jsonObj.get("investorName").isJsonNull() && (jsonObj.get("investorName") != null && !jsonObj.get("investorName").isJsonNull()) && !jsonObj.get("investorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `investorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("investorName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectedInvestor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectedInvestor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectedInvestor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectedInvestor.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectedInvestor>() {
           @Override
           public void write(JsonWriter out, ConnectedInvestor value) throws IOException {
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
           public ConnectedInvestor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectedInvestor instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectedInvestor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectedInvestor
  * @throws IOException if the JSON string is invalid with respect to ConnectedInvestor
  */
  public static ConnectedInvestor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectedInvestor.class);
  }

 /**
  * Convert an instance of ConnectedInvestor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

