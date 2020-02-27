package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class PackageFileOrderGQO {

    private OrderDirectionGQO direction;
    private PackageFileOrderFieldGQO field;

    public PackageFileOrderGQO() {
    }

    public PackageFileOrderGQO(OrderDirectionGQO direction, PackageFileOrderFieldGQO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionGQO getDirection() {
        return direction;
    }
    public void setDirection(OrderDirectionGQO direction) {
        this.direction = direction;
    }

    public PackageFileOrderFieldGQO getField() {
        return field;
    }
    public void setField(PackageFileOrderFieldGQO field) {
        this.field = field;
    }

}