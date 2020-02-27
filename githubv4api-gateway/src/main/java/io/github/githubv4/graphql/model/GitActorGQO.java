package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GitActorGQO {

    @javax.validation.constraints.NotNull
    private String avatarUrl;
    private String date;
    private String email;
    private String name;
    private UserGQO user;

    public GitActorGQO() {
    }

    public GitActorGQO(String avatarUrl, String date, String email, String name, UserGQO user) {
        this.avatarUrl = avatarUrl;
        this.date = date;
        this.email = email;
        this.name = name;
        this.user = user;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

}