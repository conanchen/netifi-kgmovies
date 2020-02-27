package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseMemberOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseMemberOrderFieldGQO field;

    public EnterpriseMemberOrderGQO() {
    }

    public EnterpriseMemberOrderGQO(OrderDirectionGQO direction, EnterpriseMemberOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseMemberOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseMemberOrderFieldGQO field) {
        this.field = field;
    }

}