package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryIdentifierGQO {

    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private String value;

    public SecurityAdvisoryIdentifierGQO() {
    }

    public SecurityAdvisoryIdentifierGQO(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}