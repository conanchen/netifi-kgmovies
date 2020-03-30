package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SoftwareApplicationRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private String applicationSuite;

    private String downloadUrl;

    private String featureList;

    private String installUrl;

    private String releaseNotes;

    private String screenshot;

    private String softwareVersion;

    public SoftwareApplicationRefGQO() {
    }

    public SoftwareApplicationRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  String applicationSuite,  String downloadUrl,  String featureList,  String installUrl,  String releaseNotes,  String screenshot,  String softwareVersion) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.applicationSuite = applicationSuite;
        this.downloadUrl = downloadUrl;
        this.featureList = featureList;
        this.installUrl = installUrl;
        this.releaseNotes = releaseNotes;
        this.screenshot = screenshot;
        this.softwareVersion = softwareVersion;
    }

}