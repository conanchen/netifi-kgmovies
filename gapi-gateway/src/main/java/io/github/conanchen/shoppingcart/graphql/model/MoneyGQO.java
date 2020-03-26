package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class MoneyGQO {

    @javax.validation.constraints.NotNull
    private java.math.BigDecimal amount;
    @javax.validation.constraints.NotNull
    private CurrencyCodeGQO currencyCode;
    @javax.validation.constraints.NotNull
    private String formatted;

    public MoneyGQO() {
    }

    public MoneyGQO( java.math.BigDecimal amount,  CurrencyCodeGQO currencyCode,  String formatted) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.formatted = formatted;
    }

}