package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateRefsInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Collection<RefUpdateGQO> refUpdates;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public UpdateRefsInputGQO() {
    }

    public UpdateRefsInputGQO(String clientMutationId, Collection<RefUpdateGQO> refUpdates, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.refUpdates = refUpdates;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<RefUpdateGQO> getRefUpdates() {
        return refUpdates;
    }
    public void setRefUpdates(Collection<RefUpdateGQO> refUpdates) {
        this.refUpdates = refUpdates;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}