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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Loan status
 */
@JsonAdapter(Status.Adapter.class)public enum Status {
  
  ALL("All"),
  
  FUNDED("Funded"),
  
  ACTIVE("Active"),
  
  CLOSED("Closed"),
  
  DEFAULTED("Defaulted");

  private String value;

  Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Status.fromValue(value);
    }
  }
}

