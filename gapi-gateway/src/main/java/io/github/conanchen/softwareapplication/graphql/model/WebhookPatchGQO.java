package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class WebhookPatchGQO {

    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private String payloadUrl;
    private String contentType;
    private String secret;
    private UserRefGQO creator;
    private java.util.Date dateCreated;
    private SoftwareApplicationRefGQO client;

    public WebhookPatchGQO() {
    }

    public WebhookPatchGQO(String identifier, String name, String alternateName, String description, String payloadUrl, String contentType, String secret, UserRefGQO creator, java.util.Date dateCreated, SoftwareApplicationRefGQO client) {
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.payloadUrl = payloadUrl;
        this.contentType = contentType;
        this.secret = secret;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.client = client;
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

    public SoftwareApplicationRefGQO getClient() {
        return client;
    }
    public void setClient(SoftwareApplicationRefGQO client) {
        this.client = client;
    }

}