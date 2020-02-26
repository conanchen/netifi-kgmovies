package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface TransferActionQuery {

    TransferActionGQO transferAction(String id, String actionId) throws Exception;

}