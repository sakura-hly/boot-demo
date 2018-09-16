package com.moon.springbootrabbitmq.rabbitmq;

import com.moon.springbootrabbitmq.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicSender topicSender;

    @Test
    public void topic() throws Exception {
        topicSender.sender();
    }

    @Test
    public void topic1() throws Exception {
        topicSender.sender1();
    }

    @Test
    public void topic2() throws Exception {
        topicSender.sender2();
    }
}
