package io.github.conanchen.taskproject.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class TaskStatusGQO implements NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;

    public TaskStatusGQO() {
    }

    public TaskStatusGQO(String name, String alternateName, String description, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}