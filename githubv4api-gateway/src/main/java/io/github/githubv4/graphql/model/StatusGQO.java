package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StatusGQO implements NodeGQO{

    private CommitGQO commit;
    private StatusContextGQO context;
    @javax.validation.constraints.NotNull
    private Collection<StatusContextGQO> contexts;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private StatusStateGQO state;

    public StatusGQO() {
    }

    public StatusGQO(CommitGQO commit, StatusContextGQO context, Collection<StatusContextGQO> contexts, String id, StatusStateGQO state) {
        this.commit = commit;
        this.context = context;
        this.contexts = contexts;
        this.id = id;
        this.state = state;
    }

    public CommitGQO getCommit() {
        return commit;
    }
    public void setCommit(CommitGQO commit) {
        this.commit = commit;
    }

    public StatusContextGQO getContext() {
        return context;
    }
    public void setContext(StatusContextGQO context) {
        this.context = context;
    }

    public Collection<StatusContextGQO> getContexts() {
        return contexts;
    }
    public void setContexts(Collection<StatusContextGQO> contexts) {
        this.contexts = contexts;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public StatusStateGQO getState() {
        return state;
    }
    public void setState(StatusStateGQO state) {
        this.state = state;
    }

}