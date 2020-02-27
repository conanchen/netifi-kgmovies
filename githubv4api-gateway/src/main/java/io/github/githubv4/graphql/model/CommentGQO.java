package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface CommentGQO {

    ActorGQO getAuthor();

    CommentAuthorAssociationGQO getAuthorAssociation();

    String getBody();

    String getBodyHTML();

    String getBodyText();

    java.util.Date getCreatedAt();

    Boolean getCreatedViaEmail();

    ActorGQO getEditor();

    String getId();

    Boolean getIncludesCreatedEdit();

    java.util.Date getLastEditedAt();

    java.util.Date getPublishedAt();

    java.util.Date getUpdatedAt();

    UserContentEditConnectionGQO getUserContentEdits();

    Boolean getViewerDidAuthor();

}