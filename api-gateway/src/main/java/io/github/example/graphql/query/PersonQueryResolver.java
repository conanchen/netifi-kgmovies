package io.github.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.Collection;

import io.github.example.graphql.model.Person;
import io.github.example.graphql.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonQueryResolver implements GraphQLQueryResolver {

    private final PersonService personService;

    public PersonQueryResolver(final PersonService personService) {
        this.personService = personService;
    }

    public Collection<Person> people() {
        return personService.getPeople();
    }
}