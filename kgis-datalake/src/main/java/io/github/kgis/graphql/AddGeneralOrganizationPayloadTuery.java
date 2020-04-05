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
public class AddGeneralOrganizationPayloadTuery extends Tuery<AddGeneralOrganizationPayloadTuery> {
    AddGeneralOrganizationPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class GeneralorganizationArguments extends Arguments {
        GeneralorganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public GeneralorganizationArguments filter(GeneralOrganizationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments order(GeneralOrganizationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface GeneralorganizationArgumentsDefinition {
        void define(GeneralorganizationArguments args);
    }

    /**
    * 
    */
    public AddGeneralOrganizationPayloadTuery generalorganization(GeneralOrganizationTueryDefinition queryDef) {
        return generalorganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddGeneralOrganizationPayloadTuery generalorganization(GeneralorganizationArgumentsDefinition argsDef, GeneralOrganizationTueryDefinition queryDef) {
        startField("generalorganization");

        GeneralorganizationArguments args = new GeneralorganizationArguments(_queryBuilder);
        argsDef.define(args);
        GeneralorganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddGeneralOrganizationPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
