package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountsUploadOrderGQO {

    @javax.validation.constraints.NotNull
    private OrderDirectionGQO direction;
    @javax.validation.constraints.NotNull
    private EnterpriseServerUserAccountsUploadOrderFieldGQO field;

    public EnterpriseServerUserAccountsUploadOrderGQO() {
    }

    public EnterpriseServerUserAccountsUploadOrderGQO(OrderDirectionGQO direction, EnterpriseServerUserAccountsUploadOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountsUploadOrderFieldGQO getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountsUploadOrderFieldGQO field) {
        this.field = field;
    }

}