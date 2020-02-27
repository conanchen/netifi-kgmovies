package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class OrgRestoreMemberMembershipTeamAuditEntryDataGQO implements OrgRestoreMemberAuditEntryMembershipGQO, TeamAuditEntryDataGQO{

    private TeamGQO team;
    private String teamName;
    private String teamResourcePath;
    private String teamUrl;

    public OrgRestoreMemberMembershipTeamAuditEntryDataGQO() {
    }

    public OrgRestoreMemberMembershipTeamAuditEntryDataGQO(TeamGQO team, String teamName, String teamResourcePath, String teamUrl) {
        this.team = team;
        this.teamName = teamName;
        this.teamResourcePath = teamResourcePath;
        this.teamUrl = teamUrl;
    }

    public TeamGQO getTeam() {
        return team;
    }
    public void setTeam(TeamGQO team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamResourcePath() {
        return teamResourcePath;
    }
    public void setTeamResourcePath(String teamResourcePath) {
        this.teamResourcePath = teamResourcePath;
    }

    public String getTeamUrl() {
        return teamUrl;
    }
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

}