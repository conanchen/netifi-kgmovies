package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface TeamAuditEntryDataGQO {

    TeamGQO getTeam();

    String getTeamName();

    String getTeamResourcePath();

    String getTeamUrl();

}