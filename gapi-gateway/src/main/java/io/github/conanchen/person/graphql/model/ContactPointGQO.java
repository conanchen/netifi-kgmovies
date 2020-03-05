package io.github.conanchen.person.graphql.model;

import io.github.conanchen.shoppingdoor.graphql.model.OpeningHoursSpecificationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ContactPointGQO implements NodeGQO {

    private java.lang.String areaServed;
    private String email;
    private String faxNumber;
    private OpeningHoursSpecificationGQO hoursAvailable;
    private String telephone;
    @javax.validation.constraints.NotNull
    private String id;

    public ContactPointGQO() {
    }

    public ContactPointGQO(java.lang.String areaServed, String email, String faxNumber, OpeningHoursSpecificationGQO hoursAvailable, String telephone, String id) {
        this.areaServed = areaServed;
        this.email = email;
        this.faxNumber = faxNumber;
        this.hoursAvailable = hoursAvailable;
        this.telephone = telephone;
        this.id = id;
    }

    public java.lang.String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(java.lang.String areaServed) {
        this.areaServed = areaServed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public OpeningHoursSpecificationGQO getHoursAvailable() {
        return hoursAvailable;
    }

    public void setHoursAvailable(OpeningHoursSpecificationGQO hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}