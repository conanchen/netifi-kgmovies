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
* 【团体内部定义的角色】
*/
public class UnknownPartyRole extends AbstractResponse<UnknownPartyRole> implements PartyRole {
    public UnknownPartyRole() {
    }

    public UnknownPartyRole(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "person": {
                    Person optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Person(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "roleName": {
                    PartyRoleName optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PartyRoleName(jsonAsObject(field.getValue(), key));
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

    public static PartyRole create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "EmployeeRole": {
                return new EmployeeRole(fields);
            }

            case "FollowerRole": {
                return new FollowerRole(fields);
            }

            case "MemberRole": {
                return new MemberRole(fields);
            }

            default: {
                return new UnknownPartyRole(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    *     在组织承担角色的个人    
    */

    public Person getPerson() {
        return (Person) get("person");
    }

    public UnknownPartyRole setPerson(Person arg) {
        optimisticData.put(getKey("person"), arg);
        return this;
    }

    /**
    *     个人在团体内承担的角色    
    */

    public PartyRoleName getRoleName() {
        return (PartyRoleName) get("roleName");
    }

    public UnknownPartyRole setRoleName(PartyRoleName arg) {
        optimisticData.put(getKey("roleName"), arg);
        return this;
    }

    /**
    *     【开始日期】 某事的开始日期和时间    
    */

    public DateTime getDateFrom() {
        return (DateTime) get("dateFrom");
    }

    public UnknownPartyRole setDateFrom(DateTime arg) {
        optimisticData.put(getKey("dateFrom"), arg);
        return this;
    }

    /**
    *     【结束日期】 活动（事件）结束时间。 The end date and time of the item (in ISO 8601 date format).    
    */

    public DateTime getDateThrough() {
        return (DateTime) get("dateThrough");
    }

    public UnknownPartyRole setDateThrough(DateTime arg) {
        optimisticData.put(getKey("dateThrough"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "person": return true;

            case "roleName": return true;

            case "dateFrom": return false;

            case "dateThrough": return false;

            default: return false;
        }
    }
}

