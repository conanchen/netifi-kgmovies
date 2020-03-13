package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class ConversationOrderGQO {

    private ConversationOrderableGQO asc;
    private ConversationOrderableGQO desc;
    private ConversationOrderGQO then;

    public ConversationOrderGQO() {
    }

    public ConversationOrderGQO(ConversationOrderableGQO asc, ConversationOrderableGQO desc, ConversationOrderGQO then) {
        this.asc = asc;
        this.desc = desc;
        this.then = then;
    }

    public ConversationOrderableGQO getAsc() {
        return asc;
    }
    public void setAsc(ConversationOrderableGQO asc) {
        this.asc = asc;
    }

    public ConversationOrderableGQO getDesc() {
        return desc;
    }
    public void setDesc(ConversationOrderableGQO desc) {
        this.desc = desc;
    }

    public ConversationOrderGQO getThen() {
        return then;
    }
    public void setThen(ConversationOrderGQO then) {
        this.then = then;
    }

}