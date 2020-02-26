package io.github.conanchen.shoppingcart.graphql.model;

public class PostalAddressInputGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private String addressCountry;
    private String addressRegion;
    private String addressLocality;
    private String streetAddress1;
    private String streetAddress2;
    private String postOfficeBoxNumber;
    private String postalCode;

    public PostalAddressInputGQO() {
    }

    public PostalAddressInputGQO(String name, String alternateName, String description, String addressCountry, String addressRegion, String addressLocality, String streetAddress1, String streetAddress2, String postOfficeBoxNumber, String postalCode) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.addressCountry = addressCountry;
        this.addressRegion = addressRegion;
        this.addressLocality = addressLocality;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.postOfficeBoxNumber = postOfficeBoxNumber;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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

}