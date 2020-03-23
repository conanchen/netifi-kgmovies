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
public class RootMutation extends AbstractResponse<RootMutation> {
    public RootMutation() {
    }

    public RootMutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
        return "RootMutation";
    }

    /**
    * 
    */

    public UpdateThingPayload getUpdateThing() {
        return (UpdateThingPayload) get("updateThing");
    }

    public RootMutation setUpdateThing(UpdateThingPayload arg) {
        optimisticData.put(getKey("updateThing"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteThingPayload getDeleteThing() {
        return (DeleteThingPayload) get("deleteThing");
    }

    public RootMutation setDeleteThing(DeleteThingPayload arg) {
        optimisticData.put(getKey("deleteThing"), arg);
        return this;
    }

    /**
    * 
    */

    public AddNamespacePayload getAddNamespace() {
        return (AddNamespacePayload) get("addNamespace");
    }

    public RootMutation setAddNamespace(AddNamespacePayload arg) {
        optimisticData.put(getKey("addNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateNamespacePayload getUpdateNamespace() {
        return (UpdateNamespacePayload) get("updateNamespace");
    }

    public RootMutation setUpdateNamespace(UpdateNamespacePayload arg) {
        optimisticData.put(getKey("updateNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteNamespacePayload getDeleteNamespace() {
        return (DeleteNamespacePayload) get("deleteNamespace");
    }

    public RootMutation setDeleteNamespace(DeleteNamespacePayload arg) {
        optimisticData.put(getKey("deleteNamespace"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPartyRoleNamePayload getAddPartyRoleName() {
        return (AddPartyRoleNamePayload) get("addPartyRoleName");
    }

    public RootMutation setAddPartyRoleName(AddPartyRoleNamePayload arg) {
        optimisticData.put(getKey("addPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePartyRoleNamePayload getUpdatePartyRoleName() {
        return (UpdatePartyRoleNamePayload) get("updatePartyRoleName");
    }

    public RootMutation setUpdatePartyRoleName(UpdatePartyRoleNamePayload arg) {
        optimisticData.put(getKey("updatePartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePartyRoleNamePayload getDeletePartyRoleName() {
        return (DeletePartyRoleNamePayload) get("deletePartyRoleName");
    }

    public RootMutation setDeletePartyRoleName(DeletePartyRoleNamePayload arg) {
        optimisticData.put(getKey("deletePartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public AddDataCatalogPayload getAddDataCatalog() {
        return (AddDataCatalogPayload) get("addDataCatalog");
    }

    public RootMutation setAddDataCatalog(AddDataCatalogPayload arg) {
        optimisticData.put(getKey("addDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateDataCatalogPayload getUpdateDataCatalog() {
        return (UpdateDataCatalogPayload) get("updateDataCatalog");
    }

    public RootMutation setUpdateDataCatalog(UpdateDataCatalogPayload arg) {
        optimisticData.put(getKey("updateDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteDataCatalogPayload getDeleteDataCatalog() {
        return (DeleteDataCatalogPayload) get("deleteDataCatalog");
    }

    public RootMutation setDeleteDataCatalog(DeleteDataCatalogPayload arg) {
        optimisticData.put(getKey("deleteDataCatalog"), arg);
        return this;
    }

    /**
    * 
    */

    public AddConversationPayload getAddConversation() {
        return (AddConversationPayload) get("addConversation");
    }

    public RootMutation setAddConversation(AddConversationPayload arg) {
        optimisticData.put(getKey("addConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateConversationPayload getUpdateConversation() {
        return (UpdateConversationPayload) get("updateConversation");
    }

    public RootMutation setUpdateConversation(UpdateConversationPayload arg) {
        optimisticData.put(getKey("updateConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteConversationPayload getDeleteConversation() {
        return (DeleteConversationPayload) get("deleteConversation");
    }

    public RootMutation setDeleteConversation(DeleteConversationPayload arg) {
        optimisticData.put(getKey("deleteConversation"), arg);
        return this;
    }

    /**
    * 
    */

    public AddMessagePayload getAddMessage() {
        return (AddMessagePayload) get("addMessage");
    }

    public RootMutation setAddMessage(AddMessagePayload arg) {
        optimisticData.put(getKey("addMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateMessagePayload getUpdateMessage() {
        return (UpdateMessagePayload) get("updateMessage");
    }

    public RootMutation setUpdateMessage(UpdateMessagePayload arg) {
        optimisticData.put(getKey("updateMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteMessagePayload getDeleteMessage() {
        return (DeleteMessagePayload) get("deleteMessage");
    }

    public RootMutation setDeleteMessage(DeleteMessagePayload arg) {
        optimisticData.put(getKey("deleteMessage"), arg);
        return this;
    }

    /**
    * 
    */

    public AddReviewPayload getAddReview() {
        return (AddReviewPayload) get("addReview");
    }

    public RootMutation setAddReview(AddReviewPayload arg) {
        optimisticData.put(getKey("addReview"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateReviewPayload getUpdateReview() {
        return (UpdateReviewPayload) get("updateReview");
    }

    public RootMutation setUpdateReview(UpdateReviewPayload arg) {
        optimisticData.put(getKey("updateReview"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteReviewPayload getDeleteReview() {
        return (DeleteReviewPayload) get("deleteReview");
    }

    public RootMutation setDeleteReview(DeleteReviewPayload arg) {
        optimisticData.put(getKey("deleteReview"), arg);
        return this;
    }

    /**
    * 
    */

    public AddReadNotePayload getAddReadNote() {
        return (AddReadNotePayload) get("addReadNote");
    }

    public RootMutation setAddReadNote(AddReadNotePayload arg) {
        optimisticData.put(getKey("addReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateReadNotePayload getUpdateReadNote() {
        return (UpdateReadNotePayload) get("updateReadNote");
    }

    public RootMutation setUpdateReadNote(UpdateReadNotePayload arg) {
        optimisticData.put(getKey("updateReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteReadNotePayload getDeleteReadNote() {
        return (DeleteReadNotePayload) get("deleteReadNote");
    }

    public RootMutation setDeleteReadNote(DeleteReadNotePayload arg) {
        optimisticData.put(getKey("deleteReadNote"), arg);
        return this;
    }

    /**
    * 
    */

    public AddGeneralOrganizationPayload getAddGeneralOrganization() {
        return (AddGeneralOrganizationPayload) get("addGeneralOrganization");
    }

    public RootMutation setAddGeneralOrganization(AddGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("addGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateGeneralOrganizationPayload getUpdateGeneralOrganization() {
        return (UpdateGeneralOrganizationPayload) get("updateGeneralOrganization");
    }

    public RootMutation setUpdateGeneralOrganization(UpdateGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("updateGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteGeneralOrganizationPayload getDeleteGeneralOrganization() {
        return (DeleteGeneralOrganizationPayload) get("deleteGeneralOrganization");
    }

    public RootMutation setDeleteGeneralOrganization(DeleteGeneralOrganizationPayload arg) {
        optimisticData.put(getKey("deleteGeneralOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public AddEmployeeRolePayload getAddEmployeeRole() {
        return (AddEmployeeRolePayload) get("addEmployeeRole");
    }

    public RootMutation setAddEmployeeRole(AddEmployeeRolePayload arg) {
        optimisticData.put(getKey("addEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateEmployeeRolePayload getUpdateEmployeeRole() {
        return (UpdateEmployeeRolePayload) get("updateEmployeeRole");
    }

    public RootMutation setUpdateEmployeeRole(UpdateEmployeeRolePayload arg) {
        optimisticData.put(getKey("updateEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteEmployeeRolePayload getDeleteEmployeeRole() {
        return (DeleteEmployeeRolePayload) get("deleteEmployeeRole");
    }

    public RootMutation setDeleteEmployeeRole(DeleteEmployeeRolePayload arg) {
        optimisticData.put(getKey("deleteEmployeeRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddFollowerRolePayload getAddFollowerRole() {
        return (AddFollowerRolePayload) get("addFollowerRole");
    }

    public RootMutation setAddFollowerRole(AddFollowerRolePayload arg) {
        optimisticData.put(getKey("addFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateFollowerRolePayload getUpdateFollowerRole() {
        return (UpdateFollowerRolePayload) get("updateFollowerRole");
    }

    public RootMutation setUpdateFollowerRole(UpdateFollowerRolePayload arg) {
        optimisticData.put(getKey("updateFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteFollowerRolePayload getDeleteFollowerRole() {
        return (DeleteFollowerRolePayload) get("deleteFollowerRole");
    }

    public RootMutation setDeleteFollowerRole(DeleteFollowerRolePayload arg) {
        optimisticData.put(getKey("deleteFollowerRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddMemberRolePayload getAddMemberRole() {
        return (AddMemberRolePayload) get("addMemberRole");
    }

    public RootMutation setAddMemberRole(AddMemberRolePayload arg) {
        optimisticData.put(getKey("addMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateMemberRolePayload getUpdateMemberRole() {
        return (UpdateMemberRolePayload) get("updateMemberRole");
    }

    public RootMutation setUpdateMemberRole(UpdateMemberRolePayload arg) {
        optimisticData.put(getKey("updateMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteMemberRolePayload getDeleteMemberRole() {
        return (DeleteMemberRolePayload) get("deleteMemberRole");
    }

    public RootMutation setDeleteMemberRole(DeleteMemberRolePayload arg) {
        optimisticData.put(getKey("deleteMemberRole"), arg);
        return this;
    }

    /**
    * 
    */

    public AddOwnershipPayload getAddOwnership() {
        return (AddOwnershipPayload) get("addOwnership");
    }

    public RootMutation setAddOwnership(AddOwnershipPayload arg) {
        optimisticData.put(getKey("addOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateOwnershipPayload getUpdateOwnership() {
        return (UpdateOwnershipPayload) get("updateOwnership");
    }

    public RootMutation setUpdateOwnership(UpdateOwnershipPayload arg) {
        optimisticData.put(getKey("updateOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteOwnershipPayload getDeleteOwnership() {
        return (DeleteOwnershipPayload) get("deleteOwnership");
    }

    public RootMutation setDeleteOwnership(DeleteOwnershipPayload arg) {
        optimisticData.put(getKey("deleteOwnership"), arg);
        return this;
    }

    /**
    * 
    */

    public AddUserPayload getAddUser() {
        return (AddUserPayload) get("addUser");
    }

    public RootMutation setAddUser(AddUserPayload arg) {
        optimisticData.put(getKey("addUser"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateUserPayload getUpdateUser() {
        return (UpdateUserPayload) get("updateUser");
    }

    public RootMutation setUpdateUser(UpdateUserPayload arg) {
        optimisticData.put(getKey("updateUser"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteUserPayload getDeleteUser() {
        return (DeleteUserPayload) get("deleteUser");
    }

    public RootMutation setDeleteUser(DeleteUserPayload arg) {
        optimisticData.put(getKey("deleteUser"), arg);
        return this;
    }

    /**
    * 
    */

    public AddPersonPayload getAddPerson() {
        return (AddPersonPayload) get("addPerson");
    }

    public RootMutation setAddPerson(AddPersonPayload arg) {
        optimisticData.put(getKey("addPerson"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdatePersonPayload getUpdatePerson() {
        return (UpdatePersonPayload) get("updatePerson");
    }

    public RootMutation setUpdatePerson(UpdatePersonPayload arg) {
        optimisticData.put(getKey("updatePerson"), arg);
        return this;
    }

    /**
    * 
    */

    public DeletePersonPayload getDeletePerson() {
        return (DeletePersonPayload) get("deletePerson");
    }

    public RootMutation setDeletePerson(DeletePersonPayload arg) {
        optimisticData.put(getKey("deletePerson"), arg);
        return this;
    }

    /**
    * 
    */

    public AddStorePayload getAddStore() {
        return (AddStorePayload) get("addStore");
    }

    public RootMutation setAddStore(AddStorePayload arg) {
        optimisticData.put(getKey("addStore"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateStorePayload getUpdateStore() {
        return (UpdateStorePayload) get("updateStore");
    }

    public RootMutation setUpdateStore(UpdateStorePayload arg) {
        optimisticData.put(getKey("updateStore"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteStorePayload getDeleteStore() {
        return (DeleteStorePayload) get("deleteStore");
    }

    public RootMutation setDeleteStore(DeleteStorePayload arg) {
        optimisticData.put(getKey("deleteStore"), arg);
        return this;
    }

    /**
    * 
    */

    public AddProductPayload getAddProduct() {
        return (AddProductPayload) get("addProduct");
    }

    public RootMutation setAddProduct(AddProductPayload arg) {
        optimisticData.put(getKey("addProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateProductPayload getUpdateProduct() {
        return (UpdateProductPayload) get("updateProduct");
    }

    public RootMutation setUpdateProduct(UpdateProductPayload arg) {
        optimisticData.put(getKey("updateProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteProductPayload getDeleteProduct() {
        return (DeleteProductPayload) get("deleteProduct");
    }

    public RootMutation setDeleteProduct(DeleteProductPayload arg) {
        optimisticData.put(getKey("deleteProduct"), arg);
        return this;
    }

    /**
    * 
    */

    public AddProductModelPayload getAddProductModel() {
        return (AddProductModelPayload) get("addProductModel");
    }

    public RootMutation setAddProductModel(AddProductModelPayload arg) {
        optimisticData.put(getKey("addProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateProductModelPayload getUpdateProductModel() {
        return (UpdateProductModelPayload) get("updateProductModel");
    }

    public RootMutation setUpdateProductModel(UpdateProductModelPayload arg) {
        optimisticData.put(getKey("updateProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteProductModelPayload getDeleteProductModel() {
        return (DeleteProductModelPayload) get("deleteProductModel");
    }

    public RootMutation setDeleteProductModel(DeleteProductModelPayload arg) {
        optimisticData.put(getKey("deleteProductModel"), arg);
        return this;
    }

    /**
    * 
    */

    public AddOfferPayload getAddOffer() {
        return (AddOfferPayload) get("addOffer");
    }

    public RootMutation setAddOffer(AddOfferPayload arg) {
        optimisticData.put(getKey("addOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateOfferPayload getUpdateOffer() {
        return (UpdateOfferPayload) get("updateOffer");
    }

    public RootMutation setUpdateOffer(UpdateOfferPayload arg) {
        optimisticData.put(getKey("updateOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteOfferPayload getDeleteOffer() {
        return (DeleteOfferPayload) get("deleteOffer");
    }

    public RootMutation setDeleteOffer(DeleteOfferPayload arg) {
        optimisticData.put(getKey("deleteOffer"), arg);
        return this;
    }

    /**
    * 
    */

    public AddEntryPointPayload getAddEntryPoint() {
        return (AddEntryPointPayload) get("addEntryPoint");
    }

    public RootMutation setAddEntryPoint(AddEntryPointPayload arg) {
        optimisticData.put(getKey("addEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateEntryPointPayload getUpdateEntryPoint() {
        return (UpdateEntryPointPayload) get("updateEntryPoint");
    }

    public RootMutation setUpdateEntryPoint(UpdateEntryPointPayload arg) {
        optimisticData.put(getKey("updateEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteEntryPointPayload getDeleteEntryPoint() {
        return (DeleteEntryPointPayload) get("deleteEntryPoint");
    }

    public RootMutation setDeleteEntryPoint(DeleteEntryPointPayload arg) {
        optimisticData.put(getKey("deleteEntryPoint"), arg);
        return this;
    }

    /**
    * 
    */

    public AddSoftwareApplicationPayload getAddSoftwareApplication() {
        return (AddSoftwareApplicationPayload) get("addSoftwareApplication");
    }

    public RootMutation setAddSoftwareApplication(AddSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("addSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateSoftwareApplicationPayload getUpdateSoftwareApplication() {
        return (UpdateSoftwareApplicationPayload) get("updateSoftwareApplication");
    }

    public RootMutation setUpdateSoftwareApplication(UpdateSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("updateSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteSoftwareApplicationPayload getDeleteSoftwareApplication() {
        return (DeleteSoftwareApplicationPayload) get("deleteSoftwareApplication");
    }

    public RootMutation setDeleteSoftwareApplication(DeleteSoftwareApplicationPayload arg) {
        optimisticData.put(getKey("deleteSoftwareApplication"), arg);
        return this;
    }

    /**
    * 
    */

    public AddWebhookPayload getAddWebhook() {
        return (AddWebhookPayload) get("addWebhook");
    }

    public RootMutation setAddWebhook(AddWebhookPayload arg) {
        optimisticData.put(getKey("addWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public UpdateWebhookPayload getUpdateWebhook() {
        return (UpdateWebhookPayload) get("updateWebhook");
    }

    public RootMutation setUpdateWebhook(UpdateWebhookPayload arg) {
        optimisticData.put(getKey("updateWebhook"), arg);
        return this;
    }

    /**
    * 
    */

    public DeleteWebhookPayload getDeleteWebhook() {
        return (DeleteWebhookPayload) get("deleteWebhook");
    }

    public RootMutation setDeleteWebhook(DeleteWebhookPayload arg) {
        optimisticData.put(getKey("deleteWebhook"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
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

            default: return false;
        }
    }
}

