package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ProjectOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private ProjectOrderFieldGQO field;

    public ProjectOrderGQO() {
    }

    public ProjectOrderGQO(OrderDirectionGQO direction, ProjectOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public ProjectOrderFieldGQO getField() {
        return field;
    }
    public void setField(ProjectOrderFieldGQO field) {
        this.field = field;
    }

}