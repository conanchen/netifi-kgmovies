package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;

public class LocalBusinessOrderGQO {

    private String name;

    public LocalBusinessOrderGQO() {
    }

    public LocalBusinessOrderGQO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}