package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountOrderFieldGQO field;

    public EnterpriseServerUserAccountOrderGQO() {
    }

    public EnterpriseServerUserAccountOrderGQO(OrderDirectionGQO direction, EnterpriseServerUserAccountOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountOrderFieldGQO field) {
        this.field = field;
    }

}