package online.inote.naruto.anti.replay.spring.configure;

import online.inote.naruto.anti.replay.annotation.EnableNarutoAntiReplay;
import online.inote.naruto.common.utils.bean.EnableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @description Anti-Replay Configuration
 * @author XQF.Sui
 * @date 2021/07/30 01:37
 */
@Configuration
@EnableBeanFactory
@EnableNarutoAntiReplay
public class NarutoAntiReplayAutoConfiguration {}
