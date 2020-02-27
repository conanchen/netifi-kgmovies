package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ImportProjectInputGQO {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private Collection<ProjectColumnImportGQO> columnImports;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerName;
    private Boolean Public;

    public ImportProjectInputGQO() {
    }

    public ImportProjectInputGQO(String body, String clientMutationId, Collection<ProjectColumnImportGQO> columnImports, String name, String ownerName, Boolean Public) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.columnImports = columnImports;
        this.name = name;
        this.ownerName = ownerName;
        this.Public = Public;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<ProjectColumnImportGQO> getColumnImports() {
        return columnImports;
    }
    public void setColumnImports(Collection<ProjectColumnImportGQO> columnImports) {
        this.columnImports = columnImports;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Boolean getPublic() {
        return Public;
    }
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

}