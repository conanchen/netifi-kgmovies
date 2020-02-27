package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateLabelPayloadGQO {

    private String clientMutationId;
    private LabelGQO label;

    public CreateLabelPayloadGQO() {
    }

    public CreateLabelPayloadGQO(String clientMutationId, LabelGQO label) {
        this.clientMutationId = clientMutationId;
        this.label = label;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public LabelGQO getLabel() {
        return label;
    }
    public void setLabel(LabelGQO label) {
        this.label = label;
    }

}