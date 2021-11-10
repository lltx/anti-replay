package online.inote.naruto.anti.replay.annotation;

import online.inote.naruto.anti.replay.spring.NarutoAntiReplaySpringConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description 启用禁止重复请求
 * @author XQF.Sui
 * @date 2021/07/30 01:43
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(NarutoAntiReplaySpringConfiguration.class)
public @interface EnableNarutoAntiReplay {
}
