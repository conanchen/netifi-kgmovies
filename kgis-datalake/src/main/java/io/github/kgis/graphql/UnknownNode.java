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
* An object with an ID
*/
public class UnknownNode extends AbstractResponse<UnknownNode> implements Node {
    public UnknownNode() {
    }

    public UnknownNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static Node create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Cart": {
                return new Cart(fields);
            }

            case "CartItem": {
                return new CartItem(fields);
            }

            case "Checkout": {
                return new Checkout(fields);
            }

            case "CheckoutItem": {
                return new CheckoutItem(fields);
            }

            case "Conversation": {
                return new Conversation(fields);
            }

            case "DataCatalog": {
                return new DataCatalog(fields);
            }

            case "EmployeeRole": {
                return new EmployeeRole(fields);
            }

            case "EntryPoint": {
                return new EntryPoint(fields);
            }

            case "FollowerRole": {
                return new FollowerRole(fields);
            }

            case "GeneralOrganization": {
                return new GeneralOrganization(fields);
            }

            case "MemberRole": {
                return new MemberRole(fields);
            }

            case "Message": {
                return new Message(fields);
            }

            case "Namespace": {
                return new Namespace(fields);
            }

            case "Offer": {
                return new Offer(fields);
            }

            case "Ownership": {
                return new Ownership(fields);
            }

            case "PartyRoleName": {
                return new PartyRoleName(fields);
            }

            case "Person": {
                return new Person(fields);
            }

            case "Poder": {
                return new Poder(fields);
            }

            case "PoderItem": {
                return new PoderItem(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductModel": {
                return new ProductModel(fields);
            }

            case "ReadNote": {
                return new ReadNote(fields);
            }

            case "Review": {
                return new Review(fields);
            }

            case "SoftwareApplication": {
                return new SoftwareApplication(fields);
            }

            case "Store": {
                return new Store(fields);
            }

            case "User": {
                return new User(fields);
            }

            case "Webhook": {
                return new Webhook(fields);
            }

            default: {
                return new UnknownNode(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The id of the thing.
    * The id: ID! in Thing means that an auto-generated ID by Dgraph will be used to identify things.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownNode setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            default: return false;
        }
    }
}

