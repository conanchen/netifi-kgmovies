package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AddCommentPayloadGQO {

    private String clientMutationId;
    private IssueCommentEdgeGQO commentEdge;
    private NodeGQO subject;
    private IssueTimelineItemEdgeGQO timelineEdge;

    public AddCommentPayloadGQO() {
    }

    public AddCommentPayloadGQO(String clientMutationId, IssueCommentEdgeGQO commentEdge, NodeGQO subject, IssueTimelineItemEdgeGQO timelineEdge) {
        this.clientMutationId = clientMutationId;
        this.commentEdge = commentEdge;
        this.subject = subject;
        this.timelineEdge = timelineEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueCommentEdgeGQO getCommentEdge() {
        return commentEdge;
    }
    public void setCommentEdge(IssueCommentEdgeGQO commentEdge) {
        this.commentEdge = commentEdge;
    }

    public NodeGQO getSubject() {
        return subject;
    }
    public void setSubject(NodeGQO subject) {
        this.subject = subject;
    }

    public IssueTimelineItemEdgeGQO getTimelineEdge() {
        return timelineEdge;
    }
    public void setTimelineEdge(IssueTimelineItemEdgeGQO timelineEdge) {
        this.timelineEdge = timelineEdge;
    }

}