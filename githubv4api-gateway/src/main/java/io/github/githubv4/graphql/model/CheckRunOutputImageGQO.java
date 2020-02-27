package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunOutputImageGQO {

    @javax.validation.constraints.NotNull
    private String alt;
    private String caption;
    @javax.validation.constraints.NotNull
    private String imageUrl;

    public CheckRunOutputImageGQO() {
    }

    public CheckRunOutputImageGQO(String alt, String caption, String imageUrl) {
        this.alt = alt;
        this.caption = caption;
        this.imageUrl = imageUrl;
    }

    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}