package io.github.conanchen.person.graphql.model;

import io.github.conanchen.shoppingdoor.graphql.model.OpeningHoursSpecificationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ContactPointGQO implements NodeGQO{


    private java.lang.String areaServed;

    private String email;

    private String faxNumber;

    private OpeningHoursSpecificationGQO hoursAvailable;

    private String telephone;
    @javax.validation.constraints.NotNull
    private String id;

    public ContactPointGQO() {
    }

    public ContactPointGQO( java.lang.String areaServed,  String email,  String faxNumber,  OpeningHoursSpecificationGQO hoursAvailable,  String telephone,  String id) {
        this.areaServed = areaServed;
        this.email = email;
        this.faxNumber = faxNumber;
        this.hoursAvailable = hoursAvailable;
        this.telephone = telephone;
        this.id = id;
    }

}