package io.github.conanchen.message.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.conanchen.message.graphql.model.AddConversationPayloadGQO;
import io.github.conanchen.message.graphql.model.ConversationConnectionGQO;
import io.github.conanchen.message.graphql.model.ConversationFilterGQO;
import io.github.conanchen.message.graphql.model.ConversationOrderGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddPayloadGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookConnectionGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookFilterGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookOrderGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
class ConversationAddPayloadResolver implements GraphQLResolver<AddConversationPayloadGQO> {

    public ConversationConnectionGQO conversationSearch(AddConversationPayloadGQO addConversationPayloadGQO,ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset) throws Exception {
        return null;
    }
}