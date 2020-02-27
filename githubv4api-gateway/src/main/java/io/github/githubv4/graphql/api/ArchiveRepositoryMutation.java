package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface ArchiveRepositoryMutation {

    ArchiveRepositoryPayloadGQO archiveRepository(ArchiveRepositoryInputGQO input) throws Exception;

}