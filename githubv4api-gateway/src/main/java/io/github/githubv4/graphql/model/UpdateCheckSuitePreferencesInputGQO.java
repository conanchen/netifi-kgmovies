package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UpdateCheckSuitePreferencesInputGQO {

    @javax.validation.constraints.NotNull
    private Collection<CheckSuiteAutoTriggerPreferenceGQO> autoTriggerPreferences;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public UpdateCheckSuitePreferencesInputGQO() {
    }

    public UpdateCheckSuitePreferencesInputGQO(Collection<CheckSuiteAutoTriggerPreferenceGQO> autoTriggerPreferences, String clientMutationId, String repositoryId) {
        this.autoTriggerPreferences = autoTriggerPreferences;
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public Collection<CheckSuiteAutoTriggerPreferenceGQO> getAutoTriggerPreferences() {
        return autoTriggerPreferences;
    }
    public void setAutoTriggerPreferences(Collection<CheckSuiteAutoTriggerPreferenceGQO> autoTriggerPreferences) {
        this.autoTriggerPreferences = autoTriggerPreferences;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}