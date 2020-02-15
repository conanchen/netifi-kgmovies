package io.github.conanchen.shoppingcart.graphql.model;

import io.github.conanchen.zommon.graphql.model.CurrencyCodeGQO;

public class MoneyGQO {

    @javax.validation.constraints.NotNull
    private java.math.BigDecimal amount;
    @javax.validation.constraints.NotNull
    private CurrencyCodeGQO currencyCode;
    @javax.validation.constraints.NotNull
    private String formatted;

    public MoneyGQO() {
    }

    public MoneyGQO(java.math.BigDecimal amount, CurrencyCodeGQO currencyCode, String formatted) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.formatted = formatted;
    }

    public java.math.BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public CurrencyCodeGQO getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(CurrencyCodeGQO currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getFormatted() {
        return formatted;
    }
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

}