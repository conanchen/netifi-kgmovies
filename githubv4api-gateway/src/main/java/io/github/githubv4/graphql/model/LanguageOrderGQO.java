package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LanguageOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private LanguageOrderFieldGQO field;

    public LanguageOrderGQO() {
    }

    public LanguageOrderGQO(OrderDirectionGQO direction, LanguageOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public LanguageOrderFieldGQO getField() {
        return field;
    }
    public void setField(LanguageOrderFieldGQO field) {
        this.field = field;
    }

}