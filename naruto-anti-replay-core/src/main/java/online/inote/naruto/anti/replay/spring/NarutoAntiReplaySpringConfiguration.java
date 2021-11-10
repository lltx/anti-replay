package online.inote.naruto.anti.replay.spring;

import online.inote.naruto.anti.replay.aspect.AntiReplayAspect;
import online.inote.naruto.anti.replay.props.ReplayProperties;
import online.inote.naruto.cache.CacheSupport;
import online.inote.naruto.common.utils.bean.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @description Anti-Replay Spring Configuration
 * @author XQF.Sui
 * @date 2021/07/30 01:38
 */
@Configurable
@EnableAspectJAutoProxy
@Import({BeanFactory.class, AntiReplayAspect.class, ReplayProperties.class, CacheSupport.class})
public class NarutoAntiReplaySpringConfiguration {}
