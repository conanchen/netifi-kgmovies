package io.github.conanchen.taskproject.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.taskproject.graphql.api.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PersonActivityTimelineGQO implements NodeGQO{


    private PersonGQO about;

    private String name;

    private String alternateName;

    private String description;

    private Collection<ActionGQO> personActivities;
    @lombok.NonNull
    private String id;

    public PersonActivityTimelineGQO() {
    }

    public PersonActivityTimelineGQO( PersonGQO about,  String name,  String alternateName,  String description,  Collection<ActionGQO> personActivities,  String id) {
        this.about = about;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.personActivities = personActivities;
        this.id = id;
    }

}