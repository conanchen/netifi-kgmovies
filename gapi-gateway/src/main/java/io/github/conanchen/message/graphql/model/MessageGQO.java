package io.github.conanchen.message.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class MessageGQO implements NodeGQO{

    private Collection<ConversationGQO> isPartOf;
    @javax.validation.constraints.NotNull
    private PersonGQO sender;
    private java.util.Date dateSent;
    private PersonGQO toRecipient;
    private java.util.Date dateRead;
    private java.util.Date dateReceived;
    private Collection<PersonGQO> recipient;
    @javax.validation.constraints.NotNull
    private String text;
    private AggregateReviewGQO aggregateReview;
    private Collection<ActionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public MessageGQO() {
    }

    public MessageGQO(Collection<ConversationGQO> isPartOf, PersonGQO sender, java.util.Date dateSent, PersonGQO toRecipient, java.util.Date dateRead, java.util.Date dateReceived, Collection<PersonGQO> recipient, String text, AggregateReviewGQO aggregateReview, Collection<ActionGQO> potentialActions, String id) {
        this.isPartOf = isPartOf;
        this.sender = sender;
        this.dateSent = dateSent;
        this.toRecipient = toRecipient;
        this.dateRead = dateRead;
        this.dateReceived = dateReceived;
        this.recipient = recipient;
        this.text = text;
        this.aggregateReview = aggregateReview;
        this.potentialActions = potentialActions;
        this.id = id;
    }

    public Collection<ConversationGQO> getIsPartOf() {
        return isPartOf;
    }
    public void setIsPartOf(Collection<ConversationGQO> isPartOf) {
        this.isPartOf = isPartOf;
    }

    public PersonGQO getSender() {
        return sender;
    }
    public void setSender(PersonGQO sender) {
        this.sender = sender;
    }

    public java.util.Date getDateSent() {
        return dateSent;
    }
    public void setDateSent(java.util.Date dateSent) {
        this.dateSent = dateSent;
    }

    public PersonGQO getToRecipient() {
        return toRecipient;
    }
    public void setToRecipient(PersonGQO toRecipient) {
        this.toRecipient = toRecipient;
    }

    public java.util.Date getDateRead() {
        return dateRead;
    }
    public void setDateRead(java.util.Date dateRead) {
        this.dateRead = dateRead;
    }

    public java.util.Date getDateReceived() {
        return dateReceived;
    }
    public void setDateReceived(java.util.Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Collection<PersonGQO> getRecipient() {
        return recipient;
    }
    public void setRecipient(Collection<PersonGQO> recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public AggregateReviewGQO getAggregateReview() {
        return aggregateReview;
    }
    public void setAggregateReview(AggregateReviewGQO aggregateReview) {
        this.aggregateReview = aggregateReview;
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