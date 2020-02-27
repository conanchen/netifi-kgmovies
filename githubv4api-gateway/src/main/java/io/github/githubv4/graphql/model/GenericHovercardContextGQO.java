package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GenericHovercardContextGQO implements HovercardContextGQO{

    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String octicon;

    public GenericHovercardContextGQO() {
    }

    public GenericHovercardContextGQO(String message, String octicon) {
        this.message = message;
        this.octicon = octicon;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

}