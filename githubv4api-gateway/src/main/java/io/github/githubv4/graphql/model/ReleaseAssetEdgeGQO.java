package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ReleaseAssetEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private ReleaseAssetGQO node;

    public ReleaseAssetEdgeGQO() {
    }

    public ReleaseAssetEdgeGQO(String cursor, ReleaseAssetGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReleaseAssetGQO getNode() {
        return node;
    }
    public void setNode(ReleaseAssetGQO node) {
        this.node = node;
    }

}