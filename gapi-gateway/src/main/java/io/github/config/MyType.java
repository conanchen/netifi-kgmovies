package io.github.config;

import com.google.common.collect.Sets;
import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.Set;

public class MyType extends AbstractMap<String,Object>{

    @NotNull
    @Override
    public Set<Entry<String, Object>> entrySet() {
        return Sets.newHashSet(new SimpleImmutableEntry("myField","myfieldvalue"),
                new SimpleImmutableEntry("name","my defined name"));
    }

    @Override
    public Object put(String key, Object value) {
        return entrySet().add(new SimpleImmutableEntry(key,value));
    }
}
