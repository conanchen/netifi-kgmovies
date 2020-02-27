package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface ClosableGQO {

    Boolean getClosed();

    java.util.Date getClosedAt();

}