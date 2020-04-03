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
* A Thing with an ID，在KGIS平台内所有内容都是东西Thing,也就是资源Resource
*/
public class UnknownThing extends AbstractResponse<UnknownThing> implements Thing {
    public UnknownThing() {
    }

    public UnknownThing(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "namespaces": {
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

                case "identifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "alternateName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
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

    public static Thing create(JsonObject fields) throws SchemaViolationError {
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
                return new UnknownThing(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * 资源对象所属的namespaces
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public UnknownThing setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 【标识符】 标识符 The identifier property represents any kind of identifier for any kind of Thing, such as
    * ISBNs, GTIN codes, UUIDs etc.
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public UnknownThing setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 【名称】name    Text    The name of the item.
    */

    public String getName() {
        return (String) get("name");
    }

    public UnknownThing setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 【别名】 该项的别名。 An alias for the item.
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public UnknownThing setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 【描述】 该项的一个简单描述。 A description of the item.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public UnknownThing setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            default: return false;
        }
    }
}

