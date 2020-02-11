package io.github.conanchen.shopping.graphql.mutation;

import javax.validation.constraints.NotNull;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.shopping.graphql.api.CreateProductMutation;
import io.github.conanchen.shopping.graphql.model.ProductGQO;
import io.github.example.graphql.service.HelloPersonService;

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