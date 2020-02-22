package io.github.example.graphql.subscription;

import java.util.Map;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import io.github.example.graphql.model.MapRecordGQO;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.stream.MapRecord;
import org.springframework.data.redis.connection.stream.StreamOffset;
import org.springframework.data.redis.stream.StreamReceiver;
import org.springframework.stereotype.Service;
import io.github.example.springdata.redis.SensorData;
import reactor.core.publisher.Flux;

@Service
public class HelloSubscriptionResolver implements GraphQLSubscriptionResolver {

    @Autowired
    StreamReceiver<String, MapRecord<String, String, String>> streamReceiver;

    public Publisher<String> helloWorld() {
        //TODO: https://spring.io/guides/gs/spring-data-reactive-redis/
        return Flux.just("Hello", "World!");
    }

    public Publisher<String> helloRedis() {
        final Flux<MapRecord<String, String, String>> messages = streamReceiver.receive(StreamOffset.fromStart(SensorData.KEY));

        Flux<Map<String, String>> vs = messages.map(MapRecord::getValue);

        return vs.map(aa -> aa.values().toString());
    }

    public Publisher<String> helloRedis2() {
        final Flux<MapRecord<String, String, String>> messages = streamReceiver.receive(StreamOffset.fromStart(SensorData.KEY));

        Flux<Map<String, String>> vs = messages.map(MapRecord::getValue);

        return vs.switchMap(v -> new Publisher<String>() {
            @Override
            public void subscribe(Subscriber<? super String> s) {
                s.onNext(v.values().toString());
            }
        });
    }

    public Publisher<MapRecordGQO> helloRedisMapRecord() {
        final Flux<MapRecord<String, String, String>> messages = streamReceiver.receive(StreamOffset.fromStart(SensorData.KEY));

        return messages.switchMap(v-> new Publisher<MapRecordGQO>() {
            @Override
            public void subscribe(Subscriber<? super MapRecordGQO> s) {
                s.onNext(new MapRecordGQO(v.getStream(),v.getId().getValue(),v.getValue().toString()));
            }
        });
    }

}