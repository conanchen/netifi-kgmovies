package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MoneyGQO {

    @lombok.NonNull
    private java.math.BigDecimal amount;
    @lombok.NonNull
    private CurrencyCodeGQO currencyCode;
    @lombok.NonNull
    private String formatted;

    public MoneyGQO() {
    }

    public MoneyGQO( java.math.BigDecimal amount,  CurrencyCodeGQO currencyCode,  String formatted) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.formatted = formatted;
    }

}