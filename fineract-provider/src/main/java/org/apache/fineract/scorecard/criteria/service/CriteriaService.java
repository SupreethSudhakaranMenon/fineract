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
package org.apache.fineract.scorecard.criteria.service;

import org.apache.fineract.infrastructure.security.service.PlatformSecurityContext;
import org.apache.fineract.scorecard.criteria.domain.CriteriaEntity;
import org.apache.fineract.scorecard.criteria.repository.CriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriteriaService {

    @Autowired
    private  PlatformSecurityContext securityContext;

    @Autowired
    private CriteriaRepository criteriaRepository;

    /**
     * .save(criteriaEntity) making use of Java Doc (CrudRepository.java)
     * Used for saving the details of Criteria Screen
     * @param criteriaEntity
     * @return
     */

    public CriteriaEntity createCriteria(final CriteriaEntity criteriaEntity){
        this.securityContext.authenticatedUser();
        return this.criteriaRepository.save(criteriaEntity);
    }

    /**
     * .findAll() making use of Java Doc (JpaRepository.java)
     * Used for fetching all the details of Criteria Screen
     * @return
     */

    public List<CriteriaEntity> getAllCriterias(){
        return this.criteriaRepository.findAll();
    }
}
