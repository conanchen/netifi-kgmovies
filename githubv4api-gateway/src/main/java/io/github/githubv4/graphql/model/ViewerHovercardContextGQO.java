package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ViewerHovercardContextGQO implements HovercardContextGQO{

    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String octicon;
    @javax.validation.constraints.NotNull
    private UserGQO viewer;

    public ViewerHovercardContextGQO() {
    }

    public ViewerHovercardContextGQO(String message, String octicon, UserGQO viewer) {
        this.message = message;
        this.octicon = octicon;
        this.viewer = viewer;
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

    public UserGQO getViewer() {
        return viewer;
    }
    public void setViewer(UserGQO viewer) {
        this.viewer = viewer;
    }

}