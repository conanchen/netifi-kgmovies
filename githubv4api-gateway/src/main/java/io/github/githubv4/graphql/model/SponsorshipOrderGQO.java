package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorshipOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private SponsorshipOrderFieldGQO field;

    public SponsorshipOrderGQO() {
    }

    public SponsorshipOrderGQO(OrderDirectionGQO direction, SponsorshipOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public SponsorshipOrderFieldGQO getField() {
        return field;
    }
    public void setField(SponsorshipOrderFieldGQO field) {
        this.field = field;
    }

}