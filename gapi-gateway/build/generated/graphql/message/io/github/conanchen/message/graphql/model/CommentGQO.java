package io.github.conanchen.message.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class CommentGQO implements NodeGQO{

    private MessageGQO parentItem;
    private PersonGQO author;
    @javax.validation.constraints.NotNull
    private String text;
    private java.util.Date dateCreated;
    @javax.validation.constraints.NotNull
    private String id;

    public CommentGQO() {
    }

    public CommentGQO(MessageGQO parentItem, PersonGQO author, String text, java.util.Date dateCreated, String id) {
        this.parentItem = parentItem;
        this.author = author;
        this.text = text;
        this.dateCreated = dateCreated;
        this.id = id;
    }

    public MessageGQO getParentItem() {
        return parentItem;
    }
    public void setParentItem(MessageGQO parentItem) {
        this.parentItem = parentItem;
    }

    public PersonGQO getAuthor() {
        return author;
    }
    public void setAuthor(PersonGQO author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}