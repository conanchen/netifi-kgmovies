package io.github.conanchen.action.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class EntryPointGQO implements NodeGQO {

    private java.lang.String urlTemplate;
    @javax.validation.constraints.NotNull
    private String id;

    public EntryPointGQO() {
    }

    public EntryPointGQO(java.lang.String urlTemplate, String id) {
        this.urlTemplate = urlTemplate;
        this.id = id;
    }

    public java.lang.String getUrlTemplate() {
        return urlTemplate;
    }
    public void setUrlTemplate(java.lang.String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}