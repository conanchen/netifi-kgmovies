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
public class TaskStatusGQO implements NodeGQO{


    private String name;

    private String alternateName;

    private String description;
    @lombok.NonNull
    private String id;

    public TaskStatusGQO() {
    }

    public TaskStatusGQO( String name,  String alternateName,  String description,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.id = id;
    }

}