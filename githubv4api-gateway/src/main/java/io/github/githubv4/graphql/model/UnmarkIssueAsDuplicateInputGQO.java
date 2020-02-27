package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnmarkIssueAsDuplicateInputGQO {

    @javax.validation.constraints.NotNull
    private String canonicalId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String duplicateId;

    public UnmarkIssueAsDuplicateInputGQO() {
    }

    public UnmarkIssueAsDuplicateInputGQO(String canonicalId, String clientMutationId, String duplicateId) {
        this.canonicalId = canonicalId;
        this.clientMutationId = clientMutationId;
        this.duplicateId = duplicateId;
    }

    public String getCanonicalId() {
        return canonicalId;
    }
    public void setCanonicalId(String canonicalId) {
        this.canonicalId = canonicalId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDuplicateId() {
        return duplicateId;
    }
    public void setDuplicateId(String duplicateId) {
        this.duplicateId = duplicateId;
    }

}