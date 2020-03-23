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
* 【阅读收条】 记录每个人阅读本条消息的时间
*/
public class ReadNoteQuery extends Query<ReadNoteQuery> {
    ReadNoteQuery(StringBuilder _queryBuilder) {
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
    public ReadNoteQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReadNoteQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public ReadNoteQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ReadNoteQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ReadNoteQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ReadNoteQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public ReadNoteQuery id() {
        startField("id");

        return this;
    }

    public class IsReadNoteOfArguments extends Arguments {
        IsReadNoteOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsReadNoteOfArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public IsReadNoteOfArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IsReadNoteOfArgumentsDefinition {
        void define(IsReadNoteOfArguments args);
    }

    /**
    *     【阅读内容】 逆属性: Message.hasReadNotes    
    */
    public ReadNoteQuery isReadNoteOf(ReadableQueryDefinition queryDef) {
        return isReadNoteOf(args -> {}, queryDef);
    }

    /**
    *     【阅读内容】 逆属性: Message.hasReadNotes    
    */
    public ReadNoteQuery isReadNoteOf(IsReadNoteOfArgumentsDefinition argsDef, ReadableQueryDefinition queryDef) {
        startField("isReadNoteOf");

        IsReadNoteOfArguments args = new IsReadNoteOfArguments(_queryBuilder);
        argsDef.define(args);
        IsReadNoteOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReaderArguments extends Arguments {
        ReaderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReaderArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ReaderArgumentsDefinition {
        void define(ReaderArguments args);
    }

    /**
    *     【读者】 内容的阅读者。    
    */
    public ReadNoteQuery reader(UserQueryDefinition queryDef) {
        return reader(args -> {}, queryDef);
    }

    /**
    *     【读者】 内容的阅读者。    
    */
    public ReadNoteQuery reader(ReaderArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("reader");

        ReaderArguments args = new ReaderArguments(_queryBuilder);
        argsDef.define(args);
        ReaderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     【阅读日期】     
    */
    public ReadNoteQuery dateRead() {
        startField("dateRead");

        return this;
    }
}
