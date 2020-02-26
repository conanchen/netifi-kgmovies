package io.github.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.example.graphql.model.HelloPerson;
import io.github.example.graphql.service.HelloPersonService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HelloPersonQueryResolver implements GraphQLQueryResolver {

    private final HelloPersonService personService;

    public HelloPersonQueryResolver(final HelloPersonService personService) {
        this.personService = personService;
    }

    public Collection<HelloPerson> people() {
        return personService.getPeople();
    }
}