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
public class AddReadNotePayloadTuery extends Tuery<AddReadNotePayloadTuery> {
    AddReadNotePayloadTuery(StringBuilder _queryBuilder) {
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
    public AddReadNotePayloadTuery readnote(ReadNoteTueryDefinition queryDef) {
        return readnote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddReadNotePayloadTuery readnote(ReadnoteArgumentsDefinition argsDef, ReadNoteTueryDefinition queryDef) {
        startField("readnote");

        ReadnoteArguments args = new ReadnoteArguments(_queryBuilder);
        argsDef.define(args);
        ReadnoteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddReadNotePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
