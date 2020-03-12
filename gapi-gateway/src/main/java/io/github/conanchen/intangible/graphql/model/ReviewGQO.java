package io.github.conanchen.intangible.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class ReviewGQO implements NodeGQO{

    private ThingGQO itemReviewed;
    private String reviewAspect;
    private String reviewBody;
    private Integer ratingValue;
    @javax.validation.constraints.NotNull
    private String id;

    public ReviewGQO() {
    }

    public ReviewGQO(ThingGQO itemReviewed, String reviewAspect, String reviewBody, Integer ratingValue, String id) {
        this.itemReviewed = itemReviewed;
        this.reviewAspect = reviewAspect;
        this.reviewBody = reviewBody;
        this.ratingValue = ratingValue;
        this.id = id;
    }

    public ThingGQO getItemReviewed() {
        return itemReviewed;
    }
    public void setItemReviewed(ThingGQO itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

    public String getReviewAspect() {
        return reviewAspect;
    }
    public void setReviewAspect(String reviewAspect) {
        this.reviewAspect = reviewAspect;
    }

    public String getReviewBody() {
        return reviewBody;
    }
    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public Integer getRatingValue() {
        return ratingValue;
    }
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}