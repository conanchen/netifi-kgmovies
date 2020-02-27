package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private OrganizationOrderFieldGQO field;

    public OrganizationOrderGQO() {
    }

    public OrganizationOrderGQO(OrderDirectionGQO direction, OrganizationOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public OrganizationOrderFieldGQO getField() {
        return field;
    }
    public void setField(OrganizationOrderFieldGQO field) {
        this.field = field;
    }

}