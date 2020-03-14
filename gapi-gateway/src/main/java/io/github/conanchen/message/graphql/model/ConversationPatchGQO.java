package io.github.conanchen.message.graphql.model;

import io.github.conanchen.softwareapplication.graphql.model.ThingRefGQO;
import io.github.conanchen.softwareapplication.graphql.model.UserRefGQO;

public class ConversationPatchGQO {

    private String identifier;
    private String name;
    private String alternateName;
    private String description;
    private ThingRefGQO about;
    private UserRefGQO accountablePerson;
    private UserRefGQO creator;

    public ConversationPatchGQO() {
    }

    public ConversationPatchGQO(String identifier, String name, String alternateName, String description, ThingRefGQO about, UserRefGQO accountablePerson, UserRefGQO creator) {
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.creator = creator;
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

    public ThingRefGQO getAbout() {
        return about;
    }
    public void setAbout(ThingRefGQO about) {
        this.about = about;
    }

    public UserRefGQO getAccountablePerson() {
        return accountablePerson;
    }
    public void setAccountablePerson(UserRefGQO accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public UserRefGQO getCreator() {
        return creator;
    }
    public void setCreator(UserRefGQO creator) {
        this.creator = creator;
    }

}