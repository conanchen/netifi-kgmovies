package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostalAddressGQO implements NodeGQO{

    @lombok.NonNull
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
    @lombok.NonNull
    private String id;

    public PostalAddressGQO() {
    }

    public PostalAddressGQO( String name,  String alternateName,  String description,  String addressCountry,  String addressRegion,  String addressLocality,  String streetAddress1,  String streetAddress2,  String postOfficeBoxNumber,  String postalCode,  String id) {
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
        this.id = id;
    }

}