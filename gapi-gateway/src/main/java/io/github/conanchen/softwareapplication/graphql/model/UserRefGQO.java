package io.github.conanchen.softwareapplication.graphql.model;

public class UserRefGQO {

    private String id;
    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private String username;
    private String password;
    private String bio;
    private PersonRefGQO isUserOf;

    public UserRefGQO() {
    }

    public UserRefGQO(String id, String identifier, String name, String alternateName, String description, String username, String password, String bio, PersonRefGQO isUserOf) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.isUserOf = isUserOf;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public PersonRefGQO getIsUserOf() {
        return isUserOf;
    }
    public void setIsUserOf(PersonRefGQO isUserOf) {
        this.isUserOf = isUserOf;
    }

}