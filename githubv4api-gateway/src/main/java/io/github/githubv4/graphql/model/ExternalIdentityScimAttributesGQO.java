package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ExternalIdentityScimAttributesGQO {

    private String username;

    public ExternalIdentityScimAttributesGQO() {
    }

    public ExternalIdentityScimAttributesGQO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}