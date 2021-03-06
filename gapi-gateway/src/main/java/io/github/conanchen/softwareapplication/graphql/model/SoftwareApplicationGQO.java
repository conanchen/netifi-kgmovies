package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import io.github.conanchen.event.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SoftwareApplicationGQO implements ThingGQO, NodeGQO{


    private String applicationSuite;

    private String downloadUrl;

    private String featureList;

    private String installUrl;

    private String iconUrl;

    private String releaseNotes;

    private String screenshot;

    private String softwareVersion;

    private Collection<ActionGQO> potentialActions;

    private SoftwareApplicationGQO isMiniAppOf;

    private Collection<SoftwareApplicationGQO> hasMiniApps;
    @lombok.NonNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;
    @lombok.NonNull
    private String id;

    public SoftwareApplicationGQO() {
    }

    public SoftwareApplicationGQO( String applicationSuite,  String downloadUrl,  String featureList,  String installUrl,  String iconUrl,  String releaseNotes,  String screenshot,  String softwareVersion,  Collection<ActionGQO> potentialActions,  SoftwareApplicationGQO isMiniAppOf,  Collection<SoftwareApplicationGQO> hasMiniApps,  Collection<ACLNamespaceGQO> namespaces,  String identifier,  String name,  String alternateName,  String description,  String id) {
        this.applicationSuite = applicationSuite;
        this.downloadUrl = downloadUrl;
        this.featureList = featureList;
        this.installUrl = installUrl;
        this.iconUrl = iconUrl;
        this.releaseNotes = releaseNotes;
        this.screenshot = screenshot;
        this.softwareVersion = softwareVersion;
        this.potentialActions = potentialActions;
        this.isMiniAppOf = isMiniAppOf;
        this.hasMiniApps = hasMiniApps;
        this.namespaces = namespaces;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.id = id;
    }

}