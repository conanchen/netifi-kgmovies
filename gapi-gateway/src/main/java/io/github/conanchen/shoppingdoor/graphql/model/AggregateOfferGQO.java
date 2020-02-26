package io.github.conanchen.shoppingdoor.graphql.model;

import java.util.Collection;

public class AggregateOfferGQO {

    private Integer highPrice;
    private Integer lowPrice;
    private Integer offerCount;
    private Collection<OfferGQO> offers;

    public AggregateOfferGQO() {
    }

    public AggregateOfferGQO(Integer highPrice, Integer lowPrice, Integer offerCount, Collection<OfferGQO> offers) {
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.offerCount = offerCount;
        this.offers = offers;
    }

    public Integer getHighPrice() {
        return highPrice;
    }
    public void setHighPrice(Integer highPrice) {
        this.highPrice = highPrice;
    }

    public Integer getLowPrice() {
        return lowPrice;
    }
    public void setLowPrice(Integer lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Integer getOfferCount() {
        return offerCount;
    }
    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }

    public Collection<OfferGQO> getOffers() {
        return offers;
    }
    public void setOffers(Collection<OfferGQO> offers) {
        this.offers = offers;
    }

}