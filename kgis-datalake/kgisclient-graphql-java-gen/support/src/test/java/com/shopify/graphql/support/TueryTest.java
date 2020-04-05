package com.shopify.graphql.support;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TueryTest {
    @Test
    public void testStringEscaping() throws Exception {
        StringBuilder result = new StringBuilder();
        Tuery.appendQuotedString(result, "\0 \r \n \\ \" c ꝏ");
        assertEquals("\"\\u0000 \\r \\n \\\\ \\\" c ꝏ\"", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAliasWithUnderscore() {
        new Tuery<Tuery>(null) {}.withAlias("invalid__alias");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAliasWithDashes() {
        new Tuery<Tuery>(null) {}.withAlias("invalid-alias");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBlankAlias() {
        new Tuery<Tuery>(null) {}.withAlias("");
    }
}
