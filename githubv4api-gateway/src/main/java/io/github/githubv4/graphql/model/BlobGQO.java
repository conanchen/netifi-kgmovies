package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BlobGQO implements GitObjectGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private Integer byteSize;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Boolean isBinary;
    @javax.validation.constraints.NotNull
    private Boolean isTruncated;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryGQO repository;
    private String text;

    public BlobGQO() {
    }

    public BlobGQO(String abbreviatedOid, Integer byteSize, String commitResourcePath, String commitUrl, String id, Boolean isBinary, Boolean isTruncated, String oid, RepositoryGQO repository, String text) {
        this.abbreviatedOid = abbreviatedOid;
        this.byteSize = byteSize;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.isBinary = isBinary;
        this.isTruncated = isTruncated;
        this.oid = oid;
        this.repository = repository;
        this.text = text;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
    }

    public Integer getByteSize() {
        return byteSize;
    }
    public void setByteSize(Integer byteSize) {
        this.byteSize = byteSize;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }
    public void setCommitResourcePath(String commitResourcePath) {
        this.commitResourcePath = commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBinary() {
        return isBinary;
    }
    public void setIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public RepositoryGQO getRepository() {
        return repository;
    }
    public void setRepository(RepositoryGQO repository) {
        this.repository = repository;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}