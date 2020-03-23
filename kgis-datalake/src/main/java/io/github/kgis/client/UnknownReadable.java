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
* 可读物
*/
public class UnknownReadable extends AbstractResponse<UnknownReadable> implements Readable {
    public UnknownReadable() {
    }

    public UnknownReadable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "hasReadNotes": {
                    List<ReadNote> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReadNote> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReadNote optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReadNote(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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

    public static Readable create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Message": {
                return new Message(fields);
            }

            default: {
                return new UnknownReadable(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    *     【阅读收条】 记录每个人阅读本条消息的时间,逆属性: ReadNote.isReadNoteOf    
    */

    public List<ReadNote> getHasReadNotes() {
        return (List<ReadNote>) get("hasReadNotes");
    }

    public UnknownReadable setHasReadNotes(List<ReadNote> arg) {
        optimisticData.put(getKey("hasReadNotes"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "hasReadNotes": return true;

            default: return false;
        }
    }
}

