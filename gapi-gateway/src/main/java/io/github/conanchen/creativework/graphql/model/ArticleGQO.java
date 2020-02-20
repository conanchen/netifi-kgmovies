package io.github.conanchen.creativework.graphql.model;

import java.util.*;
import io.github.conanchen.creativework.graphql.api.*;

public interface ArticleGQO {

    java.lang.String getArticleBody();

    java.lang.String getArticleSection();

    Integer getPageEnd();

    Integer getPageStart();

    java.lang.String getPagination();

    Integer getWordCount();

}