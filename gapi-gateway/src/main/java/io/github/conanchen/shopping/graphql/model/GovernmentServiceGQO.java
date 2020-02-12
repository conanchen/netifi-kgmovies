package io.github.conanchen.shopping.graphql.model;

import java.util.Collection;
import io.github.conanchen.message.graphql.model.ActionUnionGQO;
import io.github.conanchen.message.graphql.model.OrganizationGQO;
import io.github.conanchen.message.graphql.model.PlaceGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GovernmentServiceGQO implements ServiceGQO, NodeGQO{

    private OrganizationGQO serviceOperator;
    private String name;
    private String alternateName;
    private String description;
    private PlaceGQO areaServed;
    private OpeningHoursSpecificationGQO hoursAvailable;
    private ProductGQO isRelatedTo;
    private ProductGQO isSimilarTo;
    private Collection<ActionUnionGQO> potentialAction;
    @javax.validation.constraints.NotNull
    private String id;

    public GovernmentServiceGQO() {
    }

    public GovernmentServiceGQO(OrganizationGQO serviceOperator, String name, String alternateName, String description, PlaceGQO areaServed, OpeningHoursSpecificationGQO hoursAvailable, ProductGQO isRelatedTo, ProductGQO isSimilarTo, Collection<ActionUnionGQO> potentialAction, String id) {
        this.serviceOperator = serviceOperator;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.areaServed = areaServed;
        this.hoursAvailable = hoursAvailable;
        this.isRelatedTo = isRelatedTo;
        this.isSimilarTo = isSimilarTo;
        this.potentialAction = potentialAction;
        this.id = id;
    }

    public OrganizationGQO getServiceOperator() {
        return serviceOperator;
    }
    public void setServiceOperator(OrganizationGQO serviceOperator) {
        this.serviceOperator = serviceOperator;
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

    public OpeningHoursSpecificationGQO getHoursAvailable() {
        return hoursAvailable;
    }
    public void setHoursAvailable(OpeningHoursSpecificationGQO hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    public ProductGQO getIsRelatedTo() {
        return isRelatedTo;
    }
    public void setIsRelatedTo(ProductGQO isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    public ProductGQO getIsSimilarTo() {
        return isSimilarTo;
    }
    public void setIsSimilarTo(ProductGQO isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }

    public Collection<ActionUnionGQO> getPotentialAction() {
        return potentialAction;
    }
    public void setPotentialAction(Collection<ActionUnionGQO> potentialAction) {
        this.potentialAction = potentialAction;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}