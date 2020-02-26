package io.github.conanchen.shoppingdoor.graphql.model;

import io.github.conanchen.organization.graphql.model.PartyGQO;
import io.github.conanchen.place.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class DemandGQO implements ThingGQO, OrderableThingGQO, NodeGQO{

    private Boolean isOrderable;
    private String name;
    private String alternateName;
    private String description;
    private PlaceGQO areaServed;
    private BusinessFunctionGQO businessFunction;
    private ServiceGQO itemOffered;
    private PartyGQO seeker;
    @javax.validation.constraints.NotNull
    private String id;

    public DemandGQO() {
    }

    public DemandGQO(Boolean isOrderable, String name, String alternateName, String description, PlaceGQO areaServed, BusinessFunctionGQO businessFunction, ServiceGQO itemOffered, PartyGQO seeker, String id) {
        this.isOrderable = isOrderable;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.businessFunction = businessFunction;
        this.itemOffered = itemOffered;
        this.seeker = seeker;
        this.id = id;
    }

    public Boolean getIsOrderable() {
        return isOrderable;
    }
    public void setIsOrderable(Boolean isOrderable) {
        this.isOrderable = isOrderable;
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

    public PlaceGQO getAreaServed() {
        return areaServed;
    }
    public void setAreaServed(PlaceGQO areaServed) {
        this.areaServed = areaServed;
    }

    public BusinessFunctionGQO getBusinessFunction() {
        return businessFunction;
    }
    public void setBusinessFunction(BusinessFunctionGQO businessFunction) {
        this.businessFunction = businessFunction;
    }

    public ServiceGQO getItemOffered() {
        return itemOffered;
    }
    public void setItemOffered(ServiceGQO itemOffered) {
        this.itemOffered = itemOffered;
    }

    public PartyGQO getSeeker() {
        return seeker;
    }
    public void setSeeker(PartyGQO seeker) {
        this.seeker = seeker;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}