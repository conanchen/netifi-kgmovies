package io.github.config;

import com.google.common.collect.Lists;
import graphql.annotations.processor.GraphQLAnnotations;
import graphql.kickstart.tools.TypeDefinitionFactory;
import graphql.language.*;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLObjectType;
import lombok.SneakyThrows;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CustomTypeDefinitionFactory implements TypeDefinitionFactory {

    GraphQLAnnotations graphqlAnnotations = new GraphQLAnnotations();

    @SneakyThrows
    public List<Definition<?>> create(final List<Definition<?>> existing) {
        GraphQLObjectType object = graphqlAnnotations.object(SomeObject.class);
        //TODO: should get
        List<FieldDefinition> fieldDefinitions = object.getFieldDefinitions().stream().map(gf->gf.getDefinition()).collect(Collectors.toList());
        java.lang.reflect.Field field = SomeObject.class.getField("field");
        ObjectTypeDefinition objectTypeDefinition = ObjectTypeDefinition.newObjectTypeDefinition()
                .name(object.getName())
//                .fieldDefinitions(fieldDefinitions)
                .fieldDefinition(new FieldDefinition(field.getName(), new TypeName(field.getType().getSimpleName())))
                .build();

        return Lists.newArrayList(

                objectTypeDefinition,

                ObjectTypeDefinition.newObjectTypeDefinition()
                        .name("MyType")
                        .fieldDefinition(new FieldDefinition("myField", new TypeName("String")))
                        .fieldDefinition(new FieldDefinition("myName", new TypeName("String")))
                        .fieldDefinition(new FieldDefinition("myField1", new TypeName("String")))
                        .fieldDefinition(new FieldDefinition("myName1", new TypeName("String")))
                        .build(),

                ObjectTypeDefinition.newObjectTypeDefinition()
                        .name("HisType")
                        .fieldDefinition(new FieldDefinition("hisField", new TypeName("String")))
                        .fieldDefinition(FieldDefinition.newFieldDefinition()
                                .name("hisName")
                                .type(new TypeName("String"))
                                .description(new Description("【名称】该项目名称", null, false))
                                .build())
                        .build(),

                ObjectTypeDefinition.newObjectTypeDefinition()
                        .name("Query")
                        .fieldDefinition(FieldDefinition.newFieldDefinition().name("findMyType")
                                .type(new TypeName("MyType"))
                                .inputValueDefinition(InputValueDefinition.newInputValueDefinition().name("id")
                                        .type(new TypeName("String")).build()).build())
                        .fieldDefinition(FieldDefinition.newFieldDefinition().name("findHisType")
                                .type(new TypeName("HisType"))
                                .inputValueDefinition(InputValueDefinition.newInputValueDefinition().name("id")
                                        .type(new TypeName("String")).build()).build())
                        .fieldDefinition(FieldDefinition.newFieldDefinition().name("findSomeObject")
                                .type(new TypeName("SomeObject"))
                                .inputValueDefinition(InputValueDefinition.newInputValueDefinition().name("id")
                                        .type(new TypeName("String")).build()).build())
                        .fieldDefinition(FieldDefinition.newFieldDefinition().name("searchHisType")
                                .type(new ListType(new TypeName("HisType")))
                                .inputValueDefinitions(Lists.newArrayList(
                                        InputValueDefinition.newInputValueDefinition()
                                                .name("id")
                                                .type(new TypeName("String"))
                                                .build(),
                                        InputValueDefinition.newInputValueDefinition()
                                                .name("page")
                                                .type(new TypeName("Int"))
                                                .build()))
                                .build())

                        .build()

        );

    }
}