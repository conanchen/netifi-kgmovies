package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class UnknownSignatureGQO implements GitSignatureGQO{

    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private Boolean isValid;
    @javax.validation.constraints.NotNull
    private String payload;
    @javax.validation.constraints.NotNull
    private String signature;
    private UserGQO signer;
    @javax.validation.constraints.NotNull
    private GitSignatureStateGQO state;
    @javax.validation.constraints.NotNull
    private Boolean wasSignedByGitHub;

    public UnknownSignatureGQO() {
    }

    public UnknownSignatureGQO(String email, Boolean isValid, String payload, String signature, UserGQO signer, GitSignatureStateGQO state, Boolean wasSignedByGitHub) {
        this.email = email;
        this.isValid = isValid;
        this.payload = payload;
        this.signature = signature;
        this.signer = signer;
        this.state = state;
        this.wasSignedByGitHub = wasSignedByGitHub;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public UserGQO getSigner() {
        return signer;
    }
    public void setSigner(UserGQO signer) {
        this.signer = signer;
    }

    public GitSignatureStateGQO getState() {
        return state;
    }
    public void setState(GitSignatureStateGQO state) {
        this.state = state;
    }

    public Boolean getWasSignedByGitHub() {
        return wasSignedByGitHub;
    }
    public void setWasSignedByGitHub(Boolean wasSignedByGitHub) {
        this.wasSignedByGitHub = wasSignedByGitHub;
    }

}