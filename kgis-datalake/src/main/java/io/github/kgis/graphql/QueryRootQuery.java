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
* 
*/
public class QueryRootQuery extends Query<QueryRootQuery> {
    QueryRootQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public QueryRootQuery getNode(ID id, NodeQueryDefinition queryDef) {
        startField("getNode");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryNodeArguments extends Arguments {
        QueryNodeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryNodeArguments filter(NodeFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryNodeArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryNodeArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryNodeArgumentsDefinition {
        void define(QueryNodeArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryNode(NodeQueryDefinition queryDef) {
        return queryNode(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryNode(QueryNodeArgumentsDefinition argsDef, NodeQueryDefinition queryDef) {
        startField("queryNode");

        QueryNodeArguments args = new QueryNodeArguments(_queryBuilder);
        argsDef.define(args);
        QueryNodeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryThingArguments extends Arguments {
        QueryThingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryThingArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryThingArguments order(ThingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryThingArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryThingArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryThingArgumentsDefinition {
        void define(QueryThingArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryThing(ThingQueryDefinition queryDef) {
        return queryThing(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryThing(QueryThingArgumentsDefinition argsDef, ThingQueryDefinition queryDef) {
        startField("queryThing");

        QueryThingArguments args = new QueryThingArguments(_queryBuilder);
        argsDef.define(args);
        QueryThingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryShoppingableArguments extends Arguments {
        QueryShoppingableArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryShoppingableArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryShoppingableArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryShoppingableArgumentsDefinition {
        void define(QueryShoppingableArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryShoppingable(ShoppingableQueryDefinition queryDef) {
        return queryShoppingable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryShoppingable(QueryShoppingableArgumentsDefinition argsDef, ShoppingableQueryDefinition queryDef) {
        startField("queryShoppingable");

        QueryShoppingableArguments args = new QueryShoppingableArguments(_queryBuilder);
        argsDef.define(args);
        QueryShoppingableArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPartyArguments extends Arguments {
        QueryPartyArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPartyArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPartyArgumentsDefinition {
        void define(QueryPartyArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryParty(PartyQueryDefinition queryDef) {
        return queryParty(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryParty(QueryPartyArgumentsDefinition argsDef, PartyQueryDefinition queryDef) {
        startField("queryParty");

        QueryPartyArguments args = new QueryPartyArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryOrganizationArguments extends Arguments {
        QueryOrganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryOrganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOrganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryOrganizationArgumentsDefinition {
        void define(QueryOrganizationArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryOrganization(OrganizationQueryDefinition queryDef) {
        return queryOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryOrganization(QueryOrganizationArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
        startField("queryOrganization");

        QueryOrganizationArguments args = new QueryOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        QueryOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPartyRoleArguments extends Arguments {
        QueryPartyRoleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPartyRoleArguments order(PartyRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyRoleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyRoleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPartyRoleArgumentsDefinition {
        void define(QueryPartyRoleArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryPartyRole(PartyRoleQueryDefinition queryDef) {
        return queryPartyRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryPartyRole(QueryPartyRoleArgumentsDefinition argsDef, PartyRoleQueryDefinition queryDef) {
        startField("queryPartyRole");

        QueryPartyRoleArguments args = new QueryPartyRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getNamespace(ID id, NamespaceQueryDefinition queryDef) {
        startField("getNamespace");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryNamespaceArguments extends Arguments {
        QueryNamespaceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryNamespaceArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryNamespaceArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryNamespaceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryNamespaceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryNamespaceArgumentsDefinition {
        void define(QueryNamespaceArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryNamespace(NamespaceQueryDefinition queryDef) {
        return queryNamespace(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryNamespace(QueryNamespaceArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("queryNamespace");

        QueryNamespaceArguments args = new QueryNamespaceArguments(_queryBuilder);
        argsDef.define(args);
        QueryNamespaceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getPartyRoleName(ID id, PartyRoleNameQueryDefinition queryDef) {
        startField("getPartyRoleName");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPartyRoleNameArguments extends Arguments {
        QueryPartyRoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPartyRoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyRoleNameArguments order(PartyRoleNameOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyRoleNameArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPartyRoleNameArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPartyRoleNameArgumentsDefinition {
        void define(QueryPartyRoleNameArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        return queryPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryPartyRoleName(QueryPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
        startField("queryPartyRoleName");

        QueryPartyRoleNameArguments args = new QueryPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryReadableArguments extends Arguments {
        QueryReadableArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryReadableArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReadableArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryReadableArgumentsDefinition {
        void define(QueryReadableArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryReadable(ReadableQueryDefinition queryDef) {
        return queryReadable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryReadable(QueryReadableArgumentsDefinition argsDef, ReadableQueryDefinition queryDef) {
        startField("queryReadable");

        QueryReadableArguments args = new QueryReadableArguments(_queryBuilder);
        argsDef.define(args);
        QueryReadableArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getDataCatalog(ID id, DataCatalogQueryDefinition queryDef) {
        startField("getDataCatalog");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryDataCatalogArguments extends Arguments {
        QueryDataCatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryDataCatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryDataCatalogArguments order(DataCatalogOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryDataCatalogArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryDataCatalogArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryDataCatalogArgumentsDefinition {
        void define(QueryDataCatalogArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryDataCatalog(DataCatalogQueryDefinition queryDef) {
        return queryDataCatalog(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryDataCatalog(QueryDataCatalogArgumentsDefinition argsDef, DataCatalogQueryDefinition queryDef) {
        startField("queryDataCatalog");

        QueryDataCatalogArguments args = new QueryDataCatalogArguments(_queryBuilder);
        argsDef.define(args);
        QueryDataCatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getConversation(ID id, ConversationQueryDefinition queryDef) {
        startField("getConversation");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryConversationArguments extends Arguments {
        QueryConversationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryConversationArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryConversationArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryConversationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryConversationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryConversationArgumentsDefinition {
        void define(QueryConversationArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryConversation(ConversationQueryDefinition queryDef) {
        return queryConversation(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryConversation(QueryConversationArgumentsDefinition argsDef, ConversationQueryDefinition queryDef) {
        startField("queryConversation");

        QueryConversationArguments args = new QueryConversationArguments(_queryBuilder);
        argsDef.define(args);
        QueryConversationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getMessage(ID id, MessageQueryDefinition queryDef) {
        startField("getMessage");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryMessageArguments extends Arguments {
        QueryMessageArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryMessageArguments filter(MessageFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMessageArguments order(MessageOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMessageArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMessageArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryMessageArgumentsDefinition {
        void define(QueryMessageArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryMessage(MessageQueryDefinition queryDef) {
        return queryMessage(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryMessage(QueryMessageArgumentsDefinition argsDef, MessageQueryDefinition queryDef) {
        startField("queryMessage");

        QueryMessageArguments args = new QueryMessageArguments(_queryBuilder);
        argsDef.define(args);
        QueryMessageArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getReview(ID id, ReviewQueryDefinition queryDef) {
        startField("getReview");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryReviewArguments extends Arguments {
        QueryReviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryReviewArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReviewArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryReviewArgumentsDefinition {
        void define(QueryReviewArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryReview(ReviewQueryDefinition queryDef) {
        return queryReview(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryReview(QueryReviewArgumentsDefinition argsDef, ReviewQueryDefinition queryDef) {
        startField("queryReview");

        QueryReviewArguments args = new QueryReviewArguments(_queryBuilder);
        argsDef.define(args);
        QueryReviewArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getReadNote(ID id, ReadNoteQueryDefinition queryDef) {
        startField("getReadNote");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryReadNoteArguments extends Arguments {
        QueryReadNoteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryReadNoteArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReadNoteArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReadNoteArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryReadNoteArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryReadNoteArgumentsDefinition {
        void define(QueryReadNoteArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryReadNote(ReadNoteQueryDefinition queryDef) {
        return queryReadNote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryReadNote(QueryReadNoteArgumentsDefinition argsDef, ReadNoteQueryDefinition queryDef) {
        startField("queryReadNote");

        QueryReadNoteArguments args = new QueryReadNoteArguments(_queryBuilder);
        argsDef.define(args);
        QueryReadNoteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getGeneralOrganization(ID id, GeneralOrganizationQueryDefinition queryDef) {
        startField("getGeneralOrganization");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryGeneralOrganizationArguments extends Arguments {
        QueryGeneralOrganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryGeneralOrganizationArguments filter(GeneralOrganizationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryGeneralOrganizationArguments order(GeneralOrganizationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryGeneralOrganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryGeneralOrganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryGeneralOrganizationArgumentsDefinition {
        void define(QueryGeneralOrganizationArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        return queryGeneralOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryGeneralOrganization(QueryGeneralOrganizationArgumentsDefinition argsDef, GeneralOrganizationQueryDefinition queryDef) {
        startField("queryGeneralOrganization");

        QueryGeneralOrganizationArguments args = new QueryGeneralOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        QueryGeneralOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getEmployeeRole(ID id, EmployeeRoleQueryDefinition queryDef) {
        startField("getEmployeeRole");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryEmployeeRoleArguments extends Arguments {
        QueryEmployeeRoleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryEmployeeRoleArguments filter(EmployeeRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEmployeeRoleArguments order(EmployeeRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEmployeeRoleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEmployeeRoleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryEmployeeRoleArgumentsDefinition {
        void define(QueryEmployeeRoleArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryEmployeeRole(EmployeeRoleQueryDefinition queryDef) {
        return queryEmployeeRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryEmployeeRole(QueryEmployeeRoleArgumentsDefinition argsDef, EmployeeRoleQueryDefinition queryDef) {
        startField("queryEmployeeRole");

        QueryEmployeeRoleArguments args = new QueryEmployeeRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryEmployeeRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getFollowerRole(ID id, FollowerRoleQueryDefinition queryDef) {
        startField("getFollowerRole");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryFollowerRoleArguments extends Arguments {
        QueryFollowerRoleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryFollowerRoleArguments filter(FollowerRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryFollowerRoleArguments order(FollowerRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryFollowerRoleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryFollowerRoleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryFollowerRoleArgumentsDefinition {
        void define(QueryFollowerRoleArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryFollowerRole(FollowerRoleQueryDefinition queryDef) {
        return queryFollowerRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryFollowerRole(QueryFollowerRoleArgumentsDefinition argsDef, FollowerRoleQueryDefinition queryDef) {
        startField("queryFollowerRole");

        QueryFollowerRoleArguments args = new QueryFollowerRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryFollowerRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getMemberRole(ID id, MemberRoleQueryDefinition queryDef) {
        startField("getMemberRole");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryMemberRoleArguments extends Arguments {
        QueryMemberRoleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryMemberRoleArguments filter(MemberRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMemberRoleArguments order(MemberRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMemberRoleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryMemberRoleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryMemberRoleArgumentsDefinition {
        void define(QueryMemberRoleArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryMemberRole(MemberRoleQueryDefinition queryDef) {
        return queryMemberRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryMemberRole(QueryMemberRoleArgumentsDefinition argsDef, MemberRoleQueryDefinition queryDef) {
        startField("queryMemberRole");

        QueryMemberRoleArguments args = new QueryMemberRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryMemberRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getOwnership(ID id, OwnershipQueryDefinition queryDef) {
        startField("getOwnership");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OwnershipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryOwnershipArguments extends Arguments {
        QueryOwnershipArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryOwnershipArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOwnershipArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOwnershipArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOwnershipArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryOwnershipArgumentsDefinition {
        void define(QueryOwnershipArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryOwnership(OwnershipQueryDefinition queryDef) {
        return queryOwnership(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryOwnership(QueryOwnershipArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
        startField("queryOwnership");

        QueryOwnershipArguments args = new QueryOwnershipArguments(_queryBuilder);
        argsDef.define(args);
        QueryOwnershipArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class GetUserArguments extends Arguments {
        GetUserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public GetUserArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * 
        */
        public GetUserArguments username(String value) {
            if (value != null) {
                startArgument("username");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface GetUserArgumentsDefinition {
        void define(GetUserArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery getUser(UserQueryDefinition queryDef) {
        return getUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery getUser(GetUserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("getUser");

        GetUserArguments args = new GetUserArguments(_queryBuilder);
        argsDef.define(args);
        GetUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryUserArguments extends Arguments {
        QueryUserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryUserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryUserArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryUserArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryUserArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryUserArgumentsDefinition {
        void define(QueryUserArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryUser(UserQueryDefinition queryDef) {
        return queryUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryUser(QueryUserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("queryUser");

        QueryUserArguments args = new QueryUserArguments(_queryBuilder);
        argsDef.define(args);
        QueryUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getPerson(ID id, PersonQueryDefinition queryDef) {
        startField("getPerson");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPersonArguments extends Arguments {
        QueryPersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPersonArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPersonArguments order(PersonOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPersonArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPersonArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPersonArgumentsDefinition {
        void define(QueryPersonArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryPerson(PersonQueryDefinition queryDef) {
        return queryPerson(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryPerson(QueryPersonArgumentsDefinition argsDef, PersonQueryDefinition queryDef) {
        startField("queryPerson");

        QueryPersonArguments args = new QueryPersonArguments(_queryBuilder);
        argsDef.define(args);
        QueryPersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getStore(ID id, StoreQueryDefinition queryDef) {
        startField("getStore");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryStoreArguments extends Arguments {
        QueryStoreArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryStoreArguments filter(StoreFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryStoreArguments order(StoreOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryStoreArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryStoreArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryStoreArgumentsDefinition {
        void define(QueryStoreArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryStore(StoreQueryDefinition queryDef) {
        return queryStore(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryStore(QueryStoreArgumentsDefinition argsDef, StoreQueryDefinition queryDef) {
        startField("queryStore");

        QueryStoreArguments args = new QueryStoreArguments(_queryBuilder);
        argsDef.define(args);
        QueryStoreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getProduct(ID id, ProductQueryDefinition queryDef) {
        startField("getProduct");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryProductArguments extends Arguments {
        QueryProductArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryProductArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments order(ProductOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryProductArgumentsDefinition {
        void define(QueryProductArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryProduct(ProductQueryDefinition queryDef) {
        return queryProduct(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryProduct(QueryProductArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
        startField("queryProduct");

        QueryProductArguments args = new QueryProductArguments(_queryBuilder);
        argsDef.define(args);
        QueryProductArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getProductModel(ID id, ProductModelQueryDefinition queryDef) {
        startField("getProductModel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryProductModelArguments extends Arguments {
        QueryProductModelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryProductModelArguments filter(ProductModelFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductModelArguments order(ProductModelOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductModelArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryProductModelArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryProductModelArgumentsDefinition {
        void define(QueryProductModelArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryProductModel(ProductModelQueryDefinition queryDef) {
        return queryProductModel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryProductModel(QueryProductModelArgumentsDefinition argsDef, ProductModelQueryDefinition queryDef) {
        startField("queryProductModel");

        QueryProductModelArguments args = new QueryProductModelArguments(_queryBuilder);
        argsDef.define(args);
        QueryProductModelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getOffer(ID id, OfferQueryDefinition queryDef) {
        startField("getOffer");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OfferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryOfferArguments extends Arguments {
        QueryOfferArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryOfferArguments filter(OfferFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOfferArguments order(OfferOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOfferArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryOfferArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryOfferArgumentsDefinition {
        void define(QueryOfferArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryOffer(OfferQueryDefinition queryDef) {
        return queryOffer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryOffer(QueryOfferArgumentsDefinition argsDef, OfferQueryDefinition queryDef) {
        startField("queryOffer");

        QueryOfferArguments args = new QueryOfferArguments(_queryBuilder);
        argsDef.define(args);
        QueryOfferArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OfferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getEntryPoint(ID id, EntryPointQueryDefinition queryDef) {
        startField("getEntryPoint");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EntryPointQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryEntryPointArguments extends Arguments {
        QueryEntryPointArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryEntryPointArguments filter(EntryPointFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEntryPointArguments order(EntryPointOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEntryPointArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryEntryPointArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryEntryPointArgumentsDefinition {
        void define(QueryEntryPointArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryEntryPoint(EntryPointQueryDefinition queryDef) {
        return queryEntryPoint(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryEntryPoint(QueryEntryPointArgumentsDefinition argsDef, EntryPointQueryDefinition queryDef) {
        startField("queryEntryPoint");

        QueryEntryPointArguments args = new QueryEntryPointArguments(_queryBuilder);
        argsDef.define(args);
        QueryEntryPointArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EntryPointQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getSoftwareApplication(ID id, SoftwareApplicationQueryDefinition queryDef) {
        startField("getSoftwareApplication");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QuerySoftwareApplicationArguments extends Arguments {
        QuerySoftwareApplicationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QuerySoftwareApplicationArguments filter(SoftwareApplicationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QuerySoftwareApplicationArguments order(SoftwareApplicationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QuerySoftwareApplicationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QuerySoftwareApplicationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QuerySoftwareApplicationArgumentsDefinition {
        void define(QuerySoftwareApplicationArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery querySoftwareApplication(SoftwareApplicationQueryDefinition queryDef) {
        return querySoftwareApplication(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery querySoftwareApplication(QuerySoftwareApplicationArgumentsDefinition argsDef, SoftwareApplicationQueryDefinition queryDef) {
        startField("querySoftwareApplication");

        QuerySoftwareApplicationArguments args = new QuerySoftwareApplicationArguments(_queryBuilder);
        argsDef.define(args);
        QuerySoftwareApplicationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getWebhook(ID id, WebhookQueryDefinition queryDef) {
        startField("getWebhook");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryWebhookArguments extends Arguments {
        QueryWebhookArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryWebhookArguments filter(WebhookFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryWebhookArguments order(WebhookOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryWebhookArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryWebhookArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryWebhookArgumentsDefinition {
        void define(QueryWebhookArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryWebhook(WebhookQueryDefinition queryDef) {
        return queryWebhook(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryWebhook(QueryWebhookArgumentsDefinition argsDef, WebhookQueryDefinition queryDef) {
        startField("queryWebhook");

        QueryWebhookArguments args = new QueryWebhookArguments(_queryBuilder);
        argsDef.define(args);
        QueryWebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getCart(ID id, CartQueryDefinition queryDef) {
        startField("getCart");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryCartArguments extends Arguments {
        QueryCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryCartArguments filter(CartFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartArguments order(CartOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryCartArgumentsDefinition {
        void define(QueryCartArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryCart(CartQueryDefinition queryDef) {
        return queryCart(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryCart(QueryCartArgumentsDefinition argsDef, CartQueryDefinition queryDef) {
        startField("queryCart");

        QueryCartArguments args = new QueryCartArguments(_queryBuilder);
        argsDef.define(args);
        QueryCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getCartItem(ID id, CartItemQueryDefinition queryDef) {
        startField("getCartItem");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryCartItemArguments extends Arguments {
        QueryCartItemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryCartItemArguments filter(CartItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartItemArguments order(CartItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartItemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCartItemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryCartItemArgumentsDefinition {
        void define(QueryCartItemArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryCartItem(CartItemQueryDefinition queryDef) {
        return queryCartItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryCartItem(QueryCartItemArgumentsDefinition argsDef, CartItemQueryDefinition queryDef) {
        startField("queryCartItem");

        QueryCartItemArguments args = new QueryCartItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryCartItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getCheckout(ID id, CheckoutQueryDefinition queryDef) {
        startField("getCheckout");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryCheckoutArguments extends Arguments {
        QueryCheckoutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryCheckoutArguments filter(CheckoutFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutArguments order(CheckoutOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryCheckoutArgumentsDefinition {
        void define(QueryCheckoutArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryCheckout(CheckoutQueryDefinition queryDef) {
        return queryCheckout(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryCheckout(QueryCheckoutArgumentsDefinition argsDef, CheckoutQueryDefinition queryDef) {
        startField("queryCheckout");

        QueryCheckoutArguments args = new QueryCheckoutArguments(_queryBuilder);
        argsDef.define(args);
        QueryCheckoutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getCheckoutItem(ID id, CheckoutItemQueryDefinition queryDef) {
        startField("getCheckoutItem");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryCheckoutItemArguments extends Arguments {
        QueryCheckoutItemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryCheckoutItemArguments filter(CheckoutItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutItemArguments order(CheckoutItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutItemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryCheckoutItemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryCheckoutItemArgumentsDefinition {
        void define(QueryCheckoutItemArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryCheckoutItem(CheckoutItemQueryDefinition queryDef) {
        return queryCheckoutItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryCheckoutItem(QueryCheckoutItemArgumentsDefinition argsDef, CheckoutItemQueryDefinition queryDef) {
        startField("queryCheckoutItem");

        QueryCheckoutItemArguments args = new QueryCheckoutItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryCheckoutItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getPoder(ID id, PoderQueryDefinition queryDef) {
        startField("getPoder");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPoderArguments extends Arguments {
        QueryPoderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPoderArguments filter(PoderFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderArguments order(PoderOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPoderArgumentsDefinition {
        void define(QueryPoderArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryPoder(PoderQueryDefinition queryDef) {
        return queryPoder(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryPoder(QueryPoderArgumentsDefinition argsDef, PoderQueryDefinition queryDef) {
        startField("queryPoder");

        QueryPoderArguments args = new QueryPoderArguments(_queryBuilder);
        argsDef.define(args);
        QueryPoderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryRootQuery getPoderItem(ID id, PoderItemQueryDefinition queryDef) {
        startField("getPoderItem");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PoderItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class QueryPoderItemArguments extends Arguments {
        QueryPoderItemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public QueryPoderItemArguments filter(PoderItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderItemArguments order(PoderItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderItemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public QueryPoderItemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface QueryPoderItemArgumentsDefinition {
        void define(QueryPoderItemArguments args);
    }

    /**
    * 
    */
    public QueryRootQuery queryPoderItem(PoderItemQueryDefinition queryDef) {
        return queryPoderItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryRootQuery queryPoderItem(QueryPoderItemArgumentsDefinition argsDef, PoderItemQueryDefinition queryDef) {
        startField("queryPoderItem");

        QueryPoderItemArguments args = new QueryPoderItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryPoderItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
