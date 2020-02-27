package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageOrderGQO {

    private OrderDirectionGQO direction;
    private PackageOrderFieldGQO field;

    public PackageOrderGQO() {
    }

    public PackageOrderGQO(OrderDirectionGQO direction, PackageOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public PackageOrderFieldGQO getField() {
        return field;
    }
    public void setField(PackageOrderFieldGQO field) {
        this.field = field;
    }

}