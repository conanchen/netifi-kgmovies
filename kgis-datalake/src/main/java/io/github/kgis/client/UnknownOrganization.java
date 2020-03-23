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
* 【机构】一个组织，例如学校、非政府组织、公司、俱乐部等,也可用于临时几个人组成的聊天小组，房间
*/
public class UnknownOrganization extends AbstractResponse<UnknownOrganization> implements Organization {
    public UnknownOrganization() {
    }

    public UnknownOrganization(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static Organization create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GeneralOrganization": {
                return new GeneralOrganization(fields);
            }

            case "Store": {
                return new Store(fields);
            }

            default: {
                return new UnknownOrganization(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    *     【上级组织】 subOrganization的反向属性，即包含这个组织的更大组织    
    */

    public List<Organization> getParentOrganization() {
        return (List<Organization>) get("parentOrganization");
    }

    public UnknownOrganization setParentOrganization(List<Organization> arg) {
        optimisticData.put(getKey("parentOrganization"), arg);
        return this;
    }

    /**
    *     【子机构】 两个组织之间的关系。其中第二个组织，例如以子公司的名字，属于第一个组织。    
    */

    public List<Organization> getSubOrganizations() {
        return (List<Organization>) get("subOrganizations");
    }

    public UnknownOrganization setSubOrganizations(List<Organization> arg) {
        optimisticData.put(getKey("subOrganizations"), arg);
        return this;
    }

    /**
    *     【部门】 组织与该组织某个部门之间的关系，也被描述成组织（允许不同的网址，标识，开放时间）。 例如：一家有药店的商店，或者是一间带咖啡厅的面包店。 A relationship between
    * an organization and a department of that organization, also described as an organization (allowing
    * different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a
    * cafe.    
    */

    public List<Organization> getDepartments() {
        return (List<Organization>) get("departments");
    }

    public UnknownOrganization setDepartments(List<Organization> arg) {
        optimisticData.put(getKey("departments"), arg);
        return this;
    }

    /**
    *     组织定义的角色名称,hasPartyRoleName,逆属性 PartyRoleName.isPartyRoleNameOf    
    */

    public List<PartyRoleName> getHasPartyRoleName() {
        return (List<PartyRoleName>) get("hasPartyRoleName");
    }

    public UnknownOrganization setHasPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("hasPartyRoleName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parentOrganization": return false;

            case "subOrganizations": return false;

            case "departments": return false;

            case "hasPartyRoleName": return true;

            default: return false;
        }
    }
}

