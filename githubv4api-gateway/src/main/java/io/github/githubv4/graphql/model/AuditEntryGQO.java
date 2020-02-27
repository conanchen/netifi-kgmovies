package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface AuditEntryGQO {

    String getAction();

    AuditEntryActorGQO getActor();

    String getActorIp();

    ActorLocationGQO getActorLocation();

    String getActorLogin();

    String getActorResourcePath();

    String getActorUrl();

    String getCreatedAt();

    OperationTypeGQO getOperationType();

    UserGQO getUser();

    String getUserLogin();

    String getUserResourcePath();

    String getUserUrl();

}