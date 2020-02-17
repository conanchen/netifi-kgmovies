package io.github.conanchen.place.graphql.model;

import io.github.conanchen.zommon.graphql.model.LocalBusinessGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class EldercareGQO implements LocalBusinessGQO, NodeGQO{

    private String openingHours;
    private String paymentAccepted;
    private String priceRange;
    @javax.validation.constraints.NotNull
    private String id;

    public EldercareGQO() {
    }

    public EldercareGQO(String openingHours, String paymentAccepted, String priceRange, String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.id = id;
    }

    public String getOpeningHours() {
        return openingHours;
    }
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getPaymentAccepted() {
        return paymentAccepted;
    }
    public void setPaymentAccepted(String paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    public String getPriceRange() {
        return priceRange;
    }
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}