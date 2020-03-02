package io.github.conanchen.zommon.graphql.model;

public class DateTimeFilterGQO {

    private java.util.Date eq;
    private java.util.Date le;
    private java.util.Date lt;
    private java.util.Date ge;
    private java.util.Date gt;

    public DateTimeFilterGQO() {
    }

    public DateTimeFilterGQO(java.util.Date eq, java.util.Date le, java.util.Date lt, java.util.Date ge, java.util.Date gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

    public java.util.Date getEq() {
        return eq;
    }

    public void setEq(java.util.Date eq) {
        this.eq = eq;
    }

    public java.util.Date getLe() {
        return le;
    }

    public void setLe(java.util.Date le) {
        this.le = le;
    }

    public java.util.Date getLt() {
        return lt;
    }

    public void setLt(java.util.Date lt) {
        this.lt = lt;
    }

    public java.util.Date getGe() {
        return ge;
    }

    public void setGe(java.util.Date ge) {
        this.ge = ge;
    }

    public java.util.Date getGt() {
        return gt;
    }

    public void setGt(java.util.Date gt) {
        this.gt = gt;
    }

}