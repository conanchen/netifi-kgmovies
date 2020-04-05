// Generated from graphql_java_gen gem  with template Tuery.java.erb

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
public class UpdatePartyRoleNamePayloadTuery extends Tuery<UpdatePartyRoleNamePayloadTuery> {
    UpdatePartyRoleNamePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PartyrolenameArguments extends Arguments {
        PartyrolenameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PartyrolenameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments order(PartyRoleNameOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PartyrolenameArgumentsDefinition {
        void define(PartyrolenameArguments args);
    }

    /**
    * 
    */
    public UpdatePartyRoleNamePayloadTuery partyrolename(PartyRoleNameTueryDefinition queryDef) {
        return partyrolename(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdatePartyRoleNamePayloadTuery partyrolename(PartyrolenameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("partyrolename");

        PartyrolenameArguments args = new PartyrolenameArguments(_queryBuilder);
        argsDef.define(args);
        PartyrolenameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdatePartyRoleNamePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
