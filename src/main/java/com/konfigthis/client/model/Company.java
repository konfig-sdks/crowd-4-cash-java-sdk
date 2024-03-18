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
 * A company that takes out a loan
 */
@ApiModel(description = "A company that takes out a loan")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Company {
  public static final String SERIALIZED_NAME_LEGAL_FORM = "legalForm";
  @SerializedName(SERIALIZED_NAME_LEGAL_FORM)
  private String legalForm;

  public static final String SERIALIZED_NAME_YEAR_ESTABLISHED = "yearEstablished";
  @SerializedName(SERIALIZED_NAME_YEAR_ESTABLISHED)
  private Integer yearEstablished;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_SECTOR = "sector";
  @SerializedName(SERIALIZED_NAME_SECTOR)
  private String sector;

  public static final String SERIALIZED_NAME_NUMBER_OF_EMPLOYEES = "numberOfEmployees";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_EMPLOYEES)
  private Integer numberOfEmployees;

  public Company() {
  }

  public Company legalForm(String legalForm) {
    
    
    
    
    this.legalForm = legalForm;
    return this;
  }

   /**
   * Legal form of the company
   * @return legalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Public limited company, Cooperative, Association, Foundation etc.", value = "Legal form of the company")

  public String getLegalForm() {
    return legalForm;
  }


  public void setLegalForm(String legalForm) {
    
    
    
    this.legalForm = legalForm;
  }


  public Company yearEstablished(Integer yearEstablished) {
    
    
    
    
    this.yearEstablished = yearEstablished;
    return this;
  }

   /**
   * Year established in the commercial resgister
   * @return yearEstablished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1996", value = "Year established in the commercial resgister")

  public Integer getYearEstablished() {
    return yearEstablished;
  }


  public void setYearEstablished(Integer yearEstablished) {
    
    
    
    this.yearEstablished = yearEstablished;
  }


  public Company city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Company headquarter
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Egerkingen", value = "Company headquarter")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public Company sector(String sector) {
    
    
    
    
    this.sector = sector;
    return this;
  }

   /**
   * Business sector
   * @return sector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cars, Construction sector, Education, Agriculture and Forestry, etc", value = "Business sector")

  public String getSector() {
    return sector;
  }


  public void setSector(String sector) {
    
    
    
    this.sector = sector;
  }


  public Company numberOfEmployees(Integer numberOfEmployees) {
    
    
    
    
    this.numberOfEmployees = numberOfEmployees;
    return this;
  }

   /**
   * Number of employees
   * @return numberOfEmployees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "125", value = "Number of employees")

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }


  public void setNumberOfEmployees(Integer numberOfEmployees) {
    
    
    
    this.numberOfEmployees = numberOfEmployees;
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
   * @return the Company instance itself
   */
  public Company putAdditionalProperty(String key, Object value) {
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
    Company company = (Company) o;
    return Objects.equals(this.legalForm, company.legalForm) &&
        Objects.equals(this.yearEstablished, company.yearEstablished) &&
        Objects.equals(this.city, company.city) &&
        Objects.equals(this.sector, company.sector) &&
        Objects.equals(this.numberOfEmployees, company.numberOfEmployees)&&
        Objects.equals(this.additionalProperties, company.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalForm, yearEstablished, city, sector, numberOfEmployees, additionalProperties);
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
    sb.append("class Company {\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    yearEstablished: ").append(toIndentedString(yearEstablished)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    numberOfEmployees: ").append(toIndentedString(numberOfEmployees)).append("\n");
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
    openapiFields.add("legalForm");
    openapiFields.add("yearEstablished");
    openapiFields.add("city");
    openapiFields.add("sector");
    openapiFields.add("numberOfEmployees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Company
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Company.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Company is not found in the empty JSON string", Company.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("legalForm").isJsonNull() && (jsonObj.get("legalForm") != null && !jsonObj.get("legalForm").isJsonNull()) && !jsonObj.get("legalForm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalForm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalForm").toString()));
      }
      if (!jsonObj.get("city").isJsonNull() && (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("sector").isJsonNull() && (jsonObj.get("sector") != null && !jsonObj.get("sector").isJsonNull()) && !jsonObj.get("sector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Company.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Company' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Company> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Company.class));

       return (TypeAdapter<T>) new TypeAdapter<Company>() {
           @Override
           public void write(JsonWriter out, Company value) throws IOException {
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
           public Company read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Company instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Company given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Company
  * @throws IOException if the JSON string is invalid with respect to Company
  */
  public static Company fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Company.class);
  }

 /**
  * Convert an instance of Company to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

