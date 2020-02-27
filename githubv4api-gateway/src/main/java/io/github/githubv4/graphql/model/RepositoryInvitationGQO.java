package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class RepositoryInvitationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserGQO invitee;
    @javax.validation.constraints.NotNull
    private UserGQO inviter;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionGQO permission;
    private RepositoryInfoGQO repository;

    public RepositoryInvitationGQO() {
    }

    public RepositoryInvitationGQO(String id, UserGQO invitee, UserGQO inviter, RepositoryPermissionGQO permission, RepositoryInfoGQO repository) {
        this.id = id;
        this.invitee = invitee;
        this.inviter = inviter;
        this.permission = permission;
        this.repository = repository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public UserGQO getInvitee() {
        return invitee;
    }
    public void setInvitee(UserGQO invitee) {
        this.invitee = invitee;
    }

    public UserGQO getInviter() {
        return inviter;
    }
    public void setInviter(UserGQO inviter) {
        this.inviter = inviter;
    }

    public RepositoryPermissionGQO getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermissionGQO permission) {
        this.permission = permission;
    }

    public RepositoryInfoGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryInfoGQO repository) {
        this.repository = repository;
    }

}