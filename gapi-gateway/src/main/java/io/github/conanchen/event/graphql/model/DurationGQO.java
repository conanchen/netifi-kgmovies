package io.github.conanchen.event.graphql.model;

public class DurationGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private String duration;

    public DurationGQO() {
    }

    public DurationGQO(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

}