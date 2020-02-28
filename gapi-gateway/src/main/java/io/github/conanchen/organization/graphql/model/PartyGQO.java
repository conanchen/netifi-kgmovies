package io.github.conanchen.organization.graphql.model;

import java.util.Collection;

public interface PartyGQO {

    String getName();

    String getAlternateName();

    String getDescription();

    Collection<OwnershipGQO> getOwns();

}