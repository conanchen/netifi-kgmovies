package io.github.conanchen.zommon.graphql.model;

import java.util.*;
import io.github.conanchen.zommon.graphql.api.*;

public class CustomAttributeGQO {

    @javax.validation.constraints.NotNull
    private String key;
    private String value;

    public CustomAttributeGQO() {
    }

    public CustomAttributeGQO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}