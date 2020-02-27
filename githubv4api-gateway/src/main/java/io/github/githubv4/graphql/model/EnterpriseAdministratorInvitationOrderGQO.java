package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseAdministratorInvitationOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseAdministratorInvitationOrderFieldGQO field;

    public EnterpriseAdministratorInvitationOrderGQO() {
    }

    public EnterpriseAdministratorInvitationOrderGQO(OrderDirectionGQO direction, EnterpriseAdministratorInvitationOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseAdministratorInvitationOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseAdministratorInvitationOrderFieldGQO field) {
        this.field = field;
    }

}