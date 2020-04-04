package io.github.config;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Builder
public class MyType extends HashMap<String, Object> {

    String myField;
    String myName;

    public MyType put(String key, Object value) {

        super.put(key, value);
        return this;
    }

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
