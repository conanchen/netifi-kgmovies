package io.github.conanchen.person.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.github.conanchen.person.graphql.api.Mutation;
import io.github.conanchen.person.graphql.model.*;
import org.springframework.stereotype.Service;

@Service
public class PersonMutationResolver implements Mutation,GraphQLMutationResolver {


  @Override
  public UserSigninPayloadGQO userSignin(UserSigninInputGQO auth) throws Exception {
    return null;
  }

  @Override
  public UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth) throws Exception {
    return null;
  }

  @Override
  public UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth) throws Exception {
    return null;
  }
}