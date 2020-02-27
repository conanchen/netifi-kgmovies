package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private SecurityAdvisoryOrderFieldGQO field;

    public SecurityAdvisoryOrderGQO() {
    }

    public SecurityAdvisoryOrderGQO(OrderDirectionGQO direction, SecurityAdvisoryOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public SecurityAdvisoryOrderFieldGQO getField() {
        return field;
    }
    public void setField(SecurityAdvisoryOrderFieldGQO field) {
        this.field = field;
    }

}