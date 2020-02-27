package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsTierAdminInfoGQO {

    @javax.validation.constraints.NotNull
    private SponsorshipConnectionGQO sponsorships;

    public SponsorsTierAdminInfoGQO() {
    }

    public SponsorsTierAdminInfoGQO(SponsorshipConnectionGQO sponsorships) {
        this.sponsorships = sponsorships;
    }

    public SponsorshipConnectionGQO getSponsorships() {
        return sponsorships;
    }
    public void setSponsorships(SponsorshipConnectionGQO sponsorships) {
        this.sponsorships = sponsorships;
    }

}