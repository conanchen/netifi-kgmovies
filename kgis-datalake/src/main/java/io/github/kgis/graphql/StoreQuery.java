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
* 零售店铺
*/
public class StoreQuery extends Query<StoreQuery> {
    StoreQuery(StringBuilder _queryBuilder) {
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
    public StoreQuery owns(OwnershipQueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery owns(OwnsArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
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
    public StoreQuery hasNamespaces(NamespaceQueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public StoreQuery parentOrganization(OrganizationQueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    public StoreQuery subOrganizations(OrganizationQueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    public StoreQuery departments(OrganizationQueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    public StoreQuery hasPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
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
    public StoreQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public StoreQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public StoreQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public StoreQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public StoreQuery description() {
        startField("description");

        return this;
    }

    public class EmployeesArguments extends Arguments {
        EmployeesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EmployeesArguments filter(EmployeeRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments order(EmployeeRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EmployeesArgumentsDefinition {
        void define(EmployeesArguments args);
    }

    /**
    * 【雇员】 组织的雇员.在组织承担角色的个人有时间限制
    */
    public StoreQuery employees(EmployeeRoleQueryDefinition queryDef) {
        return employees(args -> {}, queryDef);
    }

    /**
    * 【雇员】 组织的雇员.在组织承担角色的个人有时间限制
    */
    public StoreQuery employees(EmployeesArgumentsDefinition argsDef, EmployeeRoleQueryDefinition queryDef) {
        startField("employees");

        EmployeesArguments args = new EmployeesArguments(_queryBuilder);
        argsDef.define(args);
        EmployeesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FollowersArguments extends Arguments {
        FollowersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FollowersArguments filter(FollowerRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments order(FollowerRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FollowersArgumentsDefinition {
        void define(FollowersArguments args);
    }

    /**
    * 【关注组织的人】 社交网络上本组织被别人关注
    */
    public StoreQuery followers(FollowerRoleQueryDefinition queryDef) {
        return followers(args -> {}, queryDef);
    }

    /**
    * 【关注组织的人】 社交网络上本组织被别人关注
    */
    public StoreQuery followers(FollowersArgumentsDefinition argsDef, FollowerRoleQueryDefinition queryDef) {
        startField("followers");

        FollowersArguments args = new FollowersArguments(_queryBuilder);
        argsDef.define(args);
        FollowersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MembersArguments extends Arguments {
        MembersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MembersArguments filter(MemberRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments order(MemberRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MembersArgumentsDefinition {
        void define(MembersArguments args);
    }

    /**
    * 【会员】 组织或项目的成员,在组织承担角色的个人有时间限制
    */
    public StoreQuery members(MemberRoleQueryDefinition queryDef) {
        return members(args -> {}, queryDef);
    }

    /**
    * 【会员】 组织或项目的成员,在组织承担角色的个人有时间限制
    */
    public StoreQuery members(MembersArgumentsDefinition argsDef, MemberRoleQueryDefinition queryDef) {
        startField("members");

        MembersArguments args = new MembersArguments(_queryBuilder);
        argsDef.define(args);
        MembersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【创建日期】
    */
    public StoreQuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    /**
    * 【更新日期】
    */
    public StoreQuery dateModified() {
        startField("dateModified");

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
    * 【创建人】 该物体的创作者/作者。
    */
    public StoreQuery creator(UserQueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    * 【创建人】 该物体的创作者/作者。
    */
    public StoreQuery creator(CreatorArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
