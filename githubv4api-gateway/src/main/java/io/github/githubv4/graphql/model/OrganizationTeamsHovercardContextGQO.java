package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrganizationTeamsHovercardContextGQO implements HovercardContextGQO{

    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String octicon;
    @javax.validation.constraints.NotNull
    private TeamConnectionGQO relevantTeams;
    @javax.validation.constraints.NotNull
    private String teamsResourcePath;
    @javax.validation.constraints.NotNull
    private String teamsUrl;
    @javax.validation.constraints.NotNull
    private Integer totalTeamCount;

    public OrganizationTeamsHovercardContextGQO() {
    }

    public OrganizationTeamsHovercardContextGQO(String message, String octicon, TeamConnectionGQO relevantTeams, String teamsResourcePath, String teamsUrl, Integer totalTeamCount) {
        this.message = message;
        this.octicon = octicon;
        this.relevantTeams = relevantTeams;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.totalTeamCount = totalTeamCount;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

    public TeamConnectionGQO getRelevantTeams() {
        return relevantTeams;
    }
    public void setRelevantTeams(TeamConnectionGQO relevantTeams) {
        this.relevantTeams = relevantTeams;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }
    public void setTeamsResourcePath(String teamsResourcePath) {
        this.teamsResourcePath = teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Integer getTotalTeamCount() {
        return totalTeamCount;
    }
    public void setTotalTeamCount(Integer totalTeamCount) {
        this.totalTeamCount = totalTeamCount;
    }

}