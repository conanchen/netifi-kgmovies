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
public class WebhookPatchGQO {


    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private String payloadUrl;

    private String contentType;

    private String secret;

    private UserRefGQO creator;

    private java.util.Date dateCreated;

    private SoftwareApplicationRefGQO client;

    public WebhookPatchGQO() {
    }

    public WebhookPatchGQO( String identifier,  String name,  String alternateName,  String description,  String payloadUrl,  String contentType,  String secret,  UserRefGQO creator,  java.util.Date dateCreated,  SoftwareApplicationRefGQO client) {
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.payloadUrl = payloadUrl;
        this.contentType = contentType;
        this.secret = secret;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.client = client;
    }

}