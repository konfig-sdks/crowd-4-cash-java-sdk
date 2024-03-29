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
 * Technical data related to the client&#39;s use of the website
 */
@ApiModel(description = "Technical data related to the client's use of the website")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TechnicalData {
  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_URL_REFERRER = "urlReferrer";
  @SerializedName(SERIALIZED_NAME_URL_REFERRER)
  private String urlReferrer;

  public static final String SERIALIZED_NAME_BROWSER_TYPE = "browserType";
  @SerializedName(SERIALIZED_NAME_BROWSER_TYPE)
  private String browserType;

  public static final String SERIALIZED_NAME_BROWSER_NAME = "browserName";
  @SerializedName(SERIALIZED_NAME_BROWSER_NAME)
  private String browserName;

  public static final String SERIALIZED_NAME_BROWSER_VERSION = "browserVersion";
  @SerializedName(SERIALIZED_NAME_BROWSER_VERSION)
  private String browserVersion;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_IS_BETA = "isBeta";
  @SerializedName(SERIALIZED_NAME_IS_BETA)
  private String isBeta;

  public static final String SERIALIZED_NAME_IS_MOBILE_DEVICE = "isMobileDevice";
  @SerializedName(SERIALIZED_NAME_IS_MOBILE_DEVICE)
  private String isMobileDevice;

  public static final String SERIALIZED_NAME_MOBILE_DEVICE_MANUFACTURER = "mobileDeviceManufacturer";
  @SerializedName(SERIALIZED_NAME_MOBILE_DEVICE_MANUFACTURER)
  private String mobileDeviceManufacturer;

  public static final String SERIALIZED_NAME_MOBILE_DEVICE_MODEL = "mobileDeviceModel";
  @SerializedName(SERIALIZED_NAME_MOBILE_DEVICE_MODEL)
  private String mobileDeviceModel;

  public static final String SERIALIZED_NAME_IS_DO_NOT_TRACK_ENABLED = "isDoNotTrackEnabled";
  @SerializedName(SERIALIZED_NAME_IS_DO_NOT_TRACK_ENABLED)
  private String isDoNotTrackEnabled;

  public static final String SERIALIZED_NAME_EMAIL_HOST = "emailHost";
  @SerializedName(SERIALIZED_NAME_EMAIL_HOST)
  private String emailHost;

  public static final String SERIALIZED_NAME_IS_NAME_IN_EMAIL = "isNameInEmail";
  @SerializedName(SERIALIZED_NAME_IS_NAME_IN_EMAIL)
  private String isNameInEmail;

  public static final String SERIALIZED_NAME_IS_NAME_OR_ADDRESS_LOWERCASED = "isNameOrAddressLowercased";
  @SerializedName(SERIALIZED_NAME_IS_NAME_OR_ADDRESS_LOWERCASED)
  private String isNameOrAddressLowercased;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public TechnicalData() {
  }

  public TechnicalData ipAddress(String ipAddress) {
    
    
    
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Client Ip address
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "212.60.48.254", value = "Client Ip address")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    
    
    
    this.ipAddress = ipAddress;
  }


  public TechnicalData userAgent(String userAgent) {
    
    
    
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Gets the raw user agent string of the client browser that has been provided.
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64), AppleWebKit/537.36 (KHTML, like Gecko), Chrome/64.0.3282.140, Safari/537.36, Edge/18.17763", value = "Gets the raw user agent string of the client browser that has been provided.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    
    
    
    this.userAgent = userAgent;
  }


  public TechnicalData urlReferrer(String urlReferrer) {
    
    
    
    
    this.urlReferrer = urlReferrer;
    return this;
  }

   /**
   * URL of the client&#39;s previous request that linked to our website
   * @return urlReferrer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.google.ch, www.bing.com, www.crowd4cash.ch/login", value = "URL of the client's previous request that linked to our website")

  public String getUrlReferrer() {
    return urlReferrer;
  }


  public void setUrlReferrer(String urlReferrer) {
    
    
    
    this.urlReferrer = urlReferrer;
  }


  public TechnicalData browserType(String browserType) {
    
    
    
    
    this.browserType = browserType;
    return this;
  }

   /**
   * Client browser
   * @return browserType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chrome75", value = "Client browser")

  public String getBrowserType() {
    return browserType;
  }


  public void setBrowserType(String browserType) {
    
    
    
    this.browserType = browserType;
  }


  public TechnicalData browserName(String browserName) {
    
    
    
    
    this.browserName = browserName;
    return this;
  }

   /**
   * Name of the browser
   * @return browserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chrome", value = "Name of the browser")

  public String getBrowserName() {
    return browserName;
  }


  public void setBrowserName(String browserName) {
    
    
    
    this.browserName = browserName;
  }


  public TechnicalData browserVersion(String browserVersion) {
    
    
    
    
    this.browserVersion = browserVersion;
    return this;
  }

   /**
   * Version of the browser
   * @return browserVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75", value = "Version of the browser")

  public String getBrowserVersion() {
    return browserVersion;
  }


  public void setBrowserVersion(String browserVersion) {
    
    
    
    this.browserVersion = browserVersion;
  }


  public TechnicalData platform(String platform) {
    
    
    
    
    this.platform = platform;
    return this;
  }

   /**
   * Operating System
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WinNT", value = "Operating System")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    
    
    
    this.platform = platform;
  }


  public TechnicalData isBeta(String isBeta) {
    
    
    
    
    this.isBeta = isBeta;
    return this;
  }

   /**
   * Does borrower use a beta version of the browser?
   * @return isBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Does borrower use a beta version of the browser?")

  public String getIsBeta() {
    return isBeta;
  }


  public void setIsBeta(String isBeta) {
    
    
    
    this.isBeta = isBeta;
  }


  public TechnicalData isMobileDevice(String isMobileDevice) {
    
    
    
    
    this.isMobileDevice = isMobileDevice;
    return this;
  }

   /**
   * Does client connect by mobile device?
   * @return isMobileDevice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Does client connect by mobile device?")

  public String getIsMobileDevice() {
    return isMobileDevice;
  }


  public void setIsMobileDevice(String isMobileDevice) {
    
    
    
    this.isMobileDevice = isMobileDevice;
  }


  public TechnicalData mobileDeviceManufacturer(String mobileDeviceManufacturer) {
    
    
    
    
    this.mobileDeviceManufacturer = mobileDeviceManufacturer;
    return this;
  }

   /**
   * Manufacturer of the mobile device
   * @return mobileDeviceManufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Samsug, Apple, Huawei, unknown", value = "Manufacturer of the mobile device")

  public String getMobileDeviceManufacturer() {
    return mobileDeviceManufacturer;
  }


  public void setMobileDeviceManufacturer(String mobileDeviceManufacturer) {
    
    
    
    this.mobileDeviceManufacturer = mobileDeviceManufacturer;
  }


  public TechnicalData mobileDeviceModel(String mobileDeviceModel) {
    
    
    
    
    this.mobileDeviceModel = mobileDeviceModel;
    return this;
  }

   /**
   * Model of the mobile device
   * @return mobileDeviceModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S10", value = "Model of the mobile device")

  public String getMobileDeviceModel() {
    return mobileDeviceModel;
  }


  public void setMobileDeviceModel(String mobileDeviceModel) {
    
    
    
    this.mobileDeviceModel = mobileDeviceModel;
  }


  public TechnicalData isDoNotTrackEnabled(String isDoNotTrackEnabled) {
    
    
    
    
    this.isDoNotTrackEnabled = isDoNotTrackEnabled;
    return this;
  }

   /**
   * Is the \&quot;Do Not Track\&quot; setting in their web browser enabled?
   * @return isDoNotTrackEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Is the \"Do Not Track\" setting in their web browser enabled?")

  public String getIsDoNotTrackEnabled() {
    return isDoNotTrackEnabled;
  }


  public void setIsDoNotTrackEnabled(String isDoNotTrackEnabled) {
    
    
    
    this.isDoNotTrackEnabled = isDoNotTrackEnabled;
  }


  public TechnicalData emailHost(String emailHost) {
    
    
    
    
    this.emailHost = emailHost;
    return this;
  }

   /**
   * Host of the client email
   * @return emailHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yahoo, Gmail, Other", value = "Host of the client email")

  public String getEmailHost() {
    return emailHost;
  }


  public void setEmailHost(String emailHost) {
    
    
    
    this.emailHost = emailHost;
  }


  public TechnicalData isNameInEmail(String isNameInEmail) {
    
    
    
    
    this.isNameInEmail = isNameInEmail;
    return this;
  }

   /**
   * Is name of the client a part of the email?
   * @return isNameInEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Is name of the client a part of the email?")

  public String getIsNameInEmail() {
    return isNameInEmail;
  }


  public void setIsNameInEmail(String isNameInEmail) {
    
    
    
    this.isNameInEmail = isNameInEmail;
  }


  public TechnicalData isNameOrAddressLowercased(String isNameOrAddressLowercased) {
    
    
    
    
    this.isNameOrAddressLowercased = isNameOrAddressLowercased;
    return this;
  }

   /**
   * Is the name or the address lowercased?
   * @return isNameOrAddressLowercased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Yes, No", value = "Is the name or the address lowercased?")

  public String getIsNameOrAddressLowercased() {
    return isNameOrAddressLowercased;
  }


  public void setIsNameOrAddressLowercased(String isNameOrAddressLowercased) {
    
    
    
    this.isNameOrAddressLowercased = isNameOrAddressLowercased;
  }


  public TechnicalData channel(String channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * How they found us?
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Direct, Organic, Other, Can not be tracked", value = "How they found us?")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    
    
    
    this.channel = channel;
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
   * @return the TechnicalData instance itself
   */
  public TechnicalData putAdditionalProperty(String key, Object value) {
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
    TechnicalData technicalData = (TechnicalData) o;
    return Objects.equals(this.ipAddress, technicalData.ipAddress) &&
        Objects.equals(this.userAgent, technicalData.userAgent) &&
        Objects.equals(this.urlReferrer, technicalData.urlReferrer) &&
        Objects.equals(this.browserType, technicalData.browserType) &&
        Objects.equals(this.browserName, technicalData.browserName) &&
        Objects.equals(this.browserVersion, technicalData.browserVersion) &&
        Objects.equals(this.platform, technicalData.platform) &&
        Objects.equals(this.isBeta, technicalData.isBeta) &&
        Objects.equals(this.isMobileDevice, technicalData.isMobileDevice) &&
        Objects.equals(this.mobileDeviceManufacturer, technicalData.mobileDeviceManufacturer) &&
        Objects.equals(this.mobileDeviceModel, technicalData.mobileDeviceModel) &&
        Objects.equals(this.isDoNotTrackEnabled, technicalData.isDoNotTrackEnabled) &&
        Objects.equals(this.emailHost, technicalData.emailHost) &&
        Objects.equals(this.isNameInEmail, technicalData.isNameInEmail) &&
        Objects.equals(this.isNameOrAddressLowercased, technicalData.isNameOrAddressLowercased) &&
        Objects.equals(this.channel, technicalData.channel)&&
        Objects.equals(this.additionalProperties, technicalData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, userAgent, urlReferrer, browserType, browserName, browserVersion, platform, isBeta, isMobileDevice, mobileDeviceManufacturer, mobileDeviceModel, isDoNotTrackEnabled, emailHost, isNameInEmail, isNameOrAddressLowercased, channel, additionalProperties);
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
    sb.append("class TechnicalData {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    urlReferrer: ").append(toIndentedString(urlReferrer)).append("\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    isBeta: ").append(toIndentedString(isBeta)).append("\n");
    sb.append("    isMobileDevice: ").append(toIndentedString(isMobileDevice)).append("\n");
    sb.append("    mobileDeviceManufacturer: ").append(toIndentedString(mobileDeviceManufacturer)).append("\n");
    sb.append("    mobileDeviceModel: ").append(toIndentedString(mobileDeviceModel)).append("\n");
    sb.append("    isDoNotTrackEnabled: ").append(toIndentedString(isDoNotTrackEnabled)).append("\n");
    sb.append("    emailHost: ").append(toIndentedString(emailHost)).append("\n");
    sb.append("    isNameInEmail: ").append(toIndentedString(isNameInEmail)).append("\n");
    sb.append("    isNameOrAddressLowercased: ").append(toIndentedString(isNameOrAddressLowercased)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("ipAddress");
    openapiFields.add("userAgent");
    openapiFields.add("urlReferrer");
    openapiFields.add("browserType");
    openapiFields.add("browserName");
    openapiFields.add("browserVersion");
    openapiFields.add("platform");
    openapiFields.add("isBeta");
    openapiFields.add("isMobileDevice");
    openapiFields.add("mobileDeviceManufacturer");
    openapiFields.add("mobileDeviceModel");
    openapiFields.add("isDoNotTrackEnabled");
    openapiFields.add("emailHost");
    openapiFields.add("isNameInEmail");
    openapiFields.add("isNameOrAddressLowercased");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TechnicalData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TechnicalData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TechnicalData is not found in the empty JSON string", TechnicalData.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("ipAddress").isJsonNull() && (jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if (!jsonObj.get("userAgent").isJsonNull() && (jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonNull()) && !jsonObj.get("userAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAgent").toString()));
      }
      if (!jsonObj.get("urlReferrer").isJsonNull() && (jsonObj.get("urlReferrer") != null && !jsonObj.get("urlReferrer").isJsonNull()) && !jsonObj.get("urlReferrer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlReferrer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlReferrer").toString()));
      }
      if (!jsonObj.get("browserType").isJsonNull() && (jsonObj.get("browserType") != null && !jsonObj.get("browserType").isJsonNull()) && !jsonObj.get("browserType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserType").toString()));
      }
      if (!jsonObj.get("browserName").isJsonNull() && (jsonObj.get("browserName") != null && !jsonObj.get("browserName").isJsonNull()) && !jsonObj.get("browserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserName").toString()));
      }
      if (!jsonObj.get("browserVersion").isJsonNull() && (jsonObj.get("browserVersion") != null && !jsonObj.get("browserVersion").isJsonNull()) && !jsonObj.get("browserVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserVersion").toString()));
      }
      if (!jsonObj.get("platform").isJsonNull() && (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (!jsonObj.get("isBeta").isJsonNull() && (jsonObj.get("isBeta") != null && !jsonObj.get("isBeta").isJsonNull()) && !jsonObj.get("isBeta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isBeta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isBeta").toString()));
      }
      if (!jsonObj.get("isMobileDevice").isJsonNull() && (jsonObj.get("isMobileDevice") != null && !jsonObj.get("isMobileDevice").isJsonNull()) && !jsonObj.get("isMobileDevice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isMobileDevice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isMobileDevice").toString()));
      }
      if (!jsonObj.get("mobileDeviceManufacturer").isJsonNull() && (jsonObj.get("mobileDeviceManufacturer") != null && !jsonObj.get("mobileDeviceManufacturer").isJsonNull()) && !jsonObj.get("mobileDeviceManufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobileDeviceManufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobileDeviceManufacturer").toString()));
      }
      if (!jsonObj.get("mobileDeviceModel").isJsonNull() && (jsonObj.get("mobileDeviceModel") != null && !jsonObj.get("mobileDeviceModel").isJsonNull()) && !jsonObj.get("mobileDeviceModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobileDeviceModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobileDeviceModel").toString()));
      }
      if (!jsonObj.get("isDoNotTrackEnabled").isJsonNull() && (jsonObj.get("isDoNotTrackEnabled") != null && !jsonObj.get("isDoNotTrackEnabled").isJsonNull()) && !jsonObj.get("isDoNotTrackEnabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isDoNotTrackEnabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isDoNotTrackEnabled").toString()));
      }
      if (!jsonObj.get("emailHost").isJsonNull() && (jsonObj.get("emailHost") != null && !jsonObj.get("emailHost").isJsonNull()) && !jsonObj.get("emailHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailHost").toString()));
      }
      if (!jsonObj.get("isNameInEmail").isJsonNull() && (jsonObj.get("isNameInEmail") != null && !jsonObj.get("isNameInEmail").isJsonNull()) && !jsonObj.get("isNameInEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isNameInEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isNameInEmail").toString()));
      }
      if (!jsonObj.get("isNameOrAddressLowercased").isJsonNull() && (jsonObj.get("isNameOrAddressLowercased") != null && !jsonObj.get("isNameOrAddressLowercased").isJsonNull()) && !jsonObj.get("isNameOrAddressLowercased").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isNameOrAddressLowercased` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isNameOrAddressLowercased").toString()));
      }
      if (!jsonObj.get("channel").isJsonNull() && (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TechnicalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TechnicalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TechnicalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TechnicalData.class));

       return (TypeAdapter<T>) new TypeAdapter<TechnicalData>() {
           @Override
           public void write(JsonWriter out, TechnicalData value) throws IOException {
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
           public TechnicalData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TechnicalData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TechnicalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TechnicalData
  * @throws IOException if the JSON string is invalid with respect to TechnicalData
  */
  public static TechnicalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TechnicalData.class);
  }

 /**
  * Convert an instance of TechnicalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

