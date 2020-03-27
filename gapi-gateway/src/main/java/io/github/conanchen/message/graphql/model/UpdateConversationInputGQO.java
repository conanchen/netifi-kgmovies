package io.github.conanchen.message.graphql.model;

public class UpdateConversationInputGQO {

    @javax.validation.constraints.NotNull
    private ConversationFilterGQO filter;
    private ConversationPatchGQO set;
    private ConversationPatchGQO remove;

    public UpdateConversationInputGQO() {
    }

    public UpdateConversationInputGQO(ConversationFilterGQO filter, ConversationPatchGQO set, ConversationPatchGQO remove) {
        this.filter = filter;
        this.set = set;
        this.remove = remove;
    }

    public ConversationFilterGQO getFilter() {
        return filter;
    }
    public void setFilter(ConversationFilterGQO filter) {
        this.filter = filter;
    }

    public ConversationPatchGQO getSet() {
        return set;
    }
    public void setSet(ConversationPatchGQO set) {
        this.set = set;
    }

    public ConversationPatchGQO getRemove() {
        return remove;
    }
    public void setRemove(ConversationPatchGQO remove) {
        this.remove = remove;
    }

}