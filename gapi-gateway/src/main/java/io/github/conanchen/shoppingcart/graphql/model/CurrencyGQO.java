package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;

public class CurrencyGQO {

    private CurrencyCodeGQO code;
    private String symbol;
    private String thousandsSeparator;
    private String decimalSeparator;
    private Integer decimalDigits;

    public CurrencyGQO() {
    }

    public CurrencyGQO(CurrencyCodeGQO code, String symbol, String thousandsSeparator, String decimalSeparator, Integer decimalDigits) {
        this.code = code;
        this.symbol = symbol;
        this.thousandsSeparator = thousandsSeparator;
        this.decimalSeparator = decimalSeparator;
        this.decimalDigits = decimalDigits;
    }

    public CurrencyCodeGQO getCode() {
        return code;
    }
    public void setCode(CurrencyCodeGQO code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }
    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }
    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    public Integer getDecimalDigits() {
        return decimalDigits;
    }
    public void setDecimalDigits(Integer decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

}