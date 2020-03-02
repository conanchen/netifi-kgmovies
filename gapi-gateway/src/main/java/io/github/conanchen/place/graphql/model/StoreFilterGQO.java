package io.github.conanchen.place.graphql.model;

import io.github.conanchen.zommon.graphql.model.StringHashFilter_StringRegExpFilterGQO;

import java.util.Collection;

public class StoreFilterGQO {

    @javax.validation.constraints.NotNull
    private Collection<String> id;
    private StringHashFilter_StringRegExpFilterGQO name;
    private StoreFilterGQO and;
    private StoreFilterGQO or;
    private StoreFilterGQO not;

    public StoreFilterGQO() {
    }

    public StoreFilterGQO(Collection<String> id, StringHashFilter_StringRegExpFilterGQO name, StoreFilterGQO and, StoreFilterGQO or, StoreFilterGQO not) {
        this.id = id;
        this.name = name;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public Collection<String> getId() {
        return id;
    }

    public void setId(Collection<String> id) {
        this.id = id;
    }

    public StringHashFilter_StringRegExpFilterGQO getName() {
        return name;
    }

    public void setName(StringHashFilter_StringRegExpFilterGQO name) {
        this.name = name;
    }

    public StoreFilterGQO getAnd() {
        return and;
    }

    public void setAnd(StoreFilterGQO and) {
        this.and = and;
    }

    public StoreFilterGQO getOr() {
        return or;
    }

    public void setOr(StoreFilterGQO or) {
        this.or = or;
    }

    public StoreFilterGQO getNot() {
        return not;
    }

    public void setNot(StoreFilterGQO not) {
        this.not = not;
    }

}