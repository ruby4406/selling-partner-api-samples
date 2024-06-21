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
 * Classification (browse node) associated with an Amazon catalog item.
 */
@ApiModel(description = "Classification (browse node) associated with an Amazon catalog item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-06T15:53:58.780-07:00")
public class ItemBrowseClassification {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("classificationId")
  private String classificationId = null;

  public ItemBrowseClassification displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for the classification.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display name for the classification.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ItemBrowseClassification classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

   /**
   * Identifier of the classification (browse node identifier).
   * @return classificationId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the classification (browse node identifier).")
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBrowseClassification itemBrowseClassification = (ItemBrowseClassification) o;
    return Objects.equals(this.displayName, itemBrowseClassification.displayName) &&
        Objects.equals(this.classificationId, itemBrowseClassification.classificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, classificationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBrowseClassification {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
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

