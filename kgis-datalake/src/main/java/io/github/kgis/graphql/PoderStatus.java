// Generated from graphql_java_gen gem  with template Enum.java.erb

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
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
public enum PoderStatus {
    /**
    * 
    */
    PODER_CANCELLED,

    /**
    * 
    */
    PODER_DELIVERED,

    /**
    * 
    */
    PODER_IN_TRANSIT,

    /**
    * 
    */
    PODER_PAID,

    /**
    * 
    */
    PODER_PAYMENT_DUE,

    /**
    * 
    */
    PODER_PICKUP_AVAILABLE,

    /**
    * 
    */
    PODER_PROBLEM,

    /**
    * 
    */
    PODER_PROCESSING,

    /**
    * 
    */
    PODER_RETURNED,

    /**
    * 
    */
    PODER_UNPAID,

    UNKNOWN_VALUE;

    public static PoderStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "PoderCancelled": {
                return PODER_CANCELLED;
            }

            case "PoderDelivered": {
                return PODER_DELIVERED;
            }

            case "PoderInTransit": {
                return PODER_IN_TRANSIT;
            }

            case "PoderPAID": {
                return PODER_PAID;
            }

            case "PoderPaymentDue": {
                return PODER_PAYMENT_DUE;
            }

            case "PoderPickupAvailable": {
                return PODER_PICKUP_AVAILABLE;
            }

            case "PoderProblem": {
                return PODER_PROBLEM;
            }

            case "PoderProcessing": {
                return PODER_PROCESSING;
            }

            case "PoderReturned": {
                return PODER_RETURNED;
            }

            case "PoderUNPAID": {
                return PODER_UNPAID;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case PODER_CANCELLED: {
                return "PoderCancelled";
            }

            case PODER_DELIVERED: {
                return "PoderDelivered";
            }

            case PODER_IN_TRANSIT: {
                return "PoderInTransit";
            }

            case PODER_PAID: {
                return "PoderPAID";
            }

            case PODER_PAYMENT_DUE: {
                return "PoderPaymentDue";
            }

            case PODER_PICKUP_AVAILABLE: {
                return "PoderPickupAvailable";
            }

            case PODER_PROBLEM: {
                return "PoderProblem";
            }

            case PODER_PROCESSING: {
                return "PoderProcessing";
            }

            case PODER_RETURNED: {
                return "PoderReturned";
            }

            case PODER_UNPAID: {
                return "PoderUNPAID";
            }

            default: {
                return "";
            }
        }
    }
}

