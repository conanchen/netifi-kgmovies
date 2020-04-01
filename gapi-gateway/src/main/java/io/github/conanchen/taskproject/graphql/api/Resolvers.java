package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.taskproject.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface Project {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(ProjectGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(ProjectGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Issue {
    // KK
        public Connection<UserGQO> participants(IssueGQO parent,String after, Integer first, String before, Integer last, DataFetchingEnvironment env);
    }
    public interface Task {
    // KK
    }
    public interface TaskAssignment {
    // KK
    }
    public interface TaskStatus {
    // KK
    }
    public interface PersonActivityTimeline {
    // KK
    }
}