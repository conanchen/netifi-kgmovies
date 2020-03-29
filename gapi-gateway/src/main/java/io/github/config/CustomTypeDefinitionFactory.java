package io.github.config;

import com.google.common.collect.Lists;
import graphql.kickstart.tools.TypeDefinitionFactory;
import graphql.language.*;

import java.util.List;

class CustomTypeDefinitionFactory implements TypeDefinitionFactory {
  public List<Definition<?>> create(final List<Definition<?>> existing) {
    return Lists.newArrayList(

            ObjectTypeDefinition.newObjectTypeDefinition()
              .name("MyType")
              .fieldDefinition(new FieldDefinition("myField", new TypeName("String")))
              .fieldDefinition(new FieldDefinition("name", new TypeName("String")))
              .build(),
            ObjectTypeDefinition.newObjectTypeDefinition()
              .name("HisType")
              .fieldDefinition(new FieldDefinition("hisField", new TypeName("String")))
              .fieldDefinition(new FieldDefinition("name", new TypeName("String")))
              .build(),

            //TODO : dynmically add resolvers?
            ObjectTypeDefinition.newObjectTypeDefinition()
              .name("Query")
              .fieldDefinition(FieldDefinition.newFieldDefinition().name("findMyType")
                      .type(new TypeName("MyType"))
                      .inputValueDefinition(InputValueDefinition.newInputValueDefinition().name("id")
                              .type(new TypeName("String")).build()).build())
              .build()

    );

  }
}