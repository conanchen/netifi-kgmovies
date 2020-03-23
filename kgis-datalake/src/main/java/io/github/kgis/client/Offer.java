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
* 商品供应
*/
public class Offer extends AbstractResponse<Offer> implements Thing {
    public Offer() {
    }

    public Offer(JsonObject fields) throws SchemaViolationError {
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "itemOffered": {
                    Shoppingable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownShoppingable.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "offeredBy": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateFrom": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateThrough": {
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

    public String getGraphQlTypeName() {
        return "Offer";
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public Offer setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Offer setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Offer setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Offer setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Offer setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Offer setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    *     可购物的一个商品供应    
    */

    public Shoppingable getItemOffered() {
        return (Shoppingable) get("itemOffered");
    }

    public Offer setItemOffered(Shoppingable arg) {
        optimisticData.put(getKey("itemOffered"), arg);
        return this;
    }

    /**
    *     供应商品的组织或个人 Inverse property: makesOffer.    
    */

    public Party getOfferedBy() {
        return (Party) get("offeredBy");
    }

    public Offer setOfferedBy(Party arg) {
        optimisticData.put(getKey("offeredBy"), arg);
        return this;
    }

    /**
    *     商品价格The offer price of a product, or of a price component when attached to PriceSpecification
    * and its subtypes.    
    */

    public Integer getPrice() {
        return (Integer) get("price");
    }

    public Offer setPrice(Integer arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    *     【价格有效开始日期】    
    */

    public DateTime getDateFrom() {
        return (DateTime) get("dateFrom");
    }

    public Offer setDateFrom(DateTime arg) {
        optimisticData.put(getKey("dateFrom"), arg);
        return this;
    }

    /**
    *     【价格有效结束日期】    
    */

    public DateTime getDateThrough() {
        return (DateTime) get("dateThrough");
    }

    public Offer setDateThrough(DateTime arg) {
        optimisticData.put(getKey("dateThrough"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "id": return false;

            case "itemOffered": return false;

            case "offeredBy": return false;

            case "price": return false;

            case "dateFrom": return false;

            case "dateThrough": return false;

            default: return false;
        }
    }
}

