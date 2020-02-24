package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.gobject.graphql.api.*;

public class GxcolumnDefGQO {

    private Integer colNo;
    private String name;
    private GxcolumnTypeGQO type;

    public GxcolumnDefGQO() {
    }

    public GxcolumnDefGQO(Integer colNo, String name, GxcolumnTypeGQO type) {
        this.colNo = colNo;
        this.name = name;
        this.type = type;
    }

    public Integer getColNo() {
        return colNo;
    }
    public void setColNo(Integer colNo) {
        this.colNo = colNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GxcolumnTypeGQO getType() {
        return type;
    }
    public void setType(GxcolumnTypeGQO type) {
        this.type = type;
    }

}