package io.github.conanchen.shoppingdoor.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.shoppingdoor.graphql.api.CreateProductMutation;
import io.github.conanchen.shoppingdoor.graphql.model.ProductGQO;
import io.github.example.graphql.service.HelloPersonService;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class CreateProductMutationResolver implements CreateProductMutation,GraphQLMutationResolver {

    private final HelloPersonService personService;

    public CreateProductMutationResolver(final HelloPersonService personService) {
        this.personService = personService;
    }

    @Override
    public @NotNull ProductGQO createProduct(String name) throws Exception {
      // TODO Auto-generated method stub
      return null;
    }
    
}