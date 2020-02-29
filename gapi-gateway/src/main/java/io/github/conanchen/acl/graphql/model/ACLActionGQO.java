package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;

public class ACLActionGQO {

    private ActionGQO action;

    public ACLActionGQO() {
    }

    public ACLActionGQO(ActionGQO action) {
        this.action = action;
    }

    public ActionGQO getAction() {
        return action;
    }

    public void setAction(ActionGQO action) {
        this.action = action;
    }

}