package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CheckAnnotationSpanGQO {

    @javax.validation.constraints.NotNull
    private CheckAnnotationPositionGQO end;
    @javax.validation.constraints.NotNull
    private CheckAnnotationPositionGQO start;

    public CheckAnnotationSpanGQO() {
    }

    public CheckAnnotationSpanGQO(CheckAnnotationPositionGQO end, CheckAnnotationPositionGQO start) {
        this.end = end;
        this.start = start;
    }

    public CheckAnnotationPositionGQO getEnd() {
        return end;
    }
    public void setEnd(CheckAnnotationPositionGQO end) {
        this.end = end;
    }

    public CheckAnnotationPositionGQO getStart() {
        return start;
    }
    public void setStart(CheckAnnotationPositionGQO start) {
        this.start = start;
    }

}