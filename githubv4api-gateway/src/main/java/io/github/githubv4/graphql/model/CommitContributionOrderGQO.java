package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class CommitContributionOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private CommitContributionOrderFieldGQO field;

    public CommitContributionOrderGQO() {
    }

    public CommitContributionOrderGQO(OrderDirectionGQO direction, CommitContributionOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public CommitContributionOrderFieldGQO getField() {
        return field;
    }
    public void setField(CommitContributionOrderFieldGQO field) {
        this.field = field;
    }

}