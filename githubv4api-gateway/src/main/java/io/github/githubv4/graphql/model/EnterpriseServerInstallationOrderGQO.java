package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerInstallationOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseServerInstallationOrderFieldGQO field;

    public EnterpriseServerInstallationOrderGQO() {
    }

    public EnterpriseServerInstallationOrderGQO(OrderDirectionGQO direction, EnterpriseServerInstallationOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseServerInstallationOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseServerInstallationOrderFieldGQO field) {
        this.field = field;
    }

}