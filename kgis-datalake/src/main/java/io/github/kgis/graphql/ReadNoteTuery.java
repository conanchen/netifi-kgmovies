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
* 【阅读收条】 记录每个人阅读本条消息的时间
*/
public class ReadNoteTuery extends Tuery<ReadNoteTuery> {
    ReadNoteTuery(StringBuilder _queryBuilder) {
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
    public ReadNoteTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReadNoteTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public ReadNoteTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ReadNoteTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ReadNoteTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ReadNoteTuery description() {
        startField("description");

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
    public ReadNoteTuery isReadNoteOf(ReadableTueryDefinition queryDef) {
        return isReadNoteOf(args -> {}, queryDef);
    }

    /**
    *     【阅读内容】 逆属性: Message.hasReadNotes    
    */
    public ReadNoteTuery isReadNoteOf(IsReadNoteOfArgumentsDefinition argsDef, ReadableTueryDefinition queryDef) {
        startField("isReadNoteOf");

        IsReadNoteOfArguments args = new IsReadNoteOfArguments(_queryBuilder);
        argsDef.define(args);
        IsReadNoteOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadableTuery(_queryBuilder));
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
    public ReadNoteTuery reader(UserTueryDefinition queryDef) {
        return reader(args -> {}, queryDef);
    }

    /**
    *     【读者】 内容的阅读者。    
    */
    public ReadNoteTuery reader(ReaderArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("reader");

        ReaderArguments args = new ReaderArguments(_queryBuilder);
        argsDef.define(args);
        ReaderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     【阅读日期】    
    */
    public ReadNoteTuery dateRead() {
        startField("dateRead");

        return this;
    }
}
