package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ContributionOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    private ContributionOrderFieldGQO field;

    public ContributionOrderGQO() {
    }

    public ContributionOrderGQO(OrderDirectionGQO direction, ContributionOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public ContributionOrderFieldGQO getField() {
        return field;
    }
    public void setField(ContributionOrderFieldGQO field) {
        this.field = field;
    }

}