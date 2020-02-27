package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UserStatusGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    private String emoji;
    private String emojiHTML;
    private java.util.Date expiresAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean indicatesLimitedAvailability;
    private String message;
    private OrganizationGQO organization;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    @javax.validation.constraints.NotNull
    private UserGQO user;

    public UserStatusGQO() {
    }

    public UserStatusGQO(java.util.Date createdAt, String emoji, String emojiHTML, java.util.Date expiresAt, String id, Boolean indicatesLimitedAvailability, String message, OrganizationGQO organization, java.util.Date updatedAt, UserGQO user) {
        this.createdAt = createdAt;
        this.emoji = emoji;
        this.emojiHTML = emojiHTML;
        this.expiresAt = expiresAt;
        this.id = id;
        this.indicatesLimitedAvailability = indicatesLimitedAvailability;
        this.message = message;
        this.organization = organization;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmoji() {
        return emoji;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiHTML() {
        return emojiHTML;
    }
    public void setEmojiHTML(String emojiHTML) {
        this.emojiHTML = emojiHTML;
    }

    public java.util.Date getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIndicatesLimitedAvailability() {
        return indicatesLimitedAvailability;
    }
    public void setIndicatesLimitedAvailability(Boolean indicatesLimitedAvailability) {
        this.indicatesLimitedAvailability = indicatesLimitedAvailability;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }
    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}