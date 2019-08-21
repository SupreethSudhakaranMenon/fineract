package org.apache.fineract.scorecard.feature.repo;

import org.apache.fineract.scorecard.feature.domain.FeatureEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface FeatureRepo extends Genericrepo<FeatureEntity, BigDecimal> {
}
