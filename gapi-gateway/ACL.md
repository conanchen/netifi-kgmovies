1. *全平台将有一个超级用户root可以存取平台内所有访问控制规则而不能存取任何数据
1. *全平台的超级用户root可以创建平台用户组，添加用户到用户组
1. *创建组织内或个人的用户组，添加用户到用户组
1. *每一个用户可以属于多个用户组
1. *资源实体如Product、Organization、Order在系统设计时已指定Action进行访问
1. *访问控制可以分配给用户组，也可分配给指定单独个人，也就是用户组或个人可以执行限定的Action
1. *每个组织或个人拥有自己局部的超级用户goot可以存取所拥有的数据及做所有操作
1. *每个组织或个人可以分派自己所有访问控制权限给自己用户组或个人
1. 记录所有访问，包括在哪些资源上进行的操作尝试，不管成功或失败都要记录
1. root 隶属于【全平台】一个特别的监管组 【guardians】. 监管组【guardians】可以访问所有访问规则，根据需要添加更多用户.
1. goot 隶属于【组织或个人】一个特别的监管组 【guardians】. 监管组【guardians】可以访问所有数据及访问规则，根据需要添加更多用户.
1. 资源的每个属性将有两类访问权限：READ能够查询该属性值、WRITE能够变更该属性值

Reference：
- [The requirements: We started the project by asking what are the features that we must support for access control to work both securely and seamlessly for our customers. After a few rounds of brainstorming and feedback, we settled on the following list:](https://blog.dgraph.io/post/access-control-in-dgraph/)

Kubernetes RBAC
为了让我们的新用户 "theone" 具有 Kubernetes 资源的访问权限，需要在 Kubernetes 中为其授权。RBAC 是将 Kubernetes resources 和 Kube API 的访问权限赋予一些“角色”（Role），然后通过 "User RoleBinding" 给单个用户赋予某个角色，或通过 "Group RoleBinding" 给一组用户赋予某个角色。用户获取角色后，就能相应获取该角色所具有的权限。其原理如下图 5 所示。

图 5. Kubernetes Role Based Access Control（RBAC）
![Kubernetes Role Based Access Control（RBAC）](document/image005.png)
User、RoleBinding、Role 都是 Kubernetes 的 Object，Resource 是我们要访问的 Kubernetes 中的 Object 或 API。而 Group 则是 User 的一个属性，在用户访问 Kubernetes Server API 的时候，Group 属性会作为 "Request Attribute" 传入，并被作为授权的重要依据。

我们假设有一个叫 "manager" 的 Group，我们要给这个 Group 赋予集群管理员（cluster-admin）的角色，这是通过在 Kubernetes 中创建如下的 ClusterRolebinding 来实现的。注意，下面的命令必须是由另一个具有相应权限的用户执行。