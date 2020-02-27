package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RegistryPackageMetadatumGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private Boolean update;
    @javax.validation.constraints.NotNull
    private String value;

    public RegistryPackageMetadatumGQO() {
    }

    public RegistryPackageMetadatumGQO(String name, Boolean update, String value) {
        this.name = name;
        this.update = update;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUpdate() {
        return update;
    }
    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}