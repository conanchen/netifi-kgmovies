package io.github.conanchen.person.graphql.mutation;


import com.dgraph.graphql.*;
import com.google.gson.Gson;
import com.shopify.graphql.support.ID;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.api.Mutation;
import io.github.conanchen.person.graphql.model.*;
import io.github.config.GraphQLConfiguration;
import io.jsonwebtoken.Jwts;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class PersonMutationResolver implements Mutation, GraphQLMutationResolver {

    @Autowired
    GraphQLConfiguration graphQLConfiguration;

    @Override
    public UserSigninPayloadGQO userSignin(UserSigninInputGQO auth, DataFetchingEnvironment env) throws Exception {

        @NotNull String email = auth.getEmail();
        log.info("email : " + email);
        @NotNull String password = auth.getPassword();
        log.info("password : " + password);

        QueryRootQuery query = Operations.query(queryRootQuery -> queryRootQuery.getUser(getUserArguments -> {
            getUserArguments.username(email);
        }, userQuery -> {
            userQuery.id();
            userQuery.name();
            userQuery.username();
        }));

        log.info("查询语句 : " + query.toString());

        QueryRoot queryRoot = graphQLConfiguration.graphClient().queryGraphSynchronize(
                query
        );

        User user = queryRoot.getGetUser();

        log.info("查询结果 : user : id : " + user.getId() + " username : " + user.getUsername());

        String jws = Jwts.builder()
                .setIssuer("me")
                .setSubject("Bob")
                .setAudience("you")
                .setExpiration(Date.from(
                        LocalDateTime.of(2022, Month.MARCH, 18, 13, 45, 20)
                                .atZone(ZoneId.systemDefault())
                                .toInstant())
                ) //a java.util.Date
                .setNotBefore(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant())) //a java.util.Date
                .setIssuedAt(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant())) // for example, now
                .setId(UUID.randomUUID().toString()) //just an example id)
                .compact();
        UserGQO userGQO = UserGQO.builder()
                .id(user.getId().toString()).username(user.getUsername())
                .name(user.getName()).bio("bio").bioHTML("bioHTML")
                .isUserOf(PersonGQO.builder().id("personid").personalID("2342234").name("conan").alternateName("altername").build())
                .build();
        UserSigninPayloadGQO userSigninPayloadGQO = UserSigninPayloadGQO.builder()
                .token(jws)
                .user(userGQO)
                .signinErrors(Arrays.asList(UserSigninErrorGQO.builder()
                        .code(UserSigninErrorCodeGQO.INVALID)
                        .message("邮箱格式错误").build()))
                .build();



        log.info("res : "+new Gson().toJson(userSigninPayloadGQO));

        return userSigninPayloadGQO;
    }

    @Override
    public UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth, DataFetchingEnvironment env) throws Exception {
        return UserSMSCodePayloadGQO.builder()
                .smscode("111111")
                .smsCodeErrors(Arrays.asList(
                        UserSMSCodeErrorGQO.builder()
                                .code(UserSMSCodeErrorCodeGQO.SUCC)
                                .message("发送sms验证码成功")
                                .build())
                )
                .build();
    }

    @Override
    public UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth, DataFetchingEnvironment env) throws Exception {
        String jws = Jwts.builder()

                .setIssuer("me")
                .setSubject("Bob")
                .setAudience("you")
                .setExpiration(Date.from(
                        LocalDateTime.of(2022, Month.MARCH, 18, 13, 45, 20)
                                .atZone(ZoneId.systemDefault())
                                .toInstant())
                ) //a java.util.Date
                .setNotBefore(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant())) //a java.util.Date
                .setIssuedAt(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant())) // for example, now
                .setId(UUID.randomUUID().toString()) //just an example id)
                .compact();
        UserGQO user = UserGQO.builder()
                .id("userid001").username("conanusername")
                .name("conan").bio("bio").bioHTML("bioHTML")
                .isUserOf(PersonGQO.builder()
                        .id("personid").personalID("2342234")
                        .name("conan").alternateName("altername")
                        .build())
                .build();
        UserSigninPayloadGQO userSigninPayloadGQO = UserSigninPayloadGQO.builder()
                .token(jws)
                .user(user)
                .signinErrors(
                        Arrays.asList(UserSigninErrorGQO.builder()
                                .code(UserSigninErrorCodeGQO.SUCC)
                                .message("成功登陆").build()))
                .build();

        return UserRegisterPayloadGQO.builder()
                .signinPayload(userSigninPayloadGQO)
                .registerErrors(Arrays.asList(UserRegisterErrorGQO.builder()
                        .code(UserRegisterErrorCodeGQO.BLANK).message("register ok!")
                        .build()))
                .build();
    }
}