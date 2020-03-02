package io.github.conanchen.place.graphql.model;

public class StoreOrderGQO {

    private StoreOrderableGQO asc;
    private StoreOrderableGQO desc;
    private StoreOrderGQO then;

    public StoreOrderGQO() {
    }

    public StoreOrderGQO(StoreOrderableGQO asc, StoreOrderableGQO desc, StoreOrderGQO then) {
        this.asc = asc;
        this.desc = desc;
        this.then = then;
    }

    public StoreOrderableGQO getAsc() {
        return asc;
    }

    public void setAsc(StoreOrderableGQO asc) {
        this.asc = asc;
    }

    public StoreOrderableGQO getDesc() {
        return desc;
    }

    public void setDesc(StoreOrderableGQO desc) {
        this.desc = desc;
    }

    public StoreOrderGQO getThen() {
        return then;
    }

    public void setThen(StoreOrderGQO then) {
        this.then = then;
    }

}