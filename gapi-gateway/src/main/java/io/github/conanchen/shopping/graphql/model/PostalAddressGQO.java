package io.github.conanchen.shopping.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class PostalAddressGQO implements NodeGQO{

    private String addressCountry;
    private String addressLocality;
    private String addressRegion;
    private String postOfficeBoxNumber;
    private String postalCode;
    private String streetAddress;
    @javax.validation.constraints.NotNull
    private String id;

    public PostalAddressGQO() {
    }

    public PostalAddressGQO(String addressCountry, String addressLocality, String addressRegion, String postOfficeBoxNumber, String postalCode, String streetAddress, String id) {
        this.addressCountry = addressCountry;
        this.addressLocality = addressLocality;
        this.addressRegion = addressRegion;
        this.postOfficeBoxNumber = postOfficeBoxNumber;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
        this.id = id;
    }

    public String getAddressCountry() {
        return addressCountry;
    }
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressLocality() {
        return addressLocality;
    }
    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getAddressRegion() {
        return addressRegion;
    }
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
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

    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}