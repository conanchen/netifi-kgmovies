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
* 个人,可能在平台里有一个且唯一的用户账号User
*/
public class PersonQuery extends Query<PersonQuery> {
    PersonQuery(StringBuilder _queryBuilder) {
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
    public PersonQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public PersonQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PersonQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PersonQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PersonQuery description() {
        startField("description");

        return this;
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
    * 
    */
    public PersonQuery owns(OwnershipQueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonQuery owns(OwnsArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
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
    * 
    */
    public PersonQuery hasNamespaces(NamespaceQueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonQuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 个人身份证ID
    */
    public PersonQuery personalId() {
        startField("personalID");

        return this;
    }

    /**
    * 【姓】 姓。 在美国，是一个人姓名中的最后一个字。 Family name. In the U.S., the last name of an Person. This can be used
    * along with givenName instead of the name property.
    */
    public PersonQuery familyName() {
        startField("familyName");

        return this;
    }

    /**
    * 【名】 名。在美国，是一个人名字中的第一个字 Given name. In the U.S., the first name of a Person. This can be used along
    * with familyName instead of the name property.
    */
    public PersonQuery givenName() {
        startField("givenName");

        return this;
    }

    public class HasUserArguments extends Arguments {
        HasUserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasUserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface HasUserArgumentsDefinition {
        void define(HasUserArguments args);
    }

    /**
    * 本人所拥有的用户账号，逆属性User.isUserOf，参考Inverse property: isPartOf
    */
    public PersonQuery hasUser(UserQueryDefinition queryDef) {
        return hasUser(args -> {}, queryDef);
    }

    /**
    * 本人所拥有的用户账号，逆属性User.isUserOf，参考Inverse property: isPartOf
    */
    public PersonQuery hasUser(HasUserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("hasUser");

        HasUserArguments args = new HasUserArguments(_queryBuilder);
        argsDef.define(args);
        HasUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
