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
* 【一般机构】一个组织，例如学校、非政府组织、公司、俱乐部等 An organization such as a school, NGO, corporation, club, etc.
* 也用于临时几个人组成的聊天小组，房间
* http://cnschema.org/Organization
*/
public class GeneralOrganization extends AbstractResponse<GeneralOrganization> implements Node, Organization, Party, Thing {
    public GeneralOrganization() {
    }

    public GeneralOrganization(JsonObject fields) throws SchemaViolationError {
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

                case "parentOrganization": {
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

                case "subOrganizations": {
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

                case "departments": {
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

                case "hasPartyRoleName": {
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

                case "availableConversations": {
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

                case "defaultConversation": {
                    Conversation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Conversation(jsonAsObject(field.getValue(), key));
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

    public GeneralOrganization(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "GeneralOrganization";
    }

    /**
    * 
    */

    public List<Ownership> getOwns() {
        return (List<Ownership>) get("owns");
    }

    public GeneralOrganization setOwns(List<Ownership> arg) {
        optimisticData.put(getKey("owns"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getHasNamespaces() {
        return (List<Namespace>) get("hasNamespaces");
    }

    public GeneralOrganization setHasNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("hasNamespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getParentOrganization() {
        return (List<Organization>) get("parentOrganization");
    }

    public GeneralOrganization setParentOrganization(List<Organization> arg) {
        optimisticData.put(getKey("parentOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getSubOrganizations() {
        return (List<Organization>) get("subOrganizations");
    }

    public GeneralOrganization setSubOrganizations(List<Organization> arg) {
        optimisticData.put(getKey("subOrganizations"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getDepartments() {
        return (List<Organization>) get("departments");
    }

    public GeneralOrganization setDepartments(List<Organization> arg) {
        optimisticData.put(getKey("departments"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRoleName> getHasPartyRoleName() {
        return (List<PartyRoleName>) get("hasPartyRoleName");
    }

    public GeneralOrganization setHasPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("hasPartyRoleName"), arg);
        return this;
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

    public GeneralOrganization setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public GeneralOrganization setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public GeneralOrganization setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public GeneralOrganization setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public GeneralOrganization setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * 可以访问的会话
    */

    public List<Conversation> getAvailableConversations() {
        return (List<Conversation>) get("availableConversations");
    }

    public GeneralOrganization setAvailableConversations(List<Conversation> arg) {
        optimisticData.put(getKey("availableConversations"), arg);
        return this;
    }

    /**
    *  本组织默认可访问的会话 
    */

    public Conversation getDefaultConversation() {
        return (Conversation) get("defaultConversation");
    }

    public GeneralOrganization setDefaultConversation(Conversation arg) {
        optimisticData.put(getKey("defaultConversation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "owns": return true;

            case "hasNamespaces": return true;

            case "parentOrganization": return false;

            case "subOrganizations": return false;

            case "departments": return false;

            case "hasPartyRoleName": return true;

            case "id": return false;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "availableConversations": return true;

            case "defaultConversation": return true;

            default: return false;
        }
    }
}

