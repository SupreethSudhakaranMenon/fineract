package org.apache.fineract.scorecard.feature.controller;

import org.apache.fineract.scorecard.feature.api.FeatureApi;
import org.apache.fineract.scorecard.feature.data.SaveRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;


@RestController(value = "/feature")
public class FeatureController implements FeatureApi {
    @Override
    public ResponseEntity<SaveRequest> saveFeatureUsingPOST(SaveRequest saveFeatureRequest) {
        return null;
    }

    @Override
    public ResponseEntity<List<SaveRequest>> getallfeaturesGet() {
        return null;
    }
}
