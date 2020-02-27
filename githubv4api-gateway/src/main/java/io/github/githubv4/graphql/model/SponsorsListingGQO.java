package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsListingGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String fullDescription;
    @javax.validation.constraints.NotNull
    private String fullDescriptionHTML;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String shortDescription;
    @javax.validation.constraints.NotNull
    private String slug;
    private SponsorsTierConnectionGQO tiers;

    public SponsorsListingGQO() {
    }

    public SponsorsListingGQO(java.util.Date createdAt, String fullDescription, String fullDescriptionHTML, String id, String name, String shortDescription, String slug, SponsorsTierConnectionGQO tiers) {
        this.createdAt = createdAt;
        this.fullDescription = fullDescription;
        this.fullDescriptionHTML = fullDescriptionHTML;
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.slug = slug;
        this.tiers = tiers;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getFullDescription() {
        return fullDescription;
    }
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getFullDescriptionHTML() {
        return fullDescriptionHTML;
    }
    public void setFullDescriptionHTML(String fullDescriptionHTML) {
        this.fullDescriptionHTML = fullDescriptionHTML;
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

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public SponsorsTierConnectionGQO getTiers() {
        return tiers;
    }
    public void setTiers(SponsorsTierConnectionGQO tiers) {
        this.tiers = tiers;
    }

}