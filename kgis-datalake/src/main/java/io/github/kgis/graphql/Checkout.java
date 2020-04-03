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
* Checkout:A container for all the information required to checkout items and pay.
* 结算单，包含需要结算和支付的所有信息：税收、送货地址、发票账单寄送地址、备注说明等
* 结算单信息完备后才可以创建订单
*/
public class Checkout extends AbstractResponse<Checkout> implements Node, Thing {
    public Checkout() {
    }

    public Checkout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

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

                case "owner": {
                    responseData.put(key, new User(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "completedAt": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items": {
                    List<CheckoutItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CheckoutItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CheckoutItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CheckoutItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ready": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requiresShipping": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
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

    public Checkout(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Checkout";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public Checkout setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Checkout setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Checkout setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Checkout setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Checkout setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * 结算单所有者
    */

    public User getOwner() {
        return (User) get("owner");
    }

    public Checkout setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * The date and time when the checkout was completed.
    */

    public DateTime getCompletedAt() {
        return (DateTime) get("completedAt");
    }

    public Checkout setCompletedAt(DateTime arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * The date and time when the checkout was created.
    */

    public DateTime getCreatedAt() {
        return (DateTime) get("createdAt");
    }

    public Checkout setCreatedAt(DateTime arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The email attached to this checkout.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public Checkout setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * A list of line item objects, each one containing information about an item in the checkout.
    */

    public List<CheckoutItem> getItems() {
        return (List<CheckoutItem>) get("items");
    }

    public Checkout setItems(List<CheckoutItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    * The note associated with the checkout.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Checkout setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * Whether or not the Checkout is ready and can be completed. Checkouts may have asynchronous
    * operations that can take time to finish. If you want to complete a checkout or ensure all the fields
    * are populated and up to date, polling is required until the value is true.
    */

    public Boolean getReady() {
        return (Boolean) get("ready");
    }

    public Checkout setReady(Boolean arg) {
        optimisticData.put(getKey("ready"), arg);
        return this;
    }

    /**
    * States whether or not the fulfillment requires shipping.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public Checkout setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The date and time when the checkout was last updated.
    */

    public DateTime getUpdatedAt() {
        return (DateTime) get("updatedAt");
    }

    public Checkout setUpdatedAt(DateTime arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "owner": return true;

            case "completedAt": return false;

            case "createdAt": return false;

            case "email": return false;

            case "items": return true;

            case "note": return false;

            case "ready": return false;

            case "requiresShipping": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

