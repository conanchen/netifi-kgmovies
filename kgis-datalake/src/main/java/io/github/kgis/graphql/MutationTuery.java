// Generated from graphql_java_gen gem  with template Tuery.java.erb

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
public class MutationTuery extends Tuery<MutationTuery> {
    MutationTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public MutationTuery deleteNode(NodeFilter filter, DeleteNodePayloadTueryDefinition queryDef) {
        startField("deleteNode");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteNodePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateThing(UpdateThingInput input, UpdateThingPayloadTueryDefinition queryDef) {
        startField("updateThing");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateThingPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteThing(ThingFilter filter, DeleteThingPayloadTueryDefinition queryDef) {
        startField("deleteThing");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteThingPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addNamespace(List<AddNamespaceInput> input, AddNamespacePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddNamespacePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateNamespace(UpdateNamespaceInput input, UpdateNamespacePayloadTueryDefinition queryDef) {
        startField("updateNamespace");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateNamespacePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteNamespace(NamespaceFilter filter, DeleteNamespacePayloadTueryDefinition queryDef) {
        startField("deleteNamespace");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteNamespacePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addPartyRoleName(List<AddPartyRoleNameInput> input, AddPartyRoleNamePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddPartyRoleNamePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updatePartyRoleName(UpdatePartyRoleNameInput input, UpdatePartyRoleNamePayloadTueryDefinition queryDef) {
        startField("updatePartyRoleName");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePartyRoleNamePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deletePartyRoleName(PartyRoleNameFilter filter, DeletePartyRoleNamePayloadTueryDefinition queryDef) {
        startField("deletePartyRoleName");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePartyRoleNamePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addDataCatalog(List<AddDataCatalogInput> input, AddDataCatalogPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddDataCatalogPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateDataCatalog(UpdateDataCatalogInput input, UpdateDataCatalogPayloadTueryDefinition queryDef) {
        startField("updateDataCatalog");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateDataCatalogPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteDataCatalog(DataCatalogFilter filter, DeleteDataCatalogPayloadTueryDefinition queryDef) {
        startField("deleteDataCatalog");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteDataCatalogPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addConversation(List<AddConversationInput> input, AddConversationPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddConversationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateConversation(UpdateConversationInput input, UpdateConversationPayloadTueryDefinition queryDef) {
        startField("updateConversation");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateConversationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteConversation(ConversationFilter filter, DeleteConversationPayloadTueryDefinition queryDef) {
        startField("deleteConversation");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteConversationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addMessage(List<AddMessageInput> input, AddMessagePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddMessagePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateMessage(UpdateMessageInput input, UpdateMessagePayloadTueryDefinition queryDef) {
        startField("updateMessage");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateMessagePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteMessage(MessageFilter filter, DeleteMessagePayloadTueryDefinition queryDef) {
        startField("deleteMessage");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteMessagePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addReview(List<AddReviewInput> input, AddReviewPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddReviewPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateReview(UpdateReviewInput input, UpdateReviewPayloadTueryDefinition queryDef) {
        startField("updateReview");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateReviewPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteReview(ReviewFilter filter, DeleteReviewPayloadTueryDefinition queryDef) {
        startField("deleteReview");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteReviewPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addReadNote(List<AddReadNoteInput> input, AddReadNotePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddReadNotePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateReadNote(UpdateReadNoteInput input, UpdateReadNotePayloadTueryDefinition queryDef) {
        startField("updateReadNote");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateReadNotePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteReadNote(ReadNoteFilter filter, DeleteReadNotePayloadTueryDefinition queryDef) {
        startField("deleteReadNote");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteReadNotePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addGeneralOrganization(List<AddGeneralOrganizationInput> input, AddGeneralOrganizationPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddGeneralOrganizationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateGeneralOrganization(UpdateGeneralOrganizationInput input, UpdateGeneralOrganizationPayloadTueryDefinition queryDef) {
        startField("updateGeneralOrganization");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateGeneralOrganizationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteGeneralOrganization(GeneralOrganizationFilter filter, DeleteGeneralOrganizationPayloadTueryDefinition queryDef) {
        startField("deleteGeneralOrganization");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteGeneralOrganizationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addEmployeeRole(List<AddEmployeeRoleInput> input, AddEmployeeRolePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddEmployeeRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateEmployeeRole(UpdateEmployeeRoleInput input, UpdateEmployeeRolePayloadTueryDefinition queryDef) {
        startField("updateEmployeeRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateEmployeeRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteEmployeeRole(EmployeeRoleFilter filter, DeleteEmployeeRolePayloadTueryDefinition queryDef) {
        startField("deleteEmployeeRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteEmployeeRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addFollowerRole(List<AddFollowerRoleInput> input, AddFollowerRolePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddFollowerRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateFollowerRole(UpdateFollowerRoleInput input, UpdateFollowerRolePayloadTueryDefinition queryDef) {
        startField("updateFollowerRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateFollowerRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteFollowerRole(FollowerRoleFilter filter, DeleteFollowerRolePayloadTueryDefinition queryDef) {
        startField("deleteFollowerRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteFollowerRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addMemberRole(List<AddMemberRoleInput> input, AddMemberRolePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddMemberRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateMemberRole(UpdateMemberRoleInput input, UpdateMemberRolePayloadTueryDefinition queryDef) {
        startField("updateMemberRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateMemberRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteMemberRole(MemberRoleFilter filter, DeleteMemberRolePayloadTueryDefinition queryDef) {
        startField("deleteMemberRole");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteMemberRolePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addOwnership(List<AddOwnershipInput> input, AddOwnershipPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddOwnershipPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateOwnership(UpdateOwnershipInput input, UpdateOwnershipPayloadTueryDefinition queryDef) {
        startField("updateOwnership");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateOwnershipPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteOwnership(OwnershipFilter filter, DeleteOwnershipPayloadTueryDefinition queryDef) {
        startField("deleteOwnership");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteOwnershipPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addUser(List<AddUserInput> input, AddUserPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddUserPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateUser(UpdateUserInput input, UpdateUserPayloadTueryDefinition queryDef) {
        startField("updateUser");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateUserPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteUser(UserFilter filter, DeleteUserPayloadTueryDefinition queryDef) {
        startField("deleteUser");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteUserPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addPerson(List<AddPersonInput> input, AddPersonPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddPersonPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updatePerson(UpdatePersonInput input, UpdatePersonPayloadTueryDefinition queryDef) {
        startField("updatePerson");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePersonPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deletePerson(PersonFilter filter, DeletePersonPayloadTueryDefinition queryDef) {
        startField("deletePerson");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePersonPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addStore(List<AddStoreInput> input, AddStorePayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddStorePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateStore(UpdateStoreInput input, UpdateStorePayloadTueryDefinition queryDef) {
        startField("updateStore");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateStorePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteStore(StoreFilter filter, DeleteStorePayloadTueryDefinition queryDef) {
        startField("deleteStore");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteStorePayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addProduct(List<AddProductInput> input, AddProductPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddProductPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateProduct(UpdateProductInput input, UpdateProductPayloadTueryDefinition queryDef) {
        startField("updateProduct");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteProduct(ProductFilter filter, DeleteProductPayloadTueryDefinition queryDef) {
        startField("deleteProduct");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProductPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addProductModel(List<AddProductModelInput> input, AddProductModelPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddProductModelPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateProductModel(UpdateProductModelInput input, UpdateProductModelPayloadTueryDefinition queryDef) {
        startField("updateProductModel");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductModelPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteProductModel(ProductModelFilter filter, DeleteProductModelPayloadTueryDefinition queryDef) {
        startField("deleteProductModel");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProductModelPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addOffer(List<AddOfferInput> input, AddOfferPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddOfferPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateOffer(UpdateOfferInput input, UpdateOfferPayloadTueryDefinition queryDef) {
        startField("updateOffer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateOfferPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteOffer(OfferFilter filter, DeleteOfferPayloadTueryDefinition queryDef) {
        startField("deleteOffer");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteOfferPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addEntryPoint(List<AddEntryPointInput> input, AddEntryPointPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddEntryPointPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateEntryPoint(UpdateEntryPointInput input, UpdateEntryPointPayloadTueryDefinition queryDef) {
        startField("updateEntryPoint");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateEntryPointPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteEntryPoint(EntryPointFilter filter, DeleteEntryPointPayloadTueryDefinition queryDef) {
        startField("deleteEntryPoint");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteEntryPointPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addSoftwareApplication(List<AddSoftwareApplicationInput> input, AddSoftwareApplicationPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddSoftwareApplicationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateSoftwareApplication(UpdateSoftwareApplicationInput input, UpdateSoftwareApplicationPayloadTueryDefinition queryDef) {
        startField("updateSoftwareApplication");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateSoftwareApplicationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteSoftwareApplication(SoftwareApplicationFilter filter, DeleteSoftwareApplicationPayloadTueryDefinition queryDef) {
        startField("deleteSoftwareApplication");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteSoftwareApplicationPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addWebhook(List<AddWebhookInput> input, AddWebhookPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddWebhookPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateWebhook(UpdateWebhookInput input, UpdateWebhookPayloadTueryDefinition queryDef) {
        startField("updateWebhook");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateWebhookPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteWebhook(WebhookFilter filter, DeleteWebhookPayloadTueryDefinition queryDef) {
        startField("deleteWebhook");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteWebhookPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addCart(List<AddCartInput> input, AddCartPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddCartPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateCart(UpdateCartInput input, UpdateCartPayloadTueryDefinition queryDef) {
        startField("updateCart");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCartPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteCart(CartFilter filter, DeleteCartPayloadTueryDefinition queryDef) {
        startField("deleteCart");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCartPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addCartItem(List<AddCartItemInput> input, AddCartItemPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddCartItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateCartItem(UpdateCartItemInput input, UpdateCartItemPayloadTueryDefinition queryDef) {
        startField("updateCartItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCartItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteCartItem(CartItemFilter filter, DeleteCartItemPayloadTueryDefinition queryDef) {
        startField("deleteCartItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCartItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addCheckout(List<AddCheckoutInput> input, AddCheckoutPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddCheckoutPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateCheckout(UpdateCheckoutInput input, UpdateCheckoutPayloadTueryDefinition queryDef) {
        startField("updateCheckout");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCheckoutPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteCheckout(CheckoutFilter filter, DeleteCheckoutPayloadTueryDefinition queryDef) {
        startField("deleteCheckout");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCheckoutPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addCheckoutItem(List<AddCheckoutItemInput> input, AddCheckoutItemPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddCheckoutItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updateCheckoutItem(UpdateCheckoutItemInput input, UpdateCheckoutItemPayloadTueryDefinition queryDef) {
        startField("updateCheckoutItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCheckoutItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deleteCheckoutItem(CheckoutItemFilter filter, DeleteCheckoutItemPayloadTueryDefinition queryDef) {
        startField("deleteCheckoutItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCheckoutItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addPoder(List<AddPoderInput> input, AddPoderPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddPoderPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updatePoder(UpdatePoderInput input, UpdatePoderPayloadTueryDefinition queryDef) {
        startField("updatePoder");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePoderPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deletePoder(PoderFilter filter, DeletePoderPayloadTueryDefinition queryDef) {
        startField("deletePoder");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePoderPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery addPoderItem(List<AddPoderItemInput> input, AddPoderItemPayloadTueryDefinition queryDef) {
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
        queryDef.define(new AddPoderItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery updatePoderItem(UpdatePoderItemInput input, UpdatePoderItemPayloadTueryDefinition queryDef) {
        startField("updatePoderItem");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdatePoderItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public MutationTuery deletePoderItem(PoderItemFilter filter, DeletePoderItemPayloadTueryDefinition queryDef) {
        startField("deletePoderItem");

        _queryBuilder.append("(filter:");
        filter.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePoderItemPayloadTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
