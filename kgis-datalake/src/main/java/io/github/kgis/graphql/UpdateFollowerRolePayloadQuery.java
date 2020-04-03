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
public class UpdateFollowerRolePayloadQuery extends Query<UpdateFollowerRolePayloadQuery> {
    UpdateFollowerRolePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FollowerroleArguments extends Arguments {
        FollowerroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FollowerroleArguments filter(FollowerRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments order(FollowerRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FollowerroleArgumentsDefinition {
        void define(FollowerroleArguments args);
    }

    /**
    * 
    */
    public UpdateFollowerRolePayloadQuery followerrole(FollowerRoleQueryDefinition queryDef) {
        return followerrole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateFollowerRolePayloadQuery followerrole(FollowerroleArgumentsDefinition argsDef, FollowerRoleQueryDefinition queryDef) {
        startField("followerrole");

        FollowerroleArguments args = new FollowerroleArguments(_queryBuilder);
        argsDef.define(args);
        FollowerroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateFollowerRolePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
