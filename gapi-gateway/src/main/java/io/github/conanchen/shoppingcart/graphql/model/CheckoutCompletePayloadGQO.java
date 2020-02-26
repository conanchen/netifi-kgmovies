package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;

public class CheckoutCompletePayloadGQO {

    private OrderGQO order;
    @javax.validation.constraints.NotNull
    private Collection<CheckoutErrorGQO> checkoutErrors;

    public CheckoutCompletePayloadGQO() {
    }

    public CheckoutCompletePayloadGQO(OrderGQO order, Collection<CheckoutErrorGQO> checkoutErrors) {
        this.order = order;
        this.checkoutErrors = checkoutErrors;
    }

    public OrderGQO getOrder() {
        return order;
    }
    public void setOrder(OrderGQO order) {
        this.order = order;
    }

    public Collection<CheckoutErrorGQO> getCheckoutErrors() {
        return checkoutErrors;
    }
    public void setCheckoutErrors(Collection<CheckoutErrorGQO> checkoutErrors) {
        this.checkoutErrors = checkoutErrors;
    }

}