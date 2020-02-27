package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface DeleteLabelMutation {

    DeleteLabelPayloadGQO deleteLabel(DeleteLabelInputGQO input) throws Exception;

}