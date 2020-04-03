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
* 
*/
public class MutationQuery extends Query<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public MutationQuery deleteNode(NodeFilter filter, DeleteNodePayloadQueryDefinition queryDef) {
        startField("deleteNode");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteNodePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateThing(UpdateThingInput input, UpdateThingPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteThing(ThingFilter filter, DeleteThingPayloadQueryDefinition queryDef) {
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
    public MutationQuery addNamespace(List<AddNamespaceInput> input, AddNamespacePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateNamespace(UpdateNamespaceInput input, UpdateNamespacePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteNamespace(NamespaceFilter filter, DeleteNamespacePayloadQueryDefinition queryDef) {
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
    public MutationQuery addPartyRoleName(List<AddPartyRoleNameInput> input, AddPartyRoleNamePayloadQueryDefinition queryDef) {
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
    public MutationQuery updatePartyRoleName(UpdatePartyRoleNameInput input, UpdatePartyRoleNamePayloadQueryDefinition queryDef) {
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
    public MutationQuery deletePartyRoleName(PartyRoleNameFilter filter, DeletePartyRoleNamePayloadQueryDefinition queryDef) {
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
    public MutationQuery addDataCatalog(List<AddDataCatalogInput> input, AddDataCatalogPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateDataCatalog(UpdateDataCatalogInput input, UpdateDataCatalogPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteDataCatalog(DataCatalogFilter filter, DeleteDataCatalogPayloadQueryDefinition queryDef) {
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
    public MutationQuery addConversation(List<AddConversationInput> input, AddConversationPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateConversation(UpdateConversationInput input, UpdateConversationPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteConversation(ConversationFilter filter, DeleteConversationPayloadQueryDefinition queryDef) {
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
    public MutationQuery addMessage(List<AddMessageInput> input, AddMessagePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateMessage(UpdateMessageInput input, UpdateMessagePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteMessage(MessageFilter filter, DeleteMessagePayloadQueryDefinition queryDef) {
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
    public MutationQuery addReview(List<AddReviewInput> input, AddReviewPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateReview(UpdateReviewInput input, UpdateReviewPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteReview(ReviewFilter filter, DeleteReviewPayloadQueryDefinition queryDef) {
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
    public MutationQuery addReadNote(List<AddReadNoteInput> input, AddReadNotePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateReadNote(UpdateReadNoteInput input, UpdateReadNotePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteReadNote(ReadNoteFilter filter, DeleteReadNotePayloadQueryDefinition queryDef) {
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
    public MutationQuery addGeneralOrganization(List<AddGeneralOrganizationInput> input, AddGeneralOrganizationPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateGeneralOrganization(UpdateGeneralOrganizationInput input, UpdateGeneralOrganizationPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteGeneralOrganization(GeneralOrganizationFilter filter, DeleteGeneralOrganizationPayloadQueryDefinition queryDef) {
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
    public MutationQuery addEmployeeRole(List<AddEmployeeRoleInput> input, AddEmployeeRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateEmployeeRole(UpdateEmployeeRoleInput input, UpdateEmployeeRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteEmployeeRole(EmployeeRoleFilter filter, DeleteEmployeeRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery addFollowerRole(List<AddFollowerRoleInput> input, AddFollowerRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateFollowerRole(UpdateFollowerRoleInput input, UpdateFollowerRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteFollowerRole(FollowerRoleFilter filter, DeleteFollowerRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery addMemberRole(List<AddMemberRoleInput> input, AddMemberRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateMemberRole(UpdateMemberRoleInput input, UpdateMemberRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteMemberRole(MemberRoleFilter filter, DeleteMemberRolePayloadQueryDefinition queryDef) {
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
    public MutationQuery addOwnership(List<AddOwnershipInput> input, AddOwnershipPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateOwnership(UpdateOwnershipInput input, UpdateOwnershipPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteOwnership(OwnershipFilter filter, DeleteOwnershipPayloadQueryDefinition queryDef) {
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
    public MutationQuery addUser(List<AddUserInput> input, AddUserPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateUser(UpdateUserInput input, UpdateUserPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteUser(UserFilter filter, DeleteUserPayloadQueryDefinition queryDef) {
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
    public MutationQuery addPerson(List<AddPersonInput> input, AddPersonPayloadQueryDefinition queryDef) {
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
    public MutationQuery updatePerson(UpdatePersonInput input, UpdatePersonPayloadQueryDefinition queryDef) {
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
    public MutationQuery deletePerson(PersonFilter filter, DeletePersonPayloadQueryDefinition queryDef) {
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
    public MutationQuery addStore(List<AddStoreInput> input, AddStorePayloadQueryDefinition queryDef) {
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
    public MutationQuery updateStore(UpdateStoreInput input, UpdateStorePayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteStore(StoreFilter filter, DeleteStorePayloadQueryDefinition queryDef) {
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
    public MutationQuery addProduct(List<AddProductInput> input, AddProductPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateProduct(UpdateProductInput input, UpdateProductPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteProduct(ProductFilter filter, DeleteProductPayloadQueryDefinition queryDef) {
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
    public MutationQuery addProductModel(List<AddProductModelInput> input, AddProductModelPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateProductModel(UpdateProductModelInput input, UpdateProductModelPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteProductModel(ProductModelFilter filter, DeleteProductModelPayloadQueryDefinition queryDef) {
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
    public MutationQuery addOffer(List<AddOfferInput> input, AddOfferPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateOffer(UpdateOfferInput input, UpdateOfferPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteOffer(OfferFilter filter, DeleteOfferPayloadQueryDefinition queryDef) {
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
    public MutationQuery addEntryPoint(List<AddEntryPointInput> input, AddEntryPointPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateEntryPoint(UpdateEntryPointInput input, UpdateEntryPointPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteEntryPoint(EntryPointFilter filter, DeleteEntryPointPayloadQueryDefinition queryDef) {
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
    public MutationQuery addSoftwareApplication(List<AddSoftwareApplicationInput> input, AddSoftwareApplicationPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateSoftwareApplication(UpdateSoftwareApplicationInput input, UpdateSoftwareApplicationPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteSoftwareApplication(SoftwareApplicationFilter filter, DeleteSoftwareApplicationPayloadQueryDefinition queryDef) {
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
    public MutationQuery addWebhook(List<AddWebhookInput> input, AddWebhookPayloadQueryDefinition queryDef) {
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
    public MutationQuery updateWebhook(UpdateWebhookInput input, UpdateWebhookPayloadQueryDefinition queryDef) {
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
    public MutationQuery deleteWebhook(WebhookFilter filter, DeleteWebhookPayloadQueryDefinition queryDef) {
        startField("deleteWebhook");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteWebhookPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addCart(List<AddCartInput> input, AddCartPayloadQueryDefinition queryDef) {
        startField("addCart");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddCartInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddCartPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateCart(UpdateCartInput input, UpdateCartPayloadQueryDefinition queryDef) {
        startField("updateCart");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCartPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteCart(CartFilter filter, DeleteCartPayloadQueryDefinition queryDef) {
        startField("deleteCart");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCartPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addCartItem(List<AddCartItemInput> input, AddCartItemPayloadQueryDefinition queryDef) {
        startField("addCartItem");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddCartItemInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddCartItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateCartItem(UpdateCartItemInput input, UpdateCartItemPayloadQueryDefinition queryDef) {
        startField("updateCartItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCartItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteCartItem(CartItemFilter filter, DeleteCartItemPayloadQueryDefinition queryDef) {
        startField("deleteCartItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCartItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addCheckout(List<AddCheckoutInput> input, AddCheckoutPayloadQueryDefinition queryDef) {
        startField("addCheckout");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddCheckoutInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddCheckoutPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateCheckout(UpdateCheckoutInput input, UpdateCheckoutPayloadQueryDefinition queryDef) {
        startField("updateCheckout");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCheckoutPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteCheckout(CheckoutFilter filter, DeleteCheckoutPayloadQueryDefinition queryDef) {
        startField("deleteCheckout");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCheckoutPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addCheckoutItem(List<AddCheckoutItemInput> input, AddCheckoutItemPayloadQueryDefinition queryDef) {
        startField("addCheckoutItem");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddCheckoutItemInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddCheckoutItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updateCheckoutItem(UpdateCheckoutItemInput input, UpdateCheckoutItemPayloadQueryDefinition queryDef) {
        startField("updateCheckoutItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCheckoutItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deleteCheckoutItem(CheckoutItemFilter filter, DeleteCheckoutItemPayloadQueryDefinition queryDef) {
        startField("deleteCheckoutItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCheckoutItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addPoder(List<AddPoderInput> input, AddPoderPayloadQueryDefinition queryDef) {
        startField("addPoder");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddPoderInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddPoderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updatePoder(UpdatePoderInput input, UpdatePoderPayloadQueryDefinition queryDef) {
        startField("updatePoder");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePoderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deletePoder(PoderFilter filter, DeletePoderPayloadQueryDefinition queryDef) {
        startField("deletePoder");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePoderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery addPoderItem(List<AddPoderItemInput> input, AddPoderItemPayloadQueryDefinition queryDef) {
        startField("addPoderItem");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddPoderItemInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddPoderItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery updatePoderItem(UpdatePoderItemInput input, UpdatePoderItemPayloadQueryDefinition queryDef) {
        startField("updatePoderItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePoderItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationQuery deletePoderItem(PoderItemFilter filter, DeletePoderItemPayloadQueryDefinition queryDef) {
        startField("deletePoderItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePoderItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
