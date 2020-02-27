package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryReferenceGQO {

    @javax.validation.constraints.NotNull
    private String url;

    public SecurityAdvisoryReferenceGQO() {
    }

    public SecurityAdvisoryReferenceGQO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}