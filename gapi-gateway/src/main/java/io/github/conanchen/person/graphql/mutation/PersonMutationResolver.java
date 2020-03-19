package io.github.conanchen.person.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.api.Mutation;
import io.github.conanchen.person.graphql.model.*;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.UUID;

@Service
public class PersonMutationResolver implements Mutation, GraphQLMutationResolver {


    @Override
    public UserSigninPayloadGQO userSignin(UserSigninInputGQO auth, DataFetchingEnvironment env) throws Exception {
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
                .isUserOf(PersonGQO.builder().id("personid").personalID("2342234").name("conan").alternateName("altername").build())
                .build();
        UserSigninPayloadGQO userSigninPayloadGQO = UserSigninPayloadGQO.builder()
                .token(jws)
                .user(user)
                .signinErrors(Arrays.asList(UserSigninErrorGQO.builder()
                        .code(UserSigninErrorCodeGQO.SUCC)
                        .message("成功登陆").build()))
                .build();

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