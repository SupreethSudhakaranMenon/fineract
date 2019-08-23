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

package org.apache.fineract.scorecard.configuration.services;

import org.apache.fineract.scorecard.configuration.data.SaveRequest;
import org.apache.fineract.scorecard.configuration.domain.ConfigurationEntity;
import org.apache.fineract.scorecard.configuration.repo.ConfigurationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationServicesImpl  implements ConfigurationServices {

    @Autowired
    private ConfigurationRepo configurationRepo;

    @Override
    public SaveRequest saveConfiguration(SaveRequest request) {
        ConfigurationEntity configurationEntity = new ConfigurationEntity() ;

        configurationEntity.setProduct(request.getProduct());
        configurationEntity.setCategory(request.getCategory());
        configurationEntity.setFeature(request.getFeature());
        configurationEntity.setWeight(request.getWeight());
        configurationEntity.setColour(request.getColour());
        configurationEntity.setFromrange(request.getFromrange());
        configurationEntity.setTorange(request.getTorange());
        configurationEntity.setValue(request.getValue());

        configurationRepo.save(configurationEntity);
        return null;

    }

    @Override
    public List<SaveRequest> getAllConfigurations() { return null; }
}
