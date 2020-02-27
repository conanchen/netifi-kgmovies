package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface MinimizableGQO {

    Boolean getIsMinimized();

    String getMinimizedReason();

    Boolean getViewerCanMinimize();

}