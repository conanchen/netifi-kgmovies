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
public class IssueGQO implements ThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private PersonGQO creator;

    private Collection<PersonGQO> assignees;

    private Collection<TaskGQO> tasks;
    @lombok.NonNull
    private String id;

    public IssueGQO() {
    }

    public IssueGQO( String name,  String alternateName,  String description,  PersonGQO creator,  Collection<PersonGQO> assignees,  Collection<TaskGQO> tasks,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.creator = creator;
        this.assignees = assignees;
        this.tasks = tasks;
        this.id = id;
    }

}