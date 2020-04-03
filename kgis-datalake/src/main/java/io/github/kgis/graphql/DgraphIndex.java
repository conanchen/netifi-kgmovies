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
public enum DgraphIndex {
    /**
    * 
    */
    BOOL,

    /**
    * 
    */
    DAY,

    /**
    * 
    */
    EXACT,

    /**
    * 
    */
    FLOAT,

    /**
    * 
    */
    FULLTEXT,

    /**
    * 
    */
    HASH,

    /**
    * 
    */
    HOUR,

    /**
    * 
    */
    INT,

    /**
    * 
    */
    MONTH,

    /**
    * 
    */
    REGEXP,

    /**
    * 
    */
    TERM,

    /**
    * 
    */
    TRIGRAM,

    /**
    * 
    */
    YEAR,

    UNKNOWN_VALUE;

    public static DgraphIndex fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "bool": {
                return BOOL;
            }

            case "day": {
                return DAY;
            }

            case "exact": {
                return EXACT;
            }

            case "float": {
                return FLOAT;
            }

            case "fulltext": {
                return FULLTEXT;
            }

            case "hash": {
                return HASH;
            }

            case "hour": {
                return HOUR;
            }

            case "int": {
                return INT;
            }

            case "month": {
                return MONTH;
            }

            case "regexp": {
                return REGEXP;
            }

            case "term": {
                return TERM;
            }

            case "trigram": {
                return TRIGRAM;
            }

            case "year": {
                return YEAR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BOOL: {
                return "bool";
            }

            case DAY: {
                return "day";
            }

            case EXACT: {
                return "exact";
            }

            case FLOAT: {
                return "float";
            }

            case FULLTEXT: {
                return "fulltext";
            }

            case HASH: {
                return "hash";
            }

            case HOUR: {
                return "hour";
            }

            case INT: {
                return "int";
            }

            case MONTH: {
                return "month";
            }

            case REGEXP: {
                return "regexp";
            }

            case TERM: {
                return "term";
            }

            case TRIGRAM: {
                return "trigram";
            }

            case YEAR: {
                return "year";
            }

            default: {
                return "";
            }
        }
    }
}

