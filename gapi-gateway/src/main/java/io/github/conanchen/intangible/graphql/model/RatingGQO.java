package io.github.conanchen.intangible.graphql.model;

import io.github.conanchen.organization.graphql.model.PartyGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class RatingGQO implements NodeGQO{

    private PartyGQO author;
    private Integer bestRating;
    private String ratingExplanation;
    private Integer ratingValue;
    private String reviewAspect;
    private Integer worstRating;
    @javax.validation.constraints.NotNull
    private String id;

    public RatingGQO() {
    }

    public RatingGQO(PartyGQO author, Integer bestRating, String ratingExplanation, Integer ratingValue, String reviewAspect, Integer worstRating, String id) {
        this.author = author;
        this.bestRating = bestRating;
        this.ratingExplanation = ratingExplanation;
        this.ratingValue = ratingValue;
        this.reviewAspect = reviewAspect;
        this.worstRating = worstRating;
        this.id = id;
    }

    public PartyGQO getAuthor() {
        return author;
    }
    public void setAuthor(PartyGQO author) {
        this.author = author;
    }

    public Integer getBestRating() {
        return bestRating;
    }
    public void setBestRating(Integer bestRating) {
        this.bestRating = bestRating;
    }

    public String getRatingExplanation() {
        return ratingExplanation;
    }
    public void setRatingExplanation(String ratingExplanation) {
        this.ratingExplanation = ratingExplanation;
    }

    public Integer getRatingValue() {
        return ratingValue;
    }
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getReviewAspect() {
        return reviewAspect;
    }
    public void setReviewAspect(String reviewAspect) {
        this.reviewAspect = reviewAspect;
    }

    public Integer getWorstRating() {
        return worstRating;
    }
    public void setWorstRating(Integer worstRating) {
        this.worstRating = worstRating;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}