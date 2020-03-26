package io.github.conanchen.shoppingcart.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.shoppingcart.graphql.api.Resolvers;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutGQO;
import io.github.conanchen.shoppingcart.graphql.model.CheckoutLineItemGQO;
import io.github.conanchen.shoppingcart.graphql.model.DiscountApplicationGQO;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
class CheckoutResolver implements Resolvers.Checkout,GraphQLResolver<CheckoutGQO> {


    @Override
    public Connection<DiscountApplicationGQO> discountApplications(CheckoutGQO parent, Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env) {
        return null;
    }

    @Override
    public Connection<CheckoutLineItemGQO> lineItems(CheckoutGQO parent, Integer first, String after, Integer last, String before, Boolean reverse, DataFetchingEnvironment env) {
        return null;
    }
}