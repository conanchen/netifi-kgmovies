package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;
import lombok.Builder;
import lombok.Data;

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