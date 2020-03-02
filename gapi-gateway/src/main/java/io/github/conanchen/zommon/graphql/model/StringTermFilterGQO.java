package io.github.conanchen.zommon.graphql.model;

public class StringTermFilterGQO {

    private String allofterms;
    private String anyofterms;

    public StringTermFilterGQO() {
    }

    public StringTermFilterGQO(String allofterms, String anyofterms) {
        this.allofterms = allofterms;
        this.anyofterms = anyofterms;
    }

    public String getAllofterms() {
        return allofterms;
    }

    public void setAllofterms(String allofterms) {
        this.allofterms = allofterms;
    }

    public String getAnyofterms() {
        return anyofterms;
    }

    public void setAnyofterms(String anyofterms) {
        this.anyofterms = anyofterms;
    }

}