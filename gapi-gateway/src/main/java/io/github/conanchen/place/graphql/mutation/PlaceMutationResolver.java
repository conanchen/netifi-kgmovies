package io.github.conanchen.place.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.place.graphql.api.Mutation;
import io.github.conanchen.place.graphql.model.StoreCreateInputGQO;
import io.github.conanchen.place.graphql.model.StoreCreatePayloadGQO;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class PlaceMutationResolver implements Mutation,GraphQLMutationResolver {

  @Override
  public @NotNull StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input) throws Exception {
    return null;
  }

}