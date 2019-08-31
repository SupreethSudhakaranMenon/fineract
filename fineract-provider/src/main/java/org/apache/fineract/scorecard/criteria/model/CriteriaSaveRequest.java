
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
package org.apache.fineract.scorecard.criteria.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CriteriaSaveRequest   {
    @JsonProperty("id")
    private BigDecimal id = null;

    @JsonProperty("feature")
    private String feature = null;

    @JsonProperty("keyvalue")
    private String keyvalue = null;

    @JsonProperty("sqlapi")
    private String sqlapi = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("product")
    private String product = null;

    @JsonProperty("datasource")
    private String datasource = null;

    public CriteriaSaveRequest() {
    }

    public CriteriaSaveRequest(BigDecimal id, String feature, String key, String sqlapi, String category, String product, String datasource) {
        this.id = id;
        this.feature = feature;
        this.keyvalue = key;
        this.sqlapi = sqlapi;
        this.category = category;
        this.product = product;
        this.datasource = datasource;
    }

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

    public String getKeyvalue() { return keyvalue; }

    public void setKeyvalue(String keyvalue) { this.keyvalue = keyvalue; }

    public String getSqlapi() {
        return sqlapi;
    }

    public void setSqlapi(String sqlapi) {
        this.sqlapi = sqlapi;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }
}