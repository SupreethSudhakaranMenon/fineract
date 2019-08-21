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

package org.apache.fineract.scorecard.feature.services;

import org.apache.fineract.scorecard.feature.data.SaveRequest;
import org.apache.fineract.scorecard.feature.domain.FeatureEntity;
import org.apache.fineract.scorecard.feature.repo.FeatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureServicesImpl implements FeatureServices {

    @Autowired
    private FeatureRepo featureRepo;

    @Override
    public SaveRequest saveFeature(SaveRequest request) {
        FeatureEntity featureEntity = new FeatureEntity();
//        featureEntity.setId();

        featureEntity.setCategory(request.getCategory());
        featureEntity.setData(request.getData());
        featureEntity.setFeature(request.getFeature());
        featureEntity.setStatus(request.getStatus());
        featureEntity.setValue(request.getValue());

        featureRepo.save(featureEntity);
        return null;
    }

    @Override
    public List<SaveRequest> getAllFeatures() {
        return null;
    }
}
