package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class HovercardGQO {

    @javax.validation.constraints.NotNull
    private Collection<HovercardContextGQO> contexts;

    public HovercardGQO() {
    }

    public HovercardGQO(Collection<HovercardContextGQO> contexts) {
        this.contexts = contexts;
    }

    public Collection<HovercardContextGQO> getContexts() {
        return contexts;
    }
    public void setContexts(Collection<HovercardContextGQO> contexts) {
        this.contexts = contexts;
    }

}