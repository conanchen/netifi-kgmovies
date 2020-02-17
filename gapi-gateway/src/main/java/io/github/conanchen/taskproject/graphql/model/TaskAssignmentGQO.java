package io.github.conanchen.taskproject.graphql.model;

import io.github.conanchen.message.graphql.model.CommentGQO;
import io.github.conanchen.personorg.graphql.model.PartyGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class TaskAssignmentGQO implements NodeGQO{

    private TaskGQO about;
    private CommentGQO comment;
    private PartyGQO assignee;
    private PartyGQO assigner;
    @javax.validation.constraints.NotNull
    private java.util.Date readAt;
    @javax.validation.constraints.NotNull
    private java.util.Date acceptedAt;
    @javax.validation.constraints.NotNull
    private java.util.Date assignedAt;
    @javax.validation.constraints.NotNull
    private String id;

    public TaskAssignmentGQO() {
    }

    public TaskAssignmentGQO(TaskGQO about, CommentGQO comment, PartyGQO assignee, PartyGQO assigner, java.util.Date readAt, java.util.Date acceptedAt, java.util.Date assignedAt, String id) {
        this.about = about;
        this.comment = comment;
        this.assignee = assignee;
        this.assigner = assigner;
        this.readAt = readAt;
        this.acceptedAt = acceptedAt;
        this.assignedAt = assignedAt;
        this.id = id;
    }

    public TaskGQO getAbout() {
        return about;
    }
    public void setAbout(TaskGQO about) {
        this.about = about;
    }

    public CommentGQO getComment() {
        return comment;
    }
    public void setComment(CommentGQO comment) {
        this.comment = comment;
    }

    public PartyGQO getAssignee() {
        return assignee;
    }
    public void setAssignee(PartyGQO assignee) {
        this.assignee = assignee;
    }

    public PartyGQO getAssigner() {
        return assigner;
    }
    public void setAssigner(PartyGQO assigner) {
        this.assigner = assigner;
    }

    public java.util.Date getReadAt() {
        return readAt;
    }
    public void setReadAt(java.util.Date readAt) {
        this.readAt = readAt;
    }

    public java.util.Date getAcceptedAt() {
        return acceptedAt;
    }
    public void setAcceptedAt(java.util.Date acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public java.util.Date getAssignedAt() {
        return assignedAt;
    }
    public void setAssignedAt(java.util.Date assignedAt) {
        this.assignedAt = assignedAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}