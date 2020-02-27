package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserStatusOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private UserStatusOrderFieldGQO field;

    public UserStatusOrderGQO() {
    }

    public UserStatusOrderGQO(OrderDirectionGQO direction, UserStatusOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public UserStatusOrderFieldGQO getField() {
        return field;
    }
    public void setField(UserStatusOrderFieldGQO field) {
        this.field = field;
    }

}