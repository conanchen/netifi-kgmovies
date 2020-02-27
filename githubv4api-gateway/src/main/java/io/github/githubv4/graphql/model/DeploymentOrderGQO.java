package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeploymentOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private DeploymentOrderFieldGQO field;

    public DeploymentOrderGQO() {
    }

    public DeploymentOrderGQO(OrderDirectionGQO direction, DeploymentOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public DeploymentOrderFieldGQO getField() {
        return field;
    }
    public void setField(DeploymentOrderFieldGQO field) {
        this.field = field;
    }

}