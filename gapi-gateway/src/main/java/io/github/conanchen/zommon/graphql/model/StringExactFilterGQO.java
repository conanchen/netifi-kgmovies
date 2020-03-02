package io.github.conanchen.zommon.graphql.model;

public class StringExactFilterGQO {

    private String eq;
    private String le;
    private String lt;
    private String ge;
    private String gt;

    public StringExactFilterGQO() {
    }

    public StringExactFilterGQO(String eq, String le, String lt, String ge, String gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getGe() {
        return ge;
    }

    public void setGe(String ge) {
        this.ge = ge;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

}