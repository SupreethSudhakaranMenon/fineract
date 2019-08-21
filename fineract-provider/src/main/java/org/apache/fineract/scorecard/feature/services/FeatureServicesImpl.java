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
