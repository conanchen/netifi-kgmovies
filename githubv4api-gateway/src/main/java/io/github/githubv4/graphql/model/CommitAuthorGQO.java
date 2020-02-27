package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitAuthorGQO {

    @javax.validation.constraints.NotNull
    private Collection<String> emails;
    private String id;

    public CommitAuthorGQO() {
    }

    public CommitAuthorGQO(Collection<String> emails, String id) {
        this.emails = emails;
        this.id = id;
    }

    public Collection<String> getEmails() {
        return emails;
    }
    public void setEmails(Collection<String> emails) {
        this.emails = emails;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}