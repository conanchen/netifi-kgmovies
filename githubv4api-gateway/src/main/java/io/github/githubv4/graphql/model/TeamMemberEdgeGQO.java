package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TeamMemberEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private String memberAccessResourcePath;
    @javax.validation.constraints.NotNull
    private String memberAccessUrl;
    @javax.validation.constraints.NotNull
    private UserGQO node;
    @javax.validation.constraints.NotNull
    private TeamMemberRoleGQO role;

    public TeamMemberEdgeGQO() {
    }

    public TeamMemberEdgeGQO(String cursor, String memberAccessResourcePath, String memberAccessUrl, UserGQO node, TeamMemberRoleGQO role) {
        this.cursor = cursor;
        this.memberAccessResourcePath = memberAccessResourcePath;
        this.memberAccessUrl = memberAccessUrl;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public String getMemberAccessResourcePath() {
        return memberAccessResourcePath;
    }
    public void setMemberAccessResourcePath(String memberAccessResourcePath) {
        this.memberAccessResourcePath = memberAccessResourcePath;
    }

    public String getMemberAccessUrl() {
        return memberAccessUrl;
    }
    public void setMemberAccessUrl(String memberAccessUrl) {
        this.memberAccessUrl = memberAccessUrl;
    }

    public UserGQO getNode() {
        return node;
    }
    public void setNode(UserGQO node) {
        this.node = node;
    }

    public TeamMemberRoleGQO getRole() {
        return role;
    }
    public void setRole(TeamMemberRoleGQO role) {
        this.role = role;
    }

}