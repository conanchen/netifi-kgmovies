package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountEmailOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountEmailOrderFieldGQO field;

    public EnterpriseServerUserAccountEmailOrderGQO() {
    }

    public EnterpriseServerUserAccountEmailOrderGQO(OrderDirectionGQO direction, EnterpriseServerUserAccountEmailOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountEmailOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountEmailOrderFieldGQO field) {
        this.field = field;
    }

}