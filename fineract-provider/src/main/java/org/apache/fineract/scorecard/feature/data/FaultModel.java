package org.apache.fineract.scorecard.feature.data;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * FaultModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-20T18:36:28.410+05:30")

public class FaultModel   {
  @JsonProperty("faultString")
  private String faultString = null;

  public FaultModel faultString(String faultString) {
    this.faultString = faultString;
    return this;
  }

   /**
   * Get faultString
   * @return faultString
  **/
  @ApiModelProperty(value = "")
  public String getFaultString() {
    return faultString;
  }

  public void setFaultString(String faultString) {
    this.faultString = faultString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaultModel faultModel = (FaultModel) o;
    return Objects.equals(this.faultString, faultModel.faultString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaultModel {\n");
    
    sb.append("    faultString: ").append(toIndentedString(faultString)).append("\n");
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

