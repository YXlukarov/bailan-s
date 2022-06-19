# Bailan-XMall
> 摆烂小组大型软件开发实践项目
>
> 基于Github项目[Xmall](https://github.com/Exrick/xmall)的二次开发

### 基于SOA架构的分布式购物电商商城
- 后台管理系统：管理商品、订单、类目、商品规格属性、用户、权限、系统统计、系统日志以及前台内容等功能

- 前台系统：用户可以在前台系统中进行注册、登录、浏览商品、首页、下单等操作

- 会员系统：用户可以在该系统中查询已下的订单、管理订单、我的优惠券等信息

- 订单系统：提供下单、查询订单、修改订单状态、定时处理订单

- 搜索系统：提供商品的搜索功能

- 单点登录系统：为多个系统之间提供用户登录凭证以及查询登录用户的信息

### 项目架构及功能模块图

![](https://ooo.0o0.ooo/2018/07/22/5b5461926969b.png)

### 后端所用技术
##### 各框架依赖版本皆使用目前最新版本 可进入xmall-parent中 [pom.xml](https://github.com/Exrick/xmall/blob/master/xmall-parent/pom.xml) 查看
- Spring
- [SpringMVC](https://github.com/Exrick/xmall/blob/master/study/SpringMVC.md)
- MyBatis
- [Dubbo](https://github.com/Exrick/xmall/blob/master/study/Dubbo.md)
- [ZooKeeper](https://github.com/Exrick/xmall/blob/master/study/Zookeeper.md)
- MySQL
- PageHelper：
- [Redis](https://github.com/Exrick/xmall/blob/master/study/Redis.md)：缓存
- [Elasticsearch](https://github.com/Exrick/xmall/blob/master/study/Elasticsearch.md)：基于Lucene分布式搜索引擎
- [ActiveMQ](https://github.com/Exrick/xmall/blob/master/study/ActiveMQ.md)：消息队列
- [Druid](http://druid.io/)：阿里高性能数据库连接池
- Shiro：安全框架
- [Swagger2](https://github.com/Exrick/xmall/blob/master/study/Swagger2.md)：Api文档生成
- Docker
- [Nginx](https://github.com/Exrick/xmall/blob/master/study/Nginx.md)
- Tomcat
- [Maven](https://github.com/Exrick/xmall/blob/master/study/Maven.md)
- 第三方SDK
    - [七牛云文件存储服务](https://developer.qiniu.com/kodo/sdk/1239/java)

### 开发运行部署
- 安装各中间件并启动：

  - ZooKeeper

    Docker pull镜像，暴露2181端口运行

  - Redis

    限流服务使用Docker容器运行Redis单例

    缓存服务使用Redis伪集群，搭建踩坑点：

    1. Docker搭建的Redis伪集群是运行在docker创建的局域网内，外网无法访问，如果以host模式运行则会出现错误。
    2. 通过在一台服务器上运行多个Redis实例实现Redis-cluster伪集群搭建，[搭建教程](https://blog.csdn.net/Alen_xiaoxin/article/details/123057820)有很多，注意的是在编写redis.conf文件时，不用bind，以及去掉安全认证，在最后./redis-cli --cluster create时bind的ip是localhost而非服务器公网ip，如果bind的ip是服务器的内网ip则无法访问服务。

  - ActiveMQ

  - Elasticsearch

- 修改各配置文件相应依赖IP配置

- [基于docker-compose部署](https://blog.csdn.net/qq_43743023/article/details/114274536)

