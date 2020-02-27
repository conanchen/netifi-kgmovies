package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface RepositoryInfoGQO {

    java.util.Date getCreatedAt();

    String getDescription();

    String getDescriptionHTML();

    Integer getForkCount();

    Boolean getHasIssuesEnabled();

    Boolean getHasProjectsEnabled();

    Boolean getHasWikiEnabled();

    String getHomepageUrl();

    Boolean getIsArchived();

    Boolean getIsFork();

    Boolean getIsLocked();

    Boolean getIsMirror();

    Boolean getIsPrivate();

    Boolean getIsTemplate();

    LicenseGQO getLicenseInfo();

    RepositoryLockReasonGQO getLockReason();

    String getMirrorUrl();

    String getName();

    String getNameWithOwner();

    String getOpenGraphImageUrl();

    RepositoryOwnerGQO getOwner();

    java.util.Date getPushedAt();

    String getResourcePath();

    String getShortDescriptionHTML();

    java.util.Date getUpdatedAt();

    String getUrl();

    Boolean getUsesCustomOpenGraphImage();

}