package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MinimizeCommentInputGQO {

    @javax.validation.constraints.NotNull
    private ReportedContentClassifiersGQO classifier;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public MinimizeCommentInputGQO() {
    }

    public MinimizeCommentInputGQO(ReportedContentClassifiersGQO classifier, String clientMutationId, String subjectId) {
        this.classifier = classifier;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
    }

    public ReportedContentClassifiersGQO getClassifier() {
        return classifier;
    }
    public void setClassifier(ReportedContentClassifiersGQO classifier) {
        this.classifier = classifier;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}