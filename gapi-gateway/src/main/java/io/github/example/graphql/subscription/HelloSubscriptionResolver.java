package io.github.example.graphql.subscription;

import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.example.graphql.model.MapRecordGQO;
import io.github.example.springdata.redis.SensorData;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.stream.MapRecord;
import org.springframework.data.redis.connection.stream.StreamOffset;
import org.springframework.data.redis.stream.StreamReceiver;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Map;

@Service
public class HelloSubscriptionResolver implements GraphQLSubscriptionResolver {
    private static final Logger LOG = LoggerFactory.getLogger(HelloSubscriptionResolver.class);

    @Autowired
    StreamReceiver<String, MapRecord<String, String, String>> streamReceiver;

    public Publisher<String> helloWorld(DataFetchingEnvironment env) {
        // TODO: https://github.com/graphql-java-kickstart/samples/blob/master/subscription-with-authentication/src/main/java/subscription/MySubscriptionResolver.java
//        GraphQLWebSocketContext context = env.getContext();
//        Optional<Authentication> authentication = Optional.ofNullable(context.getSession())
//                .map(Session::getUserProperties)
//                .map(props -> props.get("CONNECT_TOKEN"))
//                .map(Authentication.class::cast);
//        LOG.info("Subscribe to publisher with token: {}", authentication);
//        authentication.ifPresent(SecurityContextHolder.getContext()::setAuthentication);
//        LOG.info("Security context principal: {}", SecurityContextHolder.getContext().getAuthentication().getPrincipal());

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