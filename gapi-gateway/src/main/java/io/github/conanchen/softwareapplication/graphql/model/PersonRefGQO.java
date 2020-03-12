package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class PersonRefGQO {

    private String id;
    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private Collection<OwnershipRefGQO> owns;
    private String personalID;
    private String familyName;
    private String givenName;
    private UserRefGQO hasUser;

    public PersonRefGQO() {
    }

    public PersonRefGQO(String id, String identifier, String name, String alternateName, String description, Collection<OwnershipRefGQO> owns, String personalID, String familyName, String givenName, UserRefGQO hasUser) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.personalID = personalID;
        this.familyName = familyName;
        this.givenName = givenName;
        this.hasUser = hasUser;
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

    public Collection<OwnershipRefGQO> getOwns() {
        return owns;
    }
    public void setOwns(Collection<OwnershipRefGQO> owns) {
        this.owns = owns;
    }

    public String getPersonalID() {
        return personalID;
    }
    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public UserRefGQO getHasUser() {
        return hasUser;
    }
    public void setHasUser(UserRefGQO hasUser) {
        this.hasUser = hasUser;
    }

}