package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class PostalAddressGQO implements NodeGQO{

    private String addressCountry;
    private String addressRegion;
    private String addressLocality;
    private String streetAddress1;
    private String streetAddress2;
    private String postOfficeBoxNumber;
    private String postalCode;
    @javax.validation.constraints.NotNull
    private String id;

    public PostalAddressGQO() {
    }

    public PostalAddressGQO(String addressCountry, String addressRegion, String addressLocality, String streetAddress1, String streetAddress2, String postOfficeBoxNumber, String postalCode, String id) {
        this.addressCountry = addressCountry;
        this.addressRegion = addressRegion;
        this.addressLocality = addressLocality;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.postOfficeBoxNumber = postOfficeBoxNumber;
        this.postalCode = postalCode;
        this.id = id;
    }

    public String getAddressCountry() {
        return addressCountry;
    }
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressRegion() {
        return addressRegion;
    }
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressLocality() {
        return addressLocality;
    }
    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }
    public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
        this.postOfficeBoxNumber = postOfficeBoxNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}