package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class StarOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private StarOrderFieldGQO field;

    public StarOrderGQO() {
    }

    public StarOrderGQO(OrderDirectionGQO direction, StarOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public StarOrderFieldGQO getField() {
        return field;
    }
    public void setField(StarOrderFieldGQO field) {
        this.field = field;
    }

}