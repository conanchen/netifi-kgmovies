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
* 零售店铺
*/
public class Store extends AbstractResponse<Store> implements Node, Organization, Party, Thing {
    public Store() {
    }

    public Store(JsonObject fields) throws SchemaViolationError {
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

                case "employees": {
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

                case "followers": {
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

                case "members": {
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

                case "dateCreated": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateModified": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "creator": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
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

    public Store(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Store";
    }

    /**
    * 
    */

    public List<Ownership> getOwns() {
        return (List<Ownership>) get("owns");
    }

    public Store setOwns(List<Ownership> arg) {
        optimisticData.put(getKey("owns"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getHasNamespaces() {
        return (List<Namespace>) get("hasNamespaces");
    }

    public Store setHasNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("hasNamespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getParentOrganization() {
        return (List<Organization>) get("parentOrganization");
    }

    public Store setParentOrganization(List<Organization> arg) {
        optimisticData.put(getKey("parentOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getSubOrganizations() {
        return (List<Organization>) get("subOrganizations");
    }

    public Store setSubOrganizations(List<Organization> arg) {
        optimisticData.put(getKey("subOrganizations"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getDepartments() {
        return (List<Organization>) get("departments");
    }

    public Store setDepartments(List<Organization> arg) {
        optimisticData.put(getKey("departments"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRoleName> getHasPartyRoleName() {
        return (List<PartyRoleName>) get("hasPartyRoleName");
    }

    public Store setHasPartyRoleName(List<PartyRoleName> arg) {
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

    public Store setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Store setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Store setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Store setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Store setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * 【雇员】 组织的雇员.在组织承担角色的个人有时间限制
    */

    public List<EmployeeRole> getEmployees() {
        return (List<EmployeeRole>) get("employees");
    }

    public Store setEmployees(List<EmployeeRole> arg) {
        optimisticData.put(getKey("employees"), arg);
        return this;
    }

    /**
    * 【关注组织的人】 社交网络上本组织被别人关注
    */

    public List<FollowerRole> getFollowers() {
        return (List<FollowerRole>) get("followers");
    }

    public Store setFollowers(List<FollowerRole> arg) {
        optimisticData.put(getKey("followers"), arg);
        return this;
    }

    /**
    * 【会员】 组织或项目的成员,在组织承担角色的个人有时间限制
    */

    public List<MemberRole> getMembers() {
        return (List<MemberRole>) get("members");
    }

    public Store setMembers(List<MemberRole> arg) {
        optimisticData.put(getKey("members"), arg);
        return this;
    }

    /**
    * 【创建日期】
    */

    public DateTime getDateCreated() {
        return (DateTime) get("dateCreated");
    }

    public Store setDateCreated(DateTime arg) {
        optimisticData.put(getKey("dateCreated"), arg);
        return this;
    }

    /**
    * 【更新日期】
    */

    public DateTime getDateModified() {
        return (DateTime) get("dateModified");
    }

    public Store setDateModified(DateTime arg) {
        optimisticData.put(getKey("dateModified"), arg);
        return this;
    }

    /**
    * 【创建人】 该物体的创作者/作者。
    */

    public User getCreator() {
        return (User) get("creator");
    }

    public Store setCreator(User arg) {
        optimisticData.put(getKey("creator"), arg);
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

            case "employees": return true;

            case "followers": return true;

            case "members": return true;

            case "dateCreated": return false;

            case "dateModified": return false;

            case "creator": return true;

            default: return false;
        }
    }
}

