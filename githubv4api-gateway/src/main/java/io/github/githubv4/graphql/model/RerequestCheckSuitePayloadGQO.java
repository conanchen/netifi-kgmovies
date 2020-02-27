package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RerequestCheckSuitePayloadGQO {

    private CheckSuiteGQO checkSuite;
    private String clientMutationId;

    public RerequestCheckSuitePayloadGQO() {
    }

    public RerequestCheckSuitePayloadGQO(CheckSuiteGQO checkSuite, String clientMutationId) {
        this.checkSuite = checkSuite;
        this.clientMutationId = clientMutationId;
    }

    public CheckSuiteGQO getCheckSuite() {
        return checkSuite;
    }
    public void setCheckSuite(CheckSuiteGQO checkSuite) {
        this.checkSuite = checkSuite;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}