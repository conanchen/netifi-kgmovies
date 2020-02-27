package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ClearLabelsFromLabelableInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String labelableId;

    public ClearLabelsFromLabelableInputGQO() {
    }

    public ClearLabelsFromLabelableInputGQO(String clientMutationId, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getLabelableId() {
        return labelableId;
    }
    public void setLabelableId(String labelableId) {
        this.labelableId = labelableId;
    }

}