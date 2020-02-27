package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeletePackageVersionInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String packageVersionId;

    public DeletePackageVersionInputGQO() {
    }

    public DeletePackageVersionInputGQO(String clientMutationId, String packageVersionId) {
        this.clientMutationId = clientMutationId;
        this.packageVersionId = packageVersionId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPackageVersionId() {
        return packageVersionId;
    }
    public void setPackageVersionId(String packageVersionId) {
        this.packageVersionId = packageVersionId;
    }

}