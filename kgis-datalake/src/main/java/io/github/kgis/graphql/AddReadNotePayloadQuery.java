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
public class AddReadNotePayloadQuery extends Query<AddReadNotePayloadQuery> {
    AddReadNotePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ReadnoteArguments extends Arguments {
        ReadnoteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReadnoteArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReadnoteArgumentsDefinition {
        void define(ReadnoteArguments args);
    }

    /**
    * 
    */
    public AddReadNotePayloadQuery readnote(ReadNoteQueryDefinition queryDef) {
        return readnote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddReadNotePayloadQuery readnote(ReadnoteArgumentsDefinition argsDef, ReadNoteQueryDefinition queryDef) {
        startField("readnote");

        ReadnoteArguments args = new ReadnoteArguments(_queryBuilder);
        argsDef.define(args);
        ReadnoteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddReadNotePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
