package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;

public class StoreOrderGQO {

    private String name;

    public StoreOrderGQO() {
    }

    public StoreOrderGQO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}