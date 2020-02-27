package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ExternalIdentitySamlAttributesGQO {

    private String nameId;

    public ExternalIdentitySamlAttributesGQO() {
    }

    public ExternalIdentitySamlAttributesGQO(String nameId) {
        this.nameId = nameId;
    }

    public String getNameId() {
        return nameId;
    }
    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

}