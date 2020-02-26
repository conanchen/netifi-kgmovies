package io.github.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.example.graphql.model.HelloPerson;
import io.github.example.graphql.service.HelloPersonService;
import org.springframework.stereotype.Service;

@Service
public class CreateHelloPersonMutationResolver implements GraphQLMutationResolver {

    private final HelloPersonService personService;

    public CreateHelloPersonMutationResolver(final HelloPersonService personService) {
        this.personService = personService;
    }

    public HelloPerson createHelloPerson(final String firstName, final String lastName) {
        return personService.createPerson(firstName, lastName);
    }
}