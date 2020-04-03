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
* Party 团体:代表有行动能力的个人或组织
*/
public class UnknownParty extends AbstractResponse<UnknownParty> implements Party {
    public UnknownParty() {
    }

    public UnknownParty(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "owns": {
                    List<Ownership> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Ownership> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Ownership optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Ownership(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasNamespaces": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Namespace(jsonAsObject(element1, key)));
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

    public static Party create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GeneralOrganization": {
                return new GeneralOrganization(fields);
            }

            case "Person": {
                return new Person(fields);
            }

            case "Store": {
                return new Store(fields);
            }

            default: {
                return new UnknownParty(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * 【拥有】 组织或个人拥有的产品 逆属性 Ownable.ownedBy，Products owned by the organization or person.
    */

    public List<Ownership> getOwns() {
        return (List<Ownership>) get("owns");
    }

    public UnknownParty setOwns(List<Ownership> arg) {
        optimisticData.put(getKey("owns"), arg);
        return this;
    }

    /**
    * 拥有的namespace
    */

    public List<Namespace> getHasNamespaces() {
        return (List<Namespace>) get("hasNamespaces");
    }

    public UnknownParty setHasNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("hasNamespaces"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "owns": return true;

            case "hasNamespaces": return true;

            default: return false;
        }
    }
}

