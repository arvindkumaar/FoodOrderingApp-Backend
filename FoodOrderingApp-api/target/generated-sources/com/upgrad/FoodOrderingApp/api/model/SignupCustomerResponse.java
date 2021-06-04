package com.upgrad.FoodOrderingApp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * SignupCustomerResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-01T17:43:47.026+05:30")

public class SignupCustomerResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  public SignupCustomerResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * uuid of the signed up customer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "uuid of the signed up customer")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SignupCustomerResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return status
  **/
  @ApiModelProperty(required = true, value = "message showing the status of the signed up customer")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupCustomerResponse signupCustomerResponse = (SignupCustomerResponse) o;
    return Objects.equals(this.id, signupCustomerResponse.id) &&
        Objects.equals(this.status, signupCustomerResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupCustomerResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
}

