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
* 【机构】一个组织，例如学校、非政府组织、公司、俱乐部等,也可用于临时几个人组成的聊天小组，房间
*/

public interface Organization {
    String getGraphQlTypeName();

    List<Organization> getParentOrganization();

    List<Organization> getSubOrganizations();

    List<Organization> getDepartments();

    List<PartyRoleName> getHasPartyRoleName();
}

