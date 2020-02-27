package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckRunOutputGQO {

    @javax.validation.constraints.NotNull
    private Collection<CheckAnnotationDataGQO> annotations;
    @javax.validation.constraints.NotNull
    private Collection<CheckRunOutputImageGQO> images;
    @javax.validation.constraints.NotNull
    private String summary;
    private String text;
    @javax.validation.constraints.NotNull
    private String title;

    public CheckRunOutputGQO() {
    }

    public CheckRunOutputGQO(Collection<CheckAnnotationDataGQO> annotations, Collection<CheckRunOutputImageGQO> images, String summary, String text, String title) {
        this.annotations = annotations;
        this.images = images;
        this.summary = summary;
        this.text = text;
        this.title = title;
    }

    public Collection<CheckAnnotationDataGQO> getAnnotations() {
        return annotations;
    }
    public void setAnnotations(Collection<CheckAnnotationDataGQO> annotations) {
        this.annotations = annotations;
    }

    public Collection<CheckRunOutputImageGQO> getImages() {
        return images;
    }
    public void setImages(Collection<CheckRunOutputImageGQO> images) {
        this.images = images;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}