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

public class ReviewPatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> reviewAspect = Input.undefined();

    private Input<String> reviewBody = Input.undefined();

    private Input<Integer> ratingValue = Input.undefined();

    private Input<UserRef> author = Input.undefined();

    private Input<DateTime> dateCreated = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public ReviewPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public ReviewPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public ReviewPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public ReviewPatch setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public ReviewPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ReviewPatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public ReviewPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public ReviewPatch setAlternateNameInput(Input<String> alternateName) {
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

    public ReviewPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ReviewPatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getReviewAspect() {
        return reviewAspect.getValue();
    }

    public Input<String> getReviewAspectInput() {
        return reviewAspect;
    }

    public ReviewPatch setReviewAspect(String reviewAspect) {
        this.reviewAspect = Input.optional(reviewAspect);
        return this;
    }

    public ReviewPatch setReviewAspectInput(Input<String> reviewAspect) {
        if (reviewAspect == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reviewAspect = reviewAspect;
        return this;
    }

    public String getReviewBody() {
        return reviewBody.getValue();
    }

    public Input<String> getReviewBodyInput() {
        return reviewBody;
    }

    public ReviewPatch setReviewBody(String reviewBody) {
        this.reviewBody = Input.optional(reviewBody);
        return this;
    }

    public ReviewPatch setReviewBodyInput(Input<String> reviewBody) {
        if (reviewBody == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reviewBody = reviewBody;
        return this;
    }

    public Integer getRatingValue() {
        return ratingValue.getValue();
    }

    public Input<Integer> getRatingValueInput() {
        return ratingValue;
    }

    public ReviewPatch setRatingValue(Integer ratingValue) {
        this.ratingValue = Input.optional(ratingValue);
        return this;
    }

    public ReviewPatch setRatingValueInput(Input<Integer> ratingValue) {
        if (ratingValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ratingValue = ratingValue;
        return this;
    }

    public UserRef getAuthor() {
        return author.getValue();
    }

    public Input<UserRef> getAuthorInput() {
        return author;
    }

    public ReviewPatch setAuthor(UserRef author) {
        this.author = Input.optional(author);
        return this;
    }

    public ReviewPatch setAuthorInput(Input<UserRef> author) {
        if (author == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.author = author;
        return this;
    }

    public DateTime getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<DateTime> getDateCreatedInput() {
        return dateCreated;
    }

    public ReviewPatch setDateCreated(DateTime dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public ReviewPatch setDateCreatedInput(Input<DateTime> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.reviewAspect.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reviewAspect:");
            if (reviewAspect.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, reviewAspect.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.reviewBody.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reviewBody:");
            if (reviewBody.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, reviewBody.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ratingValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ratingValue:");
            if (ratingValue.getValue() != null) {
                _queryBuilder.append(ratingValue.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.author.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("author:");
            if (author.getValue() != null) {
                author.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateCreated.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateCreated:");
            if (dateCreated.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateCreated.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
