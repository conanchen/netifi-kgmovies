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
* 资源对象所属的namespace,根据一定规则由平台生成或配置定义如：io.shurui.store001.order,
* 默认值是default如果某个角色拥有inamespace：'io.shurui'的权限，则拥有'io.shurui'一下所有子namespace的相应权限
*/
public class NamespaceQuery extends Query<NamespaceQuery> {
    NamespaceQuery(StringBuilder _queryBuilder) {
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
    public NamespaceQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public NamespaceQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public NamespaceQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public NamespaceQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public NamespaceQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public NamespaceQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public NamespaceQuery id() {
        startField("id");

        return this;
    }

    /**
    *     资源对象所属的namespace,根据一定规则由平台生成或配置定义如：io.shurui.store001.order, 默认值是default   
    * 如果某个角色拥有inamespace：'io.shurui'的权限，则拥有'io.shurui'一下所有子namespace的相应权限    
    */
    public NamespaceQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    *     拥有namespace的组织或用户    
    */
    public NamespaceQuery isNamespaceOf(PartyQueryDefinition queryDef) {
        startField("isNamespaceOf");

        _queryBuilder.append('{');
        queryDef.define(new PartyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
