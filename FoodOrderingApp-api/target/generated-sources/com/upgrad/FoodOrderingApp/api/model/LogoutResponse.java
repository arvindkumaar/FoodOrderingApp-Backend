package com.upgrad.FoodOrderingApp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * LogoutResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-01T17:43:47.026+05:30")

public class LogoutResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  public LogoutResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * uuid of the customer who is signed out
   * @return id
  **/
  @ApiModelProperty(required = true, value = "uuid of the customer who is signed out")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LogoutResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message to show the status of the signed out customer
   * @return message
  **/
  @ApiModelProperty(required = true, value = "message to show the status of the signed out customer")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoutResponse logoutResponse = (LogoutResponse) o;
    return Objects.equals(this.id, logoutResponse.id) &&
        Objects.equals(this.message, logoutResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

