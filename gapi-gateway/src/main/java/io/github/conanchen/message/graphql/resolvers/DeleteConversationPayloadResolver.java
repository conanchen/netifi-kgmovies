package io.github.conanchen.message.graphql.resolvers;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.message.graphql.model.ConversationFilterGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.message.graphql.model.ConversationOrderGQO;
import io.github.conanchen.message.graphql.model.DeleteConversationPayloadGQO;
import io.github.conanchen.message.graphql.resolver.Resolvers;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
class DeleteConversationPayloadResolver implements Resolvers.DeleteConversationPayload, GraphQLResolver<DeleteConversationPayloadGQO> {

    @Override
    public Connection<ConversationGQO> conversationSearch(DeleteConversationPayloadGQO parent, ConversationFilterGQO filter, ConversationOrderGQO order, Integer first, Integer offset, DataFetchingEnvironment env) {
        return new SimpleListConnection<ConversationGQO>(
                Arrays.asList(
                        ConversationGQO.builder().id("id1").alternativeHeadline("alternamte1").build(),
                        ConversationGQO.builder().id("id2").alternativeHeadline("alternamte2").build(),
                        ConversationGQO.builder().id("id3").alternativeHeadline("alternamte3").build()
                )
        ).get(env);
    }
}