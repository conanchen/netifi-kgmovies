package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface MessgeWithdrawMutation {

    MessagePayloadGQO messgeWithdraw(String messageId) throws Exception;

}