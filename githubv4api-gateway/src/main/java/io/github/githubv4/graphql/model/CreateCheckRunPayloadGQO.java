package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CreateCheckRunPayloadGQO {

    private CheckRunGQO checkRun;
    private String clientMutationId;

    public CreateCheckRunPayloadGQO() {
    }

    public CreateCheckRunPayloadGQO(CheckRunGQO checkRun, String clientMutationId) {
        this.checkRun = checkRun;
        this.clientMutationId = clientMutationId;
    }

    public CheckRunGQO getCheckRun() {
        return checkRun;
    }
    public void setCheckRun(CheckRunGQO checkRun) {
        this.checkRun = checkRun;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}