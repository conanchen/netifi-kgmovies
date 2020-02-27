package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateLabelInputGQO {

    private String clientMutationId;
    private String color;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    private String name;

    public UpdateLabelInputGQO() {
    }

    public UpdateLabelInputGQO(String clientMutationId, String color, String description, String id, String name) {
        this.clientMutationId = clientMutationId;
        this.color = color;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}