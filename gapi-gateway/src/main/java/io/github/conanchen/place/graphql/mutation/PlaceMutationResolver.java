package io.github.conanchen.place.graphql.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.place.graphql.api.Mutation;
import io.github.conanchen.place.graphql.model.StoreCreateInputGQO;
import io.github.conanchen.place.graphql.model.StoreCreatePayloadGQO;
import io.github.conanchen.place.graphql.model.StoreUpdateInputGQO;
import io.github.conanchen.place.graphql.model.StoreUpdatePayloadGQO;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class PlaceMutationResolver implements Mutation, GraphQLMutationResolver {


  @Override
  public @NonNull StoreCreatePayloadGQO storeCreate(StoreCreateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }

  @Override
  public @NonNull StoreUpdatePayloadGQO storeUpdate(StoreUpdateInputGQO input, DataFetchingEnvironment env) throws Exception {
    return null;
  }
}