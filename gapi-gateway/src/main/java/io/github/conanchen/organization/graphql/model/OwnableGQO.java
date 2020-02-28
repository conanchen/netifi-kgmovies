package io.github.conanchen.organization.graphql.model;

import java.util.*;
import io.github.conanchen.organization.graphql.api.*;

public interface OwnableGQO {

    Collection<OwnershipGQO> getOwnedBy();

}