package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface GitSignatureGQO {

    String getEmail();

    Boolean getIsValid();

    String getPayload();

    String getSignature();

    UserGQO getSigner();

    GitSignatureStateGQO getState();

    Boolean getWasSignedByGitHub();

}