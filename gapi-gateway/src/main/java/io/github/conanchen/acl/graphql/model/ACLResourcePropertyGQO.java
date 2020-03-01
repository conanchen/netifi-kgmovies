package io.github.conanchen.acl.graphql.model;

public class ACLResourcePropertyGQO {

    @javax.validation.constraints.NotNull
    private ACLPermitTypeGQO permit;
    @javax.validation.constraints.NotNull
    private ACLAccessTypeGQO act;
    @javax.validation.constraints.NotNull
    private String propertyName;

    public ACLResourcePropertyGQO() {
    }

    public ACLResourcePropertyGQO(ACLPermitTypeGQO permit, ACLAccessTypeGQO act, String propertyName) {
        this.permit = permit;
        this.act = act;
        this.propertyName = propertyName;
    }

    public ACLPermitTypeGQO getPermit() {
        return permit;
    }
    public void setPermit(ACLPermitTypeGQO permit) {
        this.permit = permit;
    }

    public ACLAccessTypeGQO getAct() {
        return act;
    }
    public void setAct(ACLAccessTypeGQO act) {
        this.act = act;
    }

    public String getPropertyName() {
        return propertyName;
    }
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

}