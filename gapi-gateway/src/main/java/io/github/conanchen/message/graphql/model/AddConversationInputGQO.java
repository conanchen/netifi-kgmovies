package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;
import io.github.conanchen.softwareapplication.graphql.model.ThingRefGQO;
import io.github.conanchen.softwareapplication.graphql.model.UserRefGQO;

public class AddConversationInputGQO {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String actionId;
    private String identifier;
    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private ThingRefGQO about;
    private UserRefGQO accountablePerson;
    private UserRefGQO creator;
    private java.util.Date dateCreated;

    public AddConversationInputGQO() {
    }

    public AddConversationInputGQO(String clientMutationId, String actionId, String identifier, String name, String alternateName, String description, ThingRefGQO about, UserRefGQO accountablePerson, UserRefGQO creator, java.util.Date dateCreated) {
        this.clientMutationId = clientMutationId;
        this.actionId = actionId;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.creator = creator;
        this.dateCreated = dateCreated;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    public ThingRefGQO getAbout() {
        return about;
    }
    public void setAbout(ThingRefGQO about) {
        this.about = about;
    }

    public UserRefGQO getAccountablePerson() {
        return accountablePerson;
    }
    public void setAccountablePerson(UserRefGQO accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public UserRefGQO getCreator() {
        return creator;
    }
    public void setCreator(UserRefGQO creator) {
        this.creator = creator;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

}