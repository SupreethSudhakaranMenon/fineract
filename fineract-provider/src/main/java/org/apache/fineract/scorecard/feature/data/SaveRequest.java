package org.apache.fineract.scorecard.feature.data;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * SaveRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-20T18:36:28.410+05:30")

public class SaveRequest   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("feature")
  private String feature = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("status")
  private String status = null;

  public SaveRequest id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * primary id
   * @return id
  **/
  @ApiModelProperty(value = "primary id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public SaveRequest feature(String feature) {
    this.feature = feature;
    return this;
  }

   /**
   * feature
   * @return feature
  **/
  @ApiModelProperty(value = "feature")
  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public SaveRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(value = "value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SaveRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * data values
   * @return data
  **/
  @ApiModelProperty(value = "data values")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SaveRequest category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category
   * @return category
  **/
  @ApiModelProperty(value = "category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public SaveRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @ApiModelProperty(value = "status")
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
    SaveRequest saveRequest = (SaveRequest) o;
    return Objects.equals(this.id, saveRequest.id) &&
        Objects.equals(this.feature, saveRequest.feature) &&
        Objects.equals(this.value, saveRequest.value) &&
        Objects.equals(this.data, saveRequest.data) &&
        Objects.equals(this.category, saveRequest.category) &&
        Objects.equals(this.status, saveRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, feature, value, data, category, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

