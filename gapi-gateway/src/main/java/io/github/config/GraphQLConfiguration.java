package io.github.config;

import com.bdlbsc.graphql.GraphClient;
import graphql.GraphQL;
import graphql.execution.AsyncExecutionStrategy;
import graphql.kickstart.tools.SchemaParserOptions;
import graphql.language.StringValue;
import graphql.schema.*;
import graphql.schema.idl.InterfaceWiringEnvironment;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.UnionWiringEnvironment;
import graphql.schema.idl.WiringFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author Conan Chen
 * [schema-parser-options](https://www.graphql-java-kickstart.com/tools/schema-parser-options/)
 */
@Configuration
public class GraphQLConfiguration {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");

    @Bean
    public GraphQL graphQL(final GraphQLSchema graphQLSchema) {
        return GraphQL.newGraphQL(graphQLSchema)
                .queryExecutionStrategy(new AsyncExecutionStrategy())
                .mutationExecutionStrategy(new AsyncExecutionStrategy())
                .build();

    }


    // dgraph graphql client 客户端
    @Bean
    public GraphClient graphClient() {
        return GraphClient.builder()
                .setUrl("http://localhost:8080/graphql")
                .build();
    }


    @Bean
    public SchemaParserOptions schemaParserOptions() {
        // allowUnimplementedResolvers: Defaults to false. Allows a schema to be created even if not all GraphQL fields have resolvers. Intended only for development, it will log a warning to remind you to turn it off for production. Any unimplemented resolvers will throw errors when queried.
        // TODO: https://github.com/graphql-java-kickstart/graphql-java-servlet#context-and-dataloader-settings
        return SchemaParserOptions.newOptions()
                .allowUnimplementedResolvers(true)
                .preferGraphQLResolver(true)
                .build();
    }

    //    SchemaParserOptions.newBuilder()
    // PotentialAction = CreateAction | UpdateAction
    @Bean
    public GraphQLUnionType potentialActionType() {
        return GraphQLUnionType
                .newUnionType()
                .name("ActionUnion")
                .possibleType(GraphQLObjectType.newObject().name("CreateAction").build())
                .possibleType(GraphQLObjectType.newObject().name("UpdateAction").build())
                .name("ConversationAboutUnion")
                .possibleType(GraphQLObjectType.newObject().name("Organization").build())
                .possibleType(GraphQLObjectType.newObject().name("Bike").build())
                .build();
    }

    @Bean
    public GraphQLScalarType dateGraphQLScalarType() {
        return GraphQLScalarType.newScalar()
                .name("DateTime")
                .coercing(new Coercing() {
                    @Override
                    public Object serialize(final Object o) throws CoercingSerializeException {
                        return DATE_FORMAT.format((Date) o);
                    }

                    @Override
                    public Object parseValue(final Object o) throws CoercingParseValueException {
                        return serialize(o);
                    }

                    @Override
                    public Object parseLiteral(final Object o) throws CoercingParseLiteralException {
                        try {
                            return DATE_FORMAT.parse(((StringValue) o).getValue());
                        } catch (final ParseException e) {
                            return null;
                        }
                    }
                }).build();
    }

    @Bean
    public GraphQLScalarType urlGraphQLScalarType() {
        return GraphQLScalarType.newScalar()
                .name("URL")
                .coercing(new Coercing() {
                    @Override
                    public Object serialize(final Object o) throws CoercingSerializeException {
                        return DATE_FORMAT.format((Date) o);
                    }

                    @Override
                    public Object parseValue(final Object o) throws CoercingParseValueException {
                        return serialize(o);
                    }

                    @Override
                    public Object parseLiteral(final Object o) throws CoercingParseLiteralException {
                        try {
                            return DATE_FORMAT.parse(((StringValue) o).getValue());
                        } catch (final ParseException e) {
                            return null;
                        }
                    }
                }).build();
    }

    @Bean
    public GraphQLScalarType textGraphQLScalarType() {
        return GraphQLScalarType.newScalar()
                .name("Text")
                .coercing(new Coercing() {
                    @Override
                    public Object serialize(final Object o) throws CoercingSerializeException {
                        return DATE_FORMAT.format((Date) o);
                    }

                    @Override
                    public Object parseValue(final Object o) throws CoercingParseValueException {
                        return serialize(o);
                    }

                    @Override
                    public Object parseLiteral(final Object o) throws CoercingParseLiteralException {
                        try {
                            return DATE_FORMAT.parse(((StringValue) o).getValue());
                        } catch (final ParseException e) {
                            return null;
                        }
                    }
                }).build();
    }

    @Bean
    public GraphQLScalarType mardownGraphQLScalarType() {
        return GraphQLScalarType.newScalar()
                .name("Markdown")
                .coercing(new Coercing() {
                    @Override
                    public Object serialize(final Object o) throws CoercingSerializeException {
                        return DATE_FORMAT.format((Date) o);
                    }

                    @Override
                    public Object parseValue(final Object o) throws CoercingParseValueException {
                        return serialize(o);
                    }

                    @Override
                    public Object parseLiteral(final Object o) throws CoercingParseLiteralException {
                        try {
                            return DATE_FORMAT.parse(((StringValue) o).getValue());
                        } catch (final ParseException e) {
                            return null;
                        }
                    }
                }).build();
    }

    @Bean
    public GraphQLScalarType bigDecimalGraphQLScalarType() {
        return GraphQLScalarType.newScalar()
                .name("BigDecimal")
                .coercing(new Coercing() {
                    @Override
                    public Object serialize(final Object o) throws CoercingSerializeException {
                        return DATE_FORMAT.format((Date) o);
                    }

                    @Override
                    public Object parseValue(final Object o) throws CoercingParseValueException {
                        return serialize(o);
                    }

                    @Override
                    public Object parseLiteral(final Object o) throws CoercingParseLiteralException {
                        try {
                            return DATE_FORMAT.parse(((StringValue) o).getValue());
                        } catch (final ParseException e) {
                            return null;
                        }
                    }
                }).build();
    }

    @Bean
    public RuntimeWiring buildDynamicRuntimeWiring() {
        WiringFactory dynamicWiringFactory = new WiringFactory() {

            @Override
            public boolean providesTypeResolver(InterfaceWiringEnvironment environment) {
                return !Objects.isNull(environment.getInterfaceTypeDefinition().getDirective("specialMarker"));
            }

            @Override
            public boolean providesTypeResolver(UnionWiringEnvironment environment) {
                return !Objects.isNull(environment.getUnionTypeDefinition().getDirective("specialMarker"));
            }
        };
        return RuntimeWiring.newRuntimeWiring()
                .wiringFactory(dynamicWiringFactory).build();
    }
}