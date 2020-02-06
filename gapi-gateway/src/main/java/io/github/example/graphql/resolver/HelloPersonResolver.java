package io.github.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.github.example.graphql.model.HelloPerson;
import org.springframework.stereotype.Service;

@Service
public class HelloPersonResolver implements GraphQLResolver<HelloPerson> {

    public String fullName(final HelloPerson person) {
        return person.getFirstName() + " " + person.getLastName();
    }
}