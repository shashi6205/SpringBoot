package com.company;

import org.springframework.stereotype.Component;

@Component
public class Taxonomy {

    private int AdTaxonomyId;
    private String AdTaxonomyName;

    public int getAdTaxonomyId() {
        return AdTaxonomyId;
    }

    public void setAdTaxonomyId(int adTaxonomyId) {
        AdTaxonomyId = adTaxonomyId;
    }

    public String getAdTaxonomyName() {
        return AdTaxonomyName;
    }

    public void setAdTaxonomyName(String adTaxonomyName) {
        AdTaxonomyName = adTaxonomyName;
    }
}
