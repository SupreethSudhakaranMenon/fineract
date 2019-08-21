package org.apache.fineract.scorecard.feature.domain;


import javax.persistence.*;
import java.math.BigDecimal;
//import lombok.Getter;

@Entity
@Table(name = "m_feature")
public class FeatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id ;

    private String feature ;

    private String value ;

    private String data ;

    private String category ;

    private String status ;

    public FeatureEntity() {
    }

    public FeatureEntity(BigDecimal id, String feature, String value, String data, String category, String status) {
        this.id = id;
        this.feature = feature;
        this.value = value;
        this.data = data;
        this.category = category;
        this.status = status;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
