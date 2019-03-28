package com.d2c.shop;

import com.d2c.shop.rabbitmq.sender.OrderDelayedSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * VM options: -Dspring.profiles.active=dev -Des.set.netty.runtime.available.processors=false
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShopApplication.class})
public class ShopApplicationTests {

    @Autowired
    private OrderDelayedSender orderDelayedSender;

    @Test
    public void contextLoads() {
        orderDelayedSender.send("T1107545708271112192", 5L);
    }

}

