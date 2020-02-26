package io.github.conanchen.creativework.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public interface CreativeWorkGQO {

    ThingGQO getAbout();

    PersonGQO getEditor();

    java.lang.String getHeadline();

    java.lang.String getAlternativeHeadline();

    CreativeWorkGQO getIsPartOf();

    Collection<CreativeWorkGQO> getHasPart();

}