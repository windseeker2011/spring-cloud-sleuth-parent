# Spring-Cloud-Sleuth 演示项目
>结合eureka+mysql+kafka，剖析各适应条件下springcloud微服务追踪。本项目默认采用率为100%，生产环境根据需求自动调整即可。  
>官网文档地址：<http://cloud.spring.io/spring-cloud-static/spring-cloud-sleuth/1.3.3.RELEASE/single/spring-cloud-sleuth.html>

## * 默认配置：http+内存 *
>默认采样是采用http请求至zipkin服务端，zipkin默认采用内存存储。

### 1.相关工程：
1. spring-cloud-eureka-server-for-sleuth
>注册中心
2. spring-cloud-sleuth-http-client
>微服务，本项目最多演示三层服务调用。
3. spring-cloud-sleuth-http-server
>Zipkin服务，默认存储在内存中。

### 2.使用步骤：
1. 启动eureka注册中心：
>EurekaServerApplication.java
2. 启动三个微服务：
>a、b、c包下ServiceApplication.java
3. 启动zipkin服务：
>ZipkinServerApplication.java

### 3.测试方法
1. <http://localhost:8881/1>
2. <http://localhost:8881/2>
3. <http://localhost:8881/3>

## * 持久化配置：http+mysql *
>默认采样是采用http请求至zipkin服务端，zipkin采用mysql存储。

### 1.相关工程：
1. spring-cloud-eureka-server-for-sleuth
>注册中心
2. spring-cloud-sleuth-http-client
>微服务，本项目最多演示三层服务调用。
3. spring-cloud-sleuth-http-mysql-server
>Zipkin服务，采用mysql存储采样数据。

### 2.使用步骤：
1. 启动eureka注册中心：
>EurekaServerApplication.java
2. 启动三个微服务：
>a、b、c包下ServiceApplication.java
3. 启动zipkin服务：
>ZipkinServerApplication.java

### 3.测试方法
1. <http://localhost:8881/1>
2. <http://localhost:8881/2>
3. <http://localhost:8881/3>

## * 持久化配置：stream+mysql *
>采样是采用stream请求至zipkin服务端，zipkin采用mysql存储。

### 1.相关工程：
1. spring-cloud-eureka-server-for-sleuth
>注册中心
2. spring-cloud-sleuth-stream-client
>微服务，本项目最多演示三层服务调用。
3. spring-cloud-sleuth-stream-server
>Zipkin服务，采用mysql存储采样数据。

### 2.使用步骤：
1. 启动eureka注册中心：
>EurekaServerApplication.java
2. 启动三个微服务：
>a、b、c包下ServiceApplication.java
3. 启动zipkin服务：
>ZipkinServerApplication.java

### 3.测试方法
1. <http://localhost:8881/1>
2. <http://localhost:8881/2>
3. <http://localhost:8881/3>

