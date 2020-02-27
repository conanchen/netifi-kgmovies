package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageVersionOrderGQO {

    private OrderDirectionGQO direction;
    private PackageVersionOrderFieldGQO field;

    public PackageVersionOrderGQO() {
    }

    public PackageVersionOrderGQO(OrderDirectionGQO direction, PackageVersionOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public PackageVersionOrderFieldGQO getField() {
        return field;
    }
    public void setField(PackageVersionOrderFieldGQO field) {
        this.field = field;
    }

}