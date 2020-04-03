// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddMessageInput implements Serializable {
    private String name;

    private UserRef sender;

    private Input<List<ReadNoteRef>> hasReadNotes = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ConversationRef>> isMessageOf = Input.undefined();

    private Input<DateTime> dateSent = Input.undefined();

    private Input<UserRef> toRecipient = Input.undefined();

    private Input<DateTime> dateRead = Input.undefined();

    private Input<DateTime> dateReceived = Input.undefined();

    private Input<List<UserRef>> recipient = Input.undefined();

    private Input<List<ReviewRef>> hasReviews = Input.undefined();

    public AddMessageInput(String name, UserRef sender) {
        this.name = name;

        this.sender = sender;
    }

    public String getName() {
        return name;
    }

    public AddMessageInput setName(String name) {
        this.name = name;
        return this;
    }

    public UserRef getSender() {
        return sender;
    }

    public AddMessageInput setSender(UserRef sender) {
        this.sender = sender;
        return this;
    }

    public List<ReadNoteRef> getHasReadNotes() {
        return hasReadNotes.getValue();
    }

    public Input<List<ReadNoteRef>> getHasReadNotesInput() {
        return hasReadNotes;
    }

    public AddMessageInput setHasReadNotes(List<ReadNoteRef> hasReadNotes) {
        this.hasReadNotes = Input.optional(hasReadNotes);
        return this;
    }

    public AddMessageInput setHasReadNotesInput(Input<List<ReadNoteRef>> hasReadNotes) {
        if (hasReadNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasReadNotes = hasReadNotes;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddMessageInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddMessageInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public AddMessageInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddMessageInput setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public AddMessageInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddMessageInput setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public AddMessageInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddMessageInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ConversationRef> getIsMessageOf() {
        return isMessageOf.getValue();
    }

    public Input<List<ConversationRef>> getIsMessageOfInput() {
        return isMessageOf;
    }

    public AddMessageInput setIsMessageOf(List<ConversationRef> isMessageOf) {
        this.isMessageOf = Input.optional(isMessageOf);
        return this;
    }

    public AddMessageInput setIsMessageOfInput(Input<List<ConversationRef>> isMessageOf) {
        if (isMessageOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isMessageOf = isMessageOf;
        return this;
    }

    public DateTime getDateSent() {
        return dateSent.getValue();
    }

    public Input<DateTime> getDateSentInput() {
        return dateSent;
    }

    public AddMessageInput setDateSent(DateTime dateSent) {
        this.dateSent = Input.optional(dateSent);
        return this;
    }

    public AddMessageInput setDateSentInput(Input<DateTime> dateSent) {
        if (dateSent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateSent = dateSent;
        return this;
    }

    public UserRef getToRecipient() {
        return toRecipient.getValue();
    }

    public Input<UserRef> getToRecipientInput() {
        return toRecipient;
    }

    public AddMessageInput setToRecipient(UserRef toRecipient) {
        this.toRecipient = Input.optional(toRecipient);
        return this;
    }

    public AddMessageInput setToRecipientInput(Input<UserRef> toRecipient) {
        if (toRecipient == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.toRecipient = toRecipient;
        return this;
    }

    public DateTime getDateRead() {
        return dateRead.getValue();
    }

    public Input<DateTime> getDateReadInput() {
        return dateRead;
    }

    public AddMessageInput setDateRead(DateTime dateRead) {
        this.dateRead = Input.optional(dateRead);
        return this;
    }

    public AddMessageInput setDateReadInput(Input<DateTime> dateRead) {
        if (dateRead == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateRead = dateRead;
        return this;
    }

    public DateTime getDateReceived() {
        return dateReceived.getValue();
    }

    public Input<DateTime> getDateReceivedInput() {
        return dateReceived;
    }

    public AddMessageInput setDateReceived(DateTime dateReceived) {
        this.dateReceived = Input.optional(dateReceived);
        return this;
    }

    public AddMessageInput setDateReceivedInput(Input<DateTime> dateReceived) {
        if (dateReceived == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateReceived = dateReceived;
        return this;
    }

    public List<UserRef> getRecipient() {
        return recipient.getValue();
    }

    public Input<List<UserRef>> getRecipientInput() {
        return recipient;
    }

    public AddMessageInput setRecipient(List<UserRef> recipient) {
        this.recipient = Input.optional(recipient);
        return this;
    }

    public AddMessageInput setRecipientInput(Input<List<UserRef>> recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recipient = recipient;
        return this;
    }

    public List<ReviewRef> getHasReviews() {
        return hasReviews.getValue();
    }

    public Input<List<ReviewRef>> getHasReviewsInput() {
        return hasReviews;
    }

    public AddMessageInput setHasReviews(List<ReviewRef> hasReviews) {
        this.hasReviews = Input.optional(hasReviews);
        return this;
    }

    public AddMessageInput setHasReviewsInput(Input<List<ReviewRef>> hasReviews) {
        if (hasReviews == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasReviews = hasReviews;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sender:");
        sender.appendTo(_queryBuilder);

        if (this.hasReadNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasReadNotes:");
            if (hasReadNotes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReadNoteRef item1 : hasReadNotes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isMessageOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isMessageOf:");
            if (isMessageOf.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ConversationRef item1 : isMessageOf.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateSent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateSent:");
            if (dateSent.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateSent.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.toRecipient.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("toRecipient:");
            if (toRecipient.getValue() != null) {
                toRecipient.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateRead.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateRead:");
            if (dateRead.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateRead.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateReceived.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateReceived:");
            if (dateReceived.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateReceived.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.recipient.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recipient:");
            if (recipient.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : recipient.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasReviews.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasReviews:");
            if (hasReviews.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReviewRef item1 : hasReviews.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
