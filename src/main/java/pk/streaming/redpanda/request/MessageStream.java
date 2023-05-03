package pk.streaming.redpanda.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rayyan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageStream implements Serializable {
	
	private static final long serialVersionUID = 6851108834680297363L;
	
	private String message;

}
