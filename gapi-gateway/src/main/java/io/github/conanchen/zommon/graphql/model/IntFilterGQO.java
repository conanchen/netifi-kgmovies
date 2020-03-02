package io.github.conanchen.zommon.graphql.model;

public class IntFilterGQO {

    private Integer eq;
    private Integer le;
    private Integer lt;
    private Integer ge;
    private Integer gt;

    public IntFilterGQO() {
    }

    public IntFilterGQO(Integer eq, Integer le, Integer lt, Integer ge, Integer gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

    public Integer getEq() {
        return eq;
    }

    public void setEq(Integer eq) {
        this.eq = eq;
    }

    public Integer getLe() {
        return le;
    }

    public void setLe(Integer le) {
        this.le = le;
    }

    public Integer getLt() {
        return lt;
    }

    public void setLt(Integer lt) {
        this.lt = lt;
    }

    public Integer getGe() {
        return ge;
    }

    public void setGe(Integer ge) {
        this.ge = ge;
    }

    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

}