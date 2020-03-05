package io.github.conanchen.shoppingman.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.shoppingman.graphql.api.Mutation;
import io.github.conanchen.shoppingman.graphql.model.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class ShoppingmanMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public @NotNull ProductCreatePayloadGQO productCreate(ProductCreateInputGQO input) throws Exception {
    return null;
  }

  @Override
  public @NotNull ProductUpdatePayloadGQO productUpdate(ProductUpdateInputGQO input) throws Exception {
    return null;
  }

  @Override
  public @NotNull ProductOfferCreatePayloadGQO productOfferCreate(ProductOfferCreateInputGQO input) throws Exception {
    return null;
  }

  @Override
  public @NotNull ProductOfferUpdatePayloadGQO productOfferUpdate(ProductOfferUpdateInputGQO input) throws Exception {
    return null;
  }

  @Override
  public @NotNull ProductOfferOnlinePayloadGQO productOfferOnline(ProductOfferOnlineInputGQO input) throws Exception {
    return null;
  }

  @Override
  public @NotNull ProductOfferOfflinePayloadGQO productOfferOffline(ProductOfferOfflineInputGQO input) throws Exception {
    return null;
  }
}