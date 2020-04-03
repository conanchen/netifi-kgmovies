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
public class AddPartyRoleNamePayloadQuery extends Query<AddPartyRoleNamePayloadQuery> {
    AddPartyRoleNamePayloadQuery(StringBuilder _queryBuilder) {
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
    public AddPartyRoleNamePayloadQuery partyrolename(PartyRoleNameQueryDefinition queryDef) {
        return partyrolename(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPartyRoleNamePayloadQuery partyrolename(PartyrolenameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
        startField("partyrolename");

        PartyrolenameArguments args = new PartyrolenameArguments(_queryBuilder);
        argsDef.define(args);
        PartyrolenameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddPartyRoleNamePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
