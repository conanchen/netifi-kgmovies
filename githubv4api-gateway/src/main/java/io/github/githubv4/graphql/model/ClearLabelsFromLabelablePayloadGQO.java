package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ClearLabelsFromLabelablePayloadGQO {

    private String clientMutationId;
    private LabelableGQO labelable;

    public ClearLabelsFromLabelablePayloadGQO() {
    }

    public ClearLabelsFromLabelablePayloadGQO(String clientMutationId, LabelableGQO labelable) {
        this.clientMutationId = clientMutationId;
        this.labelable = labelable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public LabelableGQO getLabelable() {
        return labelable;
    }
    public void setLabelable(LabelableGQO labelable) {
        this.labelable = labelable;
    }

}