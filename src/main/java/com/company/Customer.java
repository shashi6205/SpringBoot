package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Define customer class as Spring Bean
public class Customer {

    private int custId;
    private String custName;
    private Taxonomy adTaxonomy;
    @Autowired
    private Ads custAd;

    public Customer(int custId, String custName, Taxonomy adTaxonomy, Ads custAd) {
        //instantiated by constructor
        this.custId = custId;
        this.custName = custName;
        this.adTaxonomy = adTaxonomy;
        this.custAd = custAd;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void display() {
        System.out.println("Object is returned successfully.");
        custAd.adDisplay();
    }

    public Ads getCustAd() {
        return custAd;
    }

    public void setCustAd(Ads custAd) {
        this.custAd = custAd;
    }

    public Taxonomy getAdTaxonomy() {
        return adTaxonomy;
    }

    public void setAdTaxonomy(Taxonomy adTaxonomy) {
        //taxonomy instantiated via setter
        this.adTaxonomy = adTaxonomy;
    }
}
