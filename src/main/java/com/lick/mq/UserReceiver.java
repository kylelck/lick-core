package com.lick.mq;

import com.lick.channel.UserMessageChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月23日 13:40
 * @copyright: 版权归所有
 */
@EnableBinding(value = {UserMessageChannel.class})
public class UserReceiver {
    private static final Logger logger = LoggerFactory.getLogger(UserReceiver.class);

    @StreamListener(UserMessageChannel.USERINPUT)
    public void receive(Object payload) {
        logger.info("Received :"+payload);
    }
}
