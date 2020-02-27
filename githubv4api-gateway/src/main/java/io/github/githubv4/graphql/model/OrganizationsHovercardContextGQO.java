package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationsHovercardContextGQO implements HovercardContextGQO{

    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String octicon;
    @javax.validation.constraints.NotNull
    private OrganizationConnectionGQO relevantOrganizations;
    @javax.validation.constraints.NotNull
    private Integer totalOrganizationCount;

    public OrganizationsHovercardContextGQO() {
    }

    public OrganizationsHovercardContextGQO(String message, String octicon, OrganizationConnectionGQO relevantOrganizations, Integer totalOrganizationCount) {
        this.message = message;
        this.octicon = octicon;
        this.relevantOrganizations = relevantOrganizations;
        this.totalOrganizationCount = totalOrganizationCount;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

    public OrganizationConnectionGQO getRelevantOrganizations() {
        return relevantOrganizations;
    }
    public void setRelevantOrganizations(OrganizationConnectionGQO relevantOrganizations) {
        this.relevantOrganizations = relevantOrganizations;
    }

    public Integer getTotalOrganizationCount() {
        return totalOrganizationCount;
    }
    public void setTotalOrganizationCount(Integer totalOrganizationCount) {
        this.totalOrganizationCount = totalOrganizationCount;
    }

}