package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RemoveLabelsFromLabelablePayloadGQO {

    private String clientMutationId;
    private LabelableGQO labelable;

    public RemoveLabelsFromLabelablePayloadGQO() {
    }

    public RemoveLabelsFromLabelablePayloadGQO(String clientMutationId, LabelableGQO labelable) {
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