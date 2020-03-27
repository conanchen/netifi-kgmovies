package io.github.conanchen.acl.graphql.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ACLResourcePropertyGQO {

    @javax.validation.constraints.NotNull
    private ACLPermitTypeGQO permit;
    @javax.validation.constraints.NotNull
    private ACLAccessTypeGQO act;
    @javax.validation.constraints.NotNull
    private String propertyName;

    public ACLResourcePropertyGQO() {
    }

    public ACLResourcePropertyGQO( ACLPermitTypeGQO permit,  ACLAccessTypeGQO act,  String propertyName) {
        this.permit = permit;
        this.act = act;
        this.propertyName = propertyName;
    }

}