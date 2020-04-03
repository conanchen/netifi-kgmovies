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
* [【社交关注角色】FollowerRole)
*/
public class FollowerRoleQuery extends Query<FollowerRoleQuery> {
    FollowerRoleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class PersonArguments extends Arguments {
        PersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PersonArgumentsDefinition {
        void define(PersonArguments args);
    }

    /**
    * 
    */
    public FollowerRoleQuery person(PersonQueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FollowerRoleQuery person(PersonArgumentsDefinition argsDef, PersonQueryDefinition queryDef) {
        startField("person");

        PersonArguments args = new PersonArguments(_queryBuilder);
        argsDef.define(args);
        PersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RoleNameArguments extends Arguments {
        RoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RoleNameArgumentsDefinition {
        void define(RoleNameArguments args);
    }

    /**
    * 
    */
    public FollowerRoleQuery roleName(PartyRoleNameQueryDefinition queryDef) {
        return roleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FollowerRoleQuery roleName(RoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
        startField("roleName");

        RoleNameArguments args = new RoleNameArguments(_queryBuilder);
        argsDef.define(args);
        RoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery dateThrough() {
        startField("dateThrough");

        return this;
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public FollowerRoleQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public FollowerRoleQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public FollowerRoleQuery description() {
        startField("description");

        return this;
    }

    /**
    * 关注设置,如关注最新产品信息
    */
    public FollowerRoleQuery settings() {
        startField("settings");

        return this;
    }
}
