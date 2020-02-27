package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsTierGQO implements NodeGQO{

    private SponsorsTierAdminInfoGQO adminInfo;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String descriptionHTML;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Integer monthlyPriceInCents;
    @javax.validation.constraints.NotNull
    private Integer monthlyPriceInDollars;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private SponsorsListingGQO sponsorsListing;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;

    public SponsorsTierGQO() {
    }

    public SponsorsTierGQO(SponsorsTierAdminInfoGQO adminInfo, java.util.Date createdAt, String description, String descriptionHTML, String id, Integer monthlyPriceInCents, Integer monthlyPriceInDollars, String name, SponsorsListingGQO sponsorsListing, java.util.Date updatedAt) {
        this.adminInfo = adminInfo;
        this.createdAt = createdAt;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.monthlyPriceInCents = monthlyPriceInCents;
        this.monthlyPriceInDollars = monthlyPriceInDollars;
        this.name = name;
        this.sponsorsListing = sponsorsListing;
        this.updatedAt = updatedAt;
    }

    public SponsorsTierAdminInfoGQO getAdminInfo() {
        return adminInfo;
    }
    public void setAdminInfo(SponsorsTierAdminInfoGQO adminInfo) {
        this.adminInfo = adminInfo;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getMonthlyPriceInCents() {
        return monthlyPriceInCents;
    }
    public void setMonthlyPriceInCents(Integer monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
    }

    public Integer getMonthlyPriceInDollars() {
        return monthlyPriceInDollars;
    }
    public void setMonthlyPriceInDollars(Integer monthlyPriceInDollars) {
        this.monthlyPriceInDollars = monthlyPriceInDollars;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public SponsorsListingGQO getSponsorsListing() {
        return sponsorsListing;
    }
    public void setSponsorsListing(SponsorsListingGQO sponsorsListing) {
        this.sponsorsListing = sponsorsListing;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}