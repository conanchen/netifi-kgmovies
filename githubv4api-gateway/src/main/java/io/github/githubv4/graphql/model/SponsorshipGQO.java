package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorshipGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserGQO maintainer;
    @javax.validation.constraints.NotNull
    private SponsorshipPrivacyGQO privacyLevel;
    private UserGQO sponsor;
    @javax.validation.constraints.NotNull
    private SponsorableGQO sponsorable;
    private SponsorsTierGQO tier;

    public SponsorshipGQO() {
    }

    public SponsorshipGQO(java.util.Date createdAt, String id, UserGQO maintainer, SponsorshipPrivacyGQO privacyLevel, UserGQO sponsor, SponsorableGQO sponsorable, SponsorsTierGQO tier) {
        this.createdAt = createdAt;
        this.id = id;
        this.maintainer = maintainer;
        this.privacyLevel = privacyLevel;
        this.sponsor = sponsor;
        this.sponsorable = sponsorable;
        this.tier = tier;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public UserGQO getMaintainer() {
        return maintainer;
    }
    public void setMaintainer(UserGQO maintainer) {
        this.maintainer = maintainer;
    }

    public SponsorshipPrivacyGQO getPrivacyLevel() {
        return privacyLevel;
    }
    public void setPrivacyLevel(SponsorshipPrivacyGQO privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public UserGQO getSponsor() {
        return sponsor;
    }
    public void setSponsor(UserGQO sponsor) {
        this.sponsor = sponsor;
    }

    public SponsorableGQO getSponsorable() {
        return sponsorable;
    }
    public void setSponsorable(SponsorableGQO sponsorable) {
        this.sponsorable = sponsorable;
    }

    public SponsorsTierGQO getTier() {
        return tier;
    }
    public void setTier(SponsorsTierGQO tier) {
        this.tier = tier;
    }

}