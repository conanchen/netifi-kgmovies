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
public class RootMutationQuery extends Query<RootMutationQuery> {
    RootMutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public RootMutationQuery updateThing(UpdateThingInput input, UpdateThingPayloadQueryDefinition queryDef) {
        startField("updateThing");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateThingPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteThing(ThingFilter filter, DeleteThingPayloadQueryDefinition queryDef) {
        startField("deleteThing");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteThingPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addNamespace(List<AddNamespaceInput> input, AddNamespacePayloadQueryDefinition queryDef) {
        startField("addNamespace");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddNamespaceInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddNamespacePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateNamespace(UpdateNamespaceInput input, UpdateNamespacePayloadQueryDefinition queryDef) {
        startField("updateNamespace");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateNamespacePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteNamespace(NamespaceFilter filter, DeleteNamespacePayloadQueryDefinition queryDef) {
        startField("deleteNamespace");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteNamespacePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addPartyRoleName(List<AddPartyRoleNameInput> input, AddPartyRoleNamePayloadQueryDefinition queryDef) {
        startField("addPartyRoleName");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddPartyRoleNameInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddPartyRoleNamePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updatePartyRoleName(UpdatePartyRoleNameInput input, UpdatePartyRoleNamePayloadQueryDefinition queryDef) {
        startField("updatePartyRoleName");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePartyRoleNamePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deletePartyRoleName(PartyRoleNameFilter filter, DeletePartyRoleNamePayloadQueryDefinition queryDef) {
        startField("deletePartyRoleName");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePartyRoleNamePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addDataCatalog(List<AddDataCatalogInput> input, AddDataCatalogPayloadQueryDefinition queryDef) {
        startField("addDataCatalog");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddDataCatalogInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddDataCatalogPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateDataCatalog(UpdateDataCatalogInput input, UpdateDataCatalogPayloadQueryDefinition queryDef) {
        startField("updateDataCatalog");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateDataCatalogPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteDataCatalog(DataCatalogFilter filter, DeleteDataCatalogPayloadQueryDefinition queryDef) {
        startField("deleteDataCatalog");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteDataCatalogPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addConversation(List<AddConversationInput> input, AddConversationPayloadQueryDefinition queryDef) {
        startField("addConversation");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddConversationInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddConversationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateConversation(UpdateConversationInput input, UpdateConversationPayloadQueryDefinition queryDef) {
        startField("updateConversation");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateConversationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteConversation(ConversationFilter filter, DeleteConversationPayloadQueryDefinition queryDef) {
        startField("deleteConversation");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteConversationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addMessage(List<AddMessageInput> input, AddMessagePayloadQueryDefinition queryDef) {
        startField("addMessage");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddMessageInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddMessagePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateMessage(UpdateMessageInput input, UpdateMessagePayloadQueryDefinition queryDef) {
        startField("updateMessage");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateMessagePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteMessage(MessageFilter filter, DeleteMessagePayloadQueryDefinition queryDef) {
        startField("deleteMessage");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteMessagePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addReview(List<AddReviewInput> input, AddReviewPayloadQueryDefinition queryDef) {
        startField("addReview");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddReviewInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateReview(UpdateReviewInput input, UpdateReviewPayloadQueryDefinition queryDef) {
        startField("updateReview");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteReview(ReviewFilter filter, DeleteReviewPayloadQueryDefinition queryDef) {
        startField("deleteReview");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteReviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addReadNote(List<AddReadNoteInput> input, AddReadNotePayloadQueryDefinition queryDef) {
        startField("addReadNote");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddReadNoteInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReadNotePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateReadNote(UpdateReadNoteInput input, UpdateReadNotePayloadQueryDefinition queryDef) {
        startField("updateReadNote");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateReadNotePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteReadNote(ReadNoteFilter filter, DeleteReadNotePayloadQueryDefinition queryDef) {
        startField("deleteReadNote");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteReadNotePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addGeneralOrganization(List<AddGeneralOrganizationInput> input, AddGeneralOrganizationPayloadQueryDefinition queryDef) {
        startField("addGeneralOrganization");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddGeneralOrganizationInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddGeneralOrganizationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateGeneralOrganization(UpdateGeneralOrganizationInput input, UpdateGeneralOrganizationPayloadQueryDefinition queryDef) {
        startField("updateGeneralOrganization");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateGeneralOrganizationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteGeneralOrganization(GeneralOrganizationFilter filter, DeleteGeneralOrganizationPayloadQueryDefinition queryDef) {
        startField("deleteGeneralOrganization");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteGeneralOrganizationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addEmployeeRole(List<AddEmployeeRoleInput> input, AddEmployeeRolePayloadQueryDefinition queryDef) {
        startField("addEmployeeRole");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddEmployeeRoleInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddEmployeeRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateEmployeeRole(UpdateEmployeeRoleInput input, UpdateEmployeeRolePayloadQueryDefinition queryDef) {
        startField("updateEmployeeRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateEmployeeRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteEmployeeRole(EmployeeRoleFilter filter, DeleteEmployeeRolePayloadQueryDefinition queryDef) {
        startField("deleteEmployeeRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteEmployeeRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addFollowerRole(List<AddFollowerRoleInput> input, AddFollowerRolePayloadQueryDefinition queryDef) {
        startField("addFollowerRole");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddFollowerRoleInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddFollowerRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateFollowerRole(UpdateFollowerRoleInput input, UpdateFollowerRolePayloadQueryDefinition queryDef) {
        startField("updateFollowerRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateFollowerRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteFollowerRole(FollowerRoleFilter filter, DeleteFollowerRolePayloadQueryDefinition queryDef) {
        startField("deleteFollowerRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteFollowerRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addMemberRole(List<AddMemberRoleInput> input, AddMemberRolePayloadQueryDefinition queryDef) {
        startField("addMemberRole");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddMemberRoleInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddMemberRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateMemberRole(UpdateMemberRoleInput input, UpdateMemberRolePayloadQueryDefinition queryDef) {
        startField("updateMemberRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateMemberRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteMemberRole(MemberRoleFilter filter, DeleteMemberRolePayloadQueryDefinition queryDef) {
        startField("deleteMemberRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteMemberRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addOwnership(List<AddOwnershipInput> input, AddOwnershipPayloadQueryDefinition queryDef) {
        startField("addOwnership");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddOwnershipInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddOwnershipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateOwnership(UpdateOwnershipInput input, UpdateOwnershipPayloadQueryDefinition queryDef) {
        startField("updateOwnership");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateOwnershipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteOwnership(OwnershipFilter filter, DeleteOwnershipPayloadQueryDefinition queryDef) {
        startField("deleteOwnership");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteOwnershipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addUser(List<AddUserInput> input, AddUserPayloadQueryDefinition queryDef) {
        startField("addUser");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddUserInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddUserPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateUser(UpdateUserInput input, UpdateUserPayloadQueryDefinition queryDef) {
        startField("updateUser");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateUserPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteUser(UserFilter filter, DeleteUserPayloadQueryDefinition queryDef) {
        startField("deleteUser");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteUserPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addPerson(List<AddPersonInput> input, AddPersonPayloadQueryDefinition queryDef) {
        startField("addPerson");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddPersonInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddPersonPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updatePerson(UpdatePersonInput input, UpdatePersonPayloadQueryDefinition queryDef) {
        startField("updatePerson");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePersonPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deletePerson(PersonFilter filter, DeletePersonPayloadQueryDefinition queryDef) {
        startField("deletePerson");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePersonPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addStore(List<AddStoreInput> input, AddStorePayloadQueryDefinition queryDef) {
        startField("addStore");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddStoreInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddStorePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateStore(UpdateStoreInput input, UpdateStorePayloadQueryDefinition queryDef) {
        startField("updateStore");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateStorePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteStore(StoreFilter filter, DeleteStorePayloadQueryDefinition queryDef) {
        startField("deleteStore");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteStorePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addProduct(List<AddProductInput> input, AddProductPayloadQueryDefinition queryDef) {
        startField("addProduct");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddProductInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateProduct(UpdateProductInput input, UpdateProductPayloadQueryDefinition queryDef) {
        startField("updateProduct");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteProduct(ProductFilter filter, DeleteProductPayloadQueryDefinition queryDef) {
        startField("deleteProduct");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProductPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addProductModel(List<AddProductModelInput> input, AddProductModelPayloadQueryDefinition queryDef) {
        startField("addProductModel");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddProductModelInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductModelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateProductModel(UpdateProductModelInput input, UpdateProductModelPayloadQueryDefinition queryDef) {
        startField("updateProductModel");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductModelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteProductModel(ProductModelFilter filter, DeleteProductModelPayloadQueryDefinition queryDef) {
        startField("deleteProductModel");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProductModelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addOffer(List<AddOfferInput> input, AddOfferPayloadQueryDefinition queryDef) {
        startField("addOffer");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddOfferInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddOfferPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateOffer(UpdateOfferInput input, UpdateOfferPayloadQueryDefinition queryDef) {
        startField("updateOffer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateOfferPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteOffer(OfferFilter filter, DeleteOfferPayloadQueryDefinition queryDef) {
        startField("deleteOffer");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteOfferPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addEntryPoint(List<AddEntryPointInput> input, AddEntryPointPayloadQueryDefinition queryDef) {
        startField("addEntryPoint");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddEntryPointInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddEntryPointPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateEntryPoint(UpdateEntryPointInput input, UpdateEntryPointPayloadQueryDefinition queryDef) {
        startField("updateEntryPoint");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateEntryPointPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteEntryPoint(EntryPointFilter filter, DeleteEntryPointPayloadQueryDefinition queryDef) {
        startField("deleteEntryPoint");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteEntryPointPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addSoftwareApplication(List<AddSoftwareApplicationInput> input, AddSoftwareApplicationPayloadQueryDefinition queryDef) {
        startField("addSoftwareApplication");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddSoftwareApplicationInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddSoftwareApplicationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateSoftwareApplication(UpdateSoftwareApplicationInput input, UpdateSoftwareApplicationPayloadQueryDefinition queryDef) {
        startField("updateSoftwareApplication");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateSoftwareApplicationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteSoftwareApplication(SoftwareApplicationFilter filter, DeleteSoftwareApplicationPayloadQueryDefinition queryDef) {
        startField("deleteSoftwareApplication");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteSoftwareApplicationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery addWebhook(List<AddWebhookInput> input, AddWebhookPayloadQueryDefinition queryDef) {
        startField("addWebhook");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddWebhookInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddWebhookPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery updateWebhook(UpdateWebhookInput input, UpdateWebhookPayloadQueryDefinition queryDef) {
        startField("updateWebhook");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateWebhookPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public RootMutationQuery deleteWebhook(WebhookFilter filter, DeleteWebhookPayloadQueryDefinition queryDef) {
        startField("deleteWebhook");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteWebhookPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
