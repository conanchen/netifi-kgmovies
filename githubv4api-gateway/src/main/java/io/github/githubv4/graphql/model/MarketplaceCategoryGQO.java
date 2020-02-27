package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class MarketplaceCategoryGQO implements NodeGQO{

    private String description;
    private String howItWorks;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Integer primaryListingCount;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private Integer secondaryListingCount;
    @javax.validation.constraints.NotNull
    private String slug;
    @javax.validation.constraints.NotNull
    private String url;

    public MarketplaceCategoryGQO() {
    }

    public MarketplaceCategoryGQO(String description, String howItWorks, String id, String name, Integer primaryListingCount, String resourcePath, Integer secondaryListingCount, String slug, String url) {
        this.description = description;
        this.howItWorks = howItWorks;
        this.id = id;
        this.name = name;
        this.primaryListingCount = primaryListingCount;
        this.resourcePath = resourcePath;
        this.secondaryListingCount = secondaryListingCount;
        this.slug = slug;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowItWorks() {
        return howItWorks;
    }
    public void setHowItWorks(String howItWorks) {
        this.howItWorks = howItWorks;
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

    public Integer getPrimaryListingCount() {
        return primaryListingCount;
    }
    public void setPrimaryListingCount(Integer primaryListingCount) {
        this.primaryListingCount = primaryListingCount;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public Integer getSecondaryListingCount() {
        return secondaryListingCount;
    }
    public void setSecondaryListingCount(Integer secondaryListingCount) {
        this.secondaryListingCount = secondaryListingCount;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}