# naruto-anti-replay

## 介绍

基于SpringBoot封装的接口放重放、防篡改功能，基于Redis(Lettuce)实现分布式。

## 软件架构

框架     | 版本
-------- | -----
SpringBoot  | 2.3.2.RELEASE
fastJson | 1.2.76

## 使用说明

#### Maven引入

```
<dependency>
  <groupId>online.inote</groupId>
  <artifactId>naruto-anti-replay-spring-boot-starter</artifactId>
  <version>0.0.6-RELEASE</version>
</dependency>
```

#### 配置信息

```
# 缓存Key前缀
naruto.security.api.anti-replay.cache.cache-key-prefix=NARUTO:SECURITY:ANTI-REPLAY:REQUEST_ID_
# 请求header属性Key
naruto.security.api.anti-replay.header-key.nonce=nonce
naruto.security.api.anti-replay.header-key.timestamp=timestamp
naruto.security.api.anti-replay.header-key.url=url
naruto.security.api.anti-replay.header-key.token=token
naruto.security.api.anti-replay.header-key.signature=signature
# 请求过期时间
naruto.security.api.anti-replay.request.expire-time=60
```

注：底层已做默认配置，如果没有特殊要求，可不增加以上配置。

#### API需要拦截的方法加注解@NarutoAntiReplay：

```
  @NarutoAntiReplay
  @GetMapping(value = "getInfo/{id}")
  public String getInfo(@PathVariable String id) {
    return "ok";
  }
```

详见naruto-anti-replay-spring-boot-sample。