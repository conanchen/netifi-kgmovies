package io.github.kgis;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KgisTest {

    @Test
    void users() {
        assertEquals(0, "io.github.conan.kk".compareTo("io.github.conan"), String.format("should found 2 users, user1=%s ",0));
    }
}