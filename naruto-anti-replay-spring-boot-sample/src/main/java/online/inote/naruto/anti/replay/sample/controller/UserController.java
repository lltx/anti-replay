package online.inote.naruto.anti.replay.sample.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import online.inote.naruto.anti.replay.annotation.NarutoAntiReplay;
import online.inote.naruto.anti.replay.sample.entity.UserEntity;
import online.inote.naruto.utils.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @description 用户Controller
 * @author XQF.Sui
 * @date 2021/07/30 01:55
 */
@Log4j2
@RestController
@RequestMapping(value = "user")
public class UserController {

  @NarutoAntiReplay
  @PostMapping(value = "save")
  public String save(@RequestBody UserEntity user) throws InterruptedException {
    log.info(UserEntity.Fields.name + ":" + user.getName());
    log.info(UserEntity.Fields.age + ":" + user.getAge());
    return "ok";
  }

  @NarutoAntiReplay
  @PostMapping(value = "update/{channel}")
  public String update(@PathVariable String channel, @RequestBody UserEntity user) {
    log.info("channel:{}", channel);
    log.info(UserEntity.Fields.name + ":" + user.getName());
    log.info(UserEntity.Fields.age + ":" + user.getAge());
    return "ok";
  }

  @NarutoAntiReplay
  @GetMapping(value = "getInfo/{id}")
  public String getInfo(@PathVariable String id) {
    log.info("id:{}", id);
    return "ok";
  }

  @NarutoAntiReplay
  @PostMapping(value = "getPage")
  public String getPage(@RequestBody Page<UserEntity> page) {
    System.out.println(JSON.toJSONString(page));
    return "ok";
  }
}
