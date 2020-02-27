package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class ActorLocationGQO {

    private String city;
    private String country;
    private String countryCode;
    private String region;
    private String regionCode;

    public ActorLocationGQO() {
    }

    public ActorLocationGQO(String city, String country, String countryCode, String region, String regionCode) {
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.region = region;
        this.regionCode = regionCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

}