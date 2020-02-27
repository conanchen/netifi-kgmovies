package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsTierOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private SponsorsTierOrderFieldGQO field;

    public SponsorsTierOrderGQO() {
    }

    public SponsorsTierOrderGQO(OrderDirectionGQO direction, SponsorsTierOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public SponsorsTierOrderFieldGQO getField() {
        return field;
    }
    public void setField(SponsorsTierOrderFieldGQO field) {
        this.field = field;
    }

}