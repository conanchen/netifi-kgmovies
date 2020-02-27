package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueFiltersGQO {

    private String assignee;
    private String createdBy;
    @javax.validation.constraints.NotNull
    private Collection<String> labels;
    private String mentioned;
    private String milestone;
    private java.util.Date since;
    @javax.validation.constraints.NotNull
    private Collection<IssueStateGQO> states;
    private Boolean viewerSubscribed;

    public IssueFiltersGQO() {
    }

    public IssueFiltersGQO(String assignee, String createdBy, Collection<String> labels, String mentioned, String milestone, java.util.Date since, Collection<IssueStateGQO> states, Boolean viewerSubscribed) {
        this.assignee = assignee;
        this.createdBy = createdBy;
        this.labels = labels;
        this.mentioned = mentioned;
        this.milestone = milestone;
        this.since = since;
        this.states = states;
        this.viewerSubscribed = viewerSubscribed;
    }

    public String getAssignee() {
        return assignee;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Collection<String> getLabels() {
        return labels;
    }
    public void setLabels(Collection<String> labels) {
        this.labels = labels;
    }

    public String getMentioned() {
        return mentioned;
    }
    public void setMentioned(String mentioned) {
        this.mentioned = mentioned;
    }

    public String getMilestone() {
        return milestone;
    }
    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public java.util.Date getSince() {
        return since;
    }
    public void setSince(java.util.Date since) {
        this.since = since;
    }

    public Collection<IssueStateGQO> getStates() {
        return states;
    }
    public void setStates(Collection<IssueStateGQO> states) {
        this.states = states;
    }

    public Boolean getViewerSubscribed() {
        return viewerSubscribed;
    }
    public void setViewerSubscribed(Boolean viewerSubscribed) {
        this.viewerSubscribed = viewerSubscribed;
    }

}