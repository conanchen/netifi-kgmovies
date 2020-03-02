package io.github.conanchen.zommon.graphql.model;

public class StringFullTextFilterGQO {

    private String alloftext;
    private String anyoftext;

    public StringFullTextFilterGQO() {
    }

    public StringFullTextFilterGQO(String alloftext, String anyoftext) {
        this.alloftext = alloftext;
        this.anyoftext = anyoftext;
    }

    public String getAlloftext() {
        return alloftext;
    }

    public void setAlloftext(String alloftext) {
        this.alloftext = alloftext;
    }

    public String getAnyoftext() {
        return anyoftext;
    }

    public void setAnyoftext(String anyoftext) {
        this.anyoftext = anyoftext;
    }

}