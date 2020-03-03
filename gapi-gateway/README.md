# gapi-gateway

1. [netifi-acmeshoes:Simple store application that composes calls to backend product information services and displays a product page. This example application shows you how to build microservice architectures using Netifi and RSocket.](https://github.com/gregwhitaker/netifi-acmeshoes)
1. [A catalog is a collection of products. A shop operator creates products in the system, and creates one or more variants for each product. ](https://docs.reactioncommerce.com/docs/concepts-catalogs)
1. [Graphql Subscription: try to use the default subscription URL: ws://localhost:8080/subscriptions Make sure that the Flux is pushing events continuously](https://github.com/graphql-java-kickstart/graphql-spring-boot/issues/221)
1. [Schema.org for Variable Products with ProductModels, Offers](https://www.schemaapp.com/newsletter/schema-org-variable-products-productmodels-offers/)
1. [https://www.devglan.com/blog/install-redis-windows-and-mac](https://www.devglan.com/blog/install-redis-windows-and-mac)


# [Shopify GraphQL Design Tutorial: It's based on lessons learned from creating and evolving production schemas at Shopify over almost 3 years. The tutorial has evolved and will continue to change in the future so nothing is set in stone.](https://github.com/Shopify/graphql-design-tutorial)

# graphql subscription testing steps:
1. set subscription url on Altar: ws://localhost:8888/subscriptions
![set subscription url on Altar](document/set-subscription-url-onAltar.jpg)
2. add values to redis stream "my-stream"
    ```
    ConandeMacBook-Pro:temp conanchen$ redis-cli
    127.0.0.1:6379> XADD my-stream * aaa bbb ccc ddd
    "1582273929819-0"
    127.0.0.1:6379> 
    ```
3. check helloRedis subscription on Altar
![check helloRedis subscription on Altar](document/check-helloRedis-subscription-on-Altar.jpg)



# kubernetes设计理念
## Kubernetes设计理念与分布式系统
分析和理解Kubernetes的设计理念可以使我们更深入地了解Kubernetes系统，更好地利用它管理分布式部署的云原生应用，另一方面也可以让我们借鉴其在分布式系统设计方面的经验。

## API设计原则 
对于云计算系统，系统API实际上处于系统设计的统领地位，正如本文前面所说，K8s集群系统每支持一项新功能，引入一项新技术，一定会新引入对应的API对象，支持对该功能的管理操作，理解掌握的API，就好比抓住了K8s系统的牛鼻子。K8s系统API的设计有以下几条原则：

1. 所有API应该是声明式的。正如前文所说，声明式的操作，相对于命令式操作，对于重复操作的效果是稳定的，这对于容易出现数据丢失或重复的分布式环境来说是很重要的。另外，声明式操作更容易被用户使用，可以使系统向用户隐藏实现的细节，隐藏实现的细节的同时，也就保留了系统未来持续优化的可能性。此外，声明式的API，同时隐含了所有的API对象都是名词性质的，例如Service、Volume这些API都是名词，这些名词描述了用户所期望得到的一个目标分布式对象。
1. API对象是彼此互补而且可组合的。这里面实际是鼓励API对象尽量实现面向对象设计时的要求，即“高内聚，松耦合”，对业务相关的概念有一个合适的分解，提高分解出来的对象的可重用性。事实上，K8s这种分布式系统管理平台，也是一种业务系统，只不过它的业务就是调度和管理容器服务。
1. 高层API以操作意图为基础设计。如何能够设计好API，跟如何能用面向对象的方法设计好应用系统有相通的地方，高层设计一定是从业务出发，而不是过早的从技术实现出发。因此，针对K8s的高层API设计，一定是以K8s的业务为基础出发，也就是以系统调度管理容器的操作意图为基础设计。
1. 低层API根据高层API的控制需要设计。设计实现低层API的目的，是为了被高层API使用，考虑减少冗余、提高重用性的目的，低层API的设计也要以需求为基础，要尽量抵抗受技术实现影响的诱惑。
1. 尽量避免简单封装，不要有在外部API无法显式知道的内部隐藏的机制。简单的封装，实际没有提供新的功能，反而增加了对所封装API的依赖性。内部隐藏的机制也是非常不利于系统维护的设计方式，例如PetSet和ReplicaSet，本来就是两种Pod集合，那么K8s就用不同API对象来定义它们，而不会说只用同一个ReplicaSet，内部通过特殊的算法再来区分这个ReplicaSet是有状态的还是无状态。
1. API操作复杂度与对象数量成正比。这一条主要是从系统性能角度考虑，要保证整个系统随着系统规模的扩大，性能不会迅速变慢到无法使用，那么最低的限定就是API的操作复杂度不能超过O(N)，N是对象的数量，否则系统就不具备水平伸缩性了。
1. API对象状态不能依赖于网络连接状态。由于众所周知，在分布式环境下，网络连接断开是经常发生的事情，因此要保证API对象状态能应对网络的不稳定，API对象的状态就不能依赖于网络连接状态。
1. 尽量避免让操作机制依赖于全局状态，因为在分布式系统中要保证全局状态的同步是非常困难的。

## Kubernetes的核心技术概念和API对象
### API对象是K8s集群中的管理操作单元。
K8s集群系统每支持一项新功能，引入一项新技术，一定会新引入对应的API对象，支持对该功能的管理操作。例如副本集Replica Set对应的API对象是RS。

每个API对象都有3大类属性：元数据metadata、规范spec和状态status。元数据是用来标识API对象的，每个对象都至少有3个元数据：namespace，name和uid；除此以外还有各种各样的标签labels用来标识和匹配不同的对象，例如用户可以用标签env来标识区分不同的服务部署环境，分别用env=dev、env=testing、env=production来标识开发、测试、生产的不同服务。规范描述了用户期望K8s集群中的分布式系统达到的理想状态（Desired State），例如用户可以通过复制控制器Replication Controller设置期望的Pod副本数为3；status描述了系统实际当前达到的状态（Status），例如系统当前实际的Pod副本数为2；那么复制控制器当前的程序逻辑就是自动启动新的Pod，争取达到副本数为3。

K8s中所有的配置都是通过API对象的spec去设置的，也就是用户通过配置系统的理想状态来改变系统，这是k8s重要设计理念之一，即所有的操作都是声明式（Declarative）的而不是命令式（Imperative）的。声明式操作在分布式系统中的好处是稳定，不怕丢操作或运行多次，例如设置副本数为3的操作运行多次也还是一个结果，而给副本数加1的操作就不是声明式的，运行多次结果就错了。

### 用户帐户（User Account）和服务帐户（Service Account）
顾名思义，用户帐户为人提供账户标识，而服务账户为计算机进程和K8s集群中运行的Pod提供账户标识。用户帐户和服务帐户的一个区别是作用范围；用户帐户对应的是人的身份，人的身份与服务的namespace无关，所以用户账户是跨namespace的；而服务帐户对应的是一个运行中程序的身份，与特定namespace是相关的。

### 名字空间（Namespace）
名字空间为K8s集群提供虚拟的隔离作用，K8s集群初始有两个名字空间，分别是默认名字空间default和系统名字空间kube-system，除此以外，管理员可以可以创建新的名字空间满足需要。

### RBAC访问授权
K8s在1.3版本中发布了alpha版的基于角色的访问控制（Role-based Access Control，RBAC）的授权模式。相对于基于属性的访问控制（Attribute-based Access Control，ABAC），RBAC主要是引入了角色（Role）和角色绑定（RoleBinding）的抽象概念。在ABAC中，K8s集群中的访问策略只能跟用户直接关联；而在RBAC中，访问策略可以跟某个角色关联，具体的用户在跟一个或多个角色相关联。显然，RBAC像其他新功能一样，每次引入新功能，都会引入新的API对象，从而引入新的概念抽象，而这一新的概念抽象一定会使集群服务管理和使用更容易扩展和重用。

## Schema previews
[Schema previews](https://developer.github.com/v4/previews/) let you try out new features and changes to our GraphQL schema before they become part of the official GitHub API.

During the preview period, we may change some features based on developer feedback. If we do make changes, we'll announce them on the developer blog without advance notice.

To access a schema preview, you'll need to provide a custom media type in the Accept header for your requests. Feature documentation for each preview specifies which custom media type to provide.

## [Writing end-to-end tests for GraphQL servers using Jest](https://blog.logrocket.com/writing-end-to-end-tests-for-graphql-servers-using-jest/)