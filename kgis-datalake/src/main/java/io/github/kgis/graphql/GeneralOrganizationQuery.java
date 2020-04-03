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
* 【一般机构】一个组织，例如学校、非政府组织、公司、俱乐部等 An organization such as a school, NGO, corporation, club, etc.
* 也用于临时几个人组成的聊天小组，房间
* http://cnschema.org/Organization
*/
public class GeneralOrganizationQuery extends Query<GeneralOrganizationQuery> {
    GeneralOrganizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
    public GeneralOrganizationQuery owns(OwnershipQueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery owns(OwnsArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
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
    public GeneralOrganizationQuery hasNamespaces(NamespaceQueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParentOrganizationArguments extends Arguments {
        ParentOrganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ParentOrganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ParentOrganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParentOrganizationArgumentsDefinition {
        void define(ParentOrganizationArguments args);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery parentOrganization(OrganizationQueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
        startField("parentOrganization");

        ParentOrganizationArguments args = new ParentOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        ParentOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubOrganizationsArguments extends Arguments {
        SubOrganizationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubOrganizationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubOrganizationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubOrganizationsArgumentsDefinition {
        void define(SubOrganizationsArguments args);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery subOrganizations(OrganizationQueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
        startField("subOrganizations");

        SubOrganizationsArguments args = new SubOrganizationsArguments(_queryBuilder);
        argsDef.define(args);
        SubOrganizationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DepartmentsArguments extends Arguments {
        DepartmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DepartmentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DepartmentsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DepartmentsArgumentsDefinition {
        void define(DepartmentsArguments args);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery departments(OrganizationQueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
        startField("departments");

        DepartmentsArguments args = new DepartmentsArguments(_queryBuilder);
        argsDef.define(args);
        DepartmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasPartyRoleNameArguments extends Arguments {
        HasPartyRoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments order(PartyRoleNameOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasPartyRoleNameArgumentsDefinition {
        void define(HasPartyRoleNameArguments args);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery hasPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
        startField("hasPartyRoleName");

        HasPartyRoleNameArguments args = new HasPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        HasPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public GeneralOrganizationQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public GeneralOrganizationQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public GeneralOrganizationQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public GeneralOrganizationQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public GeneralOrganizationQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public GeneralOrganizationQuery description() {
        startField("description");

        return this;
    }

    public class AvailableConversationsArguments extends Arguments {
        AvailableConversationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AvailableConversationsArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AvailableConversationsArgumentsDefinition {
        void define(AvailableConversationsArguments args);
    }

    /**
    * 可以访问的会话
    */
    public GeneralOrganizationQuery availableConversations(ConversationQueryDefinition queryDef) {
        return availableConversations(args -> {}, queryDef);
    }

    /**
    * 可以访问的会话
    */
    public GeneralOrganizationQuery availableConversations(AvailableConversationsArgumentsDefinition argsDef, ConversationQueryDefinition queryDef) {
        startField("availableConversations");

        AvailableConversationsArguments args = new AvailableConversationsArguments(_queryBuilder);
        argsDef.define(args);
        AvailableConversationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DefaultConversationArguments extends Arguments {
        DefaultConversationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DefaultConversationArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DefaultConversationArgumentsDefinition {
        void define(DefaultConversationArguments args);
    }

    /**
    *  本组织默认可访问的会话 
    */
    public GeneralOrganizationQuery defaultConversation(ConversationQueryDefinition queryDef) {
        return defaultConversation(args -> {}, queryDef);
    }

    /**
    *  本组织默认可访问的会话 
    */
    public GeneralOrganizationQuery defaultConversation(DefaultConversationArgumentsDefinition argsDef, ConversationQueryDefinition queryDef) {
        startField("defaultConversation");

        DefaultConversationArguments args = new DefaultConversationArguments(_queryBuilder);
        argsDef.define(args);
        DefaultConversationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
