package io.github.conanchen.message.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class ConversationGQO implements NodeGQO{

    private OrganizationGQO about;
    private Collection<MessageGQO> hasParts;
    @javax.validation.constraints.NotNull
    private String id;

    public ConversationGQO() {
    }

    public ConversationGQO(OrganizationGQO about, Collection<MessageGQO> hasParts, String id) {
        this.about = about;
        this.hasParts = hasParts;
        this.id = id;
    }

    public OrganizationGQO getAbout() {
        return about;
    }
    public void setAbout(OrganizationGQO about) {
        this.about = about;
    }

    public Collection<MessageGQO> getHasParts() {
        return hasParts;
    }
    public void setHasParts(Collection<MessageGQO> hasParts) {
        this.hasParts = hasParts;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}