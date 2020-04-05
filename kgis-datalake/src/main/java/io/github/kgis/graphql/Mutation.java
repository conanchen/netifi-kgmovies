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
* 
*/
public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deleteNode": {
                    DeleteNodePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteNodePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateThing": {
                    UpdateThingPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateThingPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteThing": {
                    DeleteThingPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteThingPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addNamespace": {
                    AddNamespacePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddNamespacePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateNamespace": {
                    UpdateNamespacePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateNamespacePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteNamespace": {
                    DeleteNamespacePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteNamespacePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addPartyRoleName": {
                    AddPartyRoleNamePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddPartyRoleNamePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatePartyRoleName": {
                    UpdatePartyRoleNamePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdatePartyRoleNamePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletePartyRoleName": {
                    DeletePartyRoleNamePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeletePartyRoleNamePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addDataCatalog": {
                    AddDataCatalogPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddDataCatalogPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateDataCatalog": {
                    UpdateDataCatalogPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateDataCatalogPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteDataCatalog": {
                    DeleteDataCatalogPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteDataCatalogPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addConversation": {
                    AddConversationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddConversationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateConversation": {
                    UpdateConversationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateConversationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteConversation": {
                    DeleteConversationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteConversationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addMessage": {
                    AddMessagePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddMessagePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateMessage": {
                    UpdateMessagePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateMessagePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteMessage": {
                    DeleteMessagePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteMessagePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReview": {
                    AddReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateReview": {
                    UpdateReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateReviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteReview": {
                    DeleteReviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteReviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReadNote": {
                    AddReadNotePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReadNotePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateReadNote": {
                    UpdateReadNotePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateReadNotePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteReadNote": {
                    DeleteReadNotePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteReadNotePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addGeneralOrganization": {
                    AddGeneralOrganizationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddGeneralOrganizationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateGeneralOrganization": {
                    UpdateGeneralOrganizationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateGeneralOrganizationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteGeneralOrganization": {
                    DeleteGeneralOrganizationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteGeneralOrganizationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addEmployeeRole": {
                    AddEmployeeRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddEmployeeRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateEmployeeRole": {
                    UpdateEmployeeRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateEmployeeRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteEmployeeRole": {
                    DeleteEmployeeRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteEmployeeRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addFollowerRole": {
                    AddFollowerRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddFollowerRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateFollowerRole": {
                    UpdateFollowerRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateFollowerRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteFollowerRole": {
                    DeleteFollowerRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteFollowerRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addMemberRole": {
                    AddMemberRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddMemberRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateMemberRole": {
                    UpdateMemberRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateMemberRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteMemberRole": {
                    DeleteMemberRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteMemberRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addOwnership": {
                    AddOwnershipPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddOwnershipPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateOwnership": {
                    UpdateOwnershipPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateOwnershipPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteOwnership": {
                    DeleteOwnershipPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteOwnershipPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addUser": {
                    AddUserPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddUserPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateUser": {
                    UpdateUserPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateUserPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteUser": {
                    DeleteUserPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteUserPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addPerson": {
                    AddPersonPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddPersonPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatePerson": {
                    UpdatePersonPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdatePersonPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletePerson": {
                    DeletePersonPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeletePersonPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addStore": {
                    AddStorePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddStorePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateStore": {
                    UpdateStorePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateStorePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteStore": {
                    DeleteStorePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteStorePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProduct": {
                    AddProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateProduct": {
                    UpdateProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteProduct": {
                    DeleteProductPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteProductPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProductModel": {
                    AddProductModelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductModelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateProductModel": {
                    UpdateProductModelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateProductModelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteProductModel": {
                    DeleteProductModelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteProductModelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addOffer": {
                    AddOfferPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddOfferPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateOffer": {
                    UpdateOfferPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateOfferPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteOffer": {
                    DeleteOfferPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteOfferPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addEntryPoint": {
                    AddEntryPointPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddEntryPointPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateEntryPoint": {
                    UpdateEntryPointPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateEntryPointPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteEntryPoint": {
                    DeleteEntryPointPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteEntryPointPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addSoftwareApplication": {
                    AddSoftwareApplicationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddSoftwareApplicationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateSoftwareApplication": {
                    UpdateSoftwareApplicationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateSoftwareApplicationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteSoftwareApplication": {
                    DeleteSoftwareApplicationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteSoftwareApplicationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addWebhook": {
                    AddWebhookPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddWebhookPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateWebhook": {
                    UpdateWebhookPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateWebhookPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteWebhook": {
                    DeleteWebhookPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteWebhookPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addCart": {
                    AddCartPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddCartPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCart": {
                    UpdateCartPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCartPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCart": {
                    DeleteCartPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCartPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addCartItem": {
                    AddCartItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddCartItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCartItem": {
                    UpdateCartItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCartItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCartItem": {
                    DeleteCartItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCartItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addCheckout": {
                    AddCheckoutPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddCheckoutPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCheckout": {
                    UpdateCheckoutPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCheckoutPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCheckout": {
                    DeleteCheckoutPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCheckoutPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addCheckoutItem": {
                    AddCheckoutItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddCheckoutItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCheckoutItem": {
                    UpdateCheckoutItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCheckoutItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCheckoutItem": {
                    DeleteCheckoutItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCheckoutItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addPoder": {
                    AddPoderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddPoderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatePoder": {
                    UpdatePoderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdatePoderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletePoder": {
                    DeletePoderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeletePoderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addPoderItem": {
                    AddPoderItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddPoderItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatePoderItem": {
                    UpdatePoderItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdatePoderItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletePoderItem": {
                    DeletePoderItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeletePoderItemPayload(jsonAsObject(field.getValue(), key));
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
        return "Mutation";
    }

    /**
    * 
    */

    public DeleteNodePayload getDeleteNode() {
        return (DeleteNodePayload) get("deleteNode");
    }

    public Mutation setDeleteNode(DeleteNodePayload arg) {
        optimisticData.put(getKey("deleteNode"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateThingPayload getUpdateThing() {
        return (UpdateThingPayload) get("updateThing");
    }

    public Mutation setUpdateThing(UpdateThingPayload arg) {
        optimisticData.put(getKey("updateThing"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteThingPayload getDeleteThing() {
        return (DeleteThingPayload) get("deleteThing");
    }

    public Mutation setDeleteThing(DeleteThingPayload arg) {
        optimisticData.put(getKey("deleteThing"), arg);
        return this;
    }

    /**
    * 
    */

    public AddNamespacePayload getAddNamespace() {
        return (AddNamespacePayload) get("addNamespace");
    }

    public Mutation setAddNamespace(AddNamespacePayload arg) {
        optimisticData.put(getKey("addNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateNamespacePayload getUpdateNamespace() {
        return (UpdateNamespacePayload) get("updateNamespace");
    }

    public Mutation setUpdateNamespace(UpdateNamespacePayload arg) {
        optimisticData.put(getKey("updateNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteNamespacePayload getDeleteNamespace() {
        return (DeleteNamespacePayload) get("deleteNamespace");
    }

    public Mutation setDeleteNamespace(DeleteNamespacePayload arg) {
        optimisticData.put(getKey("deleteNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPartyRoleNamePayload getAddPartyRoleName() {
        return (AddPartyRoleNamePayload) get("addPartyRoleName");
    }

    public Mutation setAddPartyRoleName(AddPartyRoleNamePayload arg) {
        optimisticData.put(getKey("addPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePartyRoleNamePayload getUpdatePartyRoleName() {
        return (UpdatePartyRoleNamePayload) get("updatePartyRoleName");
    }

    public Mutation setUpdatePartyRoleName(UpdatePartyRoleNamePayload arg) {
        optimisticData.put(getKey("updatePartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePartyRoleNamePayload getDeletePartyRoleName() {
        return (DeletePartyRoleNamePayload) get("deletePartyRoleName");
    }

    public Mutation setDeletePartyRoleName(DeletePartyRoleNamePayload arg) {
        optimisticData.put(getKey("deletePartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public AddDataCatalogPayload getAddDataCatalog() {
        return (AddDataCatalogPayload) get("addDataCatalog");
    }

    public Mutation setAddDataCatalog(AddDataCatalogPayload arg) {
        optimisticData.put(getKey("addDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateDataCatalogPayload getUpdateDataCatalog() {
        return (UpdateDataCatalogPayload) get("updateDataCatalog");
    }

    public Mutation setUpdateDataCatalog(UpdateDataCatalogPayload arg) {
        optimisticData.put(getKey("updateDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteDataCatalogPayload getDeleteDataCatalog() {
        return (DeleteDataCatalogPayload) get("deleteDataCatalog");
    }

    public Mutation setDeleteDataCatalog(DeleteDataCatalogPayload arg) {
        optimisticData.put(getKey("deleteDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public AddConversationPayload getAddConversation() {
        return (AddConversationPayload) get("addConversation");
    }

    public Mutation setAddConversation(AddConversationPayload arg) {
        optimisticData.put(getKey("addConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateConversationPayload getUpdateConversation() {
        return (UpdateConversationPayload) get("updateConversation");
    }

    public Mutation setUpdateConversation(UpdateConversationPayload arg) {
        optimisticData.put(getKey("updateConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteConversationPayload getDeleteConversation() {
        return (DeleteConversationPayload) get("deleteConversation");
    }

    public Mutation setDeleteConversation(DeleteConversationPayload arg) {
        optimisticData.put(getKey("deleteConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public AddMessagePayload getAddMessage() {
        return (AddMessagePayload) get("addMessage");
    }

    public Mutation setAddMessage(AddMessagePayload arg) {
        optimisticData.put(getKey("addMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateMessagePayload getUpdateMessage() {
        return (UpdateMessagePayload) get("updateMessage");
    }

    public Mutation setUpdateMessage(UpdateMessagePayload arg) {
        optimisticData.put(getKey("updateMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteMessagePayload getDeleteMessage() {
        return (DeleteMessagePayload) get("deleteMessage");
    }

    public Mutation setDeleteMessage(DeleteMessagePayload arg) {
        optimisticData.put(getKey("deleteMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public AddReviewPayload getAddReview() {
        return (AddReviewPayload) get("addReview");
    }

    public Mutation setAddReview(AddReviewPayload arg) {
        optimisticData.put(getKey("addReview"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateReviewPayload getUpdateReview() {
        return (UpdateReviewPayload) get("updateReview");
    }

    public Mutation setUpdateReview(UpdateReviewPayload arg) {
        optimisticData.put(getKey("updateReview"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteReviewPayload getDeleteReview() {
        return (DeleteReviewPayload) get("deleteReview");
    }

    public Mutation setDeleteReview(DeleteReviewPayload arg) {
        optimisticData.put(getKey("deleteReview"), arg);
        return this;
    }

    /**
    * 
    */

    public AddReadNotePayload getAddReadNote() {
        return (AddReadNotePayload) get("addReadNote");
    }

    public Mutation setAddReadNote(AddReadNotePayload arg) {
        optimisticData.put(getKey("addReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateReadNotePayload getUpdateReadNote() {
        return (UpdateReadNotePayload) get("updateReadNote");
    }

    public Mutation setUpdateReadNote(UpdateReadNotePayload arg) {
        optimisticData.put(getKey("updateReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteReadNotePayload getDeleteReadNote() {
        return (DeleteReadNotePayload) get("deleteReadNote");
    }

    public Mutation setDeleteReadNote(DeleteReadNotePayload arg) {
        optimisticData.put(getKey("deleteReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public AddGeneralOrganizationPayload getAddGeneralOrganization() {
        return (AddGeneralOrganizationPayload) get("addGeneralOrganization");
    }

    public Mutation setAddGeneralOrganization(AddGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("addGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateGeneralOrganizationPayload getUpdateGeneralOrganization() {
        return (UpdateGeneralOrganizationPayload) get("updateGeneralOrganization");
    }

    public Mutation setUpdateGeneralOrganization(UpdateGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("updateGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteGeneralOrganizationPayload getDeleteGeneralOrganization() {
        return (DeleteGeneralOrganizationPayload) get("deleteGeneralOrganization");
    }

    public Mutation setDeleteGeneralOrganization(DeleteGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("deleteGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public AddEmployeeRolePayload getAddEmployeeRole() {
        return (AddEmployeeRolePayload) get("addEmployeeRole");
    }

    public Mutation setAddEmployeeRole(AddEmployeeRolePayload arg) {
        optimisticData.put(getKey("addEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateEmployeeRolePayload getUpdateEmployeeRole() {
        return (UpdateEmployeeRolePayload) get("updateEmployeeRole");
    }

    public Mutation setUpdateEmployeeRole(UpdateEmployeeRolePayload arg) {
        optimisticData.put(getKey("updateEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteEmployeeRolePayload getDeleteEmployeeRole() {
        return (DeleteEmployeeRolePayload) get("deleteEmployeeRole");
    }

    public Mutation setDeleteEmployeeRole(DeleteEmployeeRolePayload arg) {
        optimisticData.put(getKey("deleteEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddFollowerRolePayload getAddFollowerRole() {
        return (AddFollowerRolePayload) get("addFollowerRole");
    }

    public Mutation setAddFollowerRole(AddFollowerRolePayload arg) {
        optimisticData.put(getKey("addFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateFollowerRolePayload getUpdateFollowerRole() {
        return (UpdateFollowerRolePayload) get("updateFollowerRole");
    }

    public Mutation setUpdateFollowerRole(UpdateFollowerRolePayload arg) {
        optimisticData.put(getKey("updateFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteFollowerRolePayload getDeleteFollowerRole() {
        return (DeleteFollowerRolePayload) get("deleteFollowerRole");
    }

    public Mutation setDeleteFollowerRole(DeleteFollowerRolePayload arg) {
        optimisticData.put(getKey("deleteFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddMemberRolePayload getAddMemberRole() {
        return (AddMemberRolePayload) get("addMemberRole");
    }

    public Mutation setAddMemberRole(AddMemberRolePayload arg) {
        optimisticData.put(getKey("addMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateMemberRolePayload getUpdateMemberRole() {
        return (UpdateMemberRolePayload) get("updateMemberRole");
    }

    public Mutation setUpdateMemberRole(UpdateMemberRolePayload arg) {
        optimisticData.put(getKey("updateMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteMemberRolePayload getDeleteMemberRole() {
        return (DeleteMemberRolePayload) get("deleteMemberRole");
    }

    public Mutation setDeleteMemberRole(DeleteMemberRolePayload arg) {
        optimisticData.put(getKey("deleteMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddOwnershipPayload getAddOwnership() {
        return (AddOwnershipPayload) get("addOwnership");
    }

    public Mutation setAddOwnership(AddOwnershipPayload arg) {
        optimisticData.put(getKey("addOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateOwnershipPayload getUpdateOwnership() {
        return (UpdateOwnershipPayload) get("updateOwnership");
    }

    public Mutation setUpdateOwnership(UpdateOwnershipPayload arg) {
        optimisticData.put(getKey("updateOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteOwnershipPayload getDeleteOwnership() {
        return (DeleteOwnershipPayload) get("deleteOwnership");
    }

    public Mutation setDeleteOwnership(DeleteOwnershipPayload arg) {
        optimisticData.put(getKey("deleteOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public AddUserPayload getAddUser() {
        return (AddUserPayload) get("addUser");
    }

    public Mutation setAddUser(AddUserPayload arg) {
        optimisticData.put(getKey("addUser"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateUserPayload getUpdateUser() {
        return (UpdateUserPayload) get("updateUser");
    }

    public Mutation setUpdateUser(UpdateUserPayload arg) {
        optimisticData.put(getKey("updateUser"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteUserPayload getDeleteUser() {
        return (DeleteUserPayload) get("deleteUser");
    }

    public Mutation setDeleteUser(DeleteUserPayload arg) {
        optimisticData.put(getKey("deleteUser"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPersonPayload getAddPerson() {
        return (AddPersonPayload) get("addPerson");
    }

    public Mutation setAddPerson(AddPersonPayload arg) {
        optimisticData.put(getKey("addPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePersonPayload getUpdatePerson() {
        return (UpdatePersonPayload) get("updatePerson");
    }

    public Mutation setUpdatePerson(UpdatePersonPayload arg) {
        optimisticData.put(getKey("updatePerson"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePersonPayload getDeletePerson() {
        return (DeletePersonPayload) get("deletePerson");
    }

    public Mutation setDeletePerson(DeletePersonPayload arg) {
        optimisticData.put(getKey("deletePerson"), arg);
        return this;
    }

    /**
    * 
    */

    public AddStorePayload getAddStore() {
        return (AddStorePayload) get("addStore");
    }

    public Mutation setAddStore(AddStorePayload arg) {
        optimisticData.put(getKey("addStore"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateStorePayload getUpdateStore() {
        return (UpdateStorePayload) get("updateStore");
    }

    public Mutation setUpdateStore(UpdateStorePayload arg) {
        optimisticData.put(getKey("updateStore"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteStorePayload getDeleteStore() {
        return (DeleteStorePayload) get("deleteStore");
    }

    public Mutation setDeleteStore(DeleteStorePayload arg) {
        optimisticData.put(getKey("deleteStore"), arg);
        return this;
    }

    /**
    * 
    */

    public AddProductPayload getAddProduct() {
        return (AddProductPayload) get("addProduct");
    }

    public Mutation setAddProduct(AddProductPayload arg) {
        optimisticData.put(getKey("addProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateProductPayload getUpdateProduct() {
        return (UpdateProductPayload) get("updateProduct");
    }

    public Mutation setUpdateProduct(UpdateProductPayload arg) {
        optimisticData.put(getKey("updateProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteProductPayload getDeleteProduct() {
        return (DeleteProductPayload) get("deleteProduct");
    }

    public Mutation setDeleteProduct(DeleteProductPayload arg) {
        optimisticData.put(getKey("deleteProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public AddProductModelPayload getAddProductModel() {
        return (AddProductModelPayload) get("addProductModel");
    }

    public Mutation setAddProductModel(AddProductModelPayload arg) {
        optimisticData.put(getKey("addProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateProductModelPayload getUpdateProductModel() {
        return (UpdateProductModelPayload) get("updateProductModel");
    }

    public Mutation setUpdateProductModel(UpdateProductModelPayload arg) {
        optimisticData.put(getKey("updateProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteProductModelPayload getDeleteProductModel() {
        return (DeleteProductModelPayload) get("deleteProductModel");
    }

    public Mutation setDeleteProductModel(DeleteProductModelPayload arg) {
        optimisticData.put(getKey("deleteProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public AddOfferPayload getAddOffer() {
        return (AddOfferPayload) get("addOffer");
    }

    public Mutation setAddOffer(AddOfferPayload arg) {
        optimisticData.put(getKey("addOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateOfferPayload getUpdateOffer() {
        return (UpdateOfferPayload) get("updateOffer");
    }

    public Mutation setUpdateOffer(UpdateOfferPayload arg) {
        optimisticData.put(getKey("updateOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteOfferPayload getDeleteOffer() {
        return (DeleteOfferPayload) get("deleteOffer");
    }

    public Mutation setDeleteOffer(DeleteOfferPayload arg) {
        optimisticData.put(getKey("deleteOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public AddEntryPointPayload getAddEntryPoint() {
        return (AddEntryPointPayload) get("addEntryPoint");
    }

    public Mutation setAddEntryPoint(AddEntryPointPayload arg) {
        optimisticData.put(getKey("addEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateEntryPointPayload getUpdateEntryPoint() {
        return (UpdateEntryPointPayload) get("updateEntryPoint");
    }

    public Mutation setUpdateEntryPoint(UpdateEntryPointPayload arg) {
        optimisticData.put(getKey("updateEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteEntryPointPayload getDeleteEntryPoint() {
        return (DeleteEntryPointPayload) get("deleteEntryPoint");
    }

    public Mutation setDeleteEntryPoint(DeleteEntryPointPayload arg) {
        optimisticData.put(getKey("deleteEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public AddSoftwareApplicationPayload getAddSoftwareApplication() {
        return (AddSoftwareApplicationPayload) get("addSoftwareApplication");
    }

    public Mutation setAddSoftwareApplication(AddSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("addSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateSoftwareApplicationPayload getUpdateSoftwareApplication() {
        return (UpdateSoftwareApplicationPayload) get("updateSoftwareApplication");
    }

    public Mutation setUpdateSoftwareApplication(UpdateSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("updateSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteSoftwareApplicationPayload getDeleteSoftwareApplication() {
        return (DeleteSoftwareApplicationPayload) get("deleteSoftwareApplication");
    }

    public Mutation setDeleteSoftwareApplication(DeleteSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("deleteSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public AddWebhookPayload getAddWebhook() {
        return (AddWebhookPayload) get("addWebhook");
    }

    public Mutation setAddWebhook(AddWebhookPayload arg) {
        optimisticData.put(getKey("addWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateWebhookPayload getUpdateWebhook() {
        return (UpdateWebhookPayload) get("updateWebhook");
    }

    public Mutation setUpdateWebhook(UpdateWebhookPayload arg) {
        optimisticData.put(getKey("updateWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteWebhookPayload getDeleteWebhook() {
        return (DeleteWebhookPayload) get("deleteWebhook");
    }

    public Mutation setDeleteWebhook(DeleteWebhookPayload arg) {
        optimisticData.put(getKey("deleteWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public AddCartPayload getAddCart() {
        return (AddCartPayload) get("addCart");
    }

    public Mutation setAddCart(AddCartPayload arg) {
        optimisticData.put(getKey("addCart"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateCartPayload getUpdateCart() {
        return (UpdateCartPayload) get("updateCart");
    }

    public Mutation setUpdateCart(UpdateCartPayload arg) {
        optimisticData.put(getKey("updateCart"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteCartPayload getDeleteCart() {
        return (DeleteCartPayload) get("deleteCart");
    }

    public Mutation setDeleteCart(DeleteCartPayload arg) {
        optimisticData.put(getKey("deleteCart"), arg);
        return this;
    }

    /**
    * 
    */

    public AddCartItemPayload getAddCartItem() {
        return (AddCartItemPayload) get("addCartItem");
    }

    public Mutation setAddCartItem(AddCartItemPayload arg) {
        optimisticData.put(getKey("addCartItem"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateCartItemPayload getUpdateCartItem() {
        return (UpdateCartItemPayload) get("updateCartItem");
    }

    public Mutation setUpdateCartItem(UpdateCartItemPayload arg) {
        optimisticData.put(getKey("updateCartItem"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteCartItemPayload getDeleteCartItem() {
        return (DeleteCartItemPayload) get("deleteCartItem");
    }

    public Mutation setDeleteCartItem(DeleteCartItemPayload arg) {
        optimisticData.put(getKey("deleteCartItem"), arg);
        return this;
    }

    /**
    * 
    */

    public AddCheckoutPayload getAddCheckout() {
        return (AddCheckoutPayload) get("addCheckout");
    }

    public Mutation setAddCheckout(AddCheckoutPayload arg) {
        optimisticData.put(getKey("addCheckout"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateCheckoutPayload getUpdateCheckout() {
        return (UpdateCheckoutPayload) get("updateCheckout");
    }

    public Mutation setUpdateCheckout(UpdateCheckoutPayload arg) {
        optimisticData.put(getKey("updateCheckout"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteCheckoutPayload getDeleteCheckout() {
        return (DeleteCheckoutPayload) get("deleteCheckout");
    }

    public Mutation setDeleteCheckout(DeleteCheckoutPayload arg) {
        optimisticData.put(getKey("deleteCheckout"), arg);
        return this;
    }

    /**
    * 
    */

    public AddCheckoutItemPayload getAddCheckoutItem() {
        return (AddCheckoutItemPayload) get("addCheckoutItem");
    }

    public Mutation setAddCheckoutItem(AddCheckoutItemPayload arg) {
        optimisticData.put(getKey("addCheckoutItem"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateCheckoutItemPayload getUpdateCheckoutItem() {
        return (UpdateCheckoutItemPayload) get("updateCheckoutItem");
    }

    public Mutation setUpdateCheckoutItem(UpdateCheckoutItemPayload arg) {
        optimisticData.put(getKey("updateCheckoutItem"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteCheckoutItemPayload getDeleteCheckoutItem() {
        return (DeleteCheckoutItemPayload) get("deleteCheckoutItem");
    }

    public Mutation setDeleteCheckoutItem(DeleteCheckoutItemPayload arg) {
        optimisticData.put(getKey("deleteCheckoutItem"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPoderPayload getAddPoder() {
        return (AddPoderPayload) get("addPoder");
    }

    public Mutation setAddPoder(AddPoderPayload arg) {
        optimisticData.put(getKey("addPoder"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePoderPayload getUpdatePoder() {
        return (UpdatePoderPayload) get("updatePoder");
    }

    public Mutation setUpdatePoder(UpdatePoderPayload arg) {
        optimisticData.put(getKey("updatePoder"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePoderPayload getDeletePoder() {
        return (DeletePoderPayload) get("deletePoder");
    }

    public Mutation setDeletePoder(DeletePoderPayload arg) {
        optimisticData.put(getKey("deletePoder"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPoderItemPayload getAddPoderItem() {
        return (AddPoderItemPayload) get("addPoderItem");
    }

    public Mutation setAddPoderItem(AddPoderItemPayload arg) {
        optimisticData.put(getKey("addPoderItem"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePoderItemPayload getUpdatePoderItem() {
        return (UpdatePoderItemPayload) get("updatePoderItem");
    }

    public Mutation setUpdatePoderItem(UpdatePoderItemPayload arg) {
        optimisticData.put(getKey("updatePoderItem"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePoderItemPayload getDeletePoderItem() {
        return (DeletePoderItemPayload) get("deletePoderItem");
    }

    public Mutation setDeletePoderItem(DeletePoderItemPayload arg) {
        optimisticData.put(getKey("deletePoderItem"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deleteNode": return true;

            case "updateThing": return true;

            case "deleteThing": return true;

            case "addNamespace": return true;

            case "updateNamespace": return true;

            case "deleteNamespace": return true;

            case "addPartyRoleName": return true;

            case "updatePartyRoleName": return true;

            case "deletePartyRoleName": return true;

            case "addDataCatalog": return true;

            case "updateDataCatalog": return true;

            case "deleteDataCatalog": return true;

            case "addConversation": return true;

            case "updateConversation": return true;

            case "deleteConversation": return true;

            case "addMessage": return true;

            case "updateMessage": return true;

            case "deleteMessage": return true;

            case "addReview": return true;

            case "updateReview": return true;

            case "deleteReview": return true;

            case "addReadNote": return true;

            case "updateReadNote": return true;

            case "deleteReadNote": return true;

            case "addGeneralOrganization": return true;

            case "updateGeneralOrganization": return true;

            case "deleteGeneralOrganization": return true;

            case "addEmployeeRole": return true;

            case "updateEmployeeRole": return true;

            case "deleteEmployeeRole": return true;

            case "addFollowerRole": return true;

            case "updateFollowerRole": return true;

            case "deleteFollowerRole": return true;

            case "addMemberRole": return true;

            case "updateMemberRole": return true;

            case "deleteMemberRole": return true;

            case "addOwnership": return true;

            case "updateOwnership": return true;

            case "deleteOwnership": return true;

            case "addUser": return true;

            case "updateUser": return true;

            case "deleteUser": return true;

            case "addPerson": return true;

            case "updatePerson": return true;

            case "deletePerson": return true;

            case "addStore": return true;

            case "updateStore": return true;

            case "deleteStore": return true;

            case "addProduct": return true;

            case "updateProduct": return true;

            case "deleteProduct": return true;

            case "addProductModel": return true;

            case "updateProductModel": return true;

            case "deleteProductModel": return true;

            case "addOffer": return true;

            case "updateOffer": return true;

            case "deleteOffer": return true;

            case "addEntryPoint": return true;

            case "updateEntryPoint": return true;

            case "deleteEntryPoint": return true;

            case "addSoftwareApplication": return true;

            case "updateSoftwareApplication": return true;

            case "deleteSoftwareApplication": return true;

            case "addWebhook": return true;

            case "updateWebhook": return true;

            case "deleteWebhook": return true;

            case "addCart": return true;

            case "updateCart": return true;

            case "deleteCart": return true;

            case "addCartItem": return true;

            case "updateCartItem": return true;

            case "deleteCartItem": return true;

            case "addCheckout": return true;

            case "updateCheckout": return true;

            case "deleteCheckout": return true;

            case "addCheckoutItem": return true;

            case "updateCheckoutItem": return true;

            case "deleteCheckoutItem": return true;

            case "addPoder": return true;

            case "updatePoder": return true;

            case "deletePoder": return true;

            case "addPoderItem": return true;

            case "updatePoderItem": return true;

            case "deletePoderItem": return true;

            default: return false;
        }
    }
}

