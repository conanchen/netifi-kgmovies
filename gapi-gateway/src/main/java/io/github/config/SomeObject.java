package io.github.config;

import graphql.annotations.annotationTypes.GraphQLField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SomeObject {
  @GraphQLField
  public String field;
}