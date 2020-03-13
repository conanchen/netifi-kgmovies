package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.model.*;

public interface WebhookDeleteMutation {

    WebhookDeletePayloadGQO webhookDelete(WebhookFilterGQO filter) throws Exception;

}