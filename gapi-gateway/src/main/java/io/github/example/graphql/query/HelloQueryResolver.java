package io.github.example.graphql.query;

import java.time.Duration;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import io.github.acmeshoes.store.service.PdpService;
// import io.github.acmeshoes.store.service.model.PdpData;
// import reactor.core.publisher.Mono;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {
    // @Autowired
    // private PdpService pdpService;


    public String hello(final String who) {
        // PdpData pdpData=  pdpService.getProductPage("001")
        //         .switchIfEmpty(Mono.fromSupplier(() -> null))
        //         .block(Duration.ofSeconds(5));
                
        return String.format("Hello, %s! ", 
        Optional.ofNullable(who).orElse("GraphQL"));
        // return String.format("Hello, %s! pdpData.getDescription()=%s", 
        // Optional.ofNullable(who).orElse("GraphQL"),pdpData.getDescription());
    }
}