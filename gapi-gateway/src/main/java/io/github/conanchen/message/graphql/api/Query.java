package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface Query {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

    ConversationsConnectionGQO allConversations(String after, Integer first, String before, Integer last) throws Exception;

    DefaultPlaceGQO defaultPlace(String id, String defID) throws Exception;

    AdministrativeAreaGQO administrativeArea(String id, String defID) throws Exception;

}