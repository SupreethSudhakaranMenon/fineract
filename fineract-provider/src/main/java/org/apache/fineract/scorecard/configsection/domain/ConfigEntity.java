package org.apache.fineract.scorecard.configsection.domain;

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
@Table(name = "m_configuration")
public class ConfigEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id ;
    private String feature ;
    private String product ;

    private String category ;



    private String weightage ;


    private String greenmax = null;

    private String greenmin = null;

    private String redmax = null;

    private String redmin = null;

    private String ambermax = null;

    private String ambermin = null;




    public ConfigEntity() {
    }

    public ConfigEntity(String feature, String product, String category, String weightage, String greenmax, String fromrange, String redmax, String redmin, String ambermax, String ambermin) {
        this.feature = feature;
        this.product = product;
        this.category = category;
        this.weightage = weightage;
        this.greenmax = greenmax;
        this.greenmin = fromrange;
        this.redmax = redmax;
        this.redmin = redmin;
        this.ambermax = ambermax;
        this.ambermin = ambermin;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeightage() {
        return weightage;
    }

    public void setWeightage(String weightage) {
        this.weightage = weightage;
    }

    public String getGreenmax() {
        return greenmax;
    }

    public void setGreenmax(String greenmax) {
        this.greenmax = greenmax;
    }

    public String getGreenmin() {
        return greenmin;
    }

    public void setGreenmin(String greenmin) {
        this.greenmin = greenmin;
    }

    public String getRedmax() {
        return redmax;
    }

    public void setRedmax(String redmax) {
        this.redmax = redmax;
    }

    public String getRedmin() {
        return redmin;
    }

    public void setRedmin(String redmin) {
        this.redmin = redmin;
    }

    public String getAmbermax() {
        return ambermax;
    }

    public void setAmbermax(String ambermax) {
        this.ambermax = ambermax;
    }

    public String getAmbermin() {
        return ambermin;
    }

    public void setAmbermin(String ambermin) {
        this.ambermin = ambermin;
    }
}
