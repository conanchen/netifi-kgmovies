// Generated from graphql_java_gen gem with template Object.java.erb

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
* https://schema.org/PoderItemAn poder item is a line of an poder. It includes the quantity and
* shipping details of a bought offer.购物订单内容项
*/
public class PoderItem extends AbstractResponse<PoderItem> implements Node, Thing {
    public PoderItem() {
    }

    public PoderItem(JsonObject fields) throws SchemaViolationError {
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

                case "isItemOf": {
                    Poder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Poder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderItemNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderItemStatus": {
                    PoderStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PoderStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderQuantity": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderedItem": {
                    Shoppingable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownShoppingable.create(jsonAsObject(field.getValue(), key));
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

    public PoderItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PoderItem";
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

    public PoderItem setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public PoderItem setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public PoderItem setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public PoderItem setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public PoderItem setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     partOfPoder    Poder    The overall poder the items in this delivery were included in.    
    */

    public Poder getIsItemOf() {
        return (Poder) get("isItemOf");
    }

    public PoderItem setIsItemOf(Poder arg) {
        optimisticData.put(getKey("isItemOf"), arg);
        return this;
    }

    /**
    *     poderItemNumber    Text    The identifier of the poder item.    
    */

    public String getPoderItemNumber() {
        return (String) get("poderItemNumber");
    }

    public PoderItem setPoderItemNumber(String arg) {
        optimisticData.put(getKey("poderItemNumber"), arg);
        return this;
    }

    /**
    *     poderItemStatus    PoderStatus    The current status of the poder item.    
    */

    public PoderStatus getPoderItemStatus() {
        return (PoderStatus) get("poderItemStatus");
    }

    public PoderItem setPoderItemStatus(PoderStatus arg) {
        optimisticData.put(getKey("poderItemStatus"), arg);
        return this;
    }

    /**
    *     poderQuantity    Number    The number of the item podered. If the property is not set, assume
    * the quantity is one.    
    */

    public Integer getPoderQuantity() {
        return (Integer) get("poderQuantity");
    }

    public PoderItem setPoderQuantity(Integer arg) {
        optimisticData.put(getKey("poderQuantity"), arg);
        return this;
    }

    /**
    *     poderedItem    PoderItem  or Product  or Service    
    */

    public Shoppingable getPoderedItem() {
        return (Shoppingable) get("poderedItem");
    }

    public PoderItem setPoderedItem(Shoppingable arg) {
        optimisticData.put(getKey("poderedItem"), arg);
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

            case "isItemOf": return true;

            case "poderItemNumber": return false;

            case "poderItemStatus": return false;

            case "poderQuantity": return false;

            case "poderedItem": return false;

            default: return false;
        }
    }
}

