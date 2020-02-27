package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public interface ProjectOwnerGQO {

    String getId();

    ProjectGQO getProject();

    ProjectConnectionGQO getProjects();

    String getProjectsResourcePath();

    String getProjectsUrl();

    Boolean getViewerCanCreateProjects();

}