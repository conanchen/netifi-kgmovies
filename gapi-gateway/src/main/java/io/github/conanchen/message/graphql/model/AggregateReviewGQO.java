package io.github.conanchen.message.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class AggregateReviewGQO implements NodeGQO {

    private ThingGQO itemReviewed;
    private Integer ratingCount;
    private Integer reviewCount;
    private Integer bestRating;
    private Integer averageRating;
    private Integer worstRating;
    private String ratingExplanation;
    private Collection<ReviewGQO> reviews;
    @javax.validation.constraints.NotNull
    private String id;

    public AggregateReviewGQO() {
    }

    public AggregateReviewGQO(ThingGQO itemReviewed, Integer ratingCount, Integer reviewCount, Integer bestRating, Integer averageRating, Integer worstRating, String ratingExplanation, Collection<ReviewGQO> reviews, String id) {
        this.itemReviewed = itemReviewed;
        this.ratingCount = ratingCount;
        this.reviewCount = reviewCount;
        this.bestRating = bestRating;
        this.averageRating = averageRating;
        this.worstRating = worstRating;
        this.ratingExplanation = ratingExplanation;
        this.reviews = reviews;
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

    public Integer getBestRating() {
        return bestRating;
    }
    public void setBestRating(Integer bestRating) {
        this.bestRating = bestRating;
    }

    public Integer getAverageRating() {
        return averageRating;
    }
    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getWorstRating() {
        return worstRating;
    }
    public void setWorstRating(Integer worstRating) {
        this.worstRating = worstRating;
    }

    public String getRatingExplanation() {
        return ratingExplanation;
    }
    public void setRatingExplanation(String ratingExplanation) {
        this.ratingExplanation = ratingExplanation;
    }

    public Collection<ReviewGQO> getReviews() {
        return reviews;
    }
    public void setReviews(Collection<ReviewGQO> reviews) {
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}