package io.github.example.graphql.service;

import io.github.example.graphql.model.HelloPerson;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class HelloPersonService {
    private static int INDEX_COUNTER = 0;
    private final Collection<HelloPerson> people = new ConcurrentLinkedQueue<>();

    public HelloPersonService() {
    }

    public HelloPerson createPerson(final String firstName, final String lastName) {
        final HelloPerson person = new HelloPerson(++INDEX_COUNTER, firstName, lastName);
        people.add(person);
        return person;
    }

    public Collection<HelloPerson> getPeople() {
        return Collections.unmodifiableCollection(people);
    }
}
