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
* Party 团体:代表有行动能力的个人或组织
*/
public class PartyQuery extends Query<PartyQuery> {
    PartyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class OwnsArguments extends Arguments {
        OwnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnsArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OwnsArgumentsDefinition {
        void define(OwnsArguments args);
    }

    /**
    * 【拥有】 组织或个人拥有的产品 逆属性 Ownable.ownedBy，Products owned by the organization or person.
    */
    public PartyQuery owns(OwnershipQueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 【拥有】 组织或个人拥有的产品 逆属性 Ownable.ownedBy，Products owned by the organization or person.
    */
    public PartyQuery owns(OwnsArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
        startField("owns");

        OwnsArguments args = new OwnsArguments(_queryBuilder);
        argsDef.define(args);
        OwnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasNamespacesArguments extends Arguments {
        HasNamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasNamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasNamespacesArgumentsDefinition {
        void define(HasNamespacesArguments args);
    }

    /**
    * 拥有的namespace
    */
    public PartyQuery hasNamespaces(NamespaceQueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 拥有的namespace
    */
    public PartyQuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public PartyQuery onGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyQuery onPerson(PersonQueryDefinition queryDef) {
        startInlineFragment("Person");
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyQuery onStore(StoreQueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
