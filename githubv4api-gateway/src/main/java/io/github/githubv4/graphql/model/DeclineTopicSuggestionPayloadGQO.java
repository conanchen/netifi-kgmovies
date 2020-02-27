package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class DeclineTopicSuggestionPayloadGQO {

    private String clientMutationId;
    private TopicGQO topic;

    public DeclineTopicSuggestionPayloadGQO() {
    }

    public DeclineTopicSuggestionPayloadGQO(String clientMutationId, TopicGQO topic) {
        this.clientMutationId = clientMutationId;
        this.topic = topic;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TopicGQO getTopic() {
        return topic;
    }
    public void setTopic(TopicGQO topic) {
        this.topic = topic;
    }

}