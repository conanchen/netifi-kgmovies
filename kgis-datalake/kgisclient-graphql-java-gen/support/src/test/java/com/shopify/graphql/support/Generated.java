// Generated from graphql_java_gen gem

package com.shopify.graphql.support;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import com.shopify.graphql.support.Nullable;

import java.time.LocalDateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Generated {
    public static QueryTuery query(QueryTueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("{");
        QueryTuery query = new QueryTuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static class TueryResponse {
        private TopLevelResponse response;
        private TueryRoot data;

        public TueryResponse(TopLevelResponse response) throws SchemaViolationError {
            this.response = response;
            this.data = response.getData() != null ? new TueryRoot(response.getData()) : null;
        }

        public TueryRoot getData() {
            return data;
        }

        public List<Error> getErrors() {
            return response.getErrors();
        }

        public String toJson() {
            return new Gson().toJson(response);
        }

        public String prettyPrintJson() {
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(response);
        }

        public static TueryResponse fromJson(String json) throws SchemaViolationError {
            final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
            return new TueryResponse(response);
        }
    }

    public static MutationTuery mutation(MutationTueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("mutation{");
        MutationTuery query = new MutationTuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static class MutationResponse {
        private TopLevelResponse response;
        private Mutation data;

        public MutationResponse(TopLevelResponse response) throws SchemaViolationError {
            this.response = response;
            this.data = response.getData() != null ? new Mutation(response.getData()) : null;
        }

        public Mutation getData() {
            return data;
        }

        public List<Error> getErrors() {
            return response.getErrors();
        }

        public String toJson() {
            return new Gson().toJson(response);
        }

        public String prettyPrintJson() {
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(response);
        }

        public static MutationResponse fromJson(String json) throws SchemaViolationError {
            final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
            return new MutationResponse(response);
        }
    }

    public interface EntryTueryDefinition {
        void define(EntryTuery _queryBuilder);
    }

    public static class EntryTuery extends Tuery<EntryTuery> {
        EntryTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);

            startField("__typename");
        }

        public EntryTuery key() {
            startField("key");

            return this;
        }

        public EntryTuery ttl() {
            startField("ttl");

            return this;
        }

        public EntryTuery onIntegerEntry(IntegerEntryTueryDefinition queryDef) {
            startInlineFragment("IntegerEntry");
            queryDef.define(new IntegerEntryTuery(_queryBuilder));
            _queryBuilder.append('}');
            return this;
        }

        public EntryTuery onStringEntry(StringEntryTueryDefinition queryDef) {
            startInlineFragment("StringEntry");
            queryDef.define(new StringEntryTuery(_queryBuilder));
            _queryBuilder.append('}');
            return this;
        }
    }

    public interface Entry {
        String getGraphQlTypeName();

        String getKey();

        LocalDateTime getTtl();
    }

    public static class UnknownEntry extends AbstractResponse<UnknownEntry> implements Entry {
        public UnknownEntry() {
        }

        public UnknownEntry(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "key": {
                        responseData.put(key, jsonAsString(field.getValue(), key));

                        break;
                    }

                    case "ttl": {
                        LocalDateTime optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = LocalDateTime.parse(jsonAsString(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public static Entry create(JsonObject fields) throws SchemaViolationError {
            String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
            switch (typeName) {
                case "IntegerEntry": {
                    return new IntegerEntry(fields);
                }

                case "StringEntry": {
                    return new StringEntry(fields);
                }

                default: {
                    return new UnknownEntry(fields);
                }
            }
        }

        public String getGraphQlTypeName() {
            return (String) get("__typename");
        }

        public String getKey() {
            return (String) get("key");
        }

        public UnknownEntry setKey(String arg) {
            optimisticData.put(getKey("key"), arg);
            return this;
        }

        @Nullable
        public LocalDateTime getTtl() {
            return (LocalDateTime) get("ttl");
        }

        public UnknownEntry setTtl(LocalDateTime arg) {
            optimisticData.put(getKey("ttl"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "key": return false;

                case "ttl": return false;

                default: return false;
            }
        }
    }

    public interface EntryUnionTueryDefinition {
        void define(EntryUnionTuery _queryBuilder);
    }

    public static class EntryUnionTuery extends Tuery<EntryUnionTuery> {
        EntryUnionTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);

            startField("__typename");
        }

        public EntryUnionTuery onIntegerEntry(IntegerEntryTueryDefinition queryDef) {
            startInlineFragment("IntegerEntry");
            queryDef.define(new IntegerEntryTuery(_queryBuilder));
            _queryBuilder.append('}');
            return this;
        }

        public EntryUnionTuery onStringEntry(StringEntryTueryDefinition queryDef) {
            startInlineFragment("StringEntry");
            queryDef.define(new StringEntryTuery(_queryBuilder));
            _queryBuilder.append('}');
            return this;
        }
    }

    public interface EntryUnion {
        String getGraphQlTypeName();
    }

    public static class UnknownEntryUnion extends AbstractResponse<UnknownEntryUnion> implements EntryUnion {
        public UnknownEntryUnion() {
        }

        public UnknownEntryUnion(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public static EntryUnion create(JsonObject fields) throws SchemaViolationError {
            String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
            switch (typeName) {
                case "IntegerEntry": {
                    return new IntegerEntry(fields);
                }

                case "StringEntry": {
                    return new StringEntry(fields);
                }

                default: {
                    return new UnknownEntryUnion(fields);
                }
            }
        }

        public String getGraphQlTypeName() {
            return (String) get("__typename");
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                default: return false;
            }
        }
    }

    public interface IntegerEntryTueryDefinition {
        void define(IntegerEntryTuery _queryBuilder);
    }

    public static class IntegerEntryTuery extends Tuery<IntegerEntryTuery> {
        IntegerEntryTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);
        }

        public IntegerEntryTuery key() {
            startField("key");

            return this;
        }

        public IntegerEntryTuery ttl() {
            startField("ttl");

            return this;
        }

        public IntegerEntryTuery value() {
            startField("value");

            return this;
        }
    }

    public static class IntegerEntry extends AbstractResponse<IntegerEntry> implements Entry, EntryUnion {
        public IntegerEntry() {
        }

        public IntegerEntry(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "key": {
                        responseData.put(key, jsonAsString(field.getValue(), key));

                        break;
                    }

                    case "ttl": {
                        LocalDateTime optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = LocalDateTime.parse(jsonAsString(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "value": {
                        responseData.put(key, jsonAsInteger(field.getValue(), key));

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public String getGraphQlTypeName() {
            return "IntegerEntry";
        }

        public String getKey() {
            return (String) get("key");
        }

        public IntegerEntry setKey(String arg) {
            optimisticData.put(getKey("key"), arg);
            return this;
        }

        @Nullable
        public LocalDateTime getTtl() {
            return (LocalDateTime) get("ttl");
        }

        public IntegerEntry setTtl(LocalDateTime arg) {
            optimisticData.put(getKey("ttl"), arg);
            return this;
        }

        public Integer getValue() {
            return (Integer) get("value");
        }

        public IntegerEntry setValue(Integer arg) {
            optimisticData.put(getKey("value"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "key": return false;

                case "ttl": return false;

                case "value": return false;

                default: return false;
            }
        }
    }

    /**
    * Types of values that can be stored in a key
    */
    public enum KeyType {
        INTEGER,

        STRING,

        UNKNOWN_VALUE;

        public static KeyType fromGraphQl(String value) {
            if (value == null) {
                return null;
            }

            switch (value) {
                case "INTEGER": {
                    return INTEGER;
                }

                case "STRING": {
                    return STRING;
                }

                default: {
                    return UNKNOWN_VALUE;
                }
            }
        }
        public String toString() {
            switch (this) {
                case INTEGER: {
                    return "INTEGER";
                }

                case STRING: {
                    return "STRING";
                }

                default: {
                    return "";
                }
            }
        }
    }

    public interface MutationTueryDefinition {
        void define(MutationTuery _queryBuilder);
    }

    public static class MutationTuery extends Tuery<MutationTuery> {
        MutationTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);
        }

        public MutationTuery setInteger(SetIntegerInput input) {
            startField("set_integer");

            _queryBuilder.append("(input:");
            input.appendTo(_queryBuilder);

            _queryBuilder.append(')');

            return this;
        }

        public MutationTuery setString(String key, String value) {
            startField("set_string");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(",value:");
            Tuery.appendQuotedString(_queryBuilder, value.toString());

            _queryBuilder.append(')');

            return this;
        }

        public class SetStringWithDefaultArguments extends Arguments {
            SetStringWithDefaultArguments(StringBuilder _queryBuilder) {
                super(_queryBuilder, false);
            }

            public SetStringWithDefaultArguments value(String value) {
                if (value != null) {
                    startArgument("value");
                    Tuery.appendQuotedString(_queryBuilder, value.toString());
                }
                return this;
            }
        }

        public interface SetStringWithDefaultArgumentsDefinition {
            void define(SetStringWithDefaultArguments args);
        }

        public MutationTuery setStringWithDefault(String key) {
            return setStringWithDefault(key, args -> {});
        }

        public MutationTuery setStringWithDefault(String key, SetStringWithDefaultArgumentsDefinition argsDef) {
            startField("set_string_with_default");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            argsDef.define(new SetStringWithDefaultArguments(_queryBuilder));

            _queryBuilder.append(')');

            return this;
        }

        public String toString() {
            return _queryBuilder.toString();
        }
    }

    public static class Mutation extends AbstractResponse<Mutation> {
        public Mutation() {
        }

        public Mutation(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "set_integer": {
                        responseData.put(key, jsonAsBoolean(field.getValue(), key));

                        break;
                    }

                    case "set_string": {
                        responseData.put(key, jsonAsBoolean(field.getValue(), key));

                        break;
                    }

                    case "set_string_with_default": {
                        responseData.put(key, jsonAsBoolean(field.getValue(), key));

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public String getGraphQlTypeName() {
            return "Mutation";
        }

        public Boolean getSetInteger() {
            return (Boolean) get("set_integer");
        }

        public Mutation setSetInteger(Boolean arg) {
            optimisticData.put(getKey("set_integer"), arg);
            return this;
        }

        public Boolean getSetString() {
            return (Boolean) get("set_string");
        }

        public Mutation setSetString(Boolean arg) {
            optimisticData.put(getKey("set_string"), arg);
            return this;
        }

        public Boolean getSetStringWithDefault() {
            return (Boolean) get("set_string_with_default");
        }

        public Mutation setSetStringWithDefault(Boolean arg) {
            optimisticData.put(getKey("set_string_with_default"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "set_integer": return false;

                case "set_string": return false;

                case "set_string_with_default": return false;

                default: return false;
            }
        }
    }

    public interface QueryTueryDefinition {
        void define(QueryTuery _queryBuilder);
    }

    public static class QueryTuery extends Tuery<QueryTuery> {
        QueryTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);
        }

        public class EntriesArguments extends Arguments {
            EntriesArguments(StringBuilder _queryBuilder) {
                super(_queryBuilder, false);
            }

            public EntriesArguments after(String value) {
                if (value != null) {
                    startArgument("after");
                    Tuery.appendQuotedString(_queryBuilder, value.toString());
                }
                return this;
            }
        }

        public interface EntriesArgumentsDefinition {
            void define(EntriesArguments args);
        }

        public QueryTuery entries(int first, EntryTueryDefinition queryDef) {
            return entries(first, args -> {}, queryDef);
        }

        public QueryTuery entries(int first, EntriesArgumentsDefinition argsDef, EntryTueryDefinition queryDef) {
            startField("entries");

            _queryBuilder.append("(first:");
            _queryBuilder.append(first);

            argsDef.define(new EntriesArguments(_queryBuilder));

            _queryBuilder.append(')');

            _queryBuilder.append('{');
            queryDef.define(new EntryTuery(_queryBuilder));
            _queryBuilder.append('}');

            return this;
        }

        /**
        * Get an entry of any type with the given key
        */
        public QueryTuery entry(String key, EntryTueryDefinition queryDef) {
            startField("entry");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            _queryBuilder.append('{');
            queryDef.define(new EntryTuery(_queryBuilder));
            _queryBuilder.append('}');

            return this;
        }

        /**
        * Get an entry of any type with the given key as a union
        */
        public QueryTuery entryUnion(String key, EntryUnionTueryDefinition queryDef) {
            startField("entry_union");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            _queryBuilder.append('{');
            queryDef.define(new EntryUnionTuery(_queryBuilder));
            _queryBuilder.append('}');

            return this;
        }

        /**
        * Get a integer value with the given key
        */
        public QueryTuery integer(String key) {
            startField("integer");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            return this;
        }

        public class KeysArguments extends Arguments {
            KeysArguments(StringBuilder _queryBuilder) {
                super(_queryBuilder, false);
            }

            public KeysArguments after(String value) {
                if (value != null) {
                    startArgument("after");
                    Tuery.appendQuotedString(_queryBuilder, value.toString());
                }
                return this;
            }

            public KeysArguments type(KeyType value) {
                if (value != null) {
                    startArgument("type");
                    _queryBuilder.append(value.toString());
                }
                return this;
            }
        }

        public interface KeysArgumentsDefinition {
            void define(KeysArguments args);
        }

        public QueryTuery keys(int first) {
            return keys(first, args -> {});
        }

        public QueryTuery keys(int first, KeysArgumentsDefinition argsDef) {
            startField("keys");

            _queryBuilder.append("(first:");
            _queryBuilder.append(first);

            argsDef.define(new KeysArguments(_queryBuilder));

            _queryBuilder.append(')');

            return this;
        }

        /**
        * Get a string value with the given key
        */
        public QueryTuery string(String key) {
            startField("string");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            return this;
        }

        public QueryTuery ttl(String key) {
            startField("ttl");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            return this;
        }

        public QueryTuery type(String key) {
            startField("type");

            _queryBuilder.append("(key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(')');

            return this;
        }

        public QueryTuery version() {
            startField("version");

            return this;
        }

        public String toString() {
            return _queryBuilder.toString();
        }
    }

    public static class TueryRoot extends AbstractResponse<TueryRoot> {
        public TueryRoot() {
        }

        public TueryRoot(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "entries": {
                        List<Entry> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(UnknownEntry.create(jsonAsObject(element1, key)));
                        }

                        responseData.put(key, list1);

                        break;
                    }

                    case "entry": {
                        Entry optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = UnknownEntry.create(jsonAsObject(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "entry_union": {
                        EntryUnion optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = UnknownEntryUnion.create(jsonAsObject(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "integer": {
                        Integer optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = jsonAsInteger(field.getValue(), key);
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "keys": {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        responseData.put(key, list1);

                        break;
                    }

                    case "string": {
                        String optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = jsonAsString(field.getValue(), key);
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "ttl": {
                        LocalDateTime optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = LocalDateTime.parse(jsonAsString(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "type": {
                        KeyType optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = KeyType.fromGraphQl(jsonAsString(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "version": {
                        String optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = jsonAsString(field.getValue(), key);
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public String getGraphQlTypeName() {
            return "TueryRoot";
        }

        public List<Entry> getEntries() {
            return (List<Entry>) get("entries");
        }

        public TueryRoot setEntries(List<Entry> arg) {
            optimisticData.put(getKey("entries"), arg);
            return this;
        }

        /**
        * Get an entry of any type with the given key
        */
        @Nullable
        public Entry getEntry() {
            return (Entry) get("entry");
        }

        public TueryRoot setEntry(Entry arg) {
            optimisticData.put(getKey("entry"), arg);
            return this;
        }

        /**
        * Get an entry of any type with the given key as a union
        */
        @Nullable
        public EntryUnion getEntryUnion() {
            return (EntryUnion) get("entry_union");
        }

        public TueryRoot setEntryUnion(EntryUnion arg) {
            optimisticData.put(getKey("entry_union"), arg);
            return this;
        }

        /**
        * Get a integer value with the given key
        */
        @Nullable
        public Integer getInteger() {
            return (Integer) get("integer");
        }

        public TueryRoot setInteger(Integer arg) {
            optimisticData.put(getKey("integer"), arg);
            return this;
        }

        public List<String> getKeys() {
            return (List<String>) get("keys");
        }

        public TueryRoot setKeys(List<String> arg) {
            optimisticData.put(getKey("keys"), arg);
            return this;
        }

        /**
        * Get a string value with the given key
        */
        @Nullable
        public String getString() {
            return (String) get("string");
        }

        public TueryRoot setString(String arg) {
            optimisticData.put(getKey("string"), arg);
            return this;
        }

        @Nullable
        public LocalDateTime getTtl() {
            return (LocalDateTime) get("ttl");
        }

        public TueryRoot setTtl(LocalDateTime arg) {
            optimisticData.put(getKey("ttl"), arg);
            return this;
        }

        @Nullable
        public KeyType getType() {
            return (KeyType) get("type");
        }

        public TueryRoot setType(KeyType arg) {
            optimisticData.put(getKey("type"), arg);
            return this;
        }

        @Nullable
        public String getVersion() {
            return (String) get("version");
        }

        public TueryRoot setVersion(String arg) {
            optimisticData.put(getKey("version"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "entries": return false;

                case "entry": return false;

                case "entry_union": return false;

                case "integer": return false;

                case "keys": return false;

                case "string": return false;

                case "ttl": return false;

                case "type": return false;

                case "version": return false;

                default: return false;
            }
        }
    }

    public static class SetIntegerInput implements Serializable {
        private String key;

        private int value;

        private Input<LocalDateTime> ttl = Input.undefined();

        private Input<Boolean> negate = Input.undefined();

        private Input<String> apiClient = Input.undefined();

        public SetIntegerInput(String key, int value) {
            this.key = key;

            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public SetIntegerInput setKey(String key) {
            this.key = key;
            return this;
        }

        public int getValue() {
            return value;
        }

        public SetIntegerInput setValue(int value) {
            this.value = value;
            return this;
        }

        @Nullable
        public LocalDateTime getTtl() {
            return ttl.getValue();
        }

        public Input<LocalDateTime> getTtlInput() {
            return ttl;
        }

        public SetIntegerInput setTtl(@Nullable LocalDateTime ttl) {
            this.ttl = Input.optional(ttl);
            return this;
        }

        public SetIntegerInput setTtlInput(Input<LocalDateTime> ttl) {
            if (ttl == null) {
                throw new IllegalArgumentException("Input can not be null");
            }
            this.ttl = ttl;
            return this;
        }

        @Nullable
        public Boolean getNegate() {
            return negate.getValue();
        }

        public Input<Boolean> getNegateInput() {
            return negate;
        }

        public SetIntegerInput setNegate(@Nullable Boolean negate) {
            this.negate = Input.optional(negate);
            return this;
        }

        public SetIntegerInput setNegateInput(Input<Boolean> negate) {
            if (negate == null) {
                throw new IllegalArgumentException("Input can not be null");
            }
            this.negate = negate;
            return this;
        }

        @Nullable
        public String getApiClient() {
            return apiClient.getValue();
        }

        public Input<String> getApiClientInput() {
            return apiClient;
        }

        public SetIntegerInput setApiClient(@Nullable String apiClient) {
            this.apiClient = Input.optional(apiClient);
            return this;
        }

        public SetIntegerInput setApiClientInput(Input<String> apiClient) {
            if (apiClient == null) {
                throw new IllegalArgumentException("Input can not be null");
            }
            this.apiClient = apiClient;
            return this;
        }

        public void appendTo(StringBuilder _queryBuilder) {
            String separator = "";
            _queryBuilder.append('{');

            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("key:");
            Tuery.appendQuotedString(_queryBuilder, key.toString());

            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("value:");
            _queryBuilder.append(value);

            if (this.ttl.isDefined()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append("ttl:");
                if (ttl.getValue() != null) {
                    Tuery.appendQuotedString(_queryBuilder, ttl.getValue().toString());
                } else {
                    _queryBuilder.append("null");
                }
            }

            if (this.negate.isDefined()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append("negate:");
                if (negate.getValue() != null) {
                    _queryBuilder.append(negate.getValue());
                } else {
                    _queryBuilder.append("null");
                }
            }

            if (this.apiClient.isDefined()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append("api_client:");
                if (apiClient.getValue() != null) {
                    Tuery.appendQuotedString(_queryBuilder, apiClient.getValue().toString());
                } else {
                    _queryBuilder.append("null");
                }
            }

            _queryBuilder.append('}');
        }
    }

    public interface StringEntryTueryDefinition {
        void define(StringEntryTuery _queryBuilder);
    }

    public static class StringEntryTuery extends Tuery<StringEntryTuery> {
        StringEntryTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);
        }

        public StringEntryTuery key() {
            startField("key");

            return this;
        }

        public StringEntryTuery ttl() {
            startField("ttl");

            return this;
        }

        public StringEntryTuery value() {
            startField("value");

            return this;
        }
    }

    public static class StringEntry extends AbstractResponse<StringEntry> implements Entry, EntryUnion {
        public StringEntry() {
        }

        public StringEntry(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "key": {
                        responseData.put(key, jsonAsString(field.getValue(), key));

                        break;
                    }

                    case "ttl": {
                        LocalDateTime optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = LocalDateTime.parse(jsonAsString(field.getValue(), key));
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "value": {
                        responseData.put(key, jsonAsString(field.getValue(), key));

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public String getGraphQlTypeName() {
            return "StringEntry";
        }

        public String getKey() {
            return (String) get("key");
        }

        public StringEntry setKey(String arg) {
            optimisticData.put(getKey("key"), arg);
            return this;
        }

        @Nullable
        public LocalDateTime getTtl() {
            return (LocalDateTime) get("ttl");
        }

        public StringEntry setTtl(LocalDateTime arg) {
            optimisticData.put(getKey("ttl"), arg);
            return this;
        }

        public String getValue() {
            return (String) get("value");
        }

        public StringEntry setValue(String arg) {
            optimisticData.put(getKey("value"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "key": return false;

                case "ttl": return false;

                case "value": return false;

                default: return false;
            }
        }
    }
}
