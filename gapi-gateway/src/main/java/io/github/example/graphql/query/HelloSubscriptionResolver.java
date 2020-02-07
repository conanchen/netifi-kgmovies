package io.github.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.acmeshoes.store.service.PdpService;
import reactor.core.publisher.Flux;

@Service
public class HelloSubscriptionResolver implements GraphQLSubscriptionResolver {
    @Autowired
    private PdpService pdpService;


    public Publisher<String> helloWorld() {
      return  Flux.just("Hello", "World!");
    }
}