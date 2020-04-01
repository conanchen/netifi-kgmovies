package io.github.conanchen.gobject.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.gobject.graphql.api.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ImageObjectGQO implements GObjectGQO, NodeGQO{

    @lombok.NonNull
    private String name;

    private PersonGQO creator;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;

    private Integer contentSize;

    private java.lang.String contentUrl;

    private Integer width;

    private Integer height;
    @lombok.NonNull
    private String id;

    public ImageObjectGQO() {
    }

    public ImageObjectGQO( String name,  PersonGQO creator,  java.util.Date dateCreated,  java.util.Date dateModified,  Integer contentSize,  java.lang.String contentUrl,  Integer width,  Integer height,  String id) {
        this.name = name;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.contentSize = contentSize;
        this.contentUrl = contentUrl;
        this.width = width;
        this.height = height;
        this.id = id;
    }

}