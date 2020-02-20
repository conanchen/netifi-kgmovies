package io.github.conanchen.creativework.graphql.model;

import java.util.Collection;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class BlogPostingGQO implements CreativeWorkGQO, ArticleGQO, NodeGQO{

    private ThingGQO about;
    private PersonGQO editor;
    private java.lang.String headline;
    private java.lang.String alternativeHeadline;
    private CreativeWorkGQO isPartOf;
    private Collection<CreativeWorkGQO> hasPart;
    private java.lang.String articleBody;
    private java.lang.String articleSection;
    private Integer pageEnd;
    private Integer pageStart;
    private java.lang.String pagination;
    private Integer wordCount;
    @javax.validation.constraints.NotNull
    private String id;

    public BlogPostingGQO() {
    }

    public BlogPostingGQO(ThingGQO about, PersonGQO editor, java.lang.String headline, java.lang.String alternativeHeadline, CreativeWorkGQO isPartOf, Collection<CreativeWorkGQO> hasPart, java.lang.String articleBody, java.lang.String articleSection, Integer pageEnd, Integer pageStart, java.lang.String pagination, Integer wordCount, String id) {
        this.about = about;
        this.editor = editor;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.isPartOf = isPartOf;
        this.hasPart = hasPart;
        this.articleBody = articleBody;
        this.articleSection = articleSection;
        this.pageEnd = pageEnd;
        this.pageStart = pageStart;
        this.pagination = pagination;
        this.wordCount = wordCount;
        this.id = id;
    }

    public ThingGQO getAbout() {
        return about;
    }
    public void setAbout(ThingGQO about) {
        this.about = about;
    }

    public PersonGQO getEditor() {
        return editor;
    }
    public void setEditor(PersonGQO editor) {
        this.editor = editor;
    }

    public java.lang.String getHeadline() {
        return headline;
    }
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }

    public java.lang.String getAlternativeHeadline() {
        return alternativeHeadline;
    }
    public void setAlternativeHeadline(java.lang.String alternativeHeadline) {
        this.alternativeHeadline = alternativeHeadline;
    }

    public CreativeWorkGQO getIsPartOf() {
        return isPartOf;
    }
    public void setIsPartOf(CreativeWorkGQO isPartOf) {
        this.isPartOf = isPartOf;
    }

    public Collection<CreativeWorkGQO> getHasPart() {
        return hasPart;
    }
    public void setHasPart(Collection<CreativeWorkGQO> hasPart) {
        this.hasPart = hasPart;
    }

    public java.lang.String getArticleBody() {
        return articleBody;
    }
    public void setArticleBody(java.lang.String articleBody) {
        this.articleBody = articleBody;
    }

    public java.lang.String getArticleSection() {
        return articleSection;
    }
    public void setArticleSection(java.lang.String articleSection) {
        this.articleSection = articleSection;
    }

    public Integer getPageEnd() {
        return pageEnd;
    }
    public void setPageEnd(Integer pageEnd) {
        this.pageEnd = pageEnd;
    }

    public Integer getPageStart() {
        return pageStart;
    }
    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

    public java.lang.String getPagination() {
        return pagination;
    }
    public void setPagination(java.lang.String pagination) {
        this.pagination = pagination;
    }

    public Integer getWordCount() {
        return wordCount;
    }
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}