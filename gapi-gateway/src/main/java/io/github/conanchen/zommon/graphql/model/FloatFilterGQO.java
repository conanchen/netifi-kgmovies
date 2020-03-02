package io.github.conanchen.zommon.graphql.model;

public class FloatFilterGQO {

    private Float eq;
    private Float le;
    private Float lt;
    private Float ge;
    private Float gt;

    public FloatFilterGQO() {
    }

    public FloatFilterGQO(Float eq, Float le, Float lt, Float ge, Float gt) {
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
    }

    public Float getEq() {
        return eq;
    }

    public void setEq(Float eq) {
        this.eq = eq;
    }

    public Float getLe() {
        return le;
    }

    public void setLe(Float le) {
        this.le = le;
    }

    public Float getLt() {
        return lt;
    }

    public void setLt(Float lt) {
        this.lt = lt;
    }

    public Float getGe() {
        return ge;
    }

    public void setGe(Float ge) {
        this.ge = ge;
    }

    public Float getGt() {
        return gt;
    }

    public void setGt(Float gt) {
        this.gt = gt;
    }

}