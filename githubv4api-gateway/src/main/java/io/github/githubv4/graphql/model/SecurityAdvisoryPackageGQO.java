package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SecurityAdvisoryPackageGQO {

    @javax.validation.constraints.NotNull
    private SecurityAdvisoryEcosystemGQO ecosystem;
    @javax.validation.constraints.NotNull
    private String name;

    public SecurityAdvisoryPackageGQO() {
    }

    public SecurityAdvisoryPackageGQO(SecurityAdvisoryEcosystemGQO ecosystem, String name) {
        this.ecosystem = ecosystem;
        this.name = name;
    }

    public SecurityAdvisoryEcosystemGQO getEcosystem() {
        return ecosystem;
    }
    public void setEcosystem(SecurityAdvisoryEcosystemGQO ecosystem) {
        this.ecosystem = ecosystem;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}