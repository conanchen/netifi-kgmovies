package io.github.conanchen.gobject.graphql.model;

public class GxmergedcellGQO {

    private Integer rowNoStart;
    private Integer rowNoEnd;
    private Integer colNoStart;
    private Integer colNoEnd;

    public GxmergedcellGQO() {
    }

    public GxmergedcellGQO(Integer rowNoStart, Integer rowNoEnd, Integer colNoStart, Integer colNoEnd) {
        this.rowNoStart = rowNoStart;
        this.rowNoEnd = rowNoEnd;
        this.colNoStart = colNoStart;
        this.colNoEnd = colNoEnd;
    }

    public Integer getRowNoStart() {
        return rowNoStart;
    }
    public void setRowNoStart(Integer rowNoStart) {
        this.rowNoStart = rowNoStart;
    }

    public Integer getRowNoEnd() {
        return rowNoEnd;
    }
    public void setRowNoEnd(Integer rowNoEnd) {
        this.rowNoEnd = rowNoEnd;
    }

    public Integer getColNoStart() {
        return colNoStart;
    }
    public void setColNoStart(Integer colNoStart) {
        this.colNoStart = colNoStart;
    }

    public Integer getColNoEnd() {
        return colNoEnd;
    }
    public void setColNoEnd(Integer colNoEnd) {
        this.colNoEnd = colNoEnd;
    }

}