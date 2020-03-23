// Generated from graphql_java_gen gem

package io.github.kgis.client;

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
* 用户账号
*/
public class UserQuery extends Query<UserQuery> {
    UserQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
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
    public UserQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UserQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public UserQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public UserQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public UserQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public UserQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public UserQuery id() {
        startField("id");

        return this;
    }

    /**
    *     The username used to login.    We also want to make sure that usernames are unique. The @id
    * directive takes care of that - it also automatically adds hash searching, so we can drop the
    * @search(by: [hash]), though having it also causes no harm.    
    */
    public UserQuery username() {
        startField("username");

        return this;
    }

    /**
    *     The password used to login.    
    */
    public UserQuery password() {
        startField("password");

        return this;
    }

    /**
    *     The user's public profile bio.    
    */
    public UserQuery bio() {
        startField("bio");

        return this;
    }

    public class IsUserOfArguments extends Arguments {
        IsUserOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsUserOfArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsUserOfArgumentsDefinition {
        void define(IsUserOfArguments args);
    }

    /**
    *     用户账号对应的人，有账号一定有相关的Person，逆属性 Person.hasUser，参考Inverse property: hasPart    
    */
    public UserQuery isUserOf(PersonQueryDefinition queryDef) {
        return isUserOf(args -> {}, queryDef);
    }

    /**
    *     用户账号对应的人，有账号一定有相关的Person，逆属性 Person.hasUser，参考Inverse property: hasPart    
    */
    public UserQuery isUserOf(IsUserOfArgumentsDefinition argsDef, PersonQueryDefinition queryDef) {
        startField("isUserOf");

        IsUserOfArguments args = new IsUserOfArguments(_queryBuilder);
        argsDef.define(args);
        IsUserOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
