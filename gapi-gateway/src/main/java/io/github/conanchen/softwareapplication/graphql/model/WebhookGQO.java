package io.github.conanchen.softwareapplication.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class WebhookGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private String payloadUrl;
    private String contentType;
    private String secret;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private SoftwareApplicationGQO client;
    private Collection<ActionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public WebhookGQO() {
    }

    public WebhookGQO(String name, String alternateName, String description, String payloadUrl, String contentType, String secret, PersonGQO creator, java.util.Date dateCreated, SoftwareApplicationGQO client, Collection<ActionGQO> potentialActions, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.payloadUrl = payloadUrl;
        this.contentType = contentType;
        this.secret = secret;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.client = client;
        this.potentialActions = potentialActions;
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

    public String getPayloadUrl() {
        return payloadUrl;
    }
    public void setPayloadUrl(String payloadUrl) {
        this.payloadUrl = payloadUrl;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SoftwareApplicationGQO getClient() {
        return client;
    }
    public void setClient(SoftwareApplicationGQO client) {
        this.client = client;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}