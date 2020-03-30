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
public class TaskAssignmentGQO implements NodeGQO{


    private TaskGQO about;

    private ReviewGQO comment;

    private PartyGQO assignee;

    private PartyGQO assigner;
    @lombok.NonNull
    private java.util.Date readAt;
    @lombok.NonNull
    private java.util.Date acceptedAt;
    @lombok.NonNull
    private java.util.Date assignedAt;
    @lombok.NonNull
    private String id;

    public TaskAssignmentGQO() {
    }

    public TaskAssignmentGQO( TaskGQO about,  ReviewGQO comment,  PartyGQO assignee,  PartyGQO assigner,  java.util.Date readAt,  java.util.Date acceptedAt,  java.util.Date assignedAt,  String id) {
        this.about = about;
        this.comment = comment;
        this.assignee = assignee;
        this.assigner = assigner;
        this.readAt = readAt;
        this.acceptedAt = acceptedAt;
        this.assignedAt = assignedAt;
        this.id = id;
    }

}