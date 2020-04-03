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
public enum CartOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    CREATED_AT,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    EMAIL,

    /**
    * 
    */
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    NOTES,

    /**
    * 
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CartOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "createdAt": {
                return CREATED_AT;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "email": {
                return EMAIL;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "notes": {
                return NOTES;
            }

            case "updatedAt": {
                return UPDATED_AT;
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

            case CREATED_AT: {
                return "createdAt";
            }

            case DESCRIPTION: {
                return "description";
            }

            case EMAIL: {
                return "email";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case NOTES: {
                return "notes";
            }

            case UPDATED_AT: {
                return "updatedAt";
            }

            default: {
                return "";
            }
        }
    }
}

