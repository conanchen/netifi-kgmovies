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
public class AddEmployeeRolePayloadTuery extends Tuery<AddEmployeeRolePayloadTuery> {
    AddEmployeeRolePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class EmployeeroleArguments extends Arguments {
        EmployeeroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EmployeeroleArguments filter(EmployeeRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments order(EmployeeRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EmployeeroleArgumentsDefinition {
        void define(EmployeeroleArguments args);
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery employeerole(EmployeeRoleTueryDefinition queryDef) {
        return employeerole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery employeerole(EmployeeroleArgumentsDefinition argsDef, EmployeeRoleTueryDefinition queryDef) {
        startField("employeerole");

        EmployeeroleArguments args = new EmployeeroleArguments(_queryBuilder);
        argsDef.define(args);
        EmployeeroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
