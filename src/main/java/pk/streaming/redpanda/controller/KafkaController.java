package pk.streaming.redpanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pk.streaming.redpanda.constant.Constants;
import pk.streaming.redpanda.request.MessageStream;
import pk.streaming.redpanda.service.KafkaPublisher;

/**
 * @author rayyan
 *
 */
@RestController
@RequestMapping("/api/v1/message")
public class KafkaController {
	
	@Autowired
    private KafkaPublisher kafkaPublisher;

    @PostMapping("publish")
    public ResponseEntity<String> publishMessage(@RequestBody MessageStream message){
        try {
            kafkaPublisher.sendMessage(Constants.TOPIC,message.getMessage());
            return ResponseEntity.ok(null);

        } catch (Exception e ){
            return ResponseEntity.internalServerError().body(e.getLocalizedMessage());
        }
    }

}