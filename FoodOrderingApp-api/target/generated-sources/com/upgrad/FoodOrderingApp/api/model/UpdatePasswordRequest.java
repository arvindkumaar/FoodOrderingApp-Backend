package com.upgrad.FoodOrderingApp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * UpdatePasswordRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-01T17:43:47.026+05:30")

public class UpdatePasswordRequest {
  @JsonProperty("old_password")
  private String oldPassword = null;

  @JsonProperty("new_password")
  private String newPassword = null;

  public UpdatePasswordRequest oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * Existing password of the customer
   * @return oldPassword
  **/
  @ApiModelProperty(value = "Existing password of the customer")


  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public UpdatePasswordRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * New password by customer
   * @return newPassword
  **/
  @ApiModelProperty(value = "New password by customer")


  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePasswordRequest updatePasswordRequest = (UpdatePasswordRequest) o;
    return Objects.equals(this.oldPassword, updatePasswordRequest.oldPassword) &&
        Objects.equals(this.newPassword, updatePasswordRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePasswordRequest {\n");
    
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

