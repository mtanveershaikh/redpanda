package pk.streaming.redpanda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author rayyan
 *
 */
@Component
public class KafkaPublisher {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String topicName, String msg) {
		kafkaTemplate.send(topicName, msg);
	}
}