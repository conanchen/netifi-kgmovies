package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SuggestedReviewerGQO {

    @javax.validation.constraints.NotNull
    private Boolean isAuthor;
    @javax.validation.constraints.NotNull
    private Boolean isCommenter;
    @javax.validation.constraints.NotNull
    private UserGQO reviewer;

    public SuggestedReviewerGQO() {
    }

    public SuggestedReviewerGQO(Boolean isAuthor, Boolean isCommenter, UserGQO reviewer) {
        this.isAuthor = isAuthor;
        this.isCommenter = isCommenter;
        this.reviewer = reviewer;
    }

    public Boolean getIsAuthor() {
        return isAuthor;
    }
    public void setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
    }

    public Boolean getIsCommenter() {
        return isCommenter;
    }
    public void setIsCommenter(Boolean isCommenter) {
        this.isCommenter = isCommenter;
    }

    public UserGQO getReviewer() {
        return reviewer;
    }
    public void setReviewer(UserGQO reviewer) {
        this.reviewer = reviewer;
    }

}