package io.github.conanchen.person.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.person.graphql.api.Query;
import io.github.conanchen.person.graphql.model.PersonGQO;
import org.springframework.stereotype.Service;


@Service
public class PersonQueriesResolver implements Query , GraphQLQueryResolver {


    @Override
    public PersonGQO person(String id, String pId) throws Exception {
        return null;
    }
}