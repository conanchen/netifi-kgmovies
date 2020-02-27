package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryPackageVersionGQO {

    @javax.validation.constraints.NotNull
    private String identifier;

    public SecurityAdvisoryPackageVersionGQO() {
    }

    public SecurityAdvisoryPackageVersionGQO(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}