package io.github.conanchen.softwareapplication.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.softwareapplication.graphql.api.Mutation;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddInputGQO;
import io.github.conanchen.softwareapplication.graphql.model.WebhookAddPayloadGQO;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SoftwareapplicationMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public WebhookAddPayloadGQO webhookAdd(Collection<WebhookAddInputGQO> input) throws Exception {
    return null;
  }
}