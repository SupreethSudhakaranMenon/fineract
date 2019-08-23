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

package org.apache.fineract.scorecard.configuration.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "m_configuration")
public class ConfigurationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    private String product;

    private String category;

    private String feature;

    private String weight;

    private String colour;

    private String fromrange;

    private String torange;

    private String value;

    public ConfigurationEntity() {

    }

    public ConfigurationEntity(BigDecimal id, String product, String category, String feature, String weight, String colour, String fromrange, String torange, String value) {
        this.id = id;
        this.product = product;
        this.category = category;
        this.feature = feature;
        this.weight = weight;
        this.colour = colour;
        this.fromrange = fromrange;
        this.torange = torange;
        this.value = value;
    }

    public  BigDecimal getId() { return id; }

    public void setId(BigDecimal id) { this.id = id; }

    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getFeature() { return feature; }

    public void setFeature(String feature) { this.feature = feature; }

    public String getWeight() { return weight; }

    public void setWeight(String weight) { this.weight = weight; }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public String getFromrange() { return fromrange; }

    public void setFromrange(String fromrange) { this.fromrange = fromrange; }

    public String getTorange() { return torange; }

    public void setTorange(String torange) { this.torange = torange; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }


}
