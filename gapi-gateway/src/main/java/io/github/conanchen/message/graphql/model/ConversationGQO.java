package io.github.conanchen.message.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class ConversationGQO implements NodeGQO{

    private ThingGQO about;
    private PersonGQO accountablePerson;
    private String headline;
    private String alternativeHeadline;
    private String description;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private DataCatalogGQO includedInDataCatalog;
    private Collection<MessageGQO> hasParts;
    private Collection<WebhookGQO> webhook;
    private Collection<ActionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public ConversationGQO() {
    }

    public ConversationGQO(ThingGQO about, PersonGQO accountablePerson, String headline, String alternativeHeadline, String description, PersonGQO creator, java.util.Date dateCreated, DataCatalogGQO includedInDataCatalog, Collection<MessageGQO> hasParts, Collection<WebhookGQO> webhook, Collection<ActionGQO> potentialActions, String id) {
        this.about = about;
        this.accountablePerson = accountablePerson;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.includedInDataCatalog = includedInDataCatalog;
        this.hasParts = hasParts;
        this.webhook = webhook;
        this.potentialActions = potentialActions;
        this.id = id;
    }

    public ThingGQO getAbout() {
        return about;
    }
    public void setAbout(ThingGQO about) {
        this.about = about;
    }

    public PersonGQO getAccountablePerson() {
        return accountablePerson;
    }
    public void setAccountablePerson(PersonGQO accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }
    public void setAlternativeHeadline(String alternativeHeadline) {
        this.alternativeHeadline = alternativeHeadline;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public DataCatalogGQO getIncludedInDataCatalog() {
        return includedInDataCatalog;
    }
    public void setIncludedInDataCatalog(DataCatalogGQO includedInDataCatalog) {
        this.includedInDataCatalog = includedInDataCatalog;
    }

    public Collection<MessageGQO> getHasParts() {
        return hasParts;
    }
    public void setHasParts(Collection<MessageGQO> hasParts) {
        this.hasParts = hasParts;
    }

    public Collection<WebhookGQO> getWebhook() {
        return webhook;
    }
    public void setWebhook(Collection<WebhookGQO> webhook) {
        this.webhook = webhook;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}