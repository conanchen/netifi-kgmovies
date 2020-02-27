package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateRefInputGQO {

    private String clientMutationId;
    private Boolean force;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private String refId;

    public UpdateRefInputGQO() {
    }

    public UpdateRefInputGQO(String clientMutationId, Boolean force, String oid, String refId) {
        this.clientMutationId = clientMutationId;
        this.force = force;
        this.oid = oid;
        this.refId = refId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getForce() {
        return force;
    }
    public void setForce(Boolean force) {
        this.force = force;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRefId() {
        return refId;
    }
    public void setRefId(String refId) {
        this.refId = refId;
    }

}