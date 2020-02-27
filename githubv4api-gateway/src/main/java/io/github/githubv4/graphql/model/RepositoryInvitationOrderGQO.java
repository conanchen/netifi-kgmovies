package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryInvitationOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private RepositoryInvitationOrderFieldGQO field;

    public RepositoryInvitationOrderGQO() {
    }

    public RepositoryInvitationOrderGQO(OrderDirectionGQO direction, RepositoryInvitationOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public RepositoryInvitationOrderFieldGQO getField() {
        return field;
    }
    public void setField(RepositoryInvitationOrderFieldGQO field) {
        this.field = field;
    }

}