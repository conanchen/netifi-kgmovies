package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class GitHubMetadataGQO {

    @javax.validation.constraints.NotNull
    private String gitHubServicesSha;
    @javax.validation.constraints.NotNull
    private Collection<String> gitIpAddresses;
    @javax.validation.constraints.NotNull
    private Collection<String> hookIpAddresses;
    @javax.validation.constraints.NotNull
    private Collection<String> importerIpAddresses;
    @javax.validation.constraints.NotNull
    private Boolean isPasswordAuthenticationVerifiable;
    @javax.validation.constraints.NotNull
    private Collection<String> pagesIpAddresses;

    public GitHubMetadataGQO() {
    }

    public GitHubMetadataGQO(String gitHubServicesSha, Collection<String> gitIpAddresses, Collection<String> hookIpAddresses, Collection<String> importerIpAddresses, Boolean isPasswordAuthenticationVerifiable, Collection<String> pagesIpAddresses) {
        this.gitHubServicesSha = gitHubServicesSha;
        this.gitIpAddresses = gitIpAddresses;
        this.hookIpAddresses = hookIpAddresses;
        this.importerIpAddresses = importerIpAddresses;
        this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
        this.pagesIpAddresses = pagesIpAddresses;
    }

    public String getGitHubServicesSha() {
        return gitHubServicesSha;
    }
    public void setGitHubServicesSha(String gitHubServicesSha) {
        this.gitHubServicesSha = gitHubServicesSha;
    }

    public Collection<String> getGitIpAddresses() {
        return gitIpAddresses;
    }
    public void setGitIpAddresses(Collection<String> gitIpAddresses) {
        this.gitIpAddresses = gitIpAddresses;
    }

    public Collection<String> getHookIpAddresses() {
        return hookIpAddresses;
    }
    public void setHookIpAddresses(Collection<String> hookIpAddresses) {
        this.hookIpAddresses = hookIpAddresses;
    }

    public Collection<String> getImporterIpAddresses() {
        return importerIpAddresses;
    }
    public void setImporterIpAddresses(Collection<String> importerIpAddresses) {
        this.importerIpAddresses = importerIpAddresses;
    }

    public Boolean getIsPasswordAuthenticationVerifiable() {
        return isPasswordAuthenticationVerifiable;
    }
    public void setIsPasswordAuthenticationVerifiable(Boolean isPasswordAuthenticationVerifiable) {
        this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
    }

    public Collection<String> getPagesIpAddresses() {
        return pagesIpAddresses;
    }
    public void setPagesIpAddresses(Collection<String> pagesIpAddresses) {
        this.pagesIpAddresses = pagesIpAddresses;
    }

}