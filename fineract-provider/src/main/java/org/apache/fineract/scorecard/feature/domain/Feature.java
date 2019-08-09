///**
// * Licensed to the Apache Software Foundation (ASF) under one
// * or more contributor license agreements. See the NOTICE file
// * distributed with this work for additional information
// * regarding copyright ownership. The ASF licenses this file
// * to you under the Apache License, Version 2.0 (the
// * "License"); you may not use this file except in compliance
// * with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing,
// * software distributed under the License is distributed on an
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// * KIND, either express or implied. See the License for the
// * specific language governing permissions and limitations
// * under the License.
// */
//
//package org.apache.fineract.scorecard.feature.domain;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//
//import org.apache.fineract.infrastructure.core.domain.AbstractAuditableCustom;
//import org.apache.fineract.useradministration.domain.AppUser;
//
//@Entity
//@Table(name="m_feature")
//public class Feature extends AbstractAuditableCustom<AppUser , Long> {
//
//    @Column(name = "id" , length = 50)
//    private Integer id;
//
//    @Column(name = "feature" , nullable = false)
//    private String feature;
//
//    @Column(name = "value" , nullable = false)
//    private String value;
//
//    @Column(name = "data" , nullable = false)
//    private String data;
//
//    @Column(name = "category" , nullable =false)
//    private String category;
//
//    public static Feature createNew(final Integer id,final String feature,final String value,final String data,final String category){
//        return new Feature(id,feature,value,data,category);
//    }
//
//    public Feature(final Integer id,final String feature,final String value,final String data,final String category) {
//        this.id = id;
//        this.feature = feature;
//        this.value = value;
//        this.data = data;
//        this.category = category;
//    }
//
//    public Integer getId(){
//        return this.id;
//    }
//
//    public String getFeature(){
//        return this.feature;
//    }
//
//    public String getValue() {
//        return this.value;
//    }
//
//    public String getData() {
//        return this.data;
//    }
//
//    public String getCategory() {
//        return this.category;
//    }
//
//
//}
