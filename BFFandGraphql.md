![What BFF ](document/WhatBFF.png)
- BFF 是在客户端与后台服务api之间的转换层
- BFF 从下游服务获取数据并根据用户界面或用户体验裁剪数据提供给前端界面
- BFF 不实现业务应用逻辑，只是转换整合数据
![Who owns BFF](document/Back2Mobile.png)
- 不同的客户端可以拥有自己的BFF
- 如桌面客户端BFF可能返回完全丰富的产品信息如详细描述、图片
- 如移动客户端BFF可能只返回简单的产品信息列表
![Who owns BFF](document/WhoOwnsBFF.png)
- 前端团队拥有并负责开发BFF，可以采用同一样的技术栈如小程序前端采用H5、javascript，BFF采用nodejs
- 前端团队专注用户界面与用户体验而无需等待业务逻辑实现团队提供的api
- 这样减少与业务逻辑实现团队沟通
![Who owns BFF](document/WhoOwnsBFF1.png)
- 前端团队拥有并负责开发BFF，可以采用同一样的技术栈如小程序前端采用H5、javascript，BFF采用nodejs
- 前端团队专注用户界面与用户体验而无需等待业务逻辑实现团队提供的api
- 这样减少与业务逻辑实现团队沟通
![Who owns BFF](document/WhoOwnsBFF2.png)
- 前端团队拥有并负责开发BFF，可以采用同一样的技术栈如小程序前端采用H5、javascript，BFF采用nodejs
- 前端团队专注用户界面与用户体验而无需等待业务逻辑实现团队提供的api
- 这样减少与业务逻辑实现团队沟通

# BFF Backend For Front, 
## 主要作为：
1. 为客户端用户界面提供整合、裁剪后的业务数据，特别根据用户界面进行适配的
1. 也有可能保存客户端应用的用户设置数据，如设置为暗黑皮肤
## 代码组织
1. FFU Frontend for User 客户端应用用户界面代码    Doper-FFU
1. BFF Backend for Frontend 客户端应用后台为前台代码   Doper-BFF
1. 代码仓库组织如下：   
    - 1.  Doper
        - 1.1. Doper-FFU
        - 1.2. Doper-BBF
        - 1.3. README.md

![How Graphql BFFWorks](document/HowBFFWorks.png)
