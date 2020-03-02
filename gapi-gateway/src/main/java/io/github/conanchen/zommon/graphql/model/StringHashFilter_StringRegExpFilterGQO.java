package io.github.conanchen.zommon.graphql.model;

public class StringHashFilter_StringRegExpFilterGQO {

    private String eq;
    private String regexp;

    public StringHashFilter_StringRegExpFilterGQO() {
    }

    public StringHashFilter_StringRegExpFilterGQO(String eq, String regexp) {
        this.eq = eq;
        this.regexp = regexp;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

}