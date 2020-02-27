package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SavedReplyOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private SavedReplyOrderFieldGQO field;

    public SavedReplyOrderGQO() {
    }

    public SavedReplyOrderGQO(OrderDirectionGQO direction, SavedReplyOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public SavedReplyOrderFieldGQO getField() {
        return field;
    }
    public void setField(SavedReplyOrderFieldGQO field) {
        this.field = field;
    }

}