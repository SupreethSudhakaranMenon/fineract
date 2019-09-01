package org.apache.fineract.scorecard.criteria.domain;

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


import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "m_criteria")
public class CriteriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id ;

    private String feature ;

    private String keyvalue ;

    private String sqlapi ;

    private String category ;

    private String product ;

    private String datasource ;

    public CriteriaEntity() {
    }

    /**
     * Data Fields for the Criteria Screen
     * @param feature
     * @param key
     * @param sqlapi
     * @param category
     * @param product
     * @param datasource
     */


    public CriteriaEntity(String feature, String key, String sqlapi, String category, String product, String datasource) {
        this.feature = feature;
        this.keyvalue = key;
        this.sqlapi = sqlapi;
        this.category = category;
        this.product = product;
        this.datasource = datasource;
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
