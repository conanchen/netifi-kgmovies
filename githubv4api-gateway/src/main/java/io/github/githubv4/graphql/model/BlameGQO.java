package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class BlameGQO {

    @javax.validation.constraints.NotNull
    private Collection<BlameRangeGQO> ranges;

    public BlameGQO() {
    }

    public BlameGQO(Collection<BlameRangeGQO> ranges) {
        this.ranges = ranges;
    }

    public Collection<BlameRangeGQO> getRanges() {
        return ranges;
    }
    public void setRanges(Collection<BlameRangeGQO> ranges) {
        this.ranges = ranges;
    }

}