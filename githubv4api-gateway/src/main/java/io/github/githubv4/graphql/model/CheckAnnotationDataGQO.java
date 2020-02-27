package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationDataGQO {

    @javax.validation.constraints.NotNull
    private CheckAnnotationLevelGQO annotationLevel;
    @javax.validation.constraints.NotNull
    private CheckAnnotationRangeGQO location;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String path;
    private String rawDetails;
    private String title;

    public CheckAnnotationDataGQO() {
    }

    public CheckAnnotationDataGQO(CheckAnnotationLevelGQO annotationLevel, CheckAnnotationRangeGQO location, String message, String path, String rawDetails, String title) {
        this.annotationLevel = annotationLevel;
        this.location = location;
        this.message = message;
        this.path = path;
        this.rawDetails = rawDetails;
        this.title = title;
    }

    public CheckAnnotationLevelGQO getAnnotationLevel() {
        return annotationLevel;
    }
    public void setAnnotationLevel(CheckAnnotationLevelGQO annotationLevel) {
        this.annotationLevel = annotationLevel;
    }

    public CheckAnnotationRangeGQO getLocation() {
        return location;
    }
    public void setLocation(CheckAnnotationRangeGQO location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getRawDetails() {
        return rawDetails;
    }
    public void setRawDetails(String rawDetails) {
        this.rawDetails = rawDetails;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}