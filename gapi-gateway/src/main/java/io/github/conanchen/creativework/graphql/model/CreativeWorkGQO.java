package io.github.conanchen.creativework.graphql.model;

import java.util.Collection;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public interface CreativeWorkGQO {

    ThingGQO getAbout();

    PersonGQO getEditor();

    java.lang.String getHeadline();

    java.lang.String getAlternativeHeadline();

    CreativeWorkGQO getIsPartOf();

    Collection<CreativeWorkGQO> getHasPart();

}