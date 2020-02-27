package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryIdentifierFilterGQO {

    @javax.validation.constraints.NotNull
    private SecurityAdvisoryIdentifierTypeGQO type;
    @javax.validation.constraints.NotNull
    private String value;

    public SecurityAdvisoryIdentifierFilterGQO() {
    }

    public SecurityAdvisoryIdentifierFilterGQO(SecurityAdvisoryIdentifierTypeGQO type, String value) {
        this.type = type;
        this.value = value;
    }

    public SecurityAdvisoryIdentifierTypeGQO getType() {
        return type;
    }
    public void setType(SecurityAdvisoryIdentifierTypeGQO type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}