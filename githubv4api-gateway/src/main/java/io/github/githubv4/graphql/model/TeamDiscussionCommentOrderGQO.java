package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamDiscussionCommentOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private TeamDiscussionCommentOrderFieldGQO field;

    public TeamDiscussionCommentOrderGQO() {
    }

    public TeamDiscussionCommentOrderGQO(OrderDirectionGQO direction, TeamDiscussionCommentOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public TeamDiscussionCommentOrderFieldGQO getField() {
        return field;
    }
    public void setField(TeamDiscussionCommentOrderFieldGQO field) {
        this.field = field;
    }

}