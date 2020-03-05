package io.github.config;

import graphql.kickstart.execution.context.DefaultGraphQLContext;
import graphql.kickstart.execution.context.GraphQLContext;
import graphql.servlet.context.DefaultGraphQLServletContext;
import graphql.servlet.context.DefaultGraphQLWebSocketContext;
import graphql.servlet.context.GraphQLServletContextBuilder;
import org.dataloader.DataLoaderRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import java.security.AccessControlContext;
import java.security.ProtectionDomain;

@Component
public class CustomGraphQLContextBuilder implements GraphQLServletContextBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(CustomGraphQLContextBuilder.class);


//    private final CustomerRepository customerRepository;
//
//    public CustomGraphQLContextBuilder(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Override
    public GraphQLContext build(HttpServletRequest req, HttpServletResponse response) {
        // TODO: setting authorization information here?
        // http://www.javased.com/index.php?source_dir=rundeck/core/src/test/java/com/dtolabs/rundeck/core/authorization/TestSAREAuthorization.java
        // https://github.com/rundeck/rundeck/blob/master/core/src/main/java/com/dtolabs/rundeck/core/cli/acl/AclTool.java
        // TODO: 参看 kafka的 https://github.com/open-policy-agent/contrib/tree/master/kafka_authorizer
        // TODO: 参看 https://www.openpolicyagent.org/docs/latest/http-api-authorization/
        // https://github.com/howtographql/graphql-java/blob/master/src/main/java/com/howtographql/hackernews/GraphQLEndpoint.java
        LOG.info("public GraphQLContext build(HttpServletRequest req, HttpServletResponse response)");
        return DefaultGraphQLServletContext.createServletContext(buildDataLoaderRegistry(), null).with(req).with(response)
                .with(Subject.getSubject(new AccessControlContext(new ProtectionDomain[]{})))
                .build();


    }

    // @Override
    // protected GraphQLContext createContext(Optional<HttpServletRequest> request, Optional<HttpServletResponse> response) {
    //     User user = request
    //             .map(req -> req.getHeader("Authorization"))
    //             .filter(id -> !id.isEmpty())
    //             .map(id -> id.replace("Bearer ", ""))
    //             .map(userRepository::findById)
    //             .orElse(null);
    //     return new AuthContext(user, request, response);
    // }
    @Override
    public GraphQLContext build() {
        return new DefaultGraphQLContext(buildDataLoaderRegistry(), null);
    }

    @Override
    public GraphQLContext build(Session session, HandshakeRequest request) {
        return DefaultGraphQLWebSocketContext.createWebSocketContext(buildDataLoaderRegistry(), null).with(session)
                .with(request).build();
    }

    private DataLoaderRegistry buildDataLoaderRegistry() {
        DataLoaderRegistry dataLoaderRegistry = new DataLoaderRegistry();
//        dataLoaderRegistry.register("customerDataLoader",
//                new DataLoader<Integer, String>(customerIds ->
//                        CompletableFuture.supplyAsync(() ->
//                                customerRepository.getUserNamesForIds(customerIds))));
        return dataLoaderRegistry;
    }
}