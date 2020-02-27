package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LicenseRuleGQO {

    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String label;

    public LicenseRuleGQO() {
    }

    public LicenseRuleGQO(String description, String key, String label) {
        this.description = description;
        this.key = key;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

}