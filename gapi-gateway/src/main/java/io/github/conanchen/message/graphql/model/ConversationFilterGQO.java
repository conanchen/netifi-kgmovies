package io.github.conanchen.message.graphql.model;

import io.github.conanchen.zommon.graphql.model.StringHashFilterGQO;

import java.util.Collection;

public class ConversationFilterGQO {

    private StringHashFilterGQO name;
    @javax.validation.constraints.NotNull
    private Collection<String> id;
    private ConversationFilterGQO and;
    private ConversationFilterGQO or;
    private ConversationFilterGQO not;

    public ConversationFilterGQO() {
    }

    public ConversationFilterGQO(StringHashFilterGQO name, Collection<String> id, ConversationFilterGQO and, ConversationFilterGQO or, ConversationFilterGQO not) {
        this.name = name;
        this.id = id;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public StringHashFilterGQO getName() {
        return name;
    }
    public void setName(StringHashFilterGQO name) {
        this.name = name;
    }

    public Collection<String> getId() {
        return id;
    }
    public void setId(Collection<String> id) {
        this.id = id;
    }

    public ConversationFilterGQO getAnd() {
        return and;
    }
    public void setAnd(ConversationFilterGQO and) {
        this.and = and;
    }

    public ConversationFilterGQO getOr() {
        return or;
    }
    public void setOr(ConversationFilterGQO or) {
        this.or = or;
    }

    public ConversationFilterGQO getNot() {
        return not;
    }
    public void setNot(ConversationFilterGQO not) {
        this.not = not;
    }

}