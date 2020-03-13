package io.github.conanchen.intangible.graphql.model;

import io.github.conanchen.message.graphql.model.AggregateReviewGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class BrandGQO implements ThingGQO, NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private AggregateReviewGQO aggregateReview;
    private String logo;
    private String slogan;
    @javax.validation.constraints.NotNull
    private String id;

    public BrandGQO() {
    }

    public BrandGQO(String name, String alternateName, String description, AggregateReviewGQO aggregateReview, String logo, String slogan, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.aggregateReview = aggregateReview;
        this.logo = logo;
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

    public AggregateReviewGQO getAggregateReview() {
        return aggregateReview;
    }
    public void setAggregateReview(AggregateReviewGQO aggregateReview) {
        this.aggregateReview = aggregateReview;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
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