package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunActionGQO {

    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String identifier;
    @javax.validation.constraints.NotNull
    private String label;

    public CheckRunActionGQO() {
    }

    public CheckRunActionGQO(String description, String identifier, String label) {
        this.description = description;
        this.identifier = identifier;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

}