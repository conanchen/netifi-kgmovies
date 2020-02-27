package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class AuditLogOrderGQO {

    private OrderDirectionGQO direction;
    private AuditLogOrderFieldGQO field;

    public AuditLogOrderGQO() {
    }

    public AuditLogOrderGQO(OrderDirectionGQO direction, AuditLogOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public AuditLogOrderFieldGQO getField() {
        return field;
    }
    public void setField(AuditLogOrderFieldGQO field) {
        this.field = field;
    }

}