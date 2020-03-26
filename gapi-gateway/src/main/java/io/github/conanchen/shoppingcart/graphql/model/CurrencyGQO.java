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
import lombok.NonNull;

@Data
@Builder
public class CurrencyGQO {


    private CurrencyCodeGQO code;

    private String symbol;

    private String thousandsSeparator;

    private String decimalSeparator;

    private Integer decimalDigits;

    public CurrencyGQO() {
    }

    public CurrencyGQO( CurrencyCodeGQO code,  String symbol,  String thousandsSeparator,  String decimalSeparator,  Integer decimalDigits) {
        this.code = code;
        this.symbol = symbol;
        this.thousandsSeparator = thousandsSeparator;
        this.decimalSeparator = decimalSeparator;
        this.decimalDigits = decimalDigits;
    }

}