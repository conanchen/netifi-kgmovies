package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class UserSMSCodePayloadGQO {


    private String smscode;
    @javax.validation.constraints.NotNull
    private Collection<UserSMSCodeErrorGQO> smsCodeErrors;

    public UserSMSCodePayloadGQO() {
    }

    public UserSMSCodePayloadGQO( String smscode,  Collection<UserSMSCodeErrorGQO> smsCodeErrors) {
        this.smscode = smscode;
        this.smsCodeErrors = smsCodeErrors;
    }

}