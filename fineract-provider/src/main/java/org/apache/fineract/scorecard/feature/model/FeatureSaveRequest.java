
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
package org.apache.fineract.scorecard.feature.model;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * Used JsonIgnoreProperties for ignoring the logical property
 * used in serialization and deserialization
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureSaveRequest   {
    @JsonProperty("id")
    private BigDecimal id = null;

    @JsonProperty("feature")
    private String feature = null;

    @JsonProperty("valueType")
    private String valueType = null;

    @JsonProperty("dataType")
    private String dataType = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("status")
    private String status = null;

    public FeatureSaveRequest(BigDecimal id, String feature, String valueType, String dataType, String category, String status) {
        this.id = id;
        this.feature = feature;
        this.valueType = valueType;
        this.dataType = dataType;
        this.category = category;
        this.status = status;
    }

    public FeatureSaveRequest() {
    }

    /**
     * getter and setter methods
     * @return
     */

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FeatureSaveRequest{" +
                "id=" + id +
                ", feature='" + feature + '\'' +
                ", valueType='" + valueType + '\'' +
                ", dataType='" + dataType + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}