package io.github.conanchen.softwareapplication.graphql.api;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.model.*;

public interface WebhookQuery {

    WebhookGQO webhook(String id, String webhookID) throws Exception;

}