package io.github.kgis;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KgisTest {

    @Test
    void users() {
        ImmutableList<String> rs = Kgis.users();
        assertEquals(2, rs.size(), String.format("should found 2 users, user1=%s ",rs.get(0)));
    }
}