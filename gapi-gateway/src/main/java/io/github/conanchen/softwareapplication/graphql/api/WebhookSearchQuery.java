package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.model.*;

public interface WebhookSearchQuery {

    Collection<WebhookConnectionGQO> webhookSearch(WebhookFilterGQO filter, WebhookOrderGQO order, Integer first, Integer offset) throws Exception;

}