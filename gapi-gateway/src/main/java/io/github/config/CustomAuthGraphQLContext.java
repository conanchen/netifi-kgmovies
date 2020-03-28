package io.github.config;

import graphql.kickstart.execution.context.DefaultGraphQLContext;
import lombok.Getter;
import org.dataloader.DataLoaderRegistry;

import javax.security.auth.Subject;

@Getter
public class CustomAuthGraphQLContext extends DefaultGraphQLContext {
    private AuthContext authContext;

    public CustomAuthGraphQLContext(DataLoaderRegistry dataLoaderRegistry, Subject subject, AuthContext authContext) {
        super(dataLoaderRegistry, subject);
        this.authContext = authContext;
    }
}
