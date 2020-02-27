package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GistOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private GistOrderFieldGQO field;

    public GistOrderGQO() {
    }

    public GistOrderGQO(OrderDirectionGQO direction, GistOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public GistOrderFieldGQO getField() {
        return field;
    }
    public void setField(GistOrderFieldGQO field) {
        this.field = field;
    }

}