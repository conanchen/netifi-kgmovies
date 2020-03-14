package io.github.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 通用的 DataObject Builder 模式构建器
 *
 * @author: CipherCui
 * @since 2019/8/29
 */
public class DataObjectBuilder<T> {
    private final Supplier<T> instantiator;
    private List<Consumer<T>> modifiers = new ArrayList<>();

    private DataObjectBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public static <T> DataObjectBuilder<T> of(Supplier<T> instantiator) {
        return new DataObjectBuilder<>(instantiator);
    }

    public <P1> DataObjectBuilder<T> with(Consumer1<T, P1> consumer, P1 p1) {
        Consumer<T> c = new Consumer<T>() {
            @Override
            public void accept(T instance) {
                consumer.accept(instance, p1);
            }
        };
        modifiers.add(c);
        return this;
    }

    public <P1, P2> DataObjectBuilder<T> with(Consumer2<T, P1, P2> consumer, P1 p1, P2 p2) {
        Consumer<T> c = instance -> consumer.accept(instance, p1, p2);
        modifiers.add(c);
        return this;
    }

    public <P1, P2, P3> DataObjectBuilder<T> with(Consumer3<T, P1, P2, P3> consumer, P1 p1, P2 p2, P3 p3) {
        Consumer<T> c = instance -> consumer.accept(instance, p1, p2, p3);
        modifiers.add(c);
        return this;
    }

    public T build() {
        T value = instantiator.get();
        modifiers.forEach(modifier -> modifier.accept(value));
        modifiers.clear();
        return value;
    }

    /**
     * 1 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer1<T, P1> {
        void accept(T t, P1 p1);
    }

    /**
     * 2 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer2<T, P1, P2> {
        void accept(T t, P1 p1, P2 p2);
    }

    /**
     * 3 参数 Consumer
     */
    @FunctionalInterface
    public interface Consumer3<T, P1, P2, P3> {
        void accept(T t, P1 p1, P2 p2, P3 p3);
    }
}