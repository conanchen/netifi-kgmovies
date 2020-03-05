package io.github.conanchen.place.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;

import java.util.Collection;

public class StoreUpdatePayloadGQO {

    private StoreGQO store;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<StoreUpdateErrorGQO> storeUpdateErrors;

    public StoreUpdatePayloadGQO() {
    }

    public StoreUpdatePayloadGQO(StoreGQO store, ActionGQO action, Collection<StoreUpdateErrorGQO> storeUpdateErrors) {
        this.store = store;
        this.action = action;
        this.storeUpdateErrors = storeUpdateErrors;
    }

    public StoreGQO getStore() {
        return store;
    }

    public void setStore(StoreGQO store) {
        this.store = store;
    }

    public ActionGQO getAction() {
        return action;
    }

    public void setAction(ActionGQO action) {
        this.action = action;
    }

    public Collection<StoreUpdateErrorGQO> getStoreUpdateErrors() {
        return storeUpdateErrors;
    }

    public void setStoreUpdateErrors(Collection<StoreUpdateErrorGQO> storeUpdateErrors) {
        this.storeUpdateErrors = storeUpdateErrors;
    }

}