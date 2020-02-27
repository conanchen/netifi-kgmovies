package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface LockableGQO {

    LockReasonGQO getActiveLockReason();

    Boolean getLocked();

}