package com.welab.k8s_backend_alim.event.consumer;


import com.welab.k8s_backend_alim.event.consumer.message.user.SiteUserInfoEvent;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Slf4j
@Setter
@RequiredArgsConstructor
public class KafkaMessageConsumer {
    @KafkaListener(
            topics = SiteUserInfoEvent.Topic, properties = {
            JsonDeserializer.VALUE_DEFAULT_TYPE
                    + ":com.welab.k8s_backend_alim.event.consumer.message.user.SiteUserInfoEvent"}
    )
    void handleSiteUserInfoMessage(SiteUserInfoEvent event, Acknowledgment ack){
        log.info("SiteUseInfoEvent 처리. userId={}", event.getUserId());
    }
}
