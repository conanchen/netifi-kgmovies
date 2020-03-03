package io.github.conanchen.person.graphql.model;

import java.util.Collection;

public class UserSMSCodePayloadGQO {

    private String smscode;
    @javax.validation.constraints.NotNull
    private Collection<UserSMSCodeErrorGQO> smsCodeErrors;

    public UserSMSCodePayloadGQO() {
    }

    public UserSMSCodePayloadGQO(String smscode, Collection<UserSMSCodeErrorGQO> smsCodeErrors) {
        this.smscode = smscode;
        this.smsCodeErrors = smsCodeErrors;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public Collection<UserSMSCodeErrorGQO> getSmsCodeErrors() {
        return smsCodeErrors;
    }

    public void setSmsCodeErrors(Collection<UserSMSCodeErrorGQO> smsCodeErrors) {
        this.smsCodeErrors = smsCodeErrors;
    }

}