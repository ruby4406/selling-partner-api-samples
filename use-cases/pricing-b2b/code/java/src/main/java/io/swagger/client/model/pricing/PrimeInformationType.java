/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.pricing;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Amazon Prime information.
 */
@ApiModel(description = "Amazon Prime information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-07T17:09:04.171+01:00")
public class PrimeInformationType {
  @SerializedName("IsPrime")
  private Boolean isPrime = null;

  @SerializedName("IsNationalPrime")
  private Boolean isNationalPrime = null;

  public PrimeInformationType isPrime(Boolean isPrime) {
    this.isPrime = isPrime;
    return this;
  }

   /**
   * Indicates whether the offer is an Amazon Prime offer.
   * @return isPrime
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the offer is an Amazon Prime offer.")
  public Boolean isIsPrime() {
    return isPrime;
  }

  public void setIsPrime(Boolean isPrime) {
    this.isPrime = isPrime;
  }

  public PrimeInformationType isNationalPrime(Boolean isNationalPrime) {
    this.isNationalPrime = isNationalPrime;
    return this;
  }

   /**
   * Indicates whether the offer is an Amazon Prime offer throughout the entire marketplace where it is listed.
   * @return isNationalPrime
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the offer is an Amazon Prime offer throughout the entire marketplace where it is listed.")
  public Boolean isIsNationalPrime() {
    return isNationalPrime;
  }

  public void setIsNationalPrime(Boolean isNationalPrime) {
    this.isNationalPrime = isNationalPrime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimeInformationType primeInformationType = (PrimeInformationType) o;
    return Objects.equals(this.isPrime, primeInformationType.isPrime) &&
        Objects.equals(this.isNationalPrime, primeInformationType.isNationalPrime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrime, isNationalPrime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimeInformationType {\n");
    
    sb.append("    isPrime: ").append(toIndentedString(isPrime)).append("\n");
    sb.append("    isNationalPrime: ").append(toIndentedString(isNationalPrime)).append("\n");
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

