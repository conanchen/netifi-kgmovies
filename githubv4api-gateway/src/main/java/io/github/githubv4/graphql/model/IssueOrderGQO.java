package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class IssueOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private IssueOrderFieldGQO field;

    public IssueOrderGQO() {
    }

    public IssueOrderGQO(OrderDirectionGQO direction, IssueOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public IssueOrderFieldGQO getField() {
        return field;
    }
    public void setField(IssueOrderFieldGQO field) {
        this.field = field;
    }

}