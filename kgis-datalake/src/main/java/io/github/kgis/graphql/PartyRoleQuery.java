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
* 【团体内部定义的角色】
*/
public class PartyRoleQuery extends Query<PartyRoleQuery> {
    PartyRoleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    * 在组织承担角色的个人
    */
    public PartyRoleQuery person(PersonQueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    * 在组织承担角色的个人
    */
    public PartyRoleQuery person(PersonArgumentsDefinition argsDef, PersonQueryDefinition queryDef) {
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
    * 个人在团体内承担的角色
    */
    public PartyRoleQuery roleName(PartyRoleNameQueryDefinition queryDef) {
        return roleName(args -> {}, queryDef);
    }

    /**
    * 个人在团体内承担的角色
    */
    public PartyRoleQuery roleName(RoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
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
    * 【开始日期】 某事的开始日期和时间
    */
    public PartyRoleQuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    * 【结束日期】 活动（事件）结束时间。 The end date and time of the item (in ISO 8601 date format).
    */
    public PartyRoleQuery dateThrough() {
        startField("dateThrough");

        return this;
    }

    public PartyRoleQuery onEmployeeRole(EmployeeRoleQueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleQuery onFollowerRole(FollowerRoleQueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleQuery onMemberRole(MemberRoleQueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
