package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveLabelsFromLabelableInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Collection<String> labelIds;
    @javax.validation.constraints.NotNull
    private String labelableId;

    public RemoveLabelsFromLabelableInputGQO() {
    }

    public RemoveLabelsFromLabelableInputGQO(String clientMutationId, Collection<String> labelIds, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelIds = labelIds;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<String> getLabelIds() {
        return labelIds;
    }
    public void setLabelIds(Collection<String> labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelableId() {
        return labelableId;
    }
    public void setLabelableId(String labelableId) {
        this.labelableId = labelableId;
    }

}