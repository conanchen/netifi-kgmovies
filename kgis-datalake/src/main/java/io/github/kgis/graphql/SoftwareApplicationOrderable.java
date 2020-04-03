// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public enum SoftwareApplicationOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    APPLICATION_SUITE,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    DOWNLOAD_URL,

    /**
    * 
    */
    FEATURE_LIST,

    /**
    * 
    */
    IDENTIFIER,

    /**
    * 
    */
    INSTALL_URL,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    RELEASE_NOTES,

    /**
    * 
    */
    SCREENSHOT,

    /**
    * 
    */
    SOFTWARE_VERSION,

    UNKNOWN_VALUE;

    public static SoftwareApplicationOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "applicationSuite": {
                return APPLICATION_SUITE;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "downloadUrl": {
                return DOWNLOAD_URL;
            }

            case "featureList": {
                return FEATURE_LIST;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "installUrl": {
                return INSTALL_URL;
            }

            case "name": {
                return NAME;
            }

            case "releaseNotes": {
                return RELEASE_NOTES;
            }

            case "screenshot": {
                return SCREENSHOT;
            }

            case "softwareVersion": {
                return SOFTWARE_VERSION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALTERNATE_NAME: {
                return "alternateName";
            }

            case APPLICATION_SUITE: {
                return "applicationSuite";
            }

            case DESCRIPTION: {
                return "description";
            }

            case DOWNLOAD_URL: {
                return "downloadUrl";
            }

            case FEATURE_LIST: {
                return "featureList";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case INSTALL_URL: {
                return "installUrl";
            }

            case NAME: {
                return "name";
            }

            case RELEASE_NOTES: {
                return "releaseNotes";
            }

            case SCREENSHOT: {
                return "screenshot";
            }

            case SOFTWARE_VERSION: {
                return "softwareVersion";
            }

            default: {
                return "";
            }
        }
    }
}

