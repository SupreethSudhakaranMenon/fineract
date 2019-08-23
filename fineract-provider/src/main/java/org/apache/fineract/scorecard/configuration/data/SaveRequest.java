/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.fineract.scorecard.configuration.data;
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

    @JsonProperty("product")
    private String product = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("feature")
    private String feature = null;

    @JsonProperty("weight")
    private String weight = null;

    @JsonProperty("colour")
    private String colour = null;

    @JsonProperty("fromrange")
    private String fromrange = null;

    @JsonProperty("torange")
    private String torange = null;

    @JsonProperty("value")
    private String value = null;

    public SaveRequest id(BigDecimal id){
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

    public SaveRequest product(String product) {
        this.product = product;
        return this;
    }

    /**
     * product
     * @return product
     */
    @ApiModelProperty(value= "product")
    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }

    public SaveRequest category(String category) {
        this.category = category;
        return this;
    }

    /**
     * category
     * @return category
     */
    @ApiModelProperty(value="category")
    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public SaveRequest feature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * feature
     * @return feature
     */
    @ApiModelProperty(value="feature")
    public String getFeature() { return feature; }

    public void setFeature(String feature) { this.feature = feature; }

    public SaveRequest weight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * weight
     * @return weight
     */
    @ApiModelProperty(value="weight")
    public String getWeight() { return  weight; }

    public void setWeight(String weight) { this.weight = weight; }

    public SaveRequest colour(String colour) {
        this.colour = colour;
        return this;
    }

    /**
     * colour
     * @return colour
     */
    @ApiModelProperty(value="colour")
    public String getColour() { return colour; }

    public void setColour(String Colour) { this.colour = colour; }

    public SaveRequest fromrange(String fromrange) {
        this.fromrange = fromrange;
        return this;
    }

    /**
     * fromrange
     * @return fromrange
     */
    @ApiModelProperty(value="fromrange")
    public String getFromrange() { return fromrange; }

    public void setFromrange(String fromrange) { this.fromrange = fromrange; }

    public SaveRequest torange(String torange) {
        this.torange = torange;
        return this;
    }

    /**
     * torange
     * @return torange
     */
    @ApiModelProperty(value="torange")
    public String getTorange() { return torange; }

    public void setTorange(String torange) { this.torange = torange; }

    public SaveRequest value(String value) {
        this.value  = value;
        return this;
    }

    /**
     * value
     * @return value
     */
    @ApiModelProperty(value = "value")
    public String getValue() { return value; }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        SaveRequest saveRequest = (SaveRequest) o;
        return Objects.equals(this.id, saveRequest.id) &&
                Objects.equals(this.product, saveRequest.product) &&
                Objects.equals(this.category, saveRequest.category) &&
                Objects.equals(this.feature, saveRequest.feature) &&
                Objects.equals(this.weight, saveRequest.weight) &&
                Objects.equals(this.colour, saveRequest.colour) &&
                Objects.equals(this.fromrange, saveRequest.fromrange) &&
                Objects.equals(this.torange, saveRequest.torange) &&
                Objects.equals(this.value, saveRequest.value);
    }

    @Override
    public int hashCode() { return Objects.hash(id, product, category, feature, weight, colour, fromrange, torange, value);  }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveRequest {\n}");

        sb.append("    id:").append(toIndentedString(id)).append("\n");
        sb.append("    product").append(toIndentedString(product)).append("\n");
        sb.append("    category").append(toIndentedString(category)).append("\n");
        sb.append("    feature").append(toIndentedString(feature)).append("\n");
        sb.append("    weight").append(toIndentedString(weight)).append("\n");
        sb.append("    colour").append(toIndentedString(colour)).append("\n");
        sb.append("    fromrange").append(toIndentedString(fromrange)).append("\n");
        sb.append("    torange").append(toIndentedString(torange)).append("\n");
        sb.append("    value").append(toIndentedString(value)).append("\n");
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

