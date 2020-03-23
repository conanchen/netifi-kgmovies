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
* 【机构】一个组织，例如学校、非政府组织、公司、俱乐部等,也可用于临时几个人组成的聊天小组，房间
*/
public class OrganizationQuery extends Query<OrganizationQuery> {
    OrganizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    *     【上级组织】 subOrganization的反向属性，即包含这个组织的更大组织    
    */
    public OrganizationQuery parentOrganization(OrganizationQueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    *     【上级组织】 subOrganization的反向属性，即包含这个组织的更大组织    
    */
    public OrganizationQuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    *     【子机构】 两个组织之间的关系。其中第二个组织，例如以子公司的名字，属于第一个组织。    
    */
    public OrganizationQuery subOrganizations(OrganizationQueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    *     【子机构】 两个组织之间的关系。其中第二个组织，例如以子公司的名字，属于第一个组织。    
    */
    public OrganizationQuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    *     【部门】 组织与该组织某个部门之间的关系，也被描述成组织（允许不同的网址，标识，开放时间）。 例如：一家有药店的商店，或者是一间带咖啡厅的面包店。 A relationship between
    * an organization and a department of that organization, also described as an organization (allowing
    * different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a
    * cafe.    
    */
    public OrganizationQuery departments(OrganizationQueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    *     【部门】 组织与该组织某个部门之间的关系，也被描述成组织（允许不同的网址，标识，开放时间）。 例如：一家有药店的商店，或者是一间带咖啡厅的面包店。 A relationship between
    * an organization and a department of that organization, also described as an organization (allowing
    * different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a
    * cafe.    
    */
    public OrganizationQuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    *     组织定义的角色名称,hasPartyRoleName,逆属性 PartyRoleName.isPartyRoleNameOf    
    */
    public OrganizationQuery hasPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    *     组织定义的角色名称,hasPartyRoleName,逆属性 PartyRoleName.isPartyRoleNameOf    
    */
    public OrganizationQuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
        startField("hasPartyRoleName");

        HasPartyRoleNameArguments args = new HasPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        HasPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public OrganizationQuery onGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrganizationQuery onStore(StoreQueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
