package com.org.tzlal.consumer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class MessageConsumer {
private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
@KafkaListener(topics = "users", groupId = "group_id")
public void consume(String data){
logger.info("$$ -> Consumed Message ->" + data);
}
}