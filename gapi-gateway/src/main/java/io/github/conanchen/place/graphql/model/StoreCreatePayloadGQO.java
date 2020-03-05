package io.github.conanchen.place.graphql.model;

import java.util.*;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.place.graphql.api.*;

public class StoreCreatePayloadGQO {

    private StoreGQO store;
    private ActionGQO action;
    @javax.validation.constraints.NotNull
    private Collection<StoreCreateErrorGQO> storeCreateErrors;

    public StoreCreatePayloadGQO() {
    }

    public StoreCreatePayloadGQO(StoreGQO store, ActionGQO action, Collection<StoreCreateErrorGQO> storeCreateErrors) {
        this.store = store;
        this.action = action;
        this.storeCreateErrors = storeCreateErrors;
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

    public Collection<StoreCreateErrorGQO> getStoreCreateErrors() {
        return storeCreateErrors;
    }
    public void setStoreCreateErrors(Collection<StoreCreateErrorGQO> storeCreateErrors) {
        this.storeCreateErrors = storeCreateErrors;
    }

}