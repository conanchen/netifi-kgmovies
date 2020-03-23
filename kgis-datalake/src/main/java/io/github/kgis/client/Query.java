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
* 
*/
public class Query extends AbstractResponse<Query> {
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "getThing": {
                    Thing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownThing.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryThing": {
                    List<Thing> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Thing> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Thing optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownThing.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getNamespace": {
                    Namespace optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Namespace(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryNamespace": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Namespace optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Namespace(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryShoppingable": {
                    List<Shoppingable> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Shoppingable> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Shoppingable optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownShoppingable.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryParty": {
                    List<Party> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Party> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Party optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownParty.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOrganization": {
                    List<Organization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Organization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Organization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrganization.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPartyRole": {
                    List<PartyRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PartyRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PartyRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownPartyRole.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPartyRoleName": {
                    PartyRoleName optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PartyRoleName(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPartyRoleName": {
                    List<PartyRoleName> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PartyRoleName> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PartyRoleName optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PartyRoleName(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReadable": {
                    List<Readable> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Readable> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Readable optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownReadable.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getDataCatalog": {
                    DataCatalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataCatalog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryDataCatalog": {
                    List<DataCatalog> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DataCatalog> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DataCatalog optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DataCatalog(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getConversation": {
                    Conversation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Conversation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryConversation": {
                    List<Conversation> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Conversation> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Conversation optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Conversation(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getMessage": {
                    Message optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Message(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryMessage": {
                    List<Message> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Message> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Message optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Message(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getReview": {
                    Review optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Review(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReview": {
                    List<Review> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Review> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Review optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Review(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getReadNote": {
                    ReadNote optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReadNote(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryReadNote": {
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

                case "getGeneralOrganization": {
                    GeneralOrganization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GeneralOrganization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryGeneralOrganization": {
                    List<GeneralOrganization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GeneralOrganization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GeneralOrganization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GeneralOrganization(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getEmployeeRole": {
                    EmployeeRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EmployeeRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryEmployeeRole": {
                    List<EmployeeRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<EmployeeRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            EmployeeRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new EmployeeRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getFollowerRole": {
                    FollowerRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FollowerRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryFollowerRole": {
                    List<FollowerRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FollowerRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FollowerRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FollowerRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getMemberRole": {
                    MemberRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MemberRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryMemberRole": {
                    List<MemberRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MemberRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MemberRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MemberRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getOwnership": {
                    Ownership optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Ownership(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOwnership": {
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

                case "getUser": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryUser": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            User optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new User(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPerson": {
                    Person optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Person(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryPerson": {
                    List<Person> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Person> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Person optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Person(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getStore": {
                    Store optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Store(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryStore": {
                    List<Store> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Store> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Store optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Store(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getProduct": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProduct": {
                    List<Product> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Product> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Product optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Product(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getProductModel": {
                    ProductModel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductModel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryProductModel": {
                    List<ProductModel> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductModel> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductModel optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductModel(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getOffer": {
                    Offer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Offer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryOffer": {
                    List<Offer> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Offer> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Offer optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Offer(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getEntryPoint": {
                    EntryPoint optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EntryPoint(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryEntryPoint": {
                    List<EntryPoint> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<EntryPoint> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            EntryPoint optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new EntryPoint(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getSoftwareApplication": {
                    SoftwareApplication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SoftwareApplication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "querySoftwareApplication": {
                    List<SoftwareApplication> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SoftwareApplication> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SoftwareApplication optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SoftwareApplication(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getWebhook": {
                    Webhook optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Webhook(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "queryWebhook": {
                    List<Webhook> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Webhook> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Webhook optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Webhook(jsonAsObject(element1, key));
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

    public String getGraphQlTypeName() {
        return "Query";
    }

    /**
    * 
    */

    public Thing getGetThing() {
        return (Thing) get("getThing");
    }

    public Query setGetThing(Thing arg) {
        optimisticData.put(getKey("getThing"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Thing> getQueryThing() {
        return (List<Thing>) get("queryThing");
    }

    public Query setQueryThing(List<Thing> arg) {
        optimisticData.put(getKey("queryThing"), arg);
        return this;
    }

    /**
    * 
    */

    public Namespace getGetNamespace() {
        return (Namespace) get("getNamespace");
    }

    public Query setGetNamespace(Namespace arg) {
        optimisticData.put(getKey("getNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getQueryNamespace() {
        return (List<Namespace>) get("queryNamespace");
    }

    public Query setQueryNamespace(List<Namespace> arg) {
        optimisticData.put(getKey("queryNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Shoppingable> getQueryShoppingable() {
        return (List<Shoppingable>) get("queryShoppingable");
    }

    public Query setQueryShoppingable(List<Shoppingable> arg) {
        optimisticData.put(getKey("queryShoppingable"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Party> getQueryParty() {
        return (List<Party>) get("queryParty");
    }

    public Query setQueryParty(List<Party> arg) {
        optimisticData.put(getKey("queryParty"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getQueryOrganization() {
        return (List<Organization>) get("queryOrganization");
    }

    public Query setQueryOrganization(List<Organization> arg) {
        optimisticData.put(getKey("queryOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRole> getQueryPartyRole() {
        return (List<PartyRole>) get("queryPartyRole");
    }

    public Query setQueryPartyRole(List<PartyRole> arg) {
        optimisticData.put(getKey("queryPartyRole"), arg);
        return this;
    }

    /**
    * 
    */

    public PartyRoleName getGetPartyRoleName() {
        return (PartyRoleName) get("getPartyRoleName");
    }

    public Query setGetPartyRoleName(PartyRoleName arg) {
        optimisticData.put(getKey("getPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRoleName> getQueryPartyRoleName() {
        return (List<PartyRoleName>) get("queryPartyRoleName");
    }

    public Query setQueryPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("queryPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Readable> getQueryReadable() {
        return (List<Readable>) get("queryReadable");
    }

    public Query setQueryReadable(List<Readable> arg) {
        optimisticData.put(getKey("queryReadable"), arg);
        return this;
    }

    /**
    * 
    */

    public DataCatalog getGetDataCatalog() {
        return (DataCatalog) get("getDataCatalog");
    }

    public Query setGetDataCatalog(DataCatalog arg) {
        optimisticData.put(getKey("getDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public List<DataCatalog> getQueryDataCatalog() {
        return (List<DataCatalog>) get("queryDataCatalog");
    }

    public Query setQueryDataCatalog(List<DataCatalog> arg) {
        optimisticData.put(getKey("queryDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public Conversation getGetConversation() {
        return (Conversation) get("getConversation");
    }

    public Query setGetConversation(Conversation arg) {
        optimisticData.put(getKey("getConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Conversation> getQueryConversation() {
        return (List<Conversation>) get("queryConversation");
    }

    public Query setQueryConversation(List<Conversation> arg) {
        optimisticData.put(getKey("queryConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public Message getGetMessage() {
        return (Message) get("getMessage");
    }

    public Query setGetMessage(Message arg) {
        optimisticData.put(getKey("getMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Message> getQueryMessage() {
        return (List<Message>) get("queryMessage");
    }

    public Query setQueryMessage(List<Message> arg) {
        optimisticData.put(getKey("queryMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public Review getGetReview() {
        return (Review) get("getReview");
    }

    public Query setGetReview(Review arg) {
        optimisticData.put(getKey("getReview"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Review> getQueryReview() {
        return (List<Review>) get("queryReview");
    }

    public Query setQueryReview(List<Review> arg) {
        optimisticData.put(getKey("queryReview"), arg);
        return this;
    }

    /**
    * 
    */

    public ReadNote getGetReadNote() {
        return (ReadNote) get("getReadNote");
    }

    public Query setGetReadNote(ReadNote arg) {
        optimisticData.put(getKey("getReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ReadNote> getQueryReadNote() {
        return (List<ReadNote>) get("queryReadNote");
    }

    public Query setQueryReadNote(List<ReadNote> arg) {
        optimisticData.put(getKey("queryReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public GeneralOrganization getGetGeneralOrganization() {
        return (GeneralOrganization) get("getGeneralOrganization");
    }

    public Query setGetGeneralOrganization(GeneralOrganization arg) {
        optimisticData.put(getKey("getGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<GeneralOrganization> getQueryGeneralOrganization() {
        return (List<GeneralOrganization>) get("queryGeneralOrganization");
    }

    public Query setQueryGeneralOrganization(List<GeneralOrganization> arg) {
        optimisticData.put(getKey("queryGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public EmployeeRole getGetEmployeeRole() {
        return (EmployeeRole) get("getEmployeeRole");
    }

    public Query setGetEmployeeRole(EmployeeRole arg) {
        optimisticData.put(getKey("getEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<EmployeeRole> getQueryEmployeeRole() {
        return (List<EmployeeRole>) get("queryEmployeeRole");
    }

    public Query setQueryEmployeeRole(List<EmployeeRole> arg) {
        optimisticData.put(getKey("queryEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public FollowerRole getGetFollowerRole() {
        return (FollowerRole) get("getFollowerRole");
    }

    public Query setGetFollowerRole(FollowerRole arg) {
        optimisticData.put(getKey("getFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<FollowerRole> getQueryFollowerRole() {
        return (List<FollowerRole>) get("queryFollowerRole");
    }

    public Query setQueryFollowerRole(List<FollowerRole> arg) {
        optimisticData.put(getKey("queryFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public MemberRole getGetMemberRole() {
        return (MemberRole) get("getMemberRole");
    }

    public Query setGetMemberRole(MemberRole arg) {
        optimisticData.put(getKey("getMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public List<MemberRole> getQueryMemberRole() {
        return (List<MemberRole>) get("queryMemberRole");
    }

    public Query setQueryMemberRole(List<MemberRole> arg) {
        optimisticData.put(getKey("queryMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public Ownership getGetOwnership() {
        return (Ownership) get("getOwnership");
    }

    public Query setGetOwnership(Ownership arg) {
        optimisticData.put(getKey("getOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Ownership> getQueryOwnership() {
        return (List<Ownership>) get("queryOwnership");
    }

    public Query setQueryOwnership(List<Ownership> arg) {
        optimisticData.put(getKey("queryOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public User getGetUser() {
        return (User) get("getUser");
    }

    public Query setGetUser(User arg) {
        optimisticData.put(getKey("getUser"), arg);
        return this;
    }

    /**
    * 
    */

    public List<User> getQueryUser() {
        return (List<User>) get("queryUser");
    }

    public Query setQueryUser(List<User> arg) {
        optimisticData.put(getKey("queryUser"), arg);
        return this;
    }

    /**
    * 
    */

    public Person getGetPerson() {
        return (Person) get("getPerson");
    }

    public Query setGetPerson(Person arg) {
        optimisticData.put(getKey("getPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Person> getQueryPerson() {
        return (List<Person>) get("queryPerson");
    }

    public Query setQueryPerson(List<Person> arg) {
        optimisticData.put(getKey("queryPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public Store getGetStore() {
        return (Store) get("getStore");
    }

    public Query setGetStore(Store arg) {
        optimisticData.put(getKey("getStore"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Store> getQueryStore() {
        return (List<Store>) get("queryStore");
    }

    public Query setQueryStore(List<Store> arg) {
        optimisticData.put(getKey("queryStore"), arg);
        return this;
    }

    /**
    * 
    */

    public Product getGetProduct() {
        return (Product) get("getProduct");
    }

    public Query setGetProduct(Product arg) {
        optimisticData.put(getKey("getProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Product> getQueryProduct() {
        return (List<Product>) get("queryProduct");
    }

    public Query setQueryProduct(List<Product> arg) {
        optimisticData.put(getKey("queryProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public ProductModel getGetProductModel() {
        return (ProductModel) get("getProductModel");
    }

    public Query setGetProductModel(ProductModel arg) {
        optimisticData.put(getKey("getProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public List<ProductModel> getQueryProductModel() {
        return (List<ProductModel>) get("queryProductModel");
    }

    public Query setQueryProductModel(List<ProductModel> arg) {
        optimisticData.put(getKey("queryProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public Offer getGetOffer() {
        return (Offer) get("getOffer");
    }

    public Query setGetOffer(Offer arg) {
        optimisticData.put(getKey("getOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Offer> getQueryOffer() {
        return (List<Offer>) get("queryOffer");
    }

    public Query setQueryOffer(List<Offer> arg) {
        optimisticData.put(getKey("queryOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public EntryPoint getGetEntryPoint() {
        return (EntryPoint) get("getEntryPoint");
    }

    public Query setGetEntryPoint(EntryPoint arg) {
        optimisticData.put(getKey("getEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public List<EntryPoint> getQueryEntryPoint() {
        return (List<EntryPoint>) get("queryEntryPoint");
    }

    public Query setQueryEntryPoint(List<EntryPoint> arg) {
        optimisticData.put(getKey("queryEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public SoftwareApplication getGetSoftwareApplication() {
        return (SoftwareApplication) get("getSoftwareApplication");
    }

    public Query setGetSoftwareApplication(SoftwareApplication arg) {
        optimisticData.put(getKey("getSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public List<SoftwareApplication> getQuerySoftwareApplication() {
        return (List<SoftwareApplication>) get("querySoftwareApplication");
    }

    public Query setQuerySoftwareApplication(List<SoftwareApplication> arg) {
        optimisticData.put(getKey("querySoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public Webhook getGetWebhook() {
        return (Webhook) get("getWebhook");
    }

    public Query setGetWebhook(Webhook arg) {
        optimisticData.put(getKey("getWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Webhook> getQueryWebhook() {
        return (List<Webhook>) get("queryWebhook");
    }

    public Query setQueryWebhook(List<Webhook> arg) {
        optimisticData.put(getKey("queryWebhook"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "getThing": return false;

            case "queryThing": return false;

            case "getNamespace": return true;

            case "queryNamespace": return true;

            case "queryShoppingable": return false;

            case "queryParty": return false;

            case "queryOrganization": return false;

            case "queryPartyRole": return false;

            case "getPartyRoleName": return true;

            case "queryPartyRoleName": return true;

            case "queryReadable": return false;

            case "getDataCatalog": return true;

            case "queryDataCatalog": return true;

            case "getConversation": return true;

            case "queryConversation": return true;

            case "getMessage": return true;

            case "queryMessage": return true;

            case "getReview": return true;

            case "queryReview": return true;

            case "getReadNote": return true;

            case "queryReadNote": return true;

            case "getGeneralOrganization": return true;

            case "queryGeneralOrganization": return true;

            case "getEmployeeRole": return true;

            case "queryEmployeeRole": return true;

            case "getFollowerRole": return true;

            case "queryFollowerRole": return true;

            case "getMemberRole": return true;

            case "queryMemberRole": return true;

            case "getOwnership": return true;

            case "queryOwnership": return true;

            case "getUser": return true;

            case "queryUser": return true;

            case "getPerson": return true;

            case "queryPerson": return true;

            case "getStore": return true;

            case "queryStore": return true;

            case "getProduct": return true;

            case "queryProduct": return true;

            case "getProductModel": return true;

            case "queryProductModel": return true;

            case "getOffer": return true;

            case "queryOffer": return true;

            case "getEntryPoint": return true;

            case "queryEntryPoint": return true;

            case "getSoftwareApplication": return true;

            case "querySoftwareApplication": return true;

            case "getWebhook": return true;

            case "queryWebhook": return true;

            default: return false;
        }
    }
}

