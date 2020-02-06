package io.github.conanchen.message.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GeoCoordinatesGQO implements NodeGQO{

    private Integer elevation;
    private Integer latitude;
    private Integer longitude;
    private String postalCode;
    @javax.validation.constraints.NotNull
    private String id;

    public GeoCoordinatesGQO() {
    }

    public GeoCoordinatesGQO(Integer elevation, Integer latitude, Integer longitude, String postalCode, String id) {
        this.elevation = elevation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postalCode = postalCode;
        this.id = id;
    }

    public Integer getElevation() {
        return elevation;
    }
    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public Integer getLatitude() {
        return latitude;
    }
    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }
    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}