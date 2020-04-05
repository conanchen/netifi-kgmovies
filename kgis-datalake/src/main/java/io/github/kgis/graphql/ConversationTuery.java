// Generated from graphql_java_gen gem  with template Tuery.java.erb

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
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
* 【对话】组织之间或特定主题的人员之间的一个或多个消息。 可以使用isPartOf或hasPart属性将个人消息链接到会话。 One or more messages between
* organizations or people on a particular topic. Individual messages can be linked to the conversation
* with isPartOf or hasPart properties.
*/
public class ConversationTuery extends Tuery<ConversationTuery> {
    ConversationTuery(StringBuilder _queryBuilder) {
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
    public ConversationTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ConversationTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public ConversationTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery description() {
        startField("description");

        return this;
    }

    public class AboutArguments extends Arguments {
        AboutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AboutArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AboutArgumentsDefinition {
        void define(AboutArguments args);
    }

    /**
    *     【关于】 事物的关于信息 The subject matter of the content.    
    */
    public ConversationTuery about(ThingTueryDefinition queryDef) {
        return about(args -> {}, queryDef);
    }

    /**
    *     【关于】 事物的关于信息 The subject matter of the content.    
    */
    public ConversationTuery about(AboutArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("about");

        AboutArguments args = new AboutArguments(_queryBuilder);
        argsDef.define(args);
        AboutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AccountablePersonArguments extends Arguments {
        AccountablePersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AccountablePersonArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AccountablePersonArgumentsDefinition {
        void define(AccountablePersonArguments args);
    }

    /**
    *     【负责人】 对CreativeWork负有法律责任的特定的人。 Specifies the Person that is legally accountable for the
    * CreativeWork.    
    */
    public ConversationTuery accountablePerson(UserTueryDefinition queryDef) {
        return accountablePerson(args -> {}, queryDef);
    }

    /**
    *     【负责人】 对CreativeWork负有法律责任的特定的人。 Specifies the Person that is legally accountable for the
    * CreativeWork.    
    */
    public ConversationTuery accountablePerson(AccountablePersonArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("accountablePerson");

        AccountablePersonArguments args = new AccountablePersonArguments(_queryBuilder);
        argsDef.define(args);
        AccountablePersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CreatorArguments extends Arguments {
        CreatorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CreatorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreatorArgumentsDefinition {
        void define(CreatorArguments args);
    }

    /**
    *     【作者】 该 CreativeWork 的创作者/作者。    
    */
    public ConversationTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     【作者】 该 CreativeWork 的创作者/作者。    
    */
    public ConversationTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     【创建日期】 创作出CreativeWork的日期。 The date on which the CreativeWork was created or the item was added
    * to a DataFeed. dateCreated    DateTime or Date or DataFeedItem or CreativeWork    
    */
    public ConversationTuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    public class IncludedInDataCatalogArguments extends Arguments {
        IncludedInDataCatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IncludedInDataCatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IncludedInDataCatalogArgumentsDefinition {
        void define(IncludedInDataCatalogArguments args);
    }

    /**
    *     【所在数据集目录】所在的数据集目录 A data catalog which contains this dataset.    
    */
    public ConversationTuery includedInDataCatalog(DataCatalogTueryDefinition queryDef) {
        return includedInDataCatalog(args -> {}, queryDef);
    }

    /**
    *     【所在数据集目录】所在的数据集目录 A data catalog which contains this dataset.    
    */
    public ConversationTuery includedInDataCatalog(IncludedInDataCatalogArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("includedInDataCatalog");

        IncludedInDataCatalogArguments args = new IncludedInDataCatalogArguments(_queryBuilder);
        argsDef.define(args);
        IncludedInDataCatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasMessagesArguments extends Arguments {
        HasMessagesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasMessagesArguments filter(MessageFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments order(MessageOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasMessagesArgumentsDefinition {
        void define(HasMessagesArguments args);
    }

    /**
    *     参照 hasPart【作品组件】 表示某个作品是该作品的一部分    
    */
    public ConversationTuery hasMessages(MessageTueryDefinition queryDef) {
        return hasMessages(args -> {}, queryDef);
    }

    /**
    *     参照 hasPart【作品组件】 表示某个作品是该作品的一部分    
    */
    public ConversationTuery hasMessages(HasMessagesArgumentsDefinition argsDef, MessageTueryDefinition queryDef) {
        startField("hasMessages");

        HasMessagesArguments args = new HasMessagesArguments(_queryBuilder);
        argsDef.define(args);
        HasMessagesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WebhookArguments extends Arguments {
        WebhookArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public WebhookArguments filter(WebhookFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments order(WebhookOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WebhookArgumentsDefinition {
        void define(WebhookArguments args);
    }

    /**
    *     本会话Conversation给第三方软件如Github、阿里云代码创建的webhook，第三方软件向本会话推送事件消息    
    */
    public ConversationTuery webhook(WebhookTueryDefinition queryDef) {
        return webhook(args -> {}, queryDef);
    }

    /**
    *     本会话Conversation给第三方软件如Github、阿里云代码创建的webhook，第三方软件向本会话推送事件消息    
    */
    public ConversationTuery webhook(WebhookArgumentsDefinition argsDef, WebhookTueryDefinition queryDef) {
        startField("webhook");

        WebhookArguments args = new WebhookArguments(_queryBuilder);
        argsDef.define(args);
        WebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
