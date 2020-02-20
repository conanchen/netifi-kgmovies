package io.github.conanchen.creativework.graphql.model;

import java.util.Collection;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class BlogGQO implements CreativeWorkGQO, NodeGQO{

    private java.lang.String issn;
    private Collection<BlogPostingGQO> blogPost;
    private ThingGQO about;
    private PersonGQO editor;
    private java.lang.String headline;
    private java.lang.String alternativeHeadline;
    private CreativeWorkGQO isPartOf;
    private Collection<CreativeWorkGQO> hasPart;
    @javax.validation.constraints.NotNull
    private String id;

    public BlogGQO() {
    }

    public BlogGQO(java.lang.String issn, Collection<BlogPostingGQO> blogPost, ThingGQO about, PersonGQO editor, java.lang.String headline, java.lang.String alternativeHeadline, CreativeWorkGQO isPartOf, Collection<CreativeWorkGQO> hasPart, String id) {
        this.issn = issn;
        this.blogPost = blogPost;
        this.about = about;
        this.editor = editor;
        this.headline = headline;
        this.alternativeHeadline = alternativeHeadline;
        this.isPartOf = isPartOf;
        this.hasPart = hasPart;
        this.id = id;
    }

    public java.lang.String getIssn() {
        return issn;
    }
    public void setIssn(java.lang.String issn) {
        this.issn = issn;
    }

    public Collection<BlogPostingGQO> getBlogPost() {
        return blogPost;
    }
    public void setBlogPost(Collection<BlogPostingGQO> blogPost) {
        this.blogPost = blogPost;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}