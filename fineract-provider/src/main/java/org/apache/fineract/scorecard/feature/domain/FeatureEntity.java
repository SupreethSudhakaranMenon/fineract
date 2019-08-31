package org.apache.fineract.scorecard.feature.domain;

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
@Table(name = "m_feature")
public class FeatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id ;

    private String feature ;

    private String value ;

    private String data ;

    private String category ;

    private String status ;

    public FeatureEntity() {
    }

    public FeatureEntity(BigDecimal id, String feature, String value, String data, String category, String status) {
        this.id = id;
        this.feature = feature;
        this.value = value;
        this.data = data;
        this.category = category;
        this.status = status;
    }

    public FeatureEntity( String feature, String value, String data, String category, String status) {
        this.feature = feature;
        this.value = value;
        this.data = data;
        this.category = category;
        this.status = status;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
}
