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
* 组织定义的角色，组织内统筹定义
*/
public class PartyRoleNameQuery extends Query<PartyRoleNameQuery> {
    PartyRoleNameQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
    public PartyRoleNameQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PartyRoleNameQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public PartyRoleNameQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameQuery description() {
        startField("description");

        return this;
    }

    /**
    * isPartyRoleNameOf,逆属性 Organization.hasPartyRoleName
    */
    public PartyRoleNameQuery isRoleNameOf(OrganizationQueryDefinition queryDef) {
        startField("isRoleNameOf");

        _queryBuilder.append('{');
        queryDef.define(new OrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 角色分组,如员工角色组、会员角色组
    */
    public PartyRoleNameQuery group() {
        startField("group");

        return this;
    }

    public class CreatorArguments extends Arguments {
        CreatorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CreatorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreatorArgumentsDefinition {
        void define(CreatorArguments args);
    }

    /**
    * 【作者】 该 CreativeWork 的创作者/作者。跟CreativeWork的Author属性一样。 The creator/author of this CreativeWork. This
    * is the same as the Author property for CreativeWork.creator    Organization or Person or
    * CreativeWork or UserReviews
    */
    public PartyRoleNameQuery creator(UserQueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    * 【作者】 该 CreativeWork 的创作者/作者。跟CreativeWork的Author属性一样。 The creator/author of this CreativeWork. This
    * is the same as the Author property for CreativeWork.creator    Organization or Person or
    * CreativeWork or UserReviews
    */
    public PartyRoleNameQuery creator(CreatorArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【创建日期】 创作出CreativeWork的日期。 The date on which the CreativeWork was created or the item was added to a
    * DataFeed. dateCreated    DateTime or Date or DataFeedItem or CreativeWork
    */
    public PartyRoleNameQuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
