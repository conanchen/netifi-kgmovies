package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.model.*;

public interface WebhookUpdateMutation {

    WebhookUpdatePayloadGQO webhookUpdate(WebhookUpdateInputGQO input) throws Exception;

}