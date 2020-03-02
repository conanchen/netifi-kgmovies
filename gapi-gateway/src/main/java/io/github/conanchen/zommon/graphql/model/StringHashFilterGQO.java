package io.github.conanchen.zommon.graphql.model;

public class StringHashFilterGQO {

    private String eq;

    public StringHashFilterGQO() {
    }

    public StringHashFilterGQO(String eq) {
        this.eq = eq;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

}