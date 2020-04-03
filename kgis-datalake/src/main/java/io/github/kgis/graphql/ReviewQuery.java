// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 【评论】对项目的评论 - 例如对博客文章的评论。 该评论的内容是通过text属性表示的，其主题通过about，与所有CreativeWorks共享的属性来表达 A comment on an item
* - for example, a comment on a blog post. The comment's content is expressed via the text property,
* and its topic via about, properties shared with all CreativeWorks.
*/
public class ReviewQuery extends Query<ReviewQuery> {
    ReviewQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public ReviewQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReviewQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public ReviewQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ReviewQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ReviewQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ReviewQuery description() {
        startField("description");

        return this;
    }

    public class ItemReviewedArguments extends Arguments {
        ItemReviewedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ItemReviewedArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ItemReviewedArgumentsDefinition {
        void define(ItemReviewedArguments args);
    }

    /**
    * itemReviewed    Thing    The item that is being reviewed/rated.
    */
    public ReviewQuery itemReviewed(ThingQueryDefinition queryDef) {
        return itemReviewed(args -> {}, queryDef);
    }

    /**
    * itemReviewed    Thing    The item that is being reviewed/rated.
    */
    public ReviewQuery itemReviewed(ItemReviewedArgumentsDefinition argsDef, ThingQueryDefinition queryDef) {
        startField("itemReviewed");

        ItemReviewedArguments args = new ItemReviewedArguments(_queryBuilder);
        argsDef.define(args);
        ItemReviewedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * reviewAspect    Text    This Review or Rating is relevant to this part or facet of the itemReviewed.
    */
    public ReviewQuery reviewAspect() {
        startField("reviewAspect");

        return this;
    }

    /**
    * reviewBody    Text    The actual body of the review.
    */
    public ReviewQuery reviewBody() {
        startField("reviewBody");

        return this;
    }

    /**
    * ratingValue    评分 The rating for the content.
    */
    public ReviewQuery ratingValue() {
        startField("ratingValue");

        return this;
    }

    public class AuthorArguments extends Arguments {
        AuthorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AuthorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AuthorArgumentsDefinition {
        void define(AuthorArguments args);
    }

    /**
    * 【作者】 此内容或评分的作者。
    */
    public ReviewQuery author(UserQueryDefinition queryDef) {
        return author(args -> {}, queryDef);
    }

    /**
    * 【作者】 此内容或评分的作者。
    */
    public ReviewQuery author(AuthorArgumentsDefinition argsDef, UserQueryDefinition queryDef) {
        startField("author");

        AuthorArguments args = new AuthorArguments(_queryBuilder);
        argsDef.define(args);
        AuthorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 【创建日期】 创作出CreativeWork的日期。
    */
    public ReviewQuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
