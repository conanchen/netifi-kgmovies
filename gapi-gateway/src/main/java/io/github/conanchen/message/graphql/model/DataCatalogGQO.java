package io.github.conanchen.message.graphql.model;

import java.util.Collection;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class DataCatalogGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String name;
    private DataCatalogGQO parentDataCatalog;
    private Collection<DataCatalogGQO> subDataCatalogs;
    private PersonGQO creator;
    private java.util.Date dateCreated;
    private Collection<PersonGQO> followees;
    @javax.validation.constraints.NotNull
    private String id;

    public DataCatalogGQO() {
    }

    public DataCatalogGQO(String name, DataCatalogGQO parentDataCatalog, Collection<DataCatalogGQO> subDataCatalogs, PersonGQO creator, java.util.Date dateCreated, Collection<PersonGQO> followees, String id) {
        this.name = name;
        this.parentDataCatalog = parentDataCatalog;
        this.subDataCatalogs = subDataCatalogs;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.followees = followees;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DataCatalogGQO getParentDataCatalog() {
        return parentDataCatalog;
    }
    public void setParentDataCatalog(DataCatalogGQO parentDataCatalog) {
        this.parentDataCatalog = parentDataCatalog;
    }

    public Collection<DataCatalogGQO> getSubDataCatalogs() {
        return subDataCatalogs;
    }
    public void setSubDataCatalogs(Collection<DataCatalogGQO> subDataCatalogs) {
        this.subDataCatalogs = subDataCatalogs;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(Collection<PersonGQO> followees) {
        this.followees = followees;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}