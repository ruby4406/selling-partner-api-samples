/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.CatalogApi;

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

/**
 * Product type associated with the Amazon catalog item for the indicated Amazon marketplace.
 */
@ApiModel(description = "Product type associated with the Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-06T15:53:58.780-07:00")
public class ItemProductTypeByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("productType")
  private String productType = null;

  public ItemProductTypeByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemProductTypeByMarketplace productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Name of the product type associated with the Amazon catalog item.
   * @return productType
  **/
  @ApiModelProperty(example = "LUGGAGE", value = "Name of the product type associated with the Amazon catalog item.")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemProductTypeByMarketplace itemProductTypeByMarketplace = (ItemProductTypeByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemProductTypeByMarketplace.marketplaceId) &&
        Objects.equals(this.productType, itemProductTypeByMarketplace.productType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, productType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemProductTypeByMarketplace {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

