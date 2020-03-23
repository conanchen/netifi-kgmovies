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
* 
*/
public class RootQueryQuery extends Query<RootQueryQuery> {
    RootQueryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public RootQueryQuery getThing(ID id, ThingQueryDefinition queryDef) {
        startField("getThing");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThingQuery(_queryBuilder));
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
    public RootQueryQuery queryThing(ThingQueryDefinition queryDef) {
        return queryThing(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryThing(QueryThingArgumentsDefinition argsDef, ThingQueryDefinition queryDef) {
        startField("queryThing");

        QueryThingArguments args = new QueryThingArguments(_queryBuilder);
        argsDef.define(args);
        QueryThingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootQueryQuery getNamespace(ID id, NamespaceQueryDefinition queryDef) {
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
    public RootQueryQuery queryNamespace(NamespaceQueryDefinition queryDef) {
        return queryNamespace(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryNamespace(QueryNamespaceArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("queryNamespace");

        QueryNamespaceArguments args = new QueryNamespaceArguments(_queryBuilder);
        argsDef.define(args);
        QueryNamespaceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
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
    public RootQueryQuery queryShoppingable(ShoppingableQueryDefinition queryDef) {
        return queryShoppingable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryShoppingable(QueryShoppingableArgumentsDefinition argsDef, ShoppingableQueryDefinition queryDef) {
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
    public RootQueryQuery queryParty(PartyQueryDefinition queryDef) {
        return queryParty(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryParty(QueryPartyArgumentsDefinition argsDef, PartyQueryDefinition queryDef) {
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
    public RootQueryQuery queryOrganization(OrganizationQueryDefinition queryDef) {
        return queryOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryOrganization(QueryOrganizationArgumentsDefinition argsDef, OrganizationQueryDefinition queryDef) {
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
    public RootQueryQuery queryPartyRole(PartyRoleQueryDefinition queryDef) {
        return queryPartyRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryPartyRole(QueryPartyRoleArgumentsDefinition argsDef, PartyRoleQueryDefinition queryDef) {
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
    public RootQueryQuery getPartyRoleName(ID id, PartyRoleNameQueryDefinition queryDef) {
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
    public RootQueryQuery queryPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        return queryPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryPartyRoleName(QueryPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameQueryDefinition queryDef) {
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
    public RootQueryQuery queryReadable(ReadableQueryDefinition queryDef) {
        return queryReadable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryReadable(QueryReadableArgumentsDefinition argsDef, ReadableQueryDefinition queryDef) {
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
    public RootQueryQuery getDataCatalog(ID id, DataCatalogQueryDefinition queryDef) {
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
    public RootQueryQuery queryDataCatalog(DataCatalogQueryDefinition queryDef) {
        return queryDataCatalog(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryDataCatalog(QueryDataCatalogArgumentsDefinition argsDef, DataCatalogQueryDefinition queryDef) {
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
    public RootQueryQuery getConversation(ID id, ConversationQueryDefinition queryDef) {
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
    public RootQueryQuery queryConversation(ConversationQueryDefinition queryDef) {
        return queryConversation(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryConversation(QueryConversationArgumentsDefinition argsDef, ConversationQueryDefinition queryDef) {
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
    public RootQueryQuery getMessage(ID id, MessageQueryDefinition queryDef) {
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
    public RootQueryQuery queryMessage(MessageQueryDefinition queryDef) {
        return queryMessage(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryMessage(QueryMessageArgumentsDefinition argsDef, MessageQueryDefinition queryDef) {
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
    public RootQueryQuery getReview(ID id, ReviewQueryDefinition queryDef) {
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
    public RootQueryQuery queryReview(ReviewQueryDefinition queryDef) {
        return queryReview(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryReview(QueryReviewArgumentsDefinition argsDef, ReviewQueryDefinition queryDef) {
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
    public RootQueryQuery getReadNote(ID id, ReadNoteQueryDefinition queryDef) {
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
    public RootQueryQuery queryReadNote(ReadNoteQueryDefinition queryDef) {
        return queryReadNote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryReadNote(QueryReadNoteArgumentsDefinition argsDef, ReadNoteQueryDefinition queryDef) {
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
    public RootQueryQuery getGeneralOrganization(ID id, GeneralOrganizationQueryDefinition queryDef) {
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
    public RootQueryQuery queryGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        return queryGeneralOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryGeneralOrganization(QueryGeneralOrganizationArgumentsDefinition argsDef, GeneralOrganizationQueryDefinition queryDef) {
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
    public RootQueryQuery getEmployeeRole(ID id, EmployeeRoleQueryDefinition queryDef) {
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
    public RootQueryQuery queryEmployeeRole(EmployeeRoleQueryDefinition queryDef) {
        return queryEmployeeRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryEmployeeRole(QueryEmployeeRoleArgumentsDefinition argsDef, EmployeeRoleQueryDefinition queryDef) {
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
    public RootQueryQuery getFollowerRole(ID id, FollowerRoleQueryDefinition queryDef) {
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
    public RootQueryQuery queryFollowerRole(FollowerRoleQueryDefinition queryDef) {
        return queryFollowerRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryFollowerRole(QueryFollowerRoleArgumentsDefinition argsDef, FollowerRoleQueryDefinition queryDef) {
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
    public RootQueryQuery getMemberRole(ID id, MemberRoleQueryDefinition queryDef) {
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
    public RootQueryQuery queryMemberRole(MemberRoleQueryDefinition queryDef) {
        return queryMemberRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryMemberRole(QueryMemberRoleArgumentsDefinition argsDef, MemberRoleQueryDefinition queryDef) {
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
    public RootQueryQuery getOwnership(ID id, OwnershipQueryDefinition queryDef) {
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
    public RootQueryQuery queryOwnership(OwnershipQueryDefinition queryDef) {
        return queryOwnership(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryOwnership(QueryOwnershipArgumentsDefinition argsDef, OwnershipQueryDefinition queryDef) {
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
    public RootQueryQuery getUser(UserQueryDefinition queryDef) {
        return getUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery getUser(GetUserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
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
    public RootQueryQuery queryUser(UserQueryDefinition queryDef) {
        return queryUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryUser(QueryUserArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
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
    public RootQueryQuery getPerson(ID id, PersonQueryDefinition queryDef) {
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
    public RootQueryQuery queryPerson(PersonQueryDefinition queryDef) {
        return queryPerson(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryPerson(QueryPersonArgumentsDefinition argsDef, PersonQueryDefinition queryDef) {
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
    public RootQueryQuery getStore(ID id, StoreQueryDefinition queryDef) {
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
    public RootQueryQuery queryStore(StoreQueryDefinition queryDef) {
        return queryStore(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryStore(QueryStoreArgumentsDefinition argsDef, StoreQueryDefinition queryDef) {
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
    public RootQueryQuery getProduct(ID id, ProductQueryDefinition queryDef) {
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
    public RootQueryQuery queryProduct(ProductQueryDefinition queryDef) {
        return queryProduct(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryProduct(QueryProductArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
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
    public RootQueryQuery getProductModel(ID id, ProductModelQueryDefinition queryDef) {
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
    public RootQueryQuery queryProductModel(ProductModelQueryDefinition queryDef) {
        return queryProductModel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryProductModel(QueryProductModelArgumentsDefinition argsDef, ProductModelQueryDefinition queryDef) {
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
    public RootQueryQuery getOffer(ID id, OfferQueryDefinition queryDef) {
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
    public RootQueryQuery queryOffer(OfferQueryDefinition queryDef) {
        return queryOffer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryOffer(QueryOfferArgumentsDefinition argsDef, OfferQueryDefinition queryDef) {
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
    public RootQueryQuery getEntryPoint(ID id, EntryPointQueryDefinition queryDef) {
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
    public RootQueryQuery queryEntryPoint(EntryPointQueryDefinition queryDef) {
        return queryEntryPoint(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryEntryPoint(QueryEntryPointArgumentsDefinition argsDef, EntryPointQueryDefinition queryDef) {
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
    public RootQueryQuery getSoftwareApplication(ID id, SoftwareApplicationQueryDefinition queryDef) {
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
    public RootQueryQuery querySoftwareApplication(SoftwareApplicationQueryDefinition queryDef) {
        return querySoftwareApplication(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery querySoftwareApplication(QuerySoftwareApplicationArgumentsDefinition argsDef, SoftwareApplicationQueryDefinition queryDef) {
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
    public RootQueryQuery getWebhook(ID id, WebhookQueryDefinition queryDef) {
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
    public RootQueryQuery queryWebhook(WebhookQueryDefinition queryDef) {
        return queryWebhook(args -> {}, queryDef);
    }

    /**
    * 
    */
    public RootQueryQuery queryWebhook(QueryWebhookArgumentsDefinition argsDef, WebhookQueryDefinition queryDef) {
        startField("queryWebhook");

        QueryWebhookArguments args = new QueryWebhookArguments(_queryBuilder);
        argsDef.define(args);
        QueryWebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
