// Generated from graphql_java_gen gem  with template Tuery.java.erb

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
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
public class QueryTuery extends Tuery<QueryTuery> {
    QueryTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public QueryTuery getNode(ID id, NodeTueryDefinition queryDef) {
        startField("getNode");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NodeTuery(_queryBuilder));
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
    public QueryTuery queryNode(NodeTueryDefinition queryDef) {
        return queryNode(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryNode(QueryNodeArgumentsDefinition argsDef, NodeTueryDefinition queryDef) {
        startField("queryNode");

        QueryNodeArguments args = new QueryNodeArguments(_queryBuilder);
        argsDef.define(args);
        QueryNodeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NodeTuery(_queryBuilder));
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
    public QueryTuery queryThing(ThingTueryDefinition queryDef) {
        return queryThing(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryThing(QueryThingArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("queryThing");

        QueryThingArguments args = new QueryThingArguments(_queryBuilder);
        argsDef.define(args);
        QueryThingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
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
    public QueryTuery queryShoppingable(ShoppingableTueryDefinition queryDef) {
        return queryShoppingable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryShoppingable(QueryShoppingableArgumentsDefinition argsDef, ShoppingableTueryDefinition queryDef) {
        startField("queryShoppingable");

        QueryShoppingableArguments args = new QueryShoppingableArguments(_queryBuilder);
        argsDef.define(args);
        QueryShoppingableArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableTuery(_queryBuilder));
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
    public QueryTuery queryParty(PartyTueryDefinition queryDef) {
        return queryParty(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryParty(QueryPartyArgumentsDefinition argsDef, PartyTueryDefinition queryDef) {
        startField("queryParty");

        QueryPartyArguments args = new QueryPartyArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
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
    public QueryTuery queryOrganization(OrganizationTueryDefinition queryDef) {
        return queryOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryOrganization(QueryOrganizationArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
        startField("queryOrganization");

        QueryOrganizationArguments args = new QueryOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        QueryOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
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
    public QueryTuery queryPartyRole(PartyRoleTueryDefinition queryDef) {
        return queryPartyRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryPartyRole(QueryPartyRoleArgumentsDefinition argsDef, PartyRoleTueryDefinition queryDef) {
        startField("queryPartyRole");

        QueryPartyRoleArguments args = new QueryPartyRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getNamespace(ID id, NamespaceTueryDefinition queryDef) {
        startField("getNamespace");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
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
    public QueryTuery queryNamespace(NamespaceTueryDefinition queryDef) {
        return queryNamespace(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryNamespace(QueryNamespaceArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("queryNamespace");

        QueryNamespaceArguments args = new QueryNamespaceArguments(_queryBuilder);
        argsDef.define(args);
        QueryNamespaceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getPartyRoleName(ID id, PartyRoleNameTueryDefinition queryDef) {
        startField("getPartyRoleName");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
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
    public QueryTuery queryPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        return queryPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryPartyRoleName(QueryPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("queryPartyRoleName");

        QueryPartyRoleNameArguments args = new QueryPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        QueryPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
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
    public QueryTuery queryReadable(ReadableTueryDefinition queryDef) {
        return queryReadable(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryReadable(QueryReadableArgumentsDefinition argsDef, ReadableTueryDefinition queryDef) {
        startField("queryReadable");

        QueryReadableArguments args = new QueryReadableArguments(_queryBuilder);
        argsDef.define(args);
        QueryReadableArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadableTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getDataCatalog(ID id, DataCatalogTueryDefinition queryDef) {
        startField("getDataCatalog");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
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
    public QueryTuery queryDataCatalog(DataCatalogTueryDefinition queryDef) {
        return queryDataCatalog(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryDataCatalog(QueryDataCatalogArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("queryDataCatalog");

        QueryDataCatalogArguments args = new QueryDataCatalogArguments(_queryBuilder);
        argsDef.define(args);
        QueryDataCatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getConversation(ID id, ConversationTueryDefinition queryDef) {
        startField("getConversation");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
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
    public QueryTuery queryConversation(ConversationTueryDefinition queryDef) {
        return queryConversation(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryConversation(QueryConversationArgumentsDefinition argsDef, ConversationTueryDefinition queryDef) {
        startField("queryConversation");

        QueryConversationArguments args = new QueryConversationArguments(_queryBuilder);
        argsDef.define(args);
        QueryConversationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getMessage(ID id, MessageTueryDefinition queryDef) {
        startField("getMessage");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MessageTuery(_queryBuilder));
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
    public QueryTuery queryMessage(MessageTueryDefinition queryDef) {
        return queryMessage(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryMessage(QueryMessageArgumentsDefinition argsDef, MessageTueryDefinition queryDef) {
        startField("queryMessage");

        QueryMessageArguments args = new QueryMessageArguments(_queryBuilder);
        argsDef.define(args);
        QueryMessageArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getReview(ID id, ReviewTueryDefinition queryDef) {
        startField("getReview");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReviewTuery(_queryBuilder));
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
    public QueryTuery queryReview(ReviewTueryDefinition queryDef) {
        return queryReview(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryReview(QueryReviewArgumentsDefinition argsDef, ReviewTueryDefinition queryDef) {
        startField("queryReview");

        QueryReviewArguments args = new QueryReviewArguments(_queryBuilder);
        argsDef.define(args);
        QueryReviewArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getReadNote(ID id, ReadNoteTueryDefinition queryDef) {
        startField("getReadNote");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
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
    public QueryTuery queryReadNote(ReadNoteTueryDefinition queryDef) {
        return queryReadNote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryReadNote(QueryReadNoteArgumentsDefinition argsDef, ReadNoteTueryDefinition queryDef) {
        startField("queryReadNote");

        QueryReadNoteArguments args = new QueryReadNoteArguments(_queryBuilder);
        argsDef.define(args);
        QueryReadNoteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getGeneralOrganization(ID id, GeneralOrganizationTueryDefinition queryDef) {
        startField("getGeneralOrganization");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
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
    public QueryTuery queryGeneralOrganization(GeneralOrganizationTueryDefinition queryDef) {
        return queryGeneralOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryGeneralOrganization(QueryGeneralOrganizationArgumentsDefinition argsDef, GeneralOrganizationTueryDefinition queryDef) {
        startField("queryGeneralOrganization");

        QueryGeneralOrganizationArguments args = new QueryGeneralOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        QueryGeneralOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getEmployeeRole(ID id, EmployeeRoleTueryDefinition queryDef) {
        startField("getEmployeeRole");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
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
    public QueryTuery queryEmployeeRole(EmployeeRoleTueryDefinition queryDef) {
        return queryEmployeeRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryEmployeeRole(QueryEmployeeRoleArgumentsDefinition argsDef, EmployeeRoleTueryDefinition queryDef) {
        startField("queryEmployeeRole");

        QueryEmployeeRoleArguments args = new QueryEmployeeRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryEmployeeRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getFollowerRole(ID id, FollowerRoleTueryDefinition queryDef) {
        startField("getFollowerRole");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
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
    public QueryTuery queryFollowerRole(FollowerRoleTueryDefinition queryDef) {
        return queryFollowerRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryFollowerRole(QueryFollowerRoleArgumentsDefinition argsDef, FollowerRoleTueryDefinition queryDef) {
        startField("queryFollowerRole");

        QueryFollowerRoleArguments args = new QueryFollowerRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryFollowerRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getMemberRole(ID id, MemberRoleTueryDefinition queryDef) {
        startField("getMemberRole");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleTuery(_queryBuilder));
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
    public QueryTuery queryMemberRole(MemberRoleTueryDefinition queryDef) {
        return queryMemberRole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryMemberRole(QueryMemberRoleArgumentsDefinition argsDef, MemberRoleTueryDefinition queryDef) {
        startField("queryMemberRole");

        QueryMemberRoleArguments args = new QueryMemberRoleArguments(_queryBuilder);
        argsDef.define(args);
        QueryMemberRoleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getOwnership(ID id, OwnershipTueryDefinition queryDef) {
        startField("getOwnership");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
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
    public QueryTuery queryOwnership(OwnershipTueryDefinition queryDef) {
        return queryOwnership(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryOwnership(QueryOwnershipArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
        startField("queryOwnership");

        QueryOwnershipArguments args = new QueryOwnershipArguments(_queryBuilder);
        argsDef.define(args);
        QueryOwnershipArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
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
                Tuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * 
        */
        public GetUserArguments username(String value) {
            if (value != null) {
                startArgument("username");
                Tuery.appendQuotedString(_queryBuilder, value.toString());
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
    public QueryTuery getUser(UserTueryDefinition queryDef) {
        return getUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery getUser(GetUserArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("getUser");

        GetUserArguments args = new GetUserArguments(_queryBuilder);
        argsDef.define(args);
        GetUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
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
    public QueryTuery queryUser(UserTueryDefinition queryDef) {
        return queryUser(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryUser(QueryUserArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("queryUser");

        QueryUserArguments args = new QueryUserArguments(_queryBuilder);
        argsDef.define(args);
        QueryUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getPerson(ID id, PersonTueryDefinition queryDef) {
        startField("getPerson");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PersonTuery(_queryBuilder));
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
    public QueryTuery queryPerson(PersonTueryDefinition queryDef) {
        return queryPerson(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryPerson(QueryPersonArgumentsDefinition argsDef, PersonTueryDefinition queryDef) {
        startField("queryPerson");

        QueryPersonArguments args = new QueryPersonArguments(_queryBuilder);
        argsDef.define(args);
        QueryPersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getStore(ID id, StoreTueryDefinition queryDef) {
        startField("getStore");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StoreTuery(_queryBuilder));
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
    public QueryTuery queryStore(StoreTueryDefinition queryDef) {
        return queryStore(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryStore(QueryStoreArgumentsDefinition argsDef, StoreTueryDefinition queryDef) {
        startField("queryStore");

        QueryStoreArguments args = new QueryStoreArguments(_queryBuilder);
        argsDef.define(args);
        QueryStoreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getProduct(ID id, ProductTueryDefinition queryDef) {
        startField("getProduct");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductTuery(_queryBuilder));
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
    public QueryTuery queryProduct(ProductTueryDefinition queryDef) {
        return queryProduct(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryProduct(QueryProductArgumentsDefinition argsDef, ProductTueryDefinition queryDef) {
        startField("queryProduct");

        QueryProductArguments args = new QueryProductArguments(_queryBuilder);
        argsDef.define(args);
        QueryProductArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getProductModel(ID id, ProductModelTueryDefinition queryDef) {
        startField("getProductModel");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductModelTuery(_queryBuilder));
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
    public QueryTuery queryProductModel(ProductModelTueryDefinition queryDef) {
        return queryProductModel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryProductModel(QueryProductModelArgumentsDefinition argsDef, ProductModelTueryDefinition queryDef) {
        startField("queryProductModel");

        QueryProductModelArguments args = new QueryProductModelArguments(_queryBuilder);
        argsDef.define(args);
        QueryProductModelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getOffer(ID id, OfferTueryDefinition queryDef) {
        startField("getOffer");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OfferTuery(_queryBuilder));
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
    public QueryTuery queryOffer(OfferTueryDefinition queryDef) {
        return queryOffer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryOffer(QueryOfferArgumentsDefinition argsDef, OfferTueryDefinition queryDef) {
        startField("queryOffer");

        QueryOfferArguments args = new QueryOfferArguments(_queryBuilder);
        argsDef.define(args);
        QueryOfferArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OfferTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getEntryPoint(ID id, EntryPointTueryDefinition queryDef) {
        startField("getEntryPoint");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EntryPointTuery(_queryBuilder));
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
    public QueryTuery queryEntryPoint(EntryPointTueryDefinition queryDef) {
        return queryEntryPoint(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryEntryPoint(QueryEntryPointArgumentsDefinition argsDef, EntryPointTueryDefinition queryDef) {
        startField("queryEntryPoint");

        QueryEntryPointArguments args = new QueryEntryPointArguments(_queryBuilder);
        argsDef.define(args);
        QueryEntryPointArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EntryPointTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getSoftwareApplication(ID id, SoftwareApplicationTueryDefinition queryDef) {
        startField("getSoftwareApplication");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationTuery(_queryBuilder));
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
    public QueryTuery querySoftwareApplication(SoftwareApplicationTueryDefinition queryDef) {
        return querySoftwareApplication(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery querySoftwareApplication(QuerySoftwareApplicationArgumentsDefinition argsDef, SoftwareApplicationTueryDefinition queryDef) {
        startField("querySoftwareApplication");

        QuerySoftwareApplicationArguments args = new QuerySoftwareApplicationArguments(_queryBuilder);
        argsDef.define(args);
        QuerySoftwareApplicationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getWebhook(ID id, WebhookTueryDefinition queryDef) {
        startField("getWebhook");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookTuery(_queryBuilder));
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
    public QueryTuery queryWebhook(WebhookTueryDefinition queryDef) {
        return queryWebhook(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryWebhook(QueryWebhookArgumentsDefinition argsDef, WebhookTueryDefinition queryDef) {
        startField("queryWebhook");

        QueryWebhookArguments args = new QueryWebhookArguments(_queryBuilder);
        argsDef.define(args);
        QueryWebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getCart(ID id, CartTueryDefinition queryDef) {
        startField("getCart");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartTuery(_queryBuilder));
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
    public QueryTuery queryCart(CartTueryDefinition queryDef) {
        return queryCart(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryCart(QueryCartArgumentsDefinition argsDef, CartTueryDefinition queryDef) {
        startField("queryCart");

        QueryCartArguments args = new QueryCartArguments(_queryBuilder);
        argsDef.define(args);
        QueryCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getCartItem(ID id, CartItemTueryDefinition queryDef) {
        startField("getCartItem");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartItemTuery(_queryBuilder));
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
    public QueryTuery queryCartItem(CartItemTueryDefinition queryDef) {
        return queryCartItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryCartItem(QueryCartItemArgumentsDefinition argsDef, CartItemTueryDefinition queryDef) {
        startField("queryCartItem");

        QueryCartItemArguments args = new QueryCartItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryCartItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getCheckout(ID id, CheckoutTueryDefinition queryDef) {
        startField("getCheckout");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutTuery(_queryBuilder));
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
    public QueryTuery queryCheckout(CheckoutTueryDefinition queryDef) {
        return queryCheckout(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryCheckout(QueryCheckoutArgumentsDefinition argsDef, CheckoutTueryDefinition queryDef) {
        startField("queryCheckout");

        QueryCheckoutArguments args = new QueryCheckoutArguments(_queryBuilder);
        argsDef.define(args);
        QueryCheckoutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getCheckoutItem(ID id, CheckoutItemTueryDefinition queryDef) {
        startField("getCheckoutItem");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
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
    public QueryTuery queryCheckoutItem(CheckoutItemTueryDefinition queryDef) {
        return queryCheckoutItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryCheckoutItem(QueryCheckoutItemArgumentsDefinition argsDef, CheckoutItemTueryDefinition queryDef) {
        startField("queryCheckoutItem");

        QueryCheckoutItemArguments args = new QueryCheckoutItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryCheckoutItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getPoder(ID id, PoderTueryDefinition queryDef) {
        startField("getPoder");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PoderTuery(_queryBuilder));
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
    public QueryTuery queryPoder(PoderTueryDefinition queryDef) {
        return queryPoder(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryPoder(QueryPoderArgumentsDefinition argsDef, PoderTueryDefinition queryDef) {
        startField("queryPoder");

        QueryPoderArguments args = new QueryPoderArguments(_queryBuilder);
        argsDef.define(args);
        QueryPoderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public QueryTuery getPoderItem(ID id, PoderItemTueryDefinition queryDef) {
        startField("getPoderItem");

        _queryBuilder.append("(id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PoderItemTuery(_queryBuilder));
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
    public QueryTuery queryPoderItem(PoderItemTueryDefinition queryDef) {
        return queryPoderItem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public QueryTuery queryPoderItem(QueryPoderItemArgumentsDefinition argsDef, PoderItemTueryDefinition queryDef) {
        startField("queryPoderItem");

        QueryPoderItemArguments args = new QueryPoderItemArguments(_queryBuilder);
        argsDef.define(args);
        QueryPoderItemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
