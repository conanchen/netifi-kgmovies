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
* https://schema.org/Poder An poder is a confirmation of a transaction (a receipt), which can contain
* multiple line items, each represented by an Offer that has been accepted by the
* customer.命名为Poder即是PurchaseOrder购物订单的意思,为了区分排序单词Order
*/
public class Poder extends AbstractResponse<Poder> implements Node, Thing {
    public Poder() {
    }

    public Poder(JsonObject fields) throws SchemaViolationError {
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

                case "broker": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customer": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isGift": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderDate": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "poderStatus": {
                    PoderStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PoderStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items": {
                    List<PoderItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PoderItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PoderItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PoderItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "seller": {
                    Organization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownOrganization.create(jsonAsObject(field.getValue(), key));
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

    public Poder(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Poder";
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

    public Poder setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Poder setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Poder setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Poder setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Poder setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     acceptedOffer    Offer    The offer(s) -- e.g., product, quantity and price combinations --
    * included in the poder.    billingAddress    PostalAddress    The billing address for the poder.   
    * broker    Organization  or Person    An entity that arranges for an exchange between a buyer and a
    * seller. In most cases a broker never acquires or releases ownership of a product or service involved
    * in an exchange. If it is not clear whether an entity is a broker, seller, or buyer, the latter two
    * terms are preferred. Supersedes bookingAgent.    
    */

    public Party getBroker() {
        return (Party) get("broker");
    }

    public Poder setBroker(Party arg) {
        optimisticData.put(getKey("broker"), arg);
        return this;
    }

    /**
    *     confirmationNumber    Text    A number that confirms the given poder or payment has been
    * received.    customer    Organization  or Person    Party placing the poder or paying the invoice.  
    */

    public Party getCustomer() {
        return (Party) get("customer");
    }

    public Poder setCustomer(Party arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    *     discount    Number  or Text    Any discount applied (to an Poder).    discountCode    Text   
    * Code used to redeem a discount.    discountCurrency    Text    The currency of the discount.    Use
    * standard formats: ISO 4217 currency format e.g. "USD"; Ticker symbol for cryptocurrencies e.g.
    * "BTC"; well known names for Local Exchange Tradings Systems (LETS) and other currency types e.g.
    * "Ithaca HOUR".    isGift    Boolean    Was the offer accepted as a gift for someone other than the
    * buyer.    
    */

    public Boolean getIsGift() {
        return (Boolean) get("isGift");
    }

    public Poder setIsGift(Boolean arg) {
        optimisticData.put(getKey("isGift"), arg);
        return this;
    }

    /**
    *     poderDate    DateTime  or DateTime    DateTime poder was placed.    
    */

    public DateTime getPoderDate() {
        return (DateTime) get("poderDate");
    }

    public Poder setPoderDate(DateTime arg) {
        optimisticData.put(getKey("poderDate"), arg);
        return this;
    }

    /**
    *     poderNumber    Text    The identifier of the transaction.    
    */

    public String getPoderNumber() {
        return (String) get("poderNumber");
    }

    public Poder setPoderNumber(String arg) {
        optimisticData.put(getKey("poderNumber"), arg);
        return this;
    }

    /**
    *     poderStatus    PoderStatus    The current status of the poder.    
    */

    public PoderStatus getPoderStatus() {
        return (PoderStatus) get("poderStatus");
    }

    public Poder setPoderStatus(PoderStatus arg) {
        optimisticData.put(getKey("poderStatus"), arg);
        return this;
    }

    /**
    *     poderedItem    PoderItem  or Product  or Service    The item podered.    
    */

    public List<PoderItem> getItems() {
        return (List<PoderItem>) get("items");
    }

    public Poder setItems(List<PoderItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    *     partOfInvoice    Invoice    The poder is being paid as part of the referenced Invoice.   
    * paymentDueDate    DateTime  or DateTime    The date that payment is due. Supersedes paymentDue.   
    * paymentMethod    PaymentMethod    The name of the credit card or other method of payment for the
    * poder.    paymentMethodId    Text    An identifier for the method of payment used (e.g. the last 4
    * digits of the credit card).    paymentUrl    URL    The URL for sending a payment.    seller   
    * Organization  or Person    An entity which offers (sells / leases / lends / loans) the services /
    * goods. A seller may also be a provider. Supersedes merchant, vendor.    
    */

    public Organization getSeller() {
        return (Organization) get("seller");
    }

    public Poder setSeller(Organization arg) {
        optimisticData.put(getKey("seller"), arg);
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

            case "broker": return false;

            case "customer": return false;

            case "isGift": return false;

            case "poderDate": return false;

            case "poderNumber": return false;

            case "poderStatus": return false;

            case "items": return true;

            case "seller": return false;

            default: return false;
        }
    }
}

