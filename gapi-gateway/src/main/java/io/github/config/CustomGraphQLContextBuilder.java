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
        LOG.info("public GraphQLContext build(HttpServletRequest req, HttpServletResponse response)");
        return DefaultGraphQLServletContext.createServletContext(buildDataLoaderRegistry(), null).with(req).with(response)
                .with(Subject.getSubject(new AccessControlContext(new ProtectionDomain[]{})))
                .build();


    }

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