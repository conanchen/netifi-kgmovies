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
public class UpdateMemberRolePayloadTuery extends Tuery<UpdateMemberRolePayloadTuery> {
    UpdateMemberRolePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class MemberroleArguments extends Arguments {
        MemberroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MemberroleArguments filter(MemberRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments order(MemberRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MemberroleArgumentsDefinition {
        void define(MemberroleArguments args);
    }

    /**
    * 
    */
    public UpdateMemberRolePayloadTuery memberrole(MemberRoleTueryDefinition queryDef) {
        return memberrole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateMemberRolePayloadTuery memberrole(MemberroleArgumentsDefinition argsDef, MemberRoleTueryDefinition queryDef) {
        startField("memberrole");

        MemberroleArguments args = new MemberroleArguments(_queryBuilder);
        argsDef.define(args);
        MemberroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateMemberRolePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
