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
package org.apache.fineract.scorecard.feature.service;

import org.apache.fineract.infrastructure.security.service.PlatformSecurityContext;
import org.apache.fineract.scorecard.feature.domain.FeatureEntity;
import org.apache.fineract.scorecard.feature.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.math.BigDecimal;
@Service
public class FeatureService {

    @Autowired
    private  PlatformSecurityContext securityContext;

    @Autowired
    private  FeatureRepository featureRepository;

    /**
     * .save(featureEntity) making use of Java Doc (CrudRepository.java)
     * Used for saving the details of Feature Screen
     * @param featureEntity
     * @return
     */


    public FeatureEntity createFeature(final FeatureEntity featureEntity){
        this.securityContext.authenticatedUser();
        return this.featureRepository.save(featureEntity);
    }

    /**
     * .findAll() making use of Java Doc (JpaRepository.java)
     * Used for fetching all the details of Feature Screen
     * @return
     */

    public List<FeatureEntity> getAllFeatures(){
        return this.featureRepository.findAll();
    }

    /**
     * getOne
     */
    public FeatureEntity getOneRecord(BigDecimal id){
        this.securityContext.authenticatedUser();
        return this.featureRepository.findOne(id);
    }
}
