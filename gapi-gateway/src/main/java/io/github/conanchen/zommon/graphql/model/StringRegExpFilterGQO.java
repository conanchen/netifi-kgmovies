package io.github.conanchen.zommon.graphql.model;

public class StringRegExpFilterGQO {

    private String regexp;

    public StringRegExpFilterGQO() {
    }

    public StringRegExpFilterGQO(String regexp) {
        this.regexp = regexp;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

}