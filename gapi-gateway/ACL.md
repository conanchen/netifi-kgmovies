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