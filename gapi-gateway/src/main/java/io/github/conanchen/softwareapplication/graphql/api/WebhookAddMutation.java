package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.model.*;

public interface WebhookAddMutation {

    WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input) throws Exception;

}