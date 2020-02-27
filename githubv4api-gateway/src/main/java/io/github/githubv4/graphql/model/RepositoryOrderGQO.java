package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private RepositoryOrderFieldGQO field;

    public RepositoryOrderGQO() {
    }

    public RepositoryOrderGQO(OrderDirectionGQO direction, RepositoryOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public RepositoryOrderFieldGQO getField() {
        return field;
    }
    public void setField(RepositoryOrderFieldGQO field) {
        this.field = field;
    }

}