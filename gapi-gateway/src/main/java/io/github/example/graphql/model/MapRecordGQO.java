package io.github.example.graphql.model;

public class MapRecordGQO {
    private String stream;
    private String id;
    private String v;

    public MapRecordGQO(String stream, String id, String v) {
        this.stream = stream;
        this.id = id;
        this.v = v;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}