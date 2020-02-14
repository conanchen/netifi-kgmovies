package io.github.conanchen.intangible.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class BrandGQO implements ThingGQO, NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private AggregateRatingGQO aggregateRating;
    private String logo;
    private ReviewGQO review;
    private String slogan;
    @javax.validation.constraints.NotNull
    private String id;

    public BrandGQO() {
    }

    public BrandGQO(String name, String alternateName, String description, AggregateRatingGQO aggregateRating, String logo, ReviewGQO review, String slogan, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateRating = aggregateRating;
        this.logo = logo;
        this.review = review;
        this.slogan = slogan;
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

    public AggregateRatingGQO getAggregateRating() {
        return aggregateRating;
    }
    public void setAggregateRating(AggregateRatingGQO aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ReviewGQO getReview() {
        return review;
    }
    public void setReview(ReviewGQO review) {
        this.review = review;
    }

    public String getSlogan() {
        return slogan;
    }
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}