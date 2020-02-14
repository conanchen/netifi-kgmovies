package io.github.conanchen.intangible.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class AggregateRatingGQO implements NodeGQO{

    private ThingGQO itemReviewed;
    private Integer ratingCount;
    private Integer reviewCount;
    @javax.validation.constraints.NotNull
    private String id;

    public AggregateRatingGQO() {
    }

    public AggregateRatingGQO(ThingGQO itemReviewed, Integer ratingCount, Integer reviewCount, String id) {
        this.itemReviewed = itemReviewed;
        this.ratingCount = ratingCount;
        this.reviewCount = reviewCount;
        this.id = id;
    }

    public ThingGQO getItemReviewed() {
        return itemReviewed;
    }
    public void setItemReviewed(ThingGQO itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}