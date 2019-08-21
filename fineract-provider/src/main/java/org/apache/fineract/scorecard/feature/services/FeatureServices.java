package org.apache.fineract.scorecard.feature.services;

import org.apache.fineract.scorecard.feature.data.SaveRequest;

import java.util.List;

public interface FeatureServices {

    public SaveRequest saveFeature(SaveRequest request);

    public List<SaveRequest> getAllFeatures();
}
