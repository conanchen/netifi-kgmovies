package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class ThingRefGQO {

    @javax.validation.constraints.NotNull
    private String id;

    public ThingRefGQO() {
    }

    public ThingRefGQO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}