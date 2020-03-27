package io.github.conanchen.organization.graphql.model;

import java.util.Collection;

public interface OwnableGQO {

    Collection<OwnershipGQO> getOwnedBy();

}